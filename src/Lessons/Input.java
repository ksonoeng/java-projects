package Lessons;

import java.util.Scanner;

/**
 * Created by marinatarasova on 01/30/2023
 */
public class Input {
    public static void main(String [] args) {
        Scanner listener = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
        System.out.println("enter your name:");
        String name = listener.nextLine();
        System.out.println("you entered: " + name.toUpperCase() + newLine);

        System.out.println("enter your age");
        int age = listener.nextInt();
        System.out.println("you entered: "+ age + newLine);

        System.out.println("what is your height?");
        double height = listener.nextDouble();
        System.out.println("your height is " + height + newLine);



        System.out.println("Let's summarize." + newLine + "Your name is " + name.toUpperCase() + "." + newLine + "Your age is " + age + "." + newLine + "Your height is " + height + " ft" + ".");

    }
}
