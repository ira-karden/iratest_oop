package com.example.java.ControlWorkProgram;
/*
4. Fibonacci (Рассчитать первых 50 чисел Фиббоначии вывести их на экран)
 */
public class Task4 {

    private int countF;
    private long preNumber = 1;
    private long currNumber = 0;
    private int i = 0;
    private String result = "0";

    public Task4(int countF){
        this.countF = countF;
    }
    public void setCount (int countF){
        this.countF = countF;
    }
    public void setResult(int countF){
        this.result = calculationResult(countF);
    }
    public String getResult(){
        return result;
    }
    public String calculationResult (int countF){
        while (i < countF/2){
            preNumber = currNumber + preNumber;
            result = result.concat(", "+preNumber);
            if (countF%2 ==0 && i < (countF/2)-1 ) {
                currNumber = currNumber + preNumber;
                result = result.concat(", "+currNumber);
            }
            else if (countF%2 !=0){
                currNumber = currNumber + preNumber;
                result = result.concat(", "+currNumber);
            }
            i++;
        }
        return result;
    }
}

