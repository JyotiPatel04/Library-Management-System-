import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. List Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    lib.addBook(new Book(t, a));
                    break;
                case 2:
                    System.out.print("Member Name: ");
                    String m = sc.nextLine();
                    lib.addMember(new Member(m));
                    break;
                case 3:
                    lib.listBooks();
                    break;
                case 4:
                    System.out.print("Book title to issue: ");
                    String titleIssue = sc.nextLine();
                    lib.issueBook(titleIssue);
                    break;
                case 5:
                    System.out.print("Book title to return: ");
                    String titleReturn = sc.nextLine();
                    lib.returnBook(titleReturn);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}

