package com.example.java.ControlWorkProgram;

import com.example.java.ControlWorkProgram.Exceptions.LengthPasswordException;
import com.example.java.TasksMenu.TaskMenu;

import java.io.IOException;

public class LoginProcessing {
    private String login = "iratest";
    private String password = "test123";
    private String checkLogin;
    private String checkPassword;
    boolean resultValidation;
    boolean loginValidation;

    public LoginProcessing (){
    }

    public LoginProcessing (String checkLogin, String checkPassword){
        this.login = "ira";
        this.checkLogin = checkLogin;
        this.password = "123";
        this.checkPassword = checkPassword;
    }
    public void setCheckLogin (String checkLogin){
        this.checkLogin = checkLogin;
    }

    public void setCheckPassword(String checkPassword) throws LengthPasswordException {
        try {
            if (checkPassword.length()<3){
                throw new LengthPasswordException(checkPassword.length());
            }
            else {
                this.checkPassword = checkPassword;
            }
        }catch (LengthPasswordException e){
            System.out.println("Length of password must be minimum 3 symbols");
            e.printStackTrace();
        }
    }
    public void setResultValidation(boolean resultValidation){
        this.resultValidation = resultValidation;
    }
    public boolean getResultValidation(){
        return resultValidation;
    }

    public boolean LoginValidation (String checkLogin, String checkPassword) throws ReflectiveOperationException {
        try {
            if ( login.equalsIgnoreCase(checkLogin) && password.equals(checkPassword)){
                return resultValidation = true;
            }
            else if (checkLogin.trim().length() == 0 || checkPassword.trim().length() == 0){
                throw new ReflectiveOperationException ("Empty field login or password");
            }
            else if (!login.equalsIgnoreCase(checkLogin) || !password.equals(checkPassword)){
                throw new ReflectiveOperationException("Wrong login or password");
            }
            else {
                throw new IOException ("Something went wrong please try again");
            }
        } catch (ReflectiveOperationException exception) {
            exception.printStackTrace();
            System.out.println("Wrong login or password");


        }catch (IOException exception){
            System.out.println("Something went wrong please try again");
        }
        return resultValidation;

    }
}
