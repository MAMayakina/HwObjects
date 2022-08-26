public class Main {
    public static void main(String[] args) {

        Author bookAuthor1 = new Author("Лев","Толстой");
        Author bookAuthor2 = new Author("Михаил","Шолохов");

        Book book1 = new Book("Война и мир", bookAuthor1,1864);
        Book book2 = new Book("Тихий Дон", bookAuthor2,1925);

        book1.setyearPublication(1863);


        System.out.println("book 1: " + book1.getbookTitle() + ", "+book1.getbookAuthor() +", "+ book1.getyearPublication() );
        System.out.println("book 2: " + book2.getbookTitle() + ", "+book2.getbookAuthor() +", "+ book2.getyearPublication() );


    }
}