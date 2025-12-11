package ex13;

// new 할때 타입을 결정할 수 있게 해주는 제네릭
class Box2<T>{

    T data;
}
public class Ge02 {
    public static void main(String[] args) {
        Box2 box2 = new Box2();// 오브젝트 타입
        Box2<String> box3 = new Box2();// T = String 타입
//      제네릭이 없으면 타입을 주도권은 쓰는 사람이 아닌 만드는사람이 들고있음


        box2.data = 1;  // 오류안남
//        box3.data=1;  // 오류발생
        
        box2.data = "안녕";
        box3.data = "안녕";
        
//        int len = box2.data.length();     오류 벌샹
        int len = box3.data.length();    // 정상 작동 String 타입 함수 사용 가능


        Box2<Integer> box4 = new Box2();// T = Integer 타입 int는 넣지못함 랩퍼클래스를 넣어야함
        box4.data =5;
        System.out.println(box4.data);

    }
}
