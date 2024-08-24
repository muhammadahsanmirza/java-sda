package aggregation;
/**
 *
 * @author Ahsan
 */
class person
{
    private String personName;
    private int age;

    person(String personName, int age)
    {
        this.personName = personName;
        this.age = age;
    }
    void printInfo()
    {
        System.out.println("Person Name:   "+personName+"\nPerson Age:    "+age);
    }
}
class country{

    private String countryName;
    private person person;

    country(String countryName, person person)
    {
            this.countryName = countryName;
            this.person = person;
    }
    void printInfo()
    {
            System.out.println("Country Name:    " + countryName);
            person.printInfo();

    }

}

public class Aggregation {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name : Muhammad Ahsan");
        System.out.println("Arid No. : 21-Arid-737");
        person personOne;
        personOne = new person("Hassan", 21);

        country countryName=new country("Pakistan", personOne);

        countryName.printInfo();

    }
}
