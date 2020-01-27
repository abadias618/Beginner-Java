/*package BookLibrary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {
    public void save() throws IOException {
        String fileName="Test"+".txt";
        int fileNum=1;
        File file;
        while (true){
            file=new File(fileName);
            if (file.createNewFile())
            {
                System.out.println("Library Saved!");
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
            Book book=library.libraryList.get(i);
            out.print(book.getTitle());
            out.print(book.getAuthor());
        }
        out.close();



    }
    static void load(){}
    static void  write(){}
}
*/