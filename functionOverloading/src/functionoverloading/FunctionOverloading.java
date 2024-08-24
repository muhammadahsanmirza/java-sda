package functionoverloading;

/**
 *
 * @author Ahsan
 */

class adder
{  
     int add(int numOne,int numTwo)
     {
         return numOne+numTwo;
     }  
     int add(int numOne,int numTwo,int numThree)
     {
         return numOne+numTwo+numThree;
     }  
} 

public class FunctionOverloading {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No.: 21-ARID-737");
        adder addNumber = new adder();
        System.out.println("Sum of two numbers is: " + addNumber.add(12, 23));
        System.out.println("Sum of three numbers is: " + addNumber.add(12, 23,34));

    }
}
