public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[] {
                new Book("Война и мир", "Лев Николаевич Толстой"),
                new Book("Мертвые души", "Николай Васильевич Гоголь"),
                new Book("Три мушкетера", "Александр Дюма")
        };

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

    }
}