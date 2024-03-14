import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class DefaultCommands extends FolderMonitor {
    private static Date snapShotTime = null; // Tells you when the last commit was made


// Commit command
    /**
     * Updates snapshot time. Moves all files from hardcoded folder into our "CLOUD"
     */
     public static void commit(String source, String destination) throws IOException {
         // Update Snapshot Time and store it inside a file. (Commit file could store commit messages together with the date in later versions)
         snapShotTime = new Date();
         System.out.println("Snapshot created at: " + snapShotTime);
         try{
             Path path = Paths.get("CommitFile.txt");
             Files.writeString(path, String.valueOf(snapShotTime));

         }catch (IOException e){
             e.printStackTrace();
         }


         // Copy files into "cloud"
         Path localMachine = Paths.get(source);
         Path cloud = Paths.get(destination);

         // Copy directory structure recursively
         Files.walk(localMachine).filter(path -> !path.equals(localMachine)) //Exclude the localMachine folder itself
                 .forEach(path -> {
                     Path target = cloud.resolve(path.getFileName());
                     try{
                         if (Files.isDirectory(path)){
                             Files.createDirectories(target); // Create directories if they don't exist
                         }else {
                             Files.copy(path, target, StandardCopyOption.REPLACE_EXISTING);
                         }
                     }catch (IOException e){
                         e.printStackTrace();
                     }
                 });
         System.out.println("Commit successful!");
     }

     public static void status(String localMachine, String cloud) throws IOException, NoSuchAlgorithmException {
        FolderMonitor.compareFolders(localMachine, cloud);
         System.out.println("\n");
     }

     public static void info(){

     }
}
