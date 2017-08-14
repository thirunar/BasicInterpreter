package com.sahaj.basic.handlers;

public interface Handler {

    void handle(String line);

    boolean canHandle(String command);
}
