
package crm;
import java.util.Scanner;
/**
 *
 * @author Ahsan
 */
        // Data Members
class customer{
    private int id; 
    private String name;
    private String gender;
    private String contactNumber;
    private String address;
            // Default Constructor
    public customer()
    {
        this.id=0;
        this.name="N/A";
        this.gender="N/A";
        this.contactNumber="N/A";
        this.address="N/A";
    }
            // Parametrized Constructor
    public customer(int id, String name, String gender, String contactNumber, String address)
    {
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.contactNumber=contactNumber;
        this.address=address;
    }
            // Getter-Setter Methods
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }

    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getGender()
    {
        return this.gender;
    }

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber=contactNumber;
    }
    public String getContactNumber()
    {
        return this.contactNumber;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return this.address;
    }
              // Display Method
    public void display()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println("Address: " + this.address);

    }
            
}
public class CRM {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Section: BS-SE 4-B ");
        System.out.println("Arid No.: 21-Arid-737");
        System.out.println("Submitted to : Ma'am Aiman Khan ");
        
        Scanner userInputOne = new Scanner(System.in);
        Scanner userInputTwo = new Scanner(System.in);
        
        int userID;
        String userName;
        String userGender;
        String userContactNumber;
        String userAddress;
        
        customer customerOne= new customer(1, "Muhammad Ahsan", "Male", "0300-0000000", "Rwp");
        
        customer customerTwo= new customer();  
        
            System.out.println("Enter your ID:");
            userID = userInputOne.nextInt();
            
            customerTwo.setId(userID);

            System.out.println("Enter your Name:");
            userName = userInputTwo.nextLine();

            customerTwo.setName(userName);
            
            System.out.println("Enter your Gender:");
            userGender = userInputTwo.nextLine();
            
            customerTwo.setGender(userGender);

            System.out.println("Enter your Contact Number:");
            userContactNumber = userInputTwo.nextLine();
            
            customerTwo.setContactNumber(userContactNumber);

            System.out.println("Enter your Address:");
            userAddress = userInputTwo.nextLine();

            customerTwo.setAddress(userAddress);
        
        customer customerThree= new customer();
        
            System.out.println("Enter your ID:");
            userID = userInputOne.nextInt();
            
            customerThree.setId(userID);

            System.out.println("Enter your Name:");
            userName = userInputTwo.nextLine();

            customerThree.setName(userName);
            
            System.out.println("Enter your Gender:");
            userGender = userInputTwo.nextLine();
            
            customerThree.setGender(userGender);

            System.out.println("Enter your Contact Number:");
            userContactNumber = userInputTwo.nextLine();
            
            customerThree.setContactNumber(userContactNumber);

            System.out.println("Enter your Address:");
            userAddress = userInputTwo.nextLine();

            customerThree.setAddress(userAddress);
        
        
        System.out.println("\t\t<------Customer 1------>");
        customerOne.display();
        
        System.out.println("\t\t<------Customer 2------>");      
        customerTwo.display();
        
        System.out.println("\t\t<------Customer 3------>");
        customerThree.display();

    }
}
