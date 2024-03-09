import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FolderMonitor {
    public static void compareFolders(String localMachine, String cloud){
        File source = new File(localMachine);
        File destination = new File(cloud);

        // Check if the folders exist
        if (!source.exists() || !destination.exists()){
            System.out.println("One or both folders can't be found or don't exist");
            return;
        }

        // Loop through the localMachine files
        for (File localFile : source.listFiles()){
            String localFileName = localFile.getName();
            File cloudFile = new File(cloud + File.separator + localFileName);

            // Check if file exists in Cloud folder
            if (!cloudFile.exists()){
                System.out.println(localFileName + " - deleted");
            }else {
                try {
                    if (Files.isSameFile(localFile.toPath(), cloudFile.toPath())){
                        System.out.println(localFileName + " - unchanged");
                    }else {
                        System.out.println(localFileName + " - changed");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        // Loop through cloud files (to find new files)
        for (File cloudFile : destination.listFiles()) {
            String cloudFileName = cloudFile.getName();
            File localFile = new File(localMachine + File.separator + cloudFileName);

            // Check if the file doesn't exist in localMachine
            if (!localFile.exists()){
                System.out.println(cloudFileName + " - new");
            }
        }
    }

    public static String getMD5Checksum(File file){
        return "hello";
    }
}
