package ex13;


// 오브젝트 장단점
class Box{
    Object data;
}

class RedBox extends Box{
    
    public void use(){
        System.out.println("박스사용");
    }
}

public class Ge01 {
    public static void main(String[] args) {
        Box box = new Box();
        box.data = "안녕";

        String castData = (String) box.data;
        int len = castData.length();
        System.out.println(len);

    }
}
