package observerpattern;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahsan
 */

class subject{
    private List<observer> observers= new ArrayList<>(); 
    private int state;
    void setState(int state){
        this.state=state;
        notifyAllObservers();
    }
    int getState(){
        return this.state;
    }
    public void attach(observer obs){
        observers.add(obs);
    }
    void notifyAllObservers(){
        for(observer obs : observers){
            obs.update();
        }
    }
}

abstract class observer{
    protected subject sub;
    abstract void update();
}
class binaryObserver extends observer{
    binaryObserver (subject sub){
        this.sub=sub;
        this.sub.attach(this);
    }
    @Override
    void update(){
        System.out.println("Binary String : " + Integer.toBinaryString(sub.getState()));
    }
}
class octalObserver extends observer{
    octalObserver (subject sub){
        this.sub=sub;
        this.sub.attach(this);
    }
    @Override
    void update(){
        System.out.println("Octal String : " + Integer.toOctalString(sub.getState()));
    }
}
class hexaObserver extends observer{
    hexaObserver (subject sub){
        this.sub=sub;
        this.sub.attach(this);
    }
    @Override
    void update(){
        System.out.println("hexa String : " + Integer.toHexString(sub.getState()));
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name : Muhammad Ahsan");
        System.out.println("Arid No. : 21-ARID-737");

        subject sub = new subject();
        
        binaryObserver binary = new binaryObserver(sub);
        octalObserver octal = new octalObserver(sub);
        hexaObserver hexa = new hexaObserver(sub);
        
        System.out.println("First State change : 20");
        sub.setState(20);
        
        System.out.println("Second State change : 30");
        sub.setState(30);
    }
}
