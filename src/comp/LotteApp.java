package comp;

public class LotteApp {
    public static void main(String[] args) {
        //1. 버거만 주세요
        Burger burger = new Burger("버거",1000);
        System.out.println(burger);
        //2. 콜라만 주세요
        Coke coke = new Coke("콜라",500);
        System.out.println(coke);
        //3. 쉬림프 버거 세트 주세요
        ShirmpBurger setB1 = new ShirmpBurger("새우 버거",2000,"새우");
        Coke coke2 = new Coke("콜라",500);
        Potato potato = new Potato("감자튀김",1500);

        BurgerSet burgerSet = new BurgerSet(setB1,coke2,potato);

        System.out.println(burgerSet.getTotalPrice());

    
    }
}
