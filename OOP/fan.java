package OOP;

public class fan {
    public static final   int SLOW =1;
    public static final   int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed ;
    private boolean on;
    private double radius;
    private  String color;

    public fan(){
        this.speed =SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  String toString (){
        if(this.on){
            return " Fan is on " + this.speed + " mau " + this.color + " ban kinh " + this.radius ;
        }else {
            return "Fan is of " + this.color + " ban kinh "+this.radius;
        }
    }

    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setSpeed(fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        fan fan2 = new fan();
        fan2.setSpeed(fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
