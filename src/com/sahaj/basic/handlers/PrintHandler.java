package com.sahaj.basic.handlers;

import com.sahaj.basic.Interpreter;

import static com.sahaj.basic.Interpreter.VARIABLES;

public class PrintHandler implements Handler {

    @Override
    public void handle(String line) {
        String[] splits = line.split("\"");
        if (line.contains("\""))
            System.out.println(splits[1]);
        else {
            printVariable(line);
        }
    }

    @Override
    public boolean canHandle(String code) {
        String[] literals = code.split(" ");
        String command = literals[1];

        return "PRINT".equals(command);
    }

    private void printVariable(String line) {
        String[] split = line.split("PRINT ");
        if (VARIABLES.get(split[1]) != null)
            System.out.println(VARIABLES.get(split[1]));
    }

}
