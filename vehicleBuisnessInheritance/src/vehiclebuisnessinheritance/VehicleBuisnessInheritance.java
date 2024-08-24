package vehiclebuisnessinheritance;

/**
 *
 * @author Ahsan
 */
class vehicle
{
    protected String modelName;
    protected String registrationNumber; 
    protected String owner;
        // Default Constructor
    vehicle()
    {
        this.modelName="N/A";
        this.registrationNumber="N/A";
        this.owner="N/A";

    }
        // Overloaded Constructor
    vehicle(String modelName, String registrationNumber, String owner)
    {
        this.modelName= modelName;
        this.registrationNumber= registrationNumber;
        this.owner=owner;        
    }
        // Getter and Setter
    void setModelName(String modelName)
    {
        this.modelName = modelName;
    }
    String getModelName()
    {
        return this.modelName;
    }
    
   void setRegistrationNumber(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }
    String getRegistrationNumber()
    {
        return this.registrationNumber;
    }
    
    void setOwner(String owner)
    {
        this.owner = owner;
    }
    String getOwner()
    {
        return this.owner;
    }
        // Display
    String display()
    {
        return this.modelName + "--->" + this.registrationNumber + "--->" + this.owner;
    }
}
class car extends vehicle
{
    private String trunk;
            // Default Constructor
    car()
    {
        this.trunk="N/A";
    }
        // Overloaded Constructor
    car(String modelName, String registrationNumber, String owner, String trunk)
    {
        this.modelName= modelName;
        this.registrationNumber= registrationNumber;
        this.owner=owner;
        this.trunk=trunk;
    }
    
    void setTrunk(String trunk)
    {
        this.trunk = trunk;
    }
    String getTrunk()
    {
        return this.trunk;
    }
    
    @Override
    String display()
    {
        return super.display() +"--->" + this.trunk;
    }    
    
}
class truck extends vehicle
{
    private String cargoBed;
            // Default Constructor
    truck()
    {
        this.cargoBed="N/A";
    }
        // Overloaded Constructor
    truck(String modelName, String registrationNumber, String owner, String cargoBed)
    {
        this.modelName= modelName;
        this.registrationNumber= registrationNumber;
        this.owner=owner;
        this.cargoBed=cargoBed;
    }
    
    void setCargoBed(String cargoBed)
    {
        this.cargoBed = cargoBed;
    }
    String getCargoBed()
    {
        return this.cargoBed;
    }
    
    @Override
    String display()
    {
        return super.display() +"--->" + this.cargoBed;
    } 
    
}
public class VehicleBuisnessInheritance {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Assignment 2");
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        System.out.println("BS-SE(4-B)M");
        System.out.println("Submitted to: Ma'am Aiman\n\n");
        
        car carOne = new car("Lamborghini", "IDK-777", "John Doe", "500mm*500mm*500mm");
        System.out.println(carOne.display());
        
        truck truckOne = new truck("Truck", "ICT-999", "John Doe", "10m*10m*10m");
        System.out.println(truckOne.display());
    }
}
