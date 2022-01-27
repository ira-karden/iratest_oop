package com.example.java.init;

import com.example.java.ControlWorkProgram.LoginProcessing;
import com.example.java.ControlWorkProgram.Task1;
import com.example.java.ControlWorkProgram.Task2;
import com.example.java.ControlWorkProgram.Task3;
import com.example.java.TasksMenu.TaskMenu;

import java.util.Scanner;

public class init {
    public static void main(String[] args) {
        System.out.println("Enter your login");
        Scanner scanner = new Scanner(System.in);
        String checkLogin = scanner.nextLine().trim();
        System.out.println("Enter your password");
        String checkPassword = scanner.nextLine().trim();
        LoginProcessing user = new LoginProcessing(checkLogin,checkPassword);
        user.LoginValidation(checkLogin,checkPassword);

        if (user.getResultValidation() == true){
              System.out.println("Tasks menu:");
              System.out.println();
              TaskMenu tasks = new TaskMenu();
              tasks.TasksMenu(true);
              System.out.println();
              System.out.println("Enter the number of task for output it resolution");
              int taskNumber = scanner.nextInt();
                    if (taskNumber == 1){
                        System.out.println("Enter the integer number:");
                        int number = scanner.nextInt();
                        Task1 task1 = new Task1(number);
                        task1.CheckNumber(number);
                        System.out.println(task1.getResultMsg());
                    }
                    else if (taskNumber == 2){
                        System.out.println("Enter your integer Number for Armstrong checking");
                        int userNum = scanner.nextInt();
                        Task2 task2 = new Task2(userNum);
                        task2.checkingArmstrong(userNum);
                        System.out.println(task2.getResultMsg());
                    }
                    else if (taskNumber == 3){
                        System.out.println("Enter your String:");
                        Scanner s = new Scanner(System.in);
                        String userString = s.nextLine();
                        Task3 task3 = new Task3(userString);
                        System.out.println("Your new string here:");
                        System.out.println(task3.newUserString(userString));
                    }
        }
        else {
            System.out.println("Wrong login or password");
        }






    }
}
