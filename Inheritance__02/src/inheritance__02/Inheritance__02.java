
package inheritance__02;

/**
 *
 * @author Ahsan
 */
class vehicle 
{
    protected String brand;
    String getBrand()
    {
        return this.brand;
    }
}
class car extends vehicle
{
    private String model;
    car()
    {
     this.model="LamborGhini";
     this.brand="Sian";
    }
   
    String getModel()
    {
        return this.model;
    }
}
public class Inheritance__02 {
    public static void main(String[] args) {
        // TODO code application logic he
        
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No.: 21-ARID-737");
        
        car myCar=new car();
        
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getModel());
    }
}
