package org.dev;

public class Main {
    public static void main(String[] args) {
        CodeCompiler codeCompiler = new CodeCompiler();
        String result = codeCompiler.executeCode();
        System.out.println(result);
    }
}