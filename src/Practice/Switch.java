package Practice;

import java.util.Scanner;

/**
 * Created by marinatarasova on 02/19/2023
 */
public class Switch {
    public static void main(String[] args){
        Scanner day = new Scanner(System.in);
        String nextLine = System.getProperty("line.separator");
        System.out.println("Enter your day." + nextLine);

        printWeekDay(day);

    }

    public static void printWeekDay(Scanner listener) {
        listener = new Scanner(System.in);
        String weekDay = listener.nextLine();

        switch (weekDay)
        {
            case "Monday":
                System.out.println("Do something 1.");
                break;

            case "Tuesday":
                System.out.println("Do something 2.");
                break;

            case "Wednesday":
                System.out.println("Do something 3.");
                break;

            case "Thursday":
                System.out.println("Do something 4.");
                break;

            case "Friday":
                System.out.println("Do something 5.");
                break;

            case "Saturday":
                System.out.println("Do something 6.");
                break;

            case "Sunday":
                System.out.println("Go to church.");
                break;

        }
    }

}
