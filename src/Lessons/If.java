package Lessons;

/**
 * Created by marinatarasova on 01/27/2023
 */
public class If {
    public static void main(String [] args) {
        int myInt = 15;
        if(myInt<10){
            System.out.println("Yes, it's true.");
        } else if(myInt>20){
            System.out.println("No, that's not true.");
        } else{
            System.out.println("No one from the above.");
        }
        myInt = 5;
        if(myInt<10){
            System.out.println("Yes, it's true.");
        } else if(myInt<20){
            System.out.println("No, that's not true.");
        }
    }
}
