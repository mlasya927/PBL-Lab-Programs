public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQtyInStock() { return qtyInStock; }
    public void setQtyInStock(int qtyInStock) { this.qtyInStock = qtyInStock; }

    public static void main(String[] args) {
        Author author = new Author("R.K. Narayan", "rk@example.com", 'M');
        Book book = new Book("Malgudi Days", author, 350.0, 25);

        System.out.println("Book Name : " + book.getName());
        System.out.println("Price     : " + book.getPrice());
        System.out.println("Quantity  : " + book.getQtyInStock());
        System.out.println("Author Name   : " + book.getAuthor().getName());
        System.out.println("Author Email  : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
    }
}
