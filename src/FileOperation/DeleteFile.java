package FileOperation;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) throws Exception {
        deleteValue("Apple","src\\FileOperation\\example.txt");
    }
    public static void deleteValue(String value,String path) throws Exception{
        File myFile = new File(path);
        Scanner scanner = new Scanner(myFile);
        String contentFiltered="";
        String line;
        while(scanner.hasNext()){
            line=scanner.nextLine();
            if (!line.equals(value)){
                contentFiltered+=line+"\n";
            }
        }
        myFile.delete();
        scanner.close();
        FileWriter writer = new FileWriter(path);
        writer.write(contentFiltered);
        writer.close();
    }
}

