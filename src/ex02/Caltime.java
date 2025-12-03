package ex02;

import java.util.Scanner;

public class Caltime {
    public static void main(String[] args) {

        int time = 300;    // 키보드 입력 대기
        int sec = time%60;          // 100을 60으로 나눈 나머지
        int min = time/60;          // 100을 60으로 나눈 몫
        System.out.println(time + "초는 " + min + "분 " + sec + "초 입니다");
        
    }
}
