package Points;

public class MovableMoint extends Point{
    private float xSpeed =0.0f;
    private float ySpeed =0.0f;

    public MovableMoint(){}
    public MovableMoint (float xSpeed , float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovableMoint (float x,float y , float xSpeed , float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed (){
        return new float[2];
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public String toString(){
        return super.toString()  + " , " + " speed = " +" ( " + xSpeed + " , " + ySpeed + " )";
    }

     public  MovableMoint move(){
//         setX(getX()) += xSpeed;
//         setX(getX()) += ySpeed;
         return this;
    }
}
