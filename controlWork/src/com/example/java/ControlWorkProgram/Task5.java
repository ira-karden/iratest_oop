package com.example.java.ControlWorkProgram;
/*
5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль. Выводит новую строку на экран.
Добавить обработку длины строки, максимальная длина 30 символов.
Строка может состоять из нескольких слов и любых символов)
 */

public class Task5 {

    private String str;
    private String newStr;
    public Task5(String str){
        this.str = str;
    }
    public void setStr(String str){
        this.str = str;
    }
    public void setNewStr(String str){
        this.newStr = replaceStr(str);
    }
    public String getNewStr() {
        return newStr;
    }

    public String replaceStr(String str) {
        newStr = str.replace("a", "@").replace("A", "@").replace("а", "@").replace("А", "@"); // для текстов en и ru кодировки
        newStr = newStr.replace("o", "0").replace("O", "0").replace("о","0").replace("О", "0"); // для текстов en и ru кодировки
        return newStr;
    }
}
