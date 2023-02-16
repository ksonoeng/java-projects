package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by marinatarasova on 02/10/2023
 */
public class ScanFile {
    public static void main(String[] args){
        try{
            File practiceFile = new File("/Users/marinatarasova/JavaProjects/resources/data.txt");
            Scanner scan = new Scanner(practiceFile);
            String nextLine = System.getProperty("line.separator");
            if (practiceFile.isFile() && practiceFile.length()>0)
            {
                while (scan.hasNextLine())
                {
                    String line = scan.nextLine();
                    System.out.println(line);
                }
                System.out.println(nextLine + "No more lines");

            } else
            {
                System.out.println("File " + practiceFile + " not found or blank.");
            }
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        }
    }
}
