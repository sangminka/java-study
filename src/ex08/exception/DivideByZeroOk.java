package ex08.exception;

public class DivideByZeroOk {
    public static void main(String[] args) {

        try {
            int result= 10/0;
        }catch(Exception e){
            System.out.println("0");
        }

        System.out.println("프로그램은 계속 진행 됩니다.");
    }
}
