/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import play.data.validation.Constraints.Required;
import play.data.validation.ValidationError;

/**
 *
 * @author david
 */
public class LoginForm {

    /**
     * Variables globales.
     */
    @Required
    public String nif;
    @Required
    public String password;

    /**
     * Constructor vacio.
     */
    public LoginForm() {}
    
    public List<ValidationError> validate() {
        List<ValidationError> errors = new ArrayList<>();
        if (nif != null && password != null) {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT * FROM Usuario where NIF = '").append(nif).append("' AND password = '").append(password).append("'");
            boolean ifErrorAuth = false;
            try {
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UVisa2017?verifyServerCertificate=true&useSSL=true", "Admin", "isa2017"); Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {
                    ResultSet rs = st.executeQuery(sql.toString());
                    if (!rs.next()) {
                        ifErrorAuth = true;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                ifErrorAuth = true;
            }finally {
                if(ifErrorAuth){
                    errors.add(new ValidationError("nif", ""));
                    errors.add(new ValidationError("password", ""));
                }
            }
        }
        System.err.println(this.toString());
        return (errors.size() > 0) ? errors : null;
    }

    @Override
    public String toString() {
        return "LoginForm{" + "nif=" + nif + ", password=" + password + '}';
    }
}
