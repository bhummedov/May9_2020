package FileOperation;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class UpdatingTxt{
    public static void main(String[] args) throws Exception {
        updateValue("orange","tangerine","src\\FileOperation\\example2.txt");
    }
    public static void updateValue(String oldVAl, String newVAl, String path) throws Exception{
        File file = new File(path);
        String content="";
        Scanner scan = new Scanner(file);
        String line;
        while(scan.hasNext()){
            line=scan.nextLine();
            if(line.equals(oldVAl)) {
                content += newVAl + "\n";
            }
            else {
                content += line + "\n";
            }
        }
        file.delete();
        scan.close();
        FileWriter writer = new FileWriter(path);
        //System.out.println(content);
        writer.write(content);
        writer.close();
    }
}
