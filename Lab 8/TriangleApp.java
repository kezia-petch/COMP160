import java.text.DecimalFormat;
public class TriangleApp{
  public static void main (String[]args){
    DecimalFormat fmt = new DecimalFormat ("0.##");
    Triangle tri1 = new Triangle(0, 0, 3, 0, 3, 4, "A");
    System.out.println("Triangle " + tri1.getName() + " perimeter is " + fmt.format(tri1.getPerimeter()) + " units");
    Triangle tri2 = new Triangle(0, 3, 3, 4, 1, 9, "B");
    System.out.println("Triangle" + tri2.getName() + " perimeter is " + fmt.format(tri2.getPerimeter()) + " units");
    Triangle tri3 = new Triangle(4, 2, 9, 4, 6, 7, "C");
    System.out.println("Triangle " + tri3.getName() + " perimeter is " + fmt.format(tri3.getPerimeter()) + " units");
  }
}