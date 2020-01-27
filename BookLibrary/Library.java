//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//library
package BookLibrary;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Library {
    public ArrayList<Book> libraryList=new ArrayList<>();

    public void add(Book book){
        libraryList.add(book);
    }

    public void show(){
        Book bookie;
        for (int i = 0; i <libraryList.size() ; i++) {
            bookie=libraryList.get(i);
            System.out.println(bookie.toString());
        }

    }
    public void authorSort(){
        ArrayList<String> authorList=new ArrayList<>();
        ArrayList<Book> sortedAuthorList=new ArrayList<>();

        //if there is something in the library it sorts it
        if(libraryList.size()>0){
            //gets the authors of the books and puts them into another list
            for (int i = 0; i <libraryList.size() ; i++) {
                Book getBook=libraryList.get(i);
                authorList.add(getBook.getAuthor());
            }
            Collections.sort(authorList);
            //makes another list of books sorted by author
            for (int i = 0; i <libraryList.size() ; i++) {
                for (int j = 0; j <libraryList.size() ; j++) {
                    Book getBook=libraryList.get(j);
                    if(authorList.get(i).equals(getBook.getAuthor())){
                        sortedAuthorList.add(getBook);
                        break;
                    }
                }
            }
            //replaces the sorted objects into the main list
            libraryList.clear();
            for (int i = 0; i <sortedAuthorList.size() ; i++) {
                Book book=sortedAuthorList.get(i);
                libraryList.add(book);
            }
        }
        else {
            System.out.println("you don't have books in you library yet");
        }

    }
    public void titleSort(){
        ArrayList<String> titleList=new ArrayList<>();
        ArrayList<Book> sortedTitleList=new ArrayList<>();
        //if there is something in the library it sorts it
        if(libraryList.size()>0){
            //gets the title of the books and puts them into another list
            for (int i = 0; i <libraryList.size() ; i++) {
                Book getBook=libraryList.get(i);
                titleList.add(getBook.getTitle());
            }
            Collections.sort(titleList);
            //makes another list of books sorted by title
            for (int i = 0; i <libraryList.size() ; i++) {
                for (int j = 0; j <libraryList.size() ; j++) {
                    Book getBook=libraryList.get(j);
                    if(titleList.get(i).equals(getBook.getTitle())){
                        sortedTitleList.add(getBook);
                        break;
                    }
                }
            }
            //replaces the sorted objects into the main list
            libraryList.clear();
            for (int i = 0; i <sortedTitleList.size() ; i++) {
                Book book=sortedTitleList.get(i);
                libraryList.add(book);
            }

        }
        else {
            System.out.println("you don't have books in you library yet");
        }
    }

    public void save() throws IOException {
        String fileName="Test"+".txt";
        int fileNum=1;
        File file;
        while (true){
            file=new File(fileName);
            if (file.createNewFile())
            {
                System.out.println("Library Saved! in: ");
                System.out.println(file.getAbsolutePath());
                break;
            }
            else {
                fileNum++;
                String str=Integer.toString(fileNum);
                fileName="Test"+str+".txt";
            }
        }

        PrintWriter out=new PrintWriter(file);


        for (int i = 0; i <libraryList.size() ; i++) {
            Book book=libraryList.get(i);
            out.println(book.getTitle());
            out.println(book.getAuthor());
        }
        out.close();



    }
    void load() throws Exception{
        File jkFile = new File("");
        String path=jkFile.getAbsolutePath();
        File file = new File(path);
        ArrayList<String> fileNames=new ArrayList<>();
        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            fileNames.add(f);
            System.out.println(f);
        }
        //read
        Scanner input=new Scanner(System.in);
        System.out.println("Type exactly which of these files you want to load: ");
        String whichFile=input.next();
        if(fileNames.contains(whichFile)){
            File read=new File(whichFile);
            Scanner readerScanner=new Scanner(read);
            libraryList.clear();
            while(readerScanner.hasNext()){
                String title=readerScanner.nextLine();
                String author=readerScanner.nextLine();
                Book book=new Book(title,author);
                libraryList.add(book);
            }
            readerScanner.close();

        }
        else {
            System.out.println("There isn't any file with that name");
        }
    }

}
