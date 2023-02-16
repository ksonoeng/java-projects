import java.util.Scanner;

/**
 * Created by marinatarasova on 02/07/2023
 */
public class DoWhile1 {
    public static void main(String [] args){
        Scanner listener = new Scanner(System.in);
        int value;

        /*
        System.out.println("enter your number");
        int value = listener.nextInt();
        while(value!=5){
            System.out.println("enter 5");
            value = listener.nextInt();
        }
        System.out.println("you entered 5");

  */


        do{
            System.out.println("enter 5");
            value = listener.nextInt();
        } while(value!=5);

        System.out.println("you entered 5");



    }
}
