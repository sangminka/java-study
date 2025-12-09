package ex08;

public class StringClassTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");


        //String 클래스의 length()메소드는 문자열의 길이를 반환한다.
        String s = "Hello World!";
        int size = s.length();
        System.out.println(size);

        //String 객체 안에 들어 있는 문자를 추출하려면 chatAt()이라는 메소드를 호출하면 된다. 문자 번호는 0부터 시작한다.
        char c= s.charAt(0);
        System.out.println(c);

        //자바에서 2개의 문자열을 붙이려면 물론 concat()라는 메소드를 호출하여도 되지만 + 연산자를 사용하는 것이 더 편리하다.
        String result = "A chain" + "is only as strong" + "as its weakest link";

        // 문자열 비교하기 2개의 문자열이 동일하지 검사하려면 equals()을 호출하여야 한다. == 연산자를 사용하는 것이 아니다.
        System.out.println(s1.equals(s2));  //true 올바른 방법
        System.out.println(s1.equals(s3));  //true 올바른 방법
        System.out.println(s1==s2);         //true 이지만 올바르지 않은 방법
        System.out.println(s1==s3);         //false, 올바르지 않은 방법

        // 문자열 안에서 단어 찾기
        // 문자열에서 단어를 찾을 때는 indexOf()를 사용하는 것이 가장 쉽다. 단어의 시작 위치가 반환된다.
        String str = "The cat is on the table";
        int index = str.indexOf("table");

        if (index == -1){
            System.out.println("table은 없습니다.");
        }else {
            System.out.println("table의 위치: " + index);
        }
        // 문자열을 단어로 분리할 때
        // 예전에 자바에서 문자열을 단어들로 분리할 때는 StringTokenizer 클래스를 사용하였다
        // 최근버전에서는 String 클래스가 제공하는 split()메소드를 사용하면 훨씬 쉽게 문자열을 단어로 분리할 수 있다.
        String[] tokens = "I am a boy.".split(" ");
        for(String token : tokens){
            System.out.println(token);
        }

        String[] tokens2 = "100,200,300".split(",");
        for (String token : tokens2){
            System.out.println(token);
        }

        //StringBuffer클래스
        //String 클래스의 경우, 빈번하게 문자열을 변경할때에는 비효율 적일수 있다.
        //왜냐하면 문자열의 내용을 변경하는 String 클래스 메소드의 경우, 새로운 String 객체를 생성하고 기존의 내용을 복사해야 하기 때문이다.
        //String 객체는 불변성을 가진 객체이다. 불변성이란 한 번 만들어지면 변경되지 않는 객체를 의미한다.
        //String이 불변성을 가진 객체이기 때문에, 빈번하게 문자열이 추가,수정,삭제되는 경우에는 불리하다.
        //즉 heap 메모리에 많은 가비지 객체가 생성되어서 히프 메모리가 부족해지기도 한다.
        //예를 들어 100개의 String 객체에 대하여 + 연산을 하는 경우 100만개의 가비지 객체가 생성된다.
        //자바는 변경 가능한 문자열을 위하여 String 클래스의 대안으로 StringBuffer클래스를 제공한다.
        StringBuffer strb = new StringBuffer("Happines depends upon ourselves");

        //StringBuffer 객체는 내부적으로 문자열을 저장하는 메모리를 가지고 있다.
        //이메모리를 Buffer라고 한다.
        //Buffer의 총크기는 capacity()가 나타내고 현재 저장된 문자열의 길이는 length이다
        StringBuffer sb = new StringBuffer("Hello");
        int length = sb.length();
        int capacity = sb.capacity();
        //StringBuffer만이 제공하는 가장 중요한 메소드는 append()와insert()이다.
        //append()는 문자열의 끝에 여러 종류의 데이터를 추가하는 메소드이다.
        //insert()는 문자열의 특정 위치에 여러종류의 데이터를 문자열로 바꾸어 삽입한다.
        StringBuffer sb2 = new StringBuffer("10 + 20 = ");
        sb2.append(10+20);
        System.out.println(sb2);
        sb2.insert(0,"수식 ");
        System.out.println(sb2);
    }
}
