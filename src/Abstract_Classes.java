abstract class topic{
    abstract void startEngine(); // abstract method

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Bike extends topic{
    void startEngine() {
        System.out.println("Bike engine started with a kick!");
    }
}

public class Abstract_Classes{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.startEngine();
        b.stopEngine();
    }
}
