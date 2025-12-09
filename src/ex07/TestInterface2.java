package ex07;

interface RemoteControl{
    void turnOn();
    void turnOff();
    public default void printBrand(){
        System.out.println("Remote Contril 가능 Tv");
    }
}

class Television implements RemoteControl{
    boolean on;
    public void turnOn(){
        on =true;
        System.out.println("tv가 켜졌습니다.");
    }

    public void turnOff(){
        on =false;
        System.out.println("tv가 꺼졌습니다.");
    }
    public void printBrand(){
        System.out.println("Power Java Tv 입니다.");
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        RemoteControl obj = new Television();
        obj.turnOn();
        obj.turnOff();
        obj.printBrand();
    }
}
