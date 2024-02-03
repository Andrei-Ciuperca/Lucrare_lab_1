import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

<<<<<<< Updated upstream
        Faculty CSI = new Faculty("Computer Science", "CSI", StudyField.SOFTWARE_ENGINEERING);
        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;
=======
        // A faculty for each study field (For testing purposes)
//        Faculty T = new Faculty("Trasnport", "T", StudyField.MECHANICAL_ENGINEERING);
//        Faculty CSI = new Faculty("Computer Science", "CSI", StudyField.SOFTWARE_ENGINEERING);
//        Faculty FN = new Faculty("Food and Nutrition", "FN", StudyField.FOOD_TECHNOLOGY);
//        Faculty UD = new Faculty("Urban Design", "UD", StudyField.URBANISM_ARCHITECTURE);
//        Faculty DFSPH = new Faculty("DEPARTMENT OF FOOD SAFETY AND PUBLIC HEALTH", "DFSPH", StudyField.VETERINARY_MEDICINE);



        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while(!shouldFinish){
        System.out.print("TUM Board Command Line \n" +
                "\t1. General Operations \n" +
                "\t2. Faculty Operations \n" +
                "\t3. Student Operations \n" +
                "\t4. Quit \n" +
                "Please chose one of the above options: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("General options: \n" +
                        "\t1.Create a new faculty\n" +
                        "\t2.Search for a students faculty by email\n" +
                        "\t3.Display all University faculties\n" +
                        "\t4.Display all faculties belonging to a field.");
                if (scanner.nextInt() == 1){
                    scanner.nextLine(); // Consume the newline character left by nextInt()
                    System.out.println("Enter Faculty Name: ");
                    String fName = scanner.nextLine();

                    System.out.println("Enter Faculty Abbreviation: ");
                    String fAbbreviation = scanner.nextLine();

                    System.out.println("Enter Study Field (e.g., SOFTWARE_ENGINEERING): ");
                    StudyField field = StudyField.valueOf(scanner.nextLine());

                    Faculty faculty = new Faculty(fName, fAbbreviation, field);
                    //Faculty MTC = new Faculty("Media And Telecommunications", "MTC", StudyField.SOFTWARE_ENGINEERING);
                }
                break;
            case 2:
                Faculty.displayStudentFaculty("sebastian.finciuc@gmail.com");

            case 3:
                Faculty.displayAllFaculties();
            break;
        }
        }






/*
        // General operations:
        // Step 1: Creating a faculty
        // Step 3: Display all faculties
        // Step 4: Display all faculties of a Field
        Faculty.displayAllFacultiesOfAField(StudyField.SOFTWARE_ENGINEERING);
>>>>>>> Stashed changes

        while(!shouldFinish) {
            System.out.print("TUM Board Command Line \n" +
                    "\t1. General Operations \n" +
                    "\t2. Faculty Operations \n" +
                    "\t3. Student Operations \n" +
                    "\t4. Quit \n" +
                    "Please chose one of the above options: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("General options: \n" +
                            "\t1.Create a new faculty\n" +
                            "\t2.Search for a students faculty by email\n" +
                            "\t3.Display all University faculties\n" +
                            "\t4.Display all faculties belonging to a field.");
                    if (scanner.nextInt() == 1) {
                        scanner.nextLine(); // Consume the newline character left by nextInt()
                        System.out.println("Enter Faculty Name: ");
                        String fName = scanner.nextLine();
                        System.out.println("Enter Faculty Abbreviation: ");
                        String fAbbreviation = scanner.nextLine();
                        System.out.println("Enter Study Field (e.g., SOFTWARE_ENGINEERING): ");

                        StudyField field = StudyField.valueOf(scanner.nextLine());
                        Faculty faculty = new Faculty(fName, fAbbreviation, field);
                        Faculty.displayAllFaculties();
//                       Faculty MTC = new Faculty("Media And Telecommunications", "MTC", StudyField.SOFTWARE_ENGINEERING);
                    }
                    break;
                case 2:
                    Faculty.displayStudentFaculty("sebastian.finciuc@gmail.com");
                    break;
                case 3:
                    Faculty.displayAllFaculties();
                    break;
                case 4:
                    System.out.println("helllo");
                    break;
                default:
                    System.out.println("world");
            }
        }






<<<<<<< Updated upstream

//        // General operations:
//        // Step 1: Creating a faculty
//        // Step 3: Display all faculties
//        Faculty.displayAllFaculties();
//        // Step 4: Display all faculties of a Field
//        Faculty.displayAllFacultiesOfAField(StudyField.SOFTWARE_ENGINEERING);
//
//        // Faculty operations
//        // Step 1: Create and assign student to a faculty
//        StudyField SE = StudyField.SOFTWARE_ENGINEERING;
//        Student student1 = new Student("Andrei", "Ciuperca", "ciuperca.andries@gmail.com", new Date(), new Date(), CSI);
//        Student student2 = new Student("Sebastian", "Finciuc", "sebastian.finciuc@gmail.com", new Date(), new Date(), CSI);
//        CSI.createStudent(student1);
//        CSI.createStudent(student2);
//
//
//        // Step 2: Graduating a student by email
//        CSI.graduateStudent("ciuperca.andries@gmail.com");
//
//        // Step 3: Display current enrolled students by faculty (No graduates)
//        CSI.displayStudents("CSI");
//
//        // Step 4: Display graduates (No enrolled students)
//        CSI.displayGraduatedStudents("CSI");
//
//        // Step 5: Tell if students belongs or not to faculty
//        CSI.isStudentFromFaculty("CSI", "sebastian.finciuc@gmail.com");
//
//        // General Operations
//        // Step 2: Display a students faculty by their Email
//        CSI.displayStudentFaculty("sebastian.finciuc@gmail.com");
=======
        // General Operations
        // Step 2: Display a students faculty by their Email

 */
>>>>>>> Stashed changes

    }
}
