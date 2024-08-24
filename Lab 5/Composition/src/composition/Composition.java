package composition;
/**
 *
 * @author Ahsan
 */
class birthDay
{
    private int day;
    private int month;
    private int year;

    birthDay(){
    }
    birthDay(int day, int month, int year)
    {
            this.day = day;
            this.month = month;
            this.year = year;
            
    }
    void printInfo()
    {
            System.out.println( " Bitrhday: " + (day) + "-" + (month) + "-" + (year));
    }
}

class person
{
    private String name;
    public birthDay dob;

    person(String name)
    {
            this.name = name;
    }
    void printInfo()
    {
            System.out.println(" Name: " + name);
            dob.printInfo();

    }
}

public class Composition {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name : Muhammad Ahsan");
        System.out.println("Arid No. : 21-Arid-737");
          person p = new person("John Doe");
        p.dob = new birthDay(01, 01, 2001);
        p.printInfo();
    }
}