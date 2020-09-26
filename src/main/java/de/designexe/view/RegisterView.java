package de.designexe.view;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RegisterView {
    private String userName;
    private String passwod;
    private String passwordConfirmed;
    private String email;

    public String register(){
        if (!passwod.equals(passwordConfirmed)) {
            return "passwordNotEqual";
        } else if (emailisFalid() == false) {
            return "emailFailed";
        } else {
            return "rigisterPassed";
        }
    }
    private boolean emailisFalid(){
        if (email.contains("@") && email.contains(".")){
         return true;
        } else {
            return false;
        }
    }



}
