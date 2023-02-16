/**
 * Created by marinatarasova on 02/03/2023
 */
public class LogicOperators {
    public static void main(String [] args){
        int value = 5;

        while(value>0){
            System.out.println("Hello apple " + value);
            value = value-1;

        }

        for(int i=0; i<=5; i++){
            System.out.println("Hello " + i);

        }


        if(value!=5){
            System.out.println("value not equels 5");
        } else if(value!=8&value!=5){
            System.out.println("value not equels 8");
        } else{
            System.out.println("value is " + value);
        }



    }
}
