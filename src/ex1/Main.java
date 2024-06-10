package ex1;

public class Main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        // gọi lớp cricle
        cricle.setRadius(3.5);
        cricle.setColor("RED");
        System.out.println("Diện tích hình tròn là : " +cricle.getArea());
        System.out.println(cricle);

        Cylinder cylinder = new Cylinder(3.5,"BLue",4);
        cylinder.setHeight(4);

        System.out.println("Thể tích hình tròn là : " + cylinder.getVolume());
        System.out.println(cylinder);

    }
}
