package comp;

public class ShirmpBurger extends Burger{
    private String material;    // 재료 새우

    public ShirmpBurger(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
