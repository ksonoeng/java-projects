package Lessons;

/**
 * Created by marinatarasova on 02/15/2023
 */
public class Break_Continue {
    public static void main(String[] args){
        int value = 15;
        String nextLine = System.getProperty("line.separator");
        while (value < 20 && value > 5) {
            System.out.println("Print value " + value);
            value--;
            if(value == 10){
                System.out.println(nextLine + "You've riched the point.");
                break;
            }
        }

    }
}
