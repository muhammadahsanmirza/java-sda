/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Ahsan
 */
class carInfo{
public String brand;
public String model;
public int year;
}
public class Car {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
       carInfo car1 = new carInfo();
       car1.brand="BMW";
       car1.model="X5";
       car1.year=1999;
       
       carInfo car2 = new carInfo();
       car2.brand="Ford";
       car2.model="Mustang";
       car2.year=1969;
       System.out.println(car1.brand+" "+car1.model+" "+car1.year);
       System.out.println(car2.brand+" "+car2.model+" "+car2.year);        
    }
}
