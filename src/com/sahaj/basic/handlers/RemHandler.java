package com.sahaj.basic.handlers;

public class RemHandler implements Handler {

    @Override
    public void handle(String line) {

    }

    @Override
    public boolean canHandle(String command) {
        return "REM".equals(command);
    }
}
