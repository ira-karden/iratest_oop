package com.example.java.ControlWorkProgram;

import com.example.java.TasksMenu.TaskMenu;

public class LoginProcessing {
    private String login = "iratest";
    private String password = "test123";
    private String checkLogin;
    private String checkPassword;
    boolean resultValidation;

    public LoginProcessing (){

    }

    public LoginProcessing (String logPass) {

        System.out.println("The password or login is required");
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

    public void setCheckPassword(String checkPassword){
        this.checkPassword = checkPassword;
    }
    public void setResultValidation(boolean resultValidation){
        this.resultValidation = resultValidation;
    }
    public boolean getResultValidation(){
        return resultValidation;
    }
    public boolean LoginValidation (String checkLogin, String checkPassword) {
        if ( login.equalsIgnoreCase(checkLogin) && password.equals(checkPassword)){
            return resultValidation = true;
//            System.out.println("Tasks menu:");
//            System.out.println();
//            TaskMenu tasks = new TaskMenu();
//            tasks.TasksMenu(resultValidation);
        }
        else if (!login.equalsIgnoreCase(checkLogin) || !password.equals(checkPassword)){
            return resultValidation = false;
//            System.out.println("Wrong login or password");
        }
        else {
            return resultValidation = false;
//            System.out.println("Something wrong. Try Again to enter correct login and password");
        }

    }
}
