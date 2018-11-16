package com.exmple.helloworld;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("test string please ignore"+"");
        int hay = 1;
        System.out.println(hay);
        String text = "includes text";
        int wholeNumber = 123;
        double decimalNumber = 3.141592653;
        boolean isTrue = true;
//TODO hey
        System.out.println("The variable's type is text. Its value is " + text);
        System.out.println("The variable's type is integer. Its value is  " + wholeNumber);
        System.out.println("The variable's type is decimal number. Its value is " + decimalNumber);
        System.out.println("The variable's type is truth value. Its value is " + isTrue);
        while (true) {
            System.out.println("I can program!");
            System.out.println("    *");
                    System.out.println("   ***");
                            System.out.println("  *****");
                                    System.out.println(" ******* " );
                            System.out.println("*********");



            System.out.print("Continue? ('no' to quit)? ");
            String command = reader.nextLine();
            if (command.equals("no")) {
                break;
                            }

        }
    }
}