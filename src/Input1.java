import java.util.Scanner;

/**
 * Created by marinatarasova on 02/04/2023
 */
public class Input1 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your password:");

        String passwordField = scan.nextLine();

        if(passwordField.length()>0){
            System.out.println("you entered: " + passwordField);
        } else{
            System.out.println("you entered nothing");
        }

    }
}
