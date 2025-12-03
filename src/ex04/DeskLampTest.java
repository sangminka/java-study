package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();

        myLamp.trunOn();
        System.out.println(myLamp);
        myLamp.turnOff();
        System.out.println(myLamp);
    }
}
