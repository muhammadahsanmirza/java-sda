package taskseven;

/**
 *
 * @author Ahsan
 */
interface Iprintable{  
	    void print();  
}  
interface Ishowable extends Iprintable{  
     void show();  
}  
class inheritingInterfaces implements Ishowable
{  
    @Override
       public void print(){System.out.println("Hello \n");}  
    @Override
      public void show(){System.out.println("Welcome");}  
}

public class TaskSeven {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No: 21-ARID-737");        
        inheritingInterfaces obj = new inheritingInterfaces();  
        obj.print();  
        obj.show();  

    }
}
