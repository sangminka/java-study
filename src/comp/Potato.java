package comp;

public class Potato {
    private String name;
    private int price;

    public Potato(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + " 가 만들어졌어요");
    }

    @Override
    public String toString() {
        return "Potato{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
