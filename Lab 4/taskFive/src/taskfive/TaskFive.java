package taskfive;

/**
 *
 * @author Ahsan
 */
interface Iprintable
{
    int min=5; 
    void print();
}
class concreteClass implements Iprintable
{
    @Override
    public void print()
    {
        // MIN=7; cannot assign a value to final variable MIN
        System.out.println(min);
    }
}

public class TaskFive {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No: 21-ARID-737");
        System.out.println(Iprintable.min);
        concreteClass obj = new concreteClass();  
        obj.print();    

    }
}
