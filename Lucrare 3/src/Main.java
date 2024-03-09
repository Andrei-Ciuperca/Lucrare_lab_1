import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final String CLOUD_PATH = "Z:\\catalin\\OOP\\Lucrari OOP\\Lucrari_OOP\\Lucrare 3\\Cloud"; // Folder used for storing files after commit (Emulates your GitHub repository)
        final String FOLDER_PATH = "Z:\\catalin\\OOP\\Lucrari OOP\\Lucrari_OOP\\Lucrare 3\\LocalMachine"; // Local folder used for keeping files you can edit (Emulates your local machine)

        //DefaultCommands.commit(FOLDER_PATH, CLOUD_PATH);
        FolderMonitor.compareFolders(FOLDER_PATH, CLOUD_PATH);

        /*
        Deprecated code
        // Folder location: Z:\catalin\OOP\Lucrari OOP\Lucrari_OOP\Lucrare 3\gitSimulator

        //FolderMonitor.getFileNames();
        FolderMonitor.status();
        //System.out.println(FolderMonitor.getFileNames());
        System.out.println(FolderMonitor.test());
        System.out.print("Hello world!"+((char)8)+"a");
        */

    }
}