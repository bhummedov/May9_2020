package FileOperation;

import java.io.File;
import java.util.Scanner;

public class FindingText{
    public static void main(String[] args) throws Exception {
        System.out.println(findMyValue("Banana","src\\FileOperation\\example.txt"));

    }
    public static String findMyValue(String value, String filePath)throws Exception{
        Scanner scan = new Scanner(new File(filePath));
        String word;
        String result="";
        while(scan.hasNext()){
            word= scan.next();
            if (word.equals(value)) {
                result = word;
            }
        }
        return result;
    }
}
