/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anup-Xtha
 */

public class Validations {
    private Pattern email;
    
    private Matcher matcher;
    
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z-]+(\\.[A-Za-z]+)*(\\.[A-Za-z]{3})$";
       
    public Validations(){
        email = Pattern.compile(EMAIL_PATTERN);
    }
    
    public boolean emailValidate(final String email1){
        matcher = email.matcher(email1);
        return matcher.matches();
    }
}
