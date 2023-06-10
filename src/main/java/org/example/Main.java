package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String regex = "^(1(0)|[1-9])\\s([\\+\\-\\*\\/])\\s(1(0)|[1-9])$";
        String expression = scan.nextLine();
        if(!expression.matches(regex)) throw new InvalidInputException("Невалидный ввод, используйте выражение типа (a + b), операнд отделяется пробелами, для ввода доступны значения от 1 до 10");
        System.out.println(calc(expression));
    }

    public static String calc(String input) {
        String[] exp = input.split(" ");
        int a = Integer.parseInt(exp[0]);
        int b = Integer.parseInt(exp[2]);
        String operand = exp[1];
        switch (operand){
            case "+":
                return Integer.toString(a+b);
            case "-":
                return Integer.toString(a-b);
            case "*":
                return Integer.toString(a*b);
            case "/":
                return Integer.toString(a/b);
        }
        return "Error";
    }
}