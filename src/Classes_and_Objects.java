class Bicycle {
    String brand;
    int gear;

    void ride() {
        System.out.println("Bicycle is riding...");
    }
}

public class Classes_and_Objects{
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(); // object creation
        myBike.brand = "Trek";
        myBike.gear = 21;
        myBike.ride();
    }
}
