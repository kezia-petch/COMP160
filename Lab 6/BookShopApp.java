public class BookShopApp {
  public static void main(String[]args){
    Book mp1 = new Book ();
    mp1.setTitle("Life of Pi");
    mp1.setPages(348);
    mp1.setPrice(28.90);
    mp1.displayBook();
    Book mp2 = new Book ();
    mp2.setTitle("Mister Pip");
    mp2.setPages(240);
    mp2.setPrice(22.70);
    mp2.displayBook();
    Book mp3 = new Book ();
    mp3.setTitle("Lolita");
    mp3.setPages(400);
    mp3.setPrice(29.99);
    mp3.displayBook(); 
  }
}