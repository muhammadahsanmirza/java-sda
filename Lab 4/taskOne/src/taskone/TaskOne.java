package taskone;

/**
 *
 * @author Ahsan
 */
abstract class employee 
 {
   private String name;
   private String address;
   private int number;
   
   public employee(String name, String address, int number) {
       System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public void setName(String name) {
      this.name=name;
   }
   public String getName() {
      return name;
   }
   
   public void setAddress(String address) {
      this.address = address;
   }
   public String getAddress() {
      return address;
   }

   public void setNumber(int number) {
      this.number = number; 
   }   
   public int getNumber() {
      return number; 
   }
   public abstract double computePay();
//   public double computePay() {
//      System.out.println("Inside Employee computePay");
//     return 0.0;
//   }

   public void mailCheck() {
    System.out.println("Mailing a check to " + this.name + " " + this.address);
   }

    @Override
   public String toString() {
      return name + " " + address + " " + number;
   }
    
   }
 class salary extends employee {
   private double salary;   // Annual salary

   public salary(String name, String address, int number, double salary) 
   {
      super(name, address, number);
      setSalary(salary);
   }
     @Override
   public void mailCheck() {
    System.out.println("Within mailCheck of Salary class ");
    System.out.println("Mailing check to " + getName() + " with salary " + salary);
   }
   public double getSalary() {
      return salary;
   }
   public final void setSalary(double newSalary) {
      if(newSalary>= 0.0) {
         salary = newSalary;
      }
   }
     @Override
   public double computePay() {
       System.out.println("Computing salary pay for " + getName());
      return salary/52;
   } 
 }


public class TaskOne {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No: 21-ARID-737");

      salary s = new salary("MohdMohtashim", "Ambehta, UP", 3, 3600.00);
      employee e = new salary("John Adams", "Boston, MA", 2, 2400.00);
       System.out.println("Call mailCheck using Salary reference --");
       s.mailCheck();
       System.out.println("\n Call mailCheck using Employee reference--");
       e.mailCheck();

    }
}
