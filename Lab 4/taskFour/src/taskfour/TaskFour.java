package taskfour;

/**
 *
 * @author Ahsan
 */
interface Ibank
{  
   float rateOfInterest();  
}  
class SBI implements Ibank
{  
    @Override
     public float rateOfInterest()
     {
           return 9.15f;
     }  
}  
class PNB implements Ibank
{  
    @Override
     public float rateOfInterest()
    {
        return 9.7f;
     }  
}
public class TaskFour {
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Name: Muhammad Ahsan");
      System.out.println("Arid No: 21-ARID-737");
      Ibank object=new SBI();  
      System.out.println("SBI: "+object.rateOfInterest()); 
      object=new PNB(); 
      System.out.println("PNB: "+object.rateOfInterest()); 
    }
}
