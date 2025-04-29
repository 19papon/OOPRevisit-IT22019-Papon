interface Driveable {
    void drive();
}

interface Repairable {
    void repair();
}

class dop implements Driveable, Repairable {
    public void drive() {
        System.out.println("Car is driving...");
    }

    public void repair() {
        System.out.println("Car is being repaired...");
    }
}

public class Multiple_Inheritance_using_Interface {
    public static void main(String[] args) {
        dop c = new dop();
        c.drive();
        c.repair();
    }
}
