public class Main {
    public static void main(String[] args) {
        Author author = new Author("Федор", "Достоевский");
        Book book = new Book("Преступление и наказание", author, 1866);
        Author author2 = new Author("Антон", "Чехов");
        Book book2 = new Book("Человек в футляре", new Author("Антон", "Чехов"), 1898);
        book2.setPublishingYear(1900);
        System.out.println(book);
//        System.out.printf("%s, %s %s, %d год публикации", book.getName(), author.getFirstName(), author.getLastName(), book.getPublishingYear());
        Book book3 = new Book("Евгений онегин", new Author("Александр", "Пушкин"), 1830);
        Book book4 = new Book("Евгений онегин", new Author("Александр", "Пушкин"), 1830);

    }
}