package ex5;

public class Main {
    public static void main(String[] args) {

        //tron
        System.out.println("Dt hình tròn là" +StaticMethod.callCricleArea(3.5));
        System.out.println("Dt hình tròn là" +StaticMethod.callCricleArea(6));



        // cn
        System.out.println(StaticMethod.calRectangleArea(2.5,6));

        System.out.println(StaticMethod.calRectangleArea(4,7));

        //tam giac

        System.out.println(StaticMethod.calTriangleArea(3,4,5));
        System.out.println(StaticMethod.calTriangleArea(4.5,7,6));
    }

}
