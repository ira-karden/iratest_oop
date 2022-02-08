package com.example.java.ControlWorkProgram;

import java.util.Scanner;

/*
Even Number (Напишите программу которая определяет, является ли число четным или нет.
Проверять только целые числа. Добавить обработку ошибок с описанием.)
 */
public class Task1 {

    private int number;
    private String resultMsg;

    public Task1(int number){
        this.number = number;
    }
    public Task1(){
        System.out.println("Enter the integer number:");
    }
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber (){
        return number;
    }
    public void setResultMsg(int number){
        this.resultMsg = CheckNumber(getNumber());
    }
    public String getResultMsg(){
        return resultMsg;
    }
    public String CheckNumber (int number){
        if(number%2==0){
            resultMsg = "It's an even number";
            return resultMsg;
        }
        else if (number%2 != 0){
            resultMsg = "It's not an even number";
            return resultMsg;
        }
        resultMsg = "Error. Enter the valid value. Only integer number allowed";
        return resultMsg;
    }

}
