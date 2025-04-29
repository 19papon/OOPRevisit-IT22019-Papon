class Vehicle{
    protected String category = "Vehicle";

    void show() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println(category + " says Beep Beep!");
    }
}

public class Inheritance_and_Protected_Access{
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        c.honk();
    }
}
