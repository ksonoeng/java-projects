package Lessons;

import java.util.Scanner;

/**
 * Created by marinatarasova on 01/31/2023
 */
public class DoWhile {
    public static void main(String [] args){
        String nextLine = System.getProperty("line.separator");
        Scanner listener = new Scanner(System.in);
        int value;
        do{
            System.out.println("enter 5");
            value = listener.nextInt();
            if(value!=5){
                System.out.println("you entered " + value + nextLine);
            } else {
                System.out.println("you entered 5");
            }
        } while(value!=5);
    }
}
