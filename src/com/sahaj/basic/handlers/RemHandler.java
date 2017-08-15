package com.sahaj.basic.handlers;

public class RemHandler implements Handler {

    @Override
    public void handle(String line) {

    }

    @Override
    public boolean canHandle(String code) {
        String[] literals = code.split(" ");
        String command = literals[1];

        return "REM".equals(command);
    }
}
