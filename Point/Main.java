package Point;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(3,5,6);
        System.out.println(point3D.toString());

        point3D.setXYZ(1.7f,5f,6f);
        System.out.println(point3D);
    }
}
