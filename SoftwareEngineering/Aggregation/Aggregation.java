public class Aggregation {
    
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();
        
        Car car = new Car(engine, transmission);
        
        System.out.println(car);
        
        car = null; //distoring reference object
        
        System.out.println(engine);
        System.out.println(transmission);
    }
}

class Engine {
    
    public String toString(){
        return "Engine available!";
    }
}

class Transmission {
    
    public String toString(){
        return "Weels available!";
    }

}

class Car{
    Engine engine;
    Transmission transmission;

    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }
    
    public String toString(){
        return "Car functioning with"+engine+transmission;
    }
}
