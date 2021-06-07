/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */
import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit");
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        double celsius,fahrenheit;
        System.out.println("Your choice:" + key);
        if (key.equals("c")|| key.equals("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit:");
            fahrenheit = scan.nextDouble();
            celsius = (fahrenheit-32) * 5/9;
            System.out.println("The temperature in Celsius is " + celsius);
        }
        else
        {
            System.out.println("Please enter the temperature in Celsius:");
            celsius = scan.nextDouble();
            fahrenheit =(celsius * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is" + fahrenheit);
        }
    }
}
