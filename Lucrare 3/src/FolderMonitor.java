import java.io.*;
import java.util.Date;

public class FolderMonitor {
    private static String FOLDER_PATH = "Z:\\catalin\\OOP\\Lucrari OOP\\Lucrari_OOP\\Lucrare 3\\gitSimulator";
    public Date snapShotTime;

    public FolderMonitor(Date snapShotTime) {
        this.snapShotTime = snapShotTime;
    }


    // Used for listing all files within directory
    private static String storeFileInfo() {
        File directory = new File(FOLDER_PATH);
        if (directory.exists() && directory.isDirectory()) {
            StringBuilder sb = new StringBuilder(); // Use StringBuilder for efficient string concatenation
            File[] files = directory.listFiles();
            for (File file : files) {
                if (!file.isDirectory()) {
                    sb.append(file.getName() + " " + new Date(file.lastModified()) + "\n");
                }
            }
            return sb.toString().trim(); // Remove trailing newline if any
        } else {
            System.out.println("Provided directory does not exist");
        }

        return null;
    }

    public void commit(){
        snapShotTime = new Date();
    }

    // Save all file info in a separate text file
    public static void status(){
        // Compare current information inside file with new information

            // Read previous file infro from CommitFile.txt
        String previousFileData = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("CommitFile.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n"); // Add newline after each line
            }
            previousFileData = sb.toString().trim();
            //System.out.println(previousFileData); // Print for verification (optional)
        } catch (Exception e) {
            e.printStackTrace();
        }

            //Get the current file info
        String currentFileData = storeFileInfo();
       // System.out.println(currentFileData); // Print for verification (optional)

        // Compare and print detailed messages
        if (!currentFileData.equals(previousFileData)) {
            System.out.println("Files changed:");
            String[] currentLines = currentFileData.split("\n"); // Split by newlines
            String[] previousLines = (previousFileData != null) ? previousFileData.split("\n") : new String[0]; // Handle potential null

            // Loop through current lines
            for (String currentLine : currentLines) {
                boolean foundUnchanged = false;
                for (String previousLine : previousLines) {
                    if (currentLine.startsWith(previousLine)) { // Check if filename and extension match
                        foundUnchanged = true;
                        break;
                    }
                }

                if (!foundUnchanged) {
                    String filename = currentLine.trim().split(" ")[0]; // Extract filename (assuming space separated)
                    System.out.println("  - " + filename + " - Changed");
                }
            }
        } else {
            System.out.println("Files unchanged:");
            String[] currentLines = currentFileData.split("\n");
            for (String currentLine : currentLines) {
                String filename = currentLine.trim().split(" ")[0]; // Extract filename (assuming space separated)
                System.out.println("  - " + filename + " - Unchanged");
            }
        }


        // Write all new information about the files in our folder
        try {
            File file = new File("CommitFile.txt");
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(storeFileInfo());
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Date getSnapShotTime() {
        return snapShotTime;
    }
}
