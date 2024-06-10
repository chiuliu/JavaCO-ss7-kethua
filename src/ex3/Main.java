package ex3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point( 1, 2);
        System.out.println(point);

        MoveablePont moveablePont = new MoveablePont(2,3,-1,2);
        System.out.println("Before" + moveablePont);
        moveablePont.move();
        System.out.println("After" + moveablePont);
    }
}
