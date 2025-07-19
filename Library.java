import java.util.*;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added.");
    }

    public void addMember(Member m) {
        members.add(m);
        System.out.println("Member added.");
    }

    public void listBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                b.issue();
                System.out.println("Book issued.");
                return;
            }
        }
        System.out.println("Book not found or already issued.");
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found or wasn't issued.");
    }
}

