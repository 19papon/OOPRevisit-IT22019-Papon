class Animal {
    private String type;  // private: accessible only within the class

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }
}

public class Access_Modifiers{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setType("tiger");
        System.out.println(a.getType());
    }
}
