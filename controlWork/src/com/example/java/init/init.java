package com.example.java.init;

import com.example.java.ControlWorkProgram.*;
import com.example.java.TasksMenu.TaskMenu;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class init {
    public static void main(String[] args) throws Exception {
        String checkLogin = "";
        LoginProcessing login = new LoginProcessing();

            System.out.println("Enter your login:");
                Scanner scanner = new Scanner(System.in);
                checkLogin = scanner.nextLine().trim();
                System.out.println("Enter your password:");
                String checkPassword = scanner.nextLine().trim();
                LoginProcessing user = new LoginProcessing(checkLogin, checkPassword);
                user.setCheckPassword(checkPassword);
                user.LoginValidation(checkLogin, checkPassword);

                if (user.getResultValidation()) {
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
                            try {
                                int number = scanner.nextInt();
                                Task1 task1 = new Task1(number);
                                task1.CheckNumber(number);
                                System.out.println(task1.getResultMsg());
                            } catch (InputMismatchException exception){
                                System.out.println("Error! Enter the integer number.");
                            }

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

                                System.out.println(task3.newUserString(userString));


                        } else if (taskNumber == 4) {
                            System.out.println("Enter how many Fibonacci numbers you want to calculate:");
                            try{
                                int countF = scanner.nextInt();
                                Task4 task4 = new Task4(countF);
                                task4.calculationResult(countF);
                                System.out.println(task4.getResult());
                            }catch (InputMismatchException exception){
                            System.out.println("Error! Enter the integer number.");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        } else if (taskNumber == 5) {
                            String str = "";
                            do{
                               System.out.println("Enter the string for replacing. Max length 30 symbols:");
                                Scanner s = new Scanner(System.in);
                               str = s.nextLine();
                                Task5 task5 = new Task5(str);
                            task5.beforeReplace(str);
                            } while (str.length()>30);

                        } else {
                            System.out.println("A solution is available for only 5 tasks. Start again and enter a value from 1 to 5:\n");
                        }
            } while (taskNumber <= 0 || taskNumber > 5);
                } else {
                    System.out.println("Try Again");
                }
            }
    }

