public class Box{
  /**Classifying variables**/
  int height;
  int width;
  int length;
  static String ownersName;
  /**Setting height value**/
  public void setHeight(int h){
    height = h;
  }
  /**Setting width value**/
  public void setWidth(int w){
    width = w;
  }
  /**Setting length value**/
  public void setLength(int l){
    length = l;
  }
  /**Calculating the volume from the other set variable values**/
  public int getVolume(){
    int volume = height * width * length;
      return volume ;
  }
  /**Calculating the surface area from the other set variable values**/
  public int getSurfaceArea(){
    int surfaceArea = 2*((height * length) + (width * height) + (length * width));
      return surfaceArea;
  }
  /**Returning a string describing the variable values**/
  public String toString(){
    return "Height is: " + height + ",  Length is: " + length + ", Width is: " + width + ", Volume is: " + getVolume() + 
      ", Surface Area: " + getSurfaceArea() + ", Owned by: " + ownersName;
  }
  /**creating static variable**/
  public static void String (String oN){
    ownersName = oN;
  }
  /**constructor using all box variables**/
  public Box (int h, int l, int w){
    width = w;
    length = l;
    height = h;
  }
  /**cube constructor**/
  public Box (int side){
    width = side;
    length = side;
    height = side;
  }
  /**setting default values**/
  public Box (){}
    
  }
  