package ex04;

class Pizza {
    int size;
    String type;

    public Pizza(){
        size = 12;
        type ="슈퍼슈프림";
    }

    public Pizza(int a, String b){
        size = a;
        type =b;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj = new Pizza();
        System.out.println("("+obj.type+ " , "+obj.size + ",)");

        Pizza obj2 = new Pizza(24,"포테이토");
        System.out.println("("+obj2.type+ " , "+obj2.size + ",)");

    }
}
