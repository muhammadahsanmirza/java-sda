package singletonpattern;

/**
 *
 * @author Ahsan
 */
class singletonClass
{  
    private static singletonClass instance = null; 
    public String str; 
    private singletonClass(){ 
    }
 
    public static singletonClass getInstance()
    { 
        if (instance == null){ 
        instance = new singletonClass(); 
        } 
        return instance; 
    }  
}

public class SingletonPattern {
    public static void main(String[] args) {
        // TODO code application logic here   
        
   System.out.println("Muhammad Ahsan");
   System.out.println("21-ARID-737");
   
   singletonClass single1 = singletonClass.getInstance(); 
   
   single1.str = "Hi I am the singleton class string"; 
   
   singletonClass single2 = singletonClass.getInstance(); 
   single2.str = "Hi I am the other string"; 
   
   singletonClass single3 = singletonClass.getInstance(); 
   single3.str = "I am some other string"; 
   
   System.out.println("first reference: "+single1.str); 
   System.out.println("second reference: "+single2.str); 
   System.out.println("third reference: "+single3.str); 
    }
}
