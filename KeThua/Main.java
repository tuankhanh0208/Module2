package KeThua;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape("bule" ,false);
        System.out.println(s.toString());

        Circle c = new Circle(3,"white" ,true);
        System.out.println(c.toString());

        Rectangle r = new Rectangle(3,4,"khanh" ,true);
        System.out.println(r.toString());



       Square square = new Square();
        System.out.println(square);
         square = new Square(2.3);
        System.out.println(square);
        square = new Square(5,"Khanh",true);
        System.out.println(square.toString());
    }
}
