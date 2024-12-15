public class library {
    private ArrayList<Book> books = new ArrayList<>();

    // Метод addBook()
    public void addBook(Book book) {
        books.add(book);
    }
    public void printAvBooks() {
        System.out.println("Доступные книги:");
        for (Book book : books) {
            if (book.isAv()) {
                book.displayInfo();
            }
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Книги автора: " + author);
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayInfo();
            }
        }
    }

}
