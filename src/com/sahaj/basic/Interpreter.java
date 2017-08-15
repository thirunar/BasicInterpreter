package com.sahaj.basic;

import com.sahaj.basic.handlers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interpreter {

    static List<Handler> handlers;
    public static Map<String, Object> VARIABLES;
    static {
        handlers = new ArrayList<>();
        handlers.add(new PrintHandler());
        handlers.add(new RemHandler());
        handlers.add(new InputHandler());
        handlers.add(new AssignmentHandler());
        VARIABLES = new HashMap<>();
    }

    public void interpret(String code) {

        for (Handler handler : handlers) {
            if (handler.canHandle(code)) {
                handler.handle(code);
            }
        }
    }
}
