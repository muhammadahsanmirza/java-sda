package observerpatternexample;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahsan
 */

interface IdisplayElement{
    void display();
}
interface Isubject{
    void registerObserver(observer obs);
    void removeObserver(observer obs);
    void notifyObserver();
}
class weatherData implements Isubject{
    private float temprature;
    private float humidity;
    private float pressure;
    private List<observer> observers  = new ArrayList<> () ;

    void setTemprature(float temprature){
        this.temprature = temprature;
        notifyObserver();
    }
    float getTemprature(){
        return this.temprature;
    }
    void setHumidity(float humidity){
        this.humidity = humidity;
        notifyObserver();
    }
    float getHumidity(){
        return this.humidity;
    }
    void setPressure(float pressure){
        this.pressure = pressure;
        notifyObserver();        
    }
    float getPressure(){
        return this.pressure;
    }
    @Override
    public void registerObserver(observer obs) {
        observers.add(obs);        
    }

    @Override
    public void removeObserver(observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(observer obs : observers){
            this.measurementsChanged();
            obs.update(this.temprature,this.humidity,this.pressure);
        }
    }
    
     public void measurementsChanged() {
         System.out.println("Measurements Changed");
    }
      public void setMeasurements(float temprature,float humidity,float pressure) {
          this.temprature = temprature;
          this.humidity = humidity;
          this.pressure = pressure;
          this.notifyObserver();
    }
}
abstract class observer{
    protected weatherData wd;
    abstract void update(float temprature,float humidity,float pressure);
}
class currentConditionDisplay extends observer implements IdisplayElement{   
    currentConditionDisplay(weatherData wd){
        this.wd = wd;
        wd.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temprature is : " +wd.getTemprature());
        System.out.println("Humidity is : " + wd.getHumidity());
        System.out.println("Pressure is : " + wd.getPressure());        
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.display();
    }
    
}
public class ObserverPatternExample {
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Name : Muhammad Ahsan");
         System.out.println("Arid No. :  21-ARID-737");
        
        weatherData weatherDataChanger = new weatherData();        
        currentConditionDisplay weatherDataObserver= new currentConditionDisplay(weatherDataChanger);
        weatherDataChanger.setTemprature(24);
        weatherDataChanger.setHumidity(16);
        weatherDataChanger.setPressure(12);
        weatherDataChanger.setMeasurements(42, 13, 6);
    }
}
