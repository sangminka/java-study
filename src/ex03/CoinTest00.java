package ex03;

public class CoinTest00 {
    public static void main(String[] args) {
        int money = 1370;
        int restMoney = money;
        int count;
        int coin[] = {500,100,50,10};
//        int n = 0;

        for (int i = 0; i < 4; i++) {
            count = restMoney/coin[i];
            restMoney = restMoney%coin[i];
            System.out.println(coin[i] + "동전 개수 : "+count);
            System.out.println("남은 금액 : "+restMoney);
        }

//        // 1. 500원으로 나눠서 개수를 구할거다.
//        count = restMoney/coin[n];
//        restMoney = restMoney%coin[n];
//        System.out.println(coin[n] + "동전 개수 : "+count);
//        System.out.println("남은 금액 : "+restMoney);
//        n++;
//
//        // 2. 100원으로 나눠서 개수를 구할거다.
//        count = restMoney/coin[n];
//        restMoney = restMoney%coin[n];
//        System.out.println(coin[n] + "동전 개수 : "+count);
//        System.out.println("남은 금액 : "+restMoney);
//        n++;
//
//        // 3. 50원으로 나눠서 개수를 구할거다.
//        count = restMoney/coin[n];
//        restMoney = restMoney%coin[n];
//        System.out.println(coin[n] + "동전 개수 : "+count);
//        System.out.println("남은 금액 : "+restMoney);
//        n++;
//
//        // 4. 10원으로 나눠서 개수를 구할거다.
//        count = restMoney/coin[n];
//        restMoney = restMoney%coin[n];
//        System.out.println(coin[n] + "동전 개수 : "+count);
//        System.out.println("남은 금액 : "+restMoney);
//        n++;
    }
}
