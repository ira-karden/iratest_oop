package com.example.java.TasksMenu;

import java.util.Scanner;

public class TaskMenu {
//    private int taskNumber;
    public void TasksMenu(boolean result) {
        String[] Tasks = {"Even Number", "Armstrong", "Reverse", "Fibonacci", "Replace"};
        int taskCount = 0;
        while (taskCount < Tasks.length){
            System.out.println((taskCount+1)+". "+Tasks[taskCount]);
            taskCount++;
        }
    }
}
