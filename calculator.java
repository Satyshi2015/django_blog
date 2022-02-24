package com.first.second;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double Firstnumber = 0;
        double Secondnumber = 0;
        double result = 0;
        System.out.println("Enter first number: ");
        Firstnumber = sc.nextDouble();
        System.out.println("Enter operator : ");
        String operator = sc.next();
        switch (operator)
        {
            case "sin":
                result = Math.toRadians(Math.sin(Firstnumber));
                break;
            case "cos":
                result = Math.toRadians(Math.cos(Firstnumber));
                break;
            case "tan":
                result = Math.toRadians(Math.tan(Firstnumber));
                break;
            case "cot":
                result = (Math.toRadians(Math.cos(Firstnumber)) / Math.toRadians(Math.sin(Firstnumber)));
                break;
        }
        System.out.println(Math.toRadians(result));
        System.out.println("Enter second number: ");
        Secondnumber = sc.nextDouble();
        switch (operator)
        {
            case "+":
                result = Firstnumber + Secondnumber;
                break;
            case "-":
                result = Firstnumber - Secondnumber;
                break;
            case "*":
                result = Firstnumber * Secondnumber;
                break;
            case "/":
                result = Firstnumber / Secondnumber;
                break;
            case "%":
                result = Firstnumber % Secondnumber;
                break;
        }
        System.out.println(result);
    }
}
