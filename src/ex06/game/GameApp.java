package ex06.game;

/**
 * 주말 숙제
 * (1) 메서드 오버라이드로 스타크래프트 게임 수정하기
 * - ex04의 game 패키지에 start 메서드를
 * 하나만 만들어서 해결하라
 * - 추상화 (Protoss)
 * - extends하여 타입일치
 * - start(Protoss u1, Protoss u2)
 * - Protoss에 getter와 setter 메서드 만들기
 * - River, Zealot, Dragoon에 메서드 재정의하여
 * 부모 메서드 오버라이드(무효화) 하기
 * (2) 동영상 보고 사원관리 프로그램 다시 만들어보기
 * (3) 코딩테스트 한문제씩 정리하기
 */

public class GameApp {

    // u1 -> u2 공격
    static void start(Protoss u1, Protoss u2) {
        int remainHp = u2.getHp() - u1.getAttack();
        u2.setHp(remainHp);
    }


    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Protoss r1 = new River();
        Protoss d1 = new Dragoon();

        start(z1, d1);


        //1. 드라군의 상태확인
        System.out.println(d1.getHp());

        start(d1, z1);

        //2. 질럿의 상태확인
        System.out.println(z1.getHp());

        start(z1, r1);
        System.out.println(r1.getHp());


    }
}
