package taskthree;
/**
 *
 * @author Ahsan
 */
interface Iprintable{  
    void print();  
}  
class interfacImplementation implements Iprintable
{  
    @Override
    public void print()
    {
     System.out.println("Hello");
    }  
}  

public class TaskThree {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No: 21-ARID-737");
        Iprintable objectOne=new interfacImplementation();
        objectOne.print();
    }
}
