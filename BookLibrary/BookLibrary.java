//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//library
package BookLibrary;
import java.io.IOException;
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) throws IOException,Exception {
        Library library=new Library();
        Scanner input= new Scanner(System.in);
        while (true){
            System.out.println("\nDo you want to add a book (a), view books (v),\n" +
                    "sort by author (sa), sort by title (st),\n" +
                    "save into a file (s), load from a file (l) or exit (x)?");
            String answer=input.next();
            if (answer.equals("a")){
                Scanner input2= new Scanner(System.in);
                System.out.println("What book do you want to add?");
                String bookToAdd=input2.nextLine();
                Scanner input3= new Scanner(System.in);
                System.out.println("Who is the author of "+bookToAdd+"?");
                String authorToAdd=input3.nextLine();
                Book book=new Book(bookToAdd,authorToAdd);
                library.add(book);
                System.out.println(book.getTitle()+" by "+book.getAuthor()+" has been addded to you library.");
            }
            else if (answer.equals("v")){
                System.out.println("You have "+library.libraryList.size()+" book in your library");
                library.show();
            }
            else if (answer.equals("sa")){
                library.authorSort();
                library.show();
            }
            else if (answer.equals("st")){
                library.titleSort();
                library.show();
            }
            else if (answer.equals("s")){
                library.titleSort();
                library.save();
            }
            else if (answer.equals("l")){
                library.load();
                library.show();
            }
            else if (answer.equals("x")){
                break;
            }
            else System.out.println("Enter a (a),(v),(st),(sa) or (x)");
        }

    }
}
