package constructor_1;
    // To take input from User
import java.util.Scanner;

/**
 *
 * @author Ahsan
 */
class employee{
    private String name;
    private int age;
    private String designation;
    private double salary;
    
    public employee(String name)
    {
     this.name=name;
    }
    public void empAge(int age)
    {
        this.age=age;
    }
    public void empDesignation(String designation)
    {
        this.designation=designation;
    }
    public void empSalary(double salary)
    {
        this.salary=salary;
    }
    public void display()
    {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Designation:" + this.designation);
        System.out.println("Salary:" + this.salary);
    }   
}    
public class Constructor_1 {
    public static void main(String[] args) {
        
            //
        String userName;
        int userAge;
        String userDesignation;
        double userSalary; 
        
        Scanner userInput=new Scanner(System.in); 
        
        System.out.println("Enter your Name:");
        userName=userInput.nextLine();
          
        System.out.println("Enter your Designation:");
        userDesignation=userInput.nextLine();
        
        System.out.println("Enter your Age:");
        userAge=userInput.nextInt(); 
        
        
        System.out.println("Enter your Salary:");
        userSalary=userInput.nextDouble();
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No.: 21-ARID-737");
        
        employee empOne = new employee(userName);
        empOne.empAge(userAge);
        empOne.empDesignation(userDesignation);
        empOne.empSalary(userSalary);
        
        employee empTwo = new employee("Abdul Subhan");
        empTwo.empAge(20);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(100000);
        
        empOne.display();
        empTwo.display();
    }
}
