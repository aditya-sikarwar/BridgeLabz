import java.util.*;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    void showDetails() {
        System.out.println("Book: " + title);
    }
}

class EBook extends Book {
    EBook(String title) {
        super(title);
    }

    void showDetails() {
        System.out.println("E-Book: " + title);
    }
}

class HardCopyBook extends Book {
    HardCopyBook(String title) {
        super(title);
    }

    void showDetails() {
        System.out.println("Hardcopy Book: " + title);
    }
}

class Request<T extends Book> {
    String userName;
    T book;

    Request(String userName, T book) {
        this.userName = userName;
        this.book = book;
    }

    void process() {
        System.out.println("Processing request for " + userName);
        book.showDetails();
    }
}

public class LibrarySystem{
    public static void main(String[] args) {
        Queue<Request<? extends Book>> queue = new LinkedList<>();

        Request<EBook> req1 = new Request<>("Aditya", new EBook("DSA Advanced"));
        Request<HardCopyBook> req2 = new Request<>("Ankit", new HardCopyBook("C++ Guide"));
        Request<EBook> req3 = new Request<>("Devansh", new EBook("Java Basics"));
        Request<HardCopyBook> req4 = new Request<>("Vikas", new HardCopyBook("OOPs for beginners"));
        queue.add(req1);
        queue.add(req2);
        queue.add(req3);
        queue.add(req4);

        while (!queue.isEmpty()) {
            Request<? extends Book> request = queue.poll();
            request.process();
        }
    }
}
