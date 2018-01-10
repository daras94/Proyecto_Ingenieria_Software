package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.inject.Inject;
import services.GestionDeAuthentificacionApiControllerImpInterface;
import javax.validation.constraints.*;
import models.UsuarioDB;
import play.db.Database;
import models.Usuario;
import static play.mvc.Controller.ctx;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-02T17:03:41.435Z")

public class GestionDeAuthentificacionApiControllerImp implements GestionDeAuthentificacionApiControllerImpInterface {

    private final Connection con;
    protected String authTokent;
    private static Statement st;
    private static ResultSet rs;
    private final StringBuilder sql;

    @Inject
    public GestionDeAuthentificacionApiControllerImp(Database db) {
        this.con = db.getConnection();
        this.sql = new StringBuilder();
    }

    @Override
    public Usuario loginUser(@NotNull @Pattern(regexp = "^([0-9]{8}|[XYZ]{1}[0-9]{7})[TRWAGMYFPDXBNJZSQVHLCKET]{1}$") @Size(min = 9, max = 9) String nif, @NotNull String password) throws Exception {
        Usuario user = new Usuario();
        sql.append("SELECT * FROM Usuario where NIF = '").append(nif).append("' AND password = '").append(password).append("'");
        st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        rs = st.executeQuery(sql.toString());
        if (rs.next()) {
            user.setNif(nif);
            user.setName(rs.getString("nombre") + " " + rs.getString("apellido1") + " " + rs.getString("apellido2"));
            user.setTipoUser(rs.getString("tipo_user"));
            if (user.getTipoUser().equals("ROLE_ALUMNO")) {
                rs = st.executeQuery("SELECT * Alumno where Usuario_NIF = '" + nif + "'");
                if (rs.next()) {
                    user.setNumExpediente(rs.getString("num_expediente"));
                }
            }
            this.authTokent = UsuarioDB.addUserInfo(user);
        }
        sql.setLength(0);
        return UsuarioDB.getUser(authTokent);
    }

    @Override
    public void logoutUser() throws Exception {
        Usuario user = Secured.getUserInfo(ctx());
        UsuarioDB.deletUser(user.getNif());
    }

}
