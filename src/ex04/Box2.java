package ex04;

public class Box2 {
    int width,height,depth;
    Box2(int w, int h, int d){ width = w; height =h; depth = d;}
    Box2(){}

    static void main() {
        Box2 b = new Box2();
        System.out.println("상자의 크기: (" + b.width + "," + b.height + "," + b.depth);
    }
}
