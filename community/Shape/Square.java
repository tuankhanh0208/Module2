package community.Shape;

public class Square extends Rectangle implements Resizeable, Colorable {
    private double side ;
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side ,String color , boolean filled){
        super(side,side ,color,filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth (double width){
        setWidth(width);
    }
    @Override
    public void setLength(double length){
        setLength(length);
    }

    @Override
    public String toString (){
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        side += side*percent/100;
    }

    @Override
    public void ToColor() {
        System.out.println("Color all four sides..");
    }
}
