class Student {
    private int marks;

    public void setMarks(int score) {
        if (score >= 0) {
            marks = score;
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(85);
        System.out.println(s.getMarks());
    }
}
