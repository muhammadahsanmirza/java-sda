package usingscannerclass;
import java.util.*;
/**
  *
  * @author Ahsan
 */

public class UsingScannerClass {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name : Muhammad Ahsan");
        System.out.println("Arid No. : 21-Arid-737");

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter first Number");        
        int numOne = userInput.nextInt();
        
        System.out.println("Enter Second Number");

        int numTwo = userInput.nextInt();
        
        System.out.println("Enter Third Number");
        int numThree = userInput.nextInt();

        int result = numOne + numTwo + numThree;
         
        System.out.println("Result of addition is: " + result);

              
    }
}
