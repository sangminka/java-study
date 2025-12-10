package ex08.exception;

import java.io.FileReader;
import java.io.IOException;

public class TryTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("Test.txt")){
            char[] a = new char[50];
            fr.read(a);
            for(char c : a){
                System.out.println(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
