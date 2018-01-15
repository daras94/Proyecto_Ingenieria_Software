/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.authentificacion.Secured;
import models.Usuario;
import play.mvc.*;
import controllers.matricula.*;
import java.util.ArrayList;
import java.util.List;
import models.Matricula;

import views.html.*;
import views.html.auth.*;
import views.html.operation.*;

/**
 *
 * @author david
 */
public class HomeAlumno extends Controller {

    protected static Usuario usuario = Secured.userAuth;
    protected static String TIPO_ALUMNO = "ALUMNO";
    protected static List<Matricula> itemMatricula;

    @Security.Authenticated(Secured.class)
    public Result alumno() throws Exception {
        boolean isAlumno = usuario.getTipoUser().equals(TIPO_ALUMNO);
        if (!isAlumno) {
            return unauthorized().withHeader(Secured.AUTH_TOKEN_HEADER, usuario.getAuthTokent());
        } else {
            final Integer num_expediente = Integer.decode(usuario.getNumExpediente());
            itemMatricula = new MatriculasApiControllerImp().verExpedienteNumeroExpedienteGet(num_expediente);
        }
        return ok();
    }

    @Security.Authenticated(Secured.class)
    public Result expediente() throws Exception {
        StatusHeader result = ok();
        boolean isAlumno = usuario.getTipoUser().equals(TIPO_ALUMNO);
        if (!isAlumno) {
            result = unauthorized();
        } else {
            final String ano = request().getQueryString("year");
            if (ano != null) {
                Matricula aux = new Matricula();
                final int year = Integer.getInteger(ano);
                List<Integer> years = new ArrayList<>();
                for (Matricula matricula : itemMatricula) {
                    Matricula aux1 = matricula.getClass().cast(Matricula.class); 
                    if (aux1.getAnno() == year) {
                        aux = aux1;
                    }
                    years.add(years.size(), aux1.getAnno());
                }
                result = (StatusHeader)ok(verExpedienteAlumno.render(" - Ver Expediente: ", Secured.isLoggedIn(ctx()), usuario, years, aux));
            }else{
                result = ok();
            }
        }
        return result.withHeader(Secured.AUTH_TOKEN_HEADER, usuario.getAuthTokent());
    }

}
