public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // Constuction có 3 tham số
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    // Construction có 4 tham số
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho author
    public Author getAuthor() {
        return author;
    }

    // Getter cho price
    public double getPrice() {
        return price;
    }

    // Setter cho price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter cho qty
    public int getQty() {
        return qty;
    }

    // Setter cho qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Phương thức toString (dùng lại toString() của Author)
    @Override
    public String toString() {
        return "Sách[tên=" + name + ", " + author.toString() + ", giá=" + price + ", số lượng=" + qty + "]";
    }
}
