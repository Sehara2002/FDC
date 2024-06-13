package Activity_01;


public class Main {
    public static void main(String[] args){
        Book b1 = new Book("Madol Duwa", "1234", 400);
        Book b2 = new Book("Hathpana", "4567", 200);
 
        Library mylib = new Library("UOM", "225513");
 
        mylib.addBook(b1);
        mylib.addBook(b2);
 
        mylib.getBooks();
    }    
}




