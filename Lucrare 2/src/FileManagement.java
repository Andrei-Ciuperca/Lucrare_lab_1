import java.io.*;
import java.util.*;

class FileManager {
    private static final String FILENAME = "students.dat";

    public void saveFaculties(List<Faculty> faculties) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(faculties);
        } catch (IOException e) {
            System.out.println("Error saving faculties: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Faculty> loadFaculties() {
        List<Faculty> faculties = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            faculties = (List<Faculty>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading faculties: " + e.getMessage());
        }
        return faculties;
    }
}