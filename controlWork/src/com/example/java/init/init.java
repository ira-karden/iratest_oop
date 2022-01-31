package com.example.java.init;

import com.example.java.ControlWorkProgram.*;
import com.example.java.TasksMenu.TaskMenu;

import java.util.Locale;
import java.util.Scanner;

public class init {
    public static void main(String[] args) {
        String checkLogin = "";
        LoginProcessing login = new LoginProcessing();


        do {
            System.out.println("Enter your login:");
            Scanner scanner = new Scanner(System.in);
            checkLogin = scanner.nextLine().trim();
            login.LoginValidation(checkLogin);
//            LoginProcessing login = new LoginProcessing(checkLogin);
            if(login.getLoginValidation() == false){
                System.out.println("Login is not correct");
            }
        } while (login.getLoginValidation() == false);

//            if (login.getResultValidation()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your password:");
                String checkPassword = scanner.nextLine().trim();
                LoginProcessing user = new LoginProcessing(checkLogin, checkPassword);
                user.LoginValidation(checkLogin, checkPassword);

                if (user.getResultValidation() == true) {
                    System.out.println("Tasks menu:");
                    System.out.println();
                    TaskMenu tasks = new TaskMenu();
                    tasks.TasksMenu(true);
                    System.out.println();
                    int taskNumber = 1;
                    do {
                        System.out.println("Enter the number of task for output it resolution");
                        taskNumber = scanner.nextInt();
                        if (taskNumber == 1) {
                            System.out.println("Enter the integer number:");
                            int number = scanner.nextInt();
                            Task1 task1 = new Task1(number);
                            task1.CheckNumber(number);
                            System.out.println(task1.getResultMsg());
                        } else if (taskNumber == 2) {
                            System.out.println("Enter your integer Number for Armstrong checking");
                            int userNum = scanner.nextInt();
                            Task2 task2 = new Task2(userNum);
                            task2.checkingArmstrong(userNum);
                            System.out.println(task2.getResultMsg());
                        } else if (taskNumber == 3) {
                            System.out.println("Enter your String:");
                            Scanner s = new Scanner(System.in);
                            String userString = s.nextLine();
                            Task3 task3 = new Task3(userString);
                            System.out.println("Your new string here:");
                            System.out.println(task3.newUserString(userString));
                        } else if (taskNumber == 4) {
                            System.out.println("Enter how many Fibonacci numbers you want to calculate:");
                            int countF = scanner.nextInt();
                            Task4 task4 = new Task4(countF);
                            System.out.println(countF + " Fibonacci numbers are calculated below:");
                            task4.calculationResult(countF);
                            System.out.println(task4.getResult());
                        } else if (taskNumber == 5) {
                            String str = "";
                                do{
                                System.out.println("Enter the string for replacing. Max length 30 symbols:");
                                Scanner s = new Scanner(System.in);
                                str = s.nextLine();
                                    if (str.length()<=30) {
                                        Task5 task5 = new Task5(str);
                                        System.out.println("Your reverse string: \n" + task5.replaceStr(str));
                                    }
                                    else {
                                        System.out.println("Max length 30 symbols!");
                                        }
                                } while (str.length()>30);
                        } else {
                            System.out.println("A solution is available for only 5 tasks. Start again and enter a value from 1 to 5:\n");
                        }
                    } while (taskNumber <= 0 || taskNumber > 5);
                } else {
                    System.out.println("Wrong login or password");
                }
            }
    }

