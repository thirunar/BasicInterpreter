package com.sahaj.basic;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader(new File("/Users/thirur/repos/BasicInterpretor/src/com/sahaj/basic/Program.bas"));
        BufferedReader bufferedReader = new BufferedReader(reader);
        Interpreter interpreter = new Interpreter();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            interpreter.interpret(line);
        }
    }
}
