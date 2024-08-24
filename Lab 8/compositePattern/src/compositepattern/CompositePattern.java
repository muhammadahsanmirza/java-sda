package compositepattern;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahsan
 */
class employee{
    private String name;
    private String dept;
    private int salary;
    private List<employee> subordinates;
    
    public employee(){
        this.name="N/A";
        this.dept="N/A";
        this.salary=0;
        this.subordinates=null;     
}
    public employee(String name, String dept,int salary){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        this.subordinates=new ArrayList(); 
}
    
    public void add(employee e ){
        subordinates.add(e);
    }
    
    public void remove(employee e ){
        subordinates.remove(e);
    }
    
    public List<employee> getSubordinates(){
        return subordinates;
    }
    
    @Override
    public String toString(){
        return "Employee[ Name : "+ this.name + " , Dept : " + this.dept + " , Salary : " + this.salary + "]";
    }
            
}
public class CompositePattern {
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Muhammad Ahsan");
       System.out.println("21-ARID-737");
       
        employee CEO = new employee("john", "CEO", 30000);
        employee headSales = new employee("Robert","Head Sales", 20000);
        employee headMarketing = new employee("Micheal", "Head Marketing",20000);
        employee clerkOne = new employee("Laura","Marketing", 10000);
        employee clerkTwo = new employee("Bob","Marketing", 10000);
        employee salesExecutiveOne = new employee("Richard", "Sales",10000);
        employee salesExecutiveTwo = new employee("Rob", "Sales",10000);
        
        CEO.add(headSales);
        CEO.add(headMarketing);
        
       headSales.add(salesExecutiveOne);
       headSales.add(salesExecutiveTwo);

       headMarketing.add(clerkOne);
       headMarketing.add(clerkTwo);
       System.out.println("CEO");
       for(employee headEmployee : CEO.getSubordinates()){
              System.out.println(headEmployee);
                for(employee employee : headEmployee.getSubordinates()){
                    System.out.println(employee);
                }
       }
    }
}
