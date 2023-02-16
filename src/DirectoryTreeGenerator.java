import java.io.File;

/**
 * Created by marinatarasova on 01/26/2023
 */
public class DirectoryTreeGenerator {
    public static void main(String [] args) {

        File root = new File("/Users/marinatarasova/JavaProjects");

        printDirectoryTree(root, "");

    }

    private static void printDirectoryTree(File folder, String indent) {
        if (folder.isDirectory() && folder.length() != 0)
        {
            System.out.println(indent + folder.getName());
            File[] files = folder.listFiles();
            if (files == null)
            {
                return;
            }
            indent += "   ";

            for (File file : files) {
                if (file.isDirectory()) {
                    printDirectoryTree(file, indent);
                }
            }
        } else
        {
            System.out.println(indent + folder.getName());
            if (folder.isFile())
            {
                System.out.println(folder);
            }
        }
    }
}
