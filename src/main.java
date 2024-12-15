import java.awt.print.Book;
import java.util.Scanner;


public class main {

    public static void main(String arc[]) {

            Library library = new Library();

            // Создание книг с разными конструкторами
            BOOk book1 = new BOOk("1984", "Джордж Оруэлл", 1949, true);
            BOOk book2 = new BOOk("Мастер и Маргарита", "Михаил Булгаков");
            BOOk book3 = new BOOk("Три товарища", "Эрих Мария Ремарк", 1936, true);

            // Добавление книг в библиотеку
            library.addBOOk(book1);
            library.addBOOk(book2);
            library.addBOOk(book3);

            // Вывод доступных книг
            library.printAvBOOks();

            // Взятие книги и изменение статуса
            book1.borrowBOOk();

            // Повторный вывод доступных книг
            library.printAvBOOks();

            // Возвращение книги
            book1.returnBOOk();

            // Поиск книг по автору
            library.findBOOksByAuthor("Михаил Булгаков");
        }


        /*Scanner scanner = new Scanner(System.in);
        for (int i=0; i=5; i++){


        }
        string[] bibl = new string[5];

        System.out.println("vvedite nazvanie knigi");
        String title = scanner.nextLine();

        System.out.println("vvedite avtora knigi");
        String author = scanner.nextLine();

        System.out.println("vvedite god knigi");
        String year = scanner.nextLine();

        if(title.equals("")
*/
    }
}
