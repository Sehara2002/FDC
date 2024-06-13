package Activity_01;

public class Book {
    public String ISBN;
    public String BookName;
    public float price;

    Book(String Name, String ISBN, float Price){
        this.BookName = Name;
        this.ISBN = ISBN;
        this.price = Price;
    }
    void getBook(){
        System.out.println("Book Name: "+this.BookName);
        System.out.println("Book ISBN: "+this.ISBN);
        System.out.println("Book Price : Rs."+this.price);
    }
}



