package com.example.java.ControlWorkProgram;

import java.util.Scanner;

/*
Reverse (Напишите программу для переворачивания строки, изменив расположение символов в строке задом наперёд
без использования встроенных в String функций.)
 */
public class Task3 {

    private String userString;
    private String newUserString;

   public Task3 (String userString){
        this.userString = userString;
    }
    public Task3 (){
        System.out.println("Enter your String");
    }
    public void setUserString (String userString){
        this.userString = userString;
    }
    public String getUserString(){
       return userString;
    }
    public void setNewUserString (String userString){
       this.newUserString = newUserString(getUserString());
    }

    public String getNewUserString(){
       return newUserString;
    }

    public String newUserString (String userString){
        String newUserString ="";
                String [] str = new String[userString.length()];
        int j = 1;
        for (int i = 0; i<str.length; i++){
            str[i] = Character.toString(userString.charAt(userString.length()-j));
            newUserString = newUserString.concat(str[i]);
            j++;
        }
        return newUserString;

    }
}

