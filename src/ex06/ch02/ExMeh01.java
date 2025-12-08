package ex06.ch02;

abstract class Car {
    void run() {
    }

    abstract int getPower();
}

class Morning extends Car {

    int power;

    int getPower() {
        return 5000;
    }

    void run() {
        System.out.println("모닝 달린다");
    }
}

class Sonata extends Car {
    // 부모의 메서드를 재정의하면
    // 자식이 부모의 매서드를 오버라이드 한다.
    // 오버라이드 : 무시하고 대신한다.
    void run() {
        System.out.println("소나타 달린다");
    }

    int getPower() {
        return 5000;
    }
}

public class ExMeh01 {
    public static void main(String[] args) {
        Car a1 = new Morning(); // [Morning(V), Car]
        a1.run();


        Car a3 = new Morning();
        System.out.println(a3.getPower());

        Car a2 = new Sonata(); // [Sonata, Car(v)]
        a2.run();


    }
}
