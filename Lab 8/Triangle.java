public class Triangle{
  /** defining variables**/
    int p1x; 
    int p1y;
    int p2x;
    int p2y;
    int p3x;
    int p3y;
    String name;
    /** constructor using all variables as parameters**/
    public Triangle (int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
     p1x = pt1x;
     p1y = pt1y;
     p2x = pt2x;
     p2y = pt2y;
     p3x = pt3x;
     p3y = pt3y;
     name = nameIn;
     }
    /** calculating sides**/
    public double calcSide(int x1, int y1, int x2, int y2){
      return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }
    
    public double getPerimeter(){
      double side1 = calcSide(p1x, p2x, p1y, p2y);
      double side2 = calcSide(p2x, p3x, p2y, p3y);
      double side3 = calcSide(p1x, p3x, p1y, p3y);
      return side1 + side2 + side3;
    }
        
    public String getName(){
        return name;
    }
}  