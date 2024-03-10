import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        final String CLOUD_PATH = "Z:\\catalin\\OOP\\Lucrari OOP\\Lucrari_OOP\\Lucrare 3\\Cloud"; // Folder used for storing files after commit (Emulates your GitHub repository)
        final String FOLDER_PATH = "Z:\\catalin\\OOP\\Lucrari OOP\\Lucrari_OOP\\Lucrare 3\\LocalMachine"; // Local folder used for keeping files you can edit (Emulates your local machine)

        // Interactive command line
        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish){
            System.out.println("""
                    GIT CLI\s
                    \t1. Commit\s
                    \t2. Info <argument>\s
                    \t3. Status
                    \t4. Quit
                    Please choose one of the above options:\s""");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    DefaultCommands.commit(FOLDER_PATH, CLOUD_PATH);
                    break;

                case 2:
                    System.out.println("Under development");
                    break;

                case 3:
                    DefaultCommands.status(FOLDER_PATH, CLOUD_PATH);
                    break;
                case 4:
                    shouldFinish = true;
                    break;
                default:
                    System.out.println("hello");
            }
        }

    }
}