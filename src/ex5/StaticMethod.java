package ex5;

public class StaticMethod {
    public static final double PI = 3.14;

    public static double callCricleArea(double r){
        return r * r * PI;
    }
    public static double calRectangleArea(double a, double b){
        return a*b;
    }
    public static double calTriangleArea(double a, double b, double c){
        double s = (a+b+c)/2;
        return s*(s-a)*(s-b)*(s-c);
    }

}
