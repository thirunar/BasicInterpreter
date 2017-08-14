package com.sahaj.basic;

import com.sahaj.basic.handlers.Handler;
import com.sahaj.basic.handlers.InputHandler;
import com.sahaj.basic.handlers.PrintHandler;
import com.sahaj.basic.handlers.RemHandler;

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
        VARIABLES = new HashMap<>();
    }

    public void interpret(String code) {
        String[] literals = code.split(" ");
        String keyword = literals[1];

        for (Handler handler : handlers) {
            if (handler.canHandle(keyword)) {
                handler.handle(code);
            }
        }
    }
}
