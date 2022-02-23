package com.example.java.ControlWorkProgram;
/*
2. Armstrong (Напишите программу для проверки является ли введенное число - числом Армстронга.
Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит, возведенных в степень, равную количеству цифр в этом числе.
Как пример - число 371:
371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
 */

import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Task2 {

    private int sum;
    private int userNum;
    private String resultMsg;

    public Task2 (int userNum){
        this.userNum = userNum;
    }
    public Task2 (){
        System.out.println("Enter your integer Number");
    }

    public void setUserNum (int userNum){
        this.userNum = userNum;
    }
    public void setSum(int userNum) throws ReflectiveOperationException {
        this.sum = sumCounting(userNum);
    }
    public int getSum (){
        return sum;
    }
    public void setResultMsg(int sum) throws ReflectiveOperationException {
        this.resultMsg = checkingArmstrong(sum);
    }
    public String getResultMsg() throws NullPointerException{
        try{
            if (resultMsg == null) {
                throw new NullPointerException("Received Value incorrect");
            }
            else {
                return resultMsg;
            }
        }catch (NullPointerException exception){
            System.out.println("Cannot get result. Enter Correct value");
            exception.printStackTrace();
        }
        return "";
    }
    public int sumCounting (int userNum) {

            int power = String.valueOf(userNum).length();
            String number = String.valueOf(userNum);
            int[] n = new int[number.length()];
            for (int i =0; i < number.length(); i++){
                n[i] = Integer.parseInt(number.substring(i,i+1));
            }

            for (int i =0; i < n.length; i++){
                sum = sum + (int)Math.pow (n[i], power);
            }
        return sum;
    }
     public String checkingArmstrong (int userNum) throws IllegalArgumentException  {

        try {
            if (userNum<=0){
                throw new IllegalArgumentException ("Value cannot be negative");
            }
            sum = sumCounting(userNum);
            if(userNum == sum){
                resultMsg = "Yeees, its Armstrong number";
            }
            else {
                resultMsg = "Nooo, its not Armstrong number";
            }
        }catch (IllegalArgumentException  exception){
            System.out.println("Error! Please enter a value greater than zero.");
        }

         return resultMsg;
     }

}
