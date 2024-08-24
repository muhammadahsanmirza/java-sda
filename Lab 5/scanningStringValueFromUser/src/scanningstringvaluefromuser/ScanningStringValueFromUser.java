package scanningstringvaluefromuser;
import java.util.*;
/**
 *
 * @author Ahsan
 */
public class ScanningStringValueFromUser {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name : Muhammad Ahsan");
        System.out.println("Arid No. : 21-Arid-737");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string:");
        String stringOne =userInput.nextLine();
        
        System.out.println("You entered : " + stringOne);
        

    }
}
