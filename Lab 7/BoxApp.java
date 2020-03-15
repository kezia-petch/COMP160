public class BoxApp{
  public static void main (String[]args){
    /**Using default constructor and manually setting values then printing them out**/
    Box box1 = new Box();
    /**Setting owners name**/
    Box.ownersName = "Anna Austin";
    box1.setHeight(4);
    box1.setWidth(6);
    box1.setLength(4);
    System.out.println(box1.toString());
    /**Creating new subclass and inputing values into the constructor and printing out these values**/
    Box box2 = new Box(3, 4, 5);
    System.out.println(box2.toString());
    /**Creating new subclass and inputing values into the constructor and printing out these values**/
    Box box3 = new Box(6);
    System.out.println(box3.toString());
    /**Creating new subclass and inputing values into the constructor and printing out these values**/
    Box box4 = new Box(8, 6, 7);
    System.out.println(box4.toString());
    /**Setting owners name again**/
    Box.ownersName = "Bob Berry";
  }
}