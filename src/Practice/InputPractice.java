package Practice;

import java.util.Scanner;

/**
 * Created by marinatarasova on 02/04/2023
 */
public class InputPractice {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your zip code:");
        String zipCode = scan.nextLine();

        if(zipCode.length()==5){
            System.out.println("zip code " + zipCode + " is within the range");
        } else if(zipCode.isEmpty()){
            System.out.println("zip code field is blank");
        } else{
            System.out.println("Invalid zip code: " + zipCode);
        }
    }
}
