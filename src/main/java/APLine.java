public class APLine
{
  private int a,b,c;
  private double slope;
  public APLine(int ax, int bx, int cx){
    a = ax;
    b = bx;
    c = cx;
  }
  public double getSlope(){
    slope = (double)-a/b;
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if(a*x + b*y == 0){
      return true;
    }else{
      return false;
  }
}
}
