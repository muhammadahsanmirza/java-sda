package inheritance__01;

/**
 *
 * @author Ahsan
 */
class vehicle 
{
    protected String brand = "Ford";
    String getBrand()
    {
        return this.brand;
    }
}
class car extends vehicle
{
    private String model = "Mustang";
    String getModel()
    {
        return this.model;
    }
}


public class Inheritance__01 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No.: 21-ARID-737");
        
        car myCar=new car();
        
        System.out.println(myCar.getModel());
        System.out.println(myCar.getBrand());

    }
}
