package ex04;

public class Television {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
        Television myTv =new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        Television youTv =new Television();
        youTv.channel = 9;
        youTv.volume = 12;
        youTv.onOff = true;

        System.out.println("나의 텔레지번의 채널은 " + myTv.channel + "이고 볼륨은" + myTv.volume +" 입니다");
        System.out.println("너의 텔레지번의 채널은 " + youTv.channel + "이고 볼륨은" + youTv.volume +" 입니다");

    }
}
