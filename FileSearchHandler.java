package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by marinatarasova on 02/13/2023
 */
public class FileSearchHandler {
    public static void main(String[] args){

            File resourceDirectory = new File("/Users/marinatarasova/JavaProjects/resources");

            fileSearchHandler(resourceDirectory);
    }

    public static void fileSearchHandler(File folder){
        try {
            File[] files = folder.listFiles();
            String nextLine = System.getProperty("line.separator");
            if (folder.isDirectory() && folder.length() != 0)
            {
                for (File file : files) {
                    if (file.getName().equals("data.txt")) {
                        System.out.println("File " + "'" + file.getName().concat("data.txt").substring(8) + "'" + " exists in directory " + folder + "." + nextLine);
                        System.out.println("It's content:");
                        Scanner scan = new Scanner(file);
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            if (line.toUpperCase().equals("MARINA TOKARSKIY"))
                            {
                                System.out.println(line.toUpperCase());
                            } else {
                                System.out.println(line.toLowerCase());
                            }
                        }
                        System.out.println(nextLine + "No more lines.");
                        scan.close();
                    }
                }
            } else {
                System.out.println(folder + " does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + e.getMessage());
        }

        }
    }
