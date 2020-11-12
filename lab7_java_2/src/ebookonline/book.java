package ebookonline;

public class book {
    private int bookID;
    private String title;
    private String author;
    private int years;
    private String category;
    private int status;
    private int qty;
    private double price;
    private String createdDate;
    private String updatedDate;

    public book(int bookID, String title, String author, double price, int qty) {
        this.bookID = bookID;
        this.title = title;
        this.author=author;
        this.price = price;
        this.qty = qty;
    }
    public book(int bookID, String title, String author,int years, String category, int status, int qty, double price, String createddate, String updateddate){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.years = years;
        this.category = category;
        this.status = status;
        this.qty = qty;
        this.price = price;
        this.createdDate = createddate;
        this.updatedDate = updateddate;
    }
    public book(){
        bookID=0;
        title="";
        author="";
        price=0;
        qty=0;
        years=0;
        category="";
        status=0;
        createdDate="";
        updatedDate="";
    }

    public int getYears() {
        return years;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public int getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public int getBookID() {
        return bookID;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getQty() {
        return qty;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return String.format("%-40d%-30s%-40s%-30s%-40d%-30.1f%-30d\n",bookID,title,author,category,years,price,qty);
    }
}
