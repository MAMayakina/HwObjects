public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int yearPublication;

    public Book(String bookTitle, String bookAuthor, int yearPublication) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublication = yearPublication;
    }

    public String getbookTitle() {
        return this.bookTitle;
    }

    public int getyearPublication() {
        return this.yearPublication;
    }

    public void setyearPublication(int year) {
        if (yearPublication < 1800 && yearPublication > 2020) {
            System.out.println("Ошибка");
            //throw new RuntimeException("Введены некорретные данные");
        } else {
            this.yearPublication = year;
        }
    }

}
