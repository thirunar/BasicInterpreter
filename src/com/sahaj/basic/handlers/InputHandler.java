package com.sahaj.basic.handlers;

import com.sahaj.basic.Interpreter;

import java.util.Scanner;

import static com.sahaj.basic.Interpreter.VARIABLES;

public class InputHandler implements Handler {

    @Override
    public void handle(String line) {
        String[] split = line.split("INPUT ");
        String variableName = split[1];
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        VARIABLES.put(variableName, value);
    }

    @Override
    public boolean canHandle(String command) {
        return "INPUT".equals(command);
    }
}
