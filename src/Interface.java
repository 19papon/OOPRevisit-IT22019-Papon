interface tit{
    void move();
}

class cp implements tit{
    public void move() {
        System.out.println("Car is moving...");
    }
}

public class Interface{
    public static void main(String[] args) {
        cp c = new cp();
        c.move();
    }
}
