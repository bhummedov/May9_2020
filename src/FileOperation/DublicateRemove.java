package FileOperation;

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;

public class DublicateRemove{
    public static void main(String[] args) throws Exception {
        removeDuplicates("src\\FileOperation\\example.txt");
    }
    public static void removeDuplicates(String path) throws Exception{
        File file = new File(path);
        String duplicatesRemoved="";
        Scanner scanner = new Scanner(file);
        HashSet<String> hashSet = new HashSet<>();

        while(scanner.hasNext()){
            hashSet.add(scanner.nextLine());
        }
        file.delete();
        scanner.close();
        duplicatesRemoved = hashSet.toString();
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(duplicatesRemoved);
        fileWriter.close();
    }
}




