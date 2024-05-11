//Создайте класс Book: Название, Автор(ы), Издательство, Год издания. Определите несколько конструкторов.
// Если в конструктор не передается значение какого-то поля, то этому полю присваиваются значения по умолчанию. Для строк это пустая строка: "", для чисел 0.
//Переопределите метод toString(). Он должен формировать строку в csv - формате, в которой значения всех полей отделяются точками с запятыми.
package Books;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;


    public Book() {
        this.name = "";
        this.author = "";
        this.publisher = "";
        this.year = 0;
    }

    public Book(String name, String author, String publisher, int year) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.publisher = "";
        this.year = 0;
    }

    public Book(String name, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = 0;
    }

    @Override
    public String toString() {
        return name + ';' + author + ';' + publisher + ';' + year;
    }
}
