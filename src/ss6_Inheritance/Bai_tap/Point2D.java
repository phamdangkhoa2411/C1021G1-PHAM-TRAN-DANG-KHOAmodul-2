package ss6_Inheritance.Bai_tap;

public class Point2D {
    public float x ;
    public float y;

    public Point2D() {
    }
    public Point2D(float x , float y ){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setxy(float x,float y){
        this.x = x ;
        this.y = y ;
    }
    public float[] getxy(){
        float[] xy = {this.x,this.y};
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(8,9);
        System.out.println(point2D);
    }
}

