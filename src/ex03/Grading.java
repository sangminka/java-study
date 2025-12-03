package ex03;

public class Grading {
    public static void main(String[] args) {
        int grade = 52;

        if (grade >= 90)
            System.out.println("학점 A");
        else if (grade >= 80)
            System.out.println("학점 B");
        else if (grade >= 70)
            System.out.println("학점 C");
        else if (grade >= 60)
            System.out.println("학점 D");
        else
            System.out.println("학점 F");
    }
}
