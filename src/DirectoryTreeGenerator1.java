import java.io.File;

/**
 * Created by marinatarasova on 02/04/2023
 */
public class DirectoryTreeGenerator1 {
    public static void main(String [] args){

        File root = new File("/Users/marinatarasova/Documents");

        printDirectoryTree(root, "");
    }

    private static void printDirectoryTree(File folder, String indent) {

        //Print folder name
        System.out.println(indent + folder.getName());

        File[] files = folder.listFiles();
        if (files == null){
            return;
        }

        indent += "       ";
        for(File file : files){
            if (file.isDirectory()){
                printDirectoryTree(file, indent);
            }
        }
    }
}
