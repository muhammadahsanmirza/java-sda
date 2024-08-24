package mainclass;
/**
 *
 * @author Ahsan
 */
class bike{
    protected String color;
    protected int wheels;
    
    public void setColor(String color){
        this.color=color;
    }
    public void setWheels(int wheels){
        this.wheels=wheels;
    }
    public void bikeFeatures(){
        System.out.println("Bike color is : " + this.color);
        System.out.println("Bike wheels are : " + this.wheels);

    }
} 
class honda extends bike{
    private hondaEngine engine;
    honda(){
        engine = new hondaEngine();
    }
    public void setStart(){
        engine.Start();
    }
}
class hondaEngine{
    void Start(){
        System.out.println("Engine Started");
    }
    void Stop(){
        System.out.println("Engine Stoped");
    }
}
public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");

        honda hondaBike = new honda();
        hondaBike.setColor("Black");
        hondaBike.setWheels(2);
        hondaBike.bikeFeatures();
        hondaBike.setStart();
    }
}
