
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class GeneratePassword {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String password = "priya";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));
    }
    
    //$2a$10$cEIezvGhWkCdd4.iJF7fguVMdYpBOdXVVK/L.4T0ov649r4V4lizy

}
