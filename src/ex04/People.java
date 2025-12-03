package ex04;

public class People {

    private String name;
    private int height;
    private int weight;

    People(String name,int height,int weight){
        this.name =name;
        this.height = height;
        this.weight = weight;
    }
    // 상태 변경
    public void 밥먹기(){
        this.weight = weight+2;
    }

    //상태 확인
    public int getWeight(){
        return weight;
    }
    public static void main(String[] args) {
        People people1 =new People("홍길동",30,5);
        People people2 =new People("장보고",20,3);
        // 내가 생성자를 직접 만들면 디폴트 기본 생성자를 만들어 주지 않음

        people1.밥먹기(); // 메서드(상태변경)
    }
}
