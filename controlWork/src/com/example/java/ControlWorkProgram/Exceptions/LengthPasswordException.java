package com.example.java.ControlWorkProgram.Exceptions;

public class LengthPasswordException extends Exception {
    private int passLength;
    public LengthPasswordException(int passLength){
        this.passLength = passLength;
    }
}
