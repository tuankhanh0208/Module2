package community.Shape;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        Square square1 = new Square(20);

        System.out.println("Truoc khi thay doi");
        System.out.println(square);
        System.out.println(square1);

        square.resize(30);
        square1.resize(100);

        System.out.println("Sau khi do la");
        System.out.println(square);
        System.out.println(square1);
        System.out.println("Mau sac la");
        square1.ToColor();
        square.ToColor();;

//        Circle circle = new Circle(10) ;
//        Rectangle rectangle = new Rectangle(20,10);
//        Square square = new Square(30);
//        System.out.println("Truoc khi thay doi");
//        System.out.println(circle);
//        System.out.println(rectangle);
//        System.out.println(square);
//
//
//        circle.resize(50);
//        rectangle.resize(50);
//        square.resize(60);
//
//        System.out.println("Sau khi thay doi");
//        System.out.println(circle);
//        System.out.println(rectangle);
//        System.out.println(square);
//        Shape s = new Shape("bule" ,false);
//        System.out.println(s.toString());
//
//        Circle c = new Circle(3,"white" ,true);
//        System.out.println(c.toString());
//
//        Rectangle r = new Rectangle(3,4,"khanh" ,true);
//        System.out.println(r.toString());
//
//
//
//       Square square = new Square();
//        System.out.println(square);
//         square = new Square(2.3);
//        System.out.println(square);
//        square = new Square(5,"Khanh",true);
//        System.out.println(square.toString());

//        ComparableCircle [] circles = new   ComparableCircle[3];
//        circles[0] = new ComparableCircle(3.6);
//        circles[1] = new ComparableCircle();
//        circles[2] = new ComparableCircle(5,"white", true);
//        System.out.println("ABC");
//        for (ComparableCircle circle :circles){
//            System.out.println(circle);
//        }
//        Arrays.sort(circles);
//        System.out.println("after");
//        for (ComparableCircle circle :circles){
//            System.out.println(circle);
//        }

//        Circle [] circles = new Circle[3];
//        circles[0] = new Circle(3.6);
//        circles[1] = new Circle();
//        circles[2] = new Circle(8,"bule" ,true);
//        System.out.println("ABC");
//        for (Circle circle :circles){
//            System.out.println(circle);
//        }
//        Comparator circleComparator = new CircleComparator();
//        Arrays.sort(circles,circleComparator);
//
//        System.out.println("After");
//        for (Circle circle :circles){
//            System.out.println(circle);
//        }
    }
}
