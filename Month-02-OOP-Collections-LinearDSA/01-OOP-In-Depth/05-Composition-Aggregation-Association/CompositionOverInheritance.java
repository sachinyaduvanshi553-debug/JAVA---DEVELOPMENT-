package month02.oop.composition;

class Engine {
    public void start() {
        System.out.println("V8 Engine roaring to life...");
    }
}

// Composition: Car HAS-A Engine. The lifetime of Engine is bound to Car.
class Vehicle {
    private final Engine engine;

    public Vehicle() {
        this.engine = new Engine();
    }

    public void startJourney() {
        engine.start();
        System.out.println("Vehicle moving forward safely.");
    }
}

public class CompositionOverInheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.startJourney();
    }
}
