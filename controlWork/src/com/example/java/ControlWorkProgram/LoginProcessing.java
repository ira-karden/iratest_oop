package com.example.java.ControlWorkProgram;

import com.example.java.TasksMenu.TaskMenu;

public class LoginProcessing {
    private String login = "iratest";
    private String password = "test123";
    private String checkLogin;
    private String checkPassword;
    boolean resultValidation;
    boolean loginValidation;

    public LoginProcessing (){

    }

    public LoginProcessing (String logPass) {
        this.login = "iratest";
        this.checkLogin = checkLogin;
    }

    public LoginProcessing (String checkLogin, String checkPassword){
        this.login = "iratest";
        this.checkLogin = checkLogin;
        this.password = "test123";
        this.checkPassword = checkPassword;
    }
    public void setCheckLogin (String checkLogin){
        this.checkLogin = checkLogin;
    }
    public void setLoginValidation (boolean loginValidation){
        this.loginValidation = loginValidation;
    }
    public boolean getLoginValidation (){
        return loginValidation;
    }

    public void setCheckPassword(String checkPassword){
        this.checkPassword = checkPassword;
    }
    public void setResultValidation(boolean resultValidation){
        this.resultValidation = resultValidation;
    }
    public boolean getResultValidation(){
        return resultValidation;
    }
    public boolean LoginValidation (String checkLogin) {
        if (login.equalsIgnoreCase(checkLogin)) {
            return loginValidation = true;
        } else if (!login.equalsIgnoreCase(checkLogin)) {
            return loginValidation = false;
        } else {
            return loginValidation = false;
        }
    }
    public boolean LoginValidation (String checkLogin, String checkPassword) {
        if ( login.equalsIgnoreCase(checkLogin) && password.equals(checkPassword)){
            return resultValidation = true;
        }
        else if (!login.equalsIgnoreCase(checkLogin) || !password.equals(checkPassword)){
            return resultValidation = false;
        }
        else {
            return resultValidation = false;
        }

    }
}
