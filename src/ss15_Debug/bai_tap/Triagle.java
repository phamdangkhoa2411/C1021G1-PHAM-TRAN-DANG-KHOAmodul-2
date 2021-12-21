package ss15_Debug.bai_tap;

public class Triagle {
    private int edge1;
    private int edge2;
    private int edge3;
    public Triagle(){
    }
    public Triagle(int edge1 , int edge2 , int edge3 ) throws ExceptionRectangle {
      if (edge1<=0 || edge2<=0 || edge3 <= 0|| (edge2+edge3) < edge1 || (edge3+ edge1) < edge2 ){
          throw new ExceptionRectangle();
      }
      this.edge1 = edge1;
      this.edge2 = edge2;
      this.edge3 = edge3;
    }
}
