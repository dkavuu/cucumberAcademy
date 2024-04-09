package org.dev;

public class UserInput {
    public static void main(String[] args) {
        System.out.println(generateString());
    }

    public static String generateString() {
        StringBuilder result = new StringBuilder("Hello and welcome!\n");
        for (int i = 1; i <= 5; i++) {
            result.append("i = ").append(i).append("\n");
        }
        result.append("THIS IS THE RESULT OF THE USER INPUT CODE!");
        return result.toString();
    }
}