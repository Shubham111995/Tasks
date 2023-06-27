import java.util.ArrayList;
import java.util.Scanner;

public class Openlogix {
    static Library lib = new Library();

    static void printMenu() {
        System.out.println("Hi, what would you like to do? Press the number from (1-3)");
        System.out.println("1) Add Book\n2) Add User\n3) Search Book\n4) Exit");
    }

    public static void main(String[] args) {
        printMenu();
        Scanner scan;
        int userInput = -1;

        while(userInput != 4) {
            scan = new Scanner(System.in);
            userInput = scan.nextInt();

            while(!(userInput > 0 && userInput <= 4) ) {
                printMenu();
                scan = new Scanner(System.in);
                userInput = scan.nextInt();
            }
            switch (userInput) {
                case 1:
                    lib.addBook("Harry Potter", "Someone");
                    System.out.println("Added Book to the Library");
                    break;
                case 2:
                    lib.addUser("Shubham" , "999955855" );
                    System.out.println("Added User to the Library");
                    break;
                case 3:
                    System.out.println("Searching Book");
                    ArrayList<Book> results = lib.searchBook("Harry Potter");
                    System.out.println("Found: " + results.size());
                    for(Book result: results) {
                        System.out.println(result);
                    }
                    break;
                case 4: 
                    System.out.println("Searching User");
                    ArrayList<User> results = lib.searchUser("Shubham");
                    System.out.println("Found: " + results.size());
                    for(User result:results){
                        System.out.println(result);
                    }
                    break;
                    default:
                    System.out.println("EXIT");
            }
        }
    }
}
