package com.sahaj.basic.handlers;

import com.sahaj.basic.Interpreter;

public class AssignmentHandler implements Handler {

    @Override
    public void handle(String line) {
        String[] literals = line.split(" ");
        String variable = getVariable(literals[1]);
        String[] splitByEqual = line.split("=");
        String value = splitByEqual[1].trim();
        Interpreter.VARIABLES.put(variable, Integer.parseInt(value));
    }

    @Override
    public boolean canHandle(String code) {
        String[] literals = code.split(" ");
        return code.contains("=") &&
                getVariable(literals[1]).length() == 1 &&
                getVariable(literals[1]).matches("[a-zA-Z]");
    }

    private String getVariable(String literal) {
        return literal.split("=")[0];
    }
}
