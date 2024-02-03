import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;

        // A faculty for each study field (For testing purposes)
        Faculty T = new Faculty("Trasnport", "T", StudyField.MECHANICAL_ENGINEERING);
        Faculty CSI = new Faculty("Computer Science", "CSI", StudyField.SOFTWARE_ENGINEERING);
        Faculty FN = new Faculty("Food and Nutrition", "FN", StudyField.FOOD_TECHNOLOGY);
        Faculty UD = new Faculty("Urban Design", "UD", StudyField.URBANISM_ARCHITECTURE);
        Faculty DFSPH = new Faculty("DEPARTMENT OF FOOD SAFETY AND PUBLIC HEALTH", "DFSPH", StudyField.VETERINARY_MEDICINE);

        // Hard coded students
        Student student2 = new Student("Sebastian", "Finciuc", "sebastian.finciuc@gmail.com", new Date(), new Date(), CSI, false);
        CSI.createStudent(student2);


        // General operations:
        // Step 1: Creating a faculty
        // Step 3: Display all faculties
        // Step 4: Display all faculties of a Field
       // Faculty.displayAllFacultiesOfAField(StudyField.SOFTWARE_ENGINEERING);

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
                    switch (scanner.nextInt()) {
                        case 1 -> {
                            scanner.nextLine(); // Consume the newline character left by nextInt()

                            System.out.println("Enter Faculty Name: ");
                            String fName = scanner.nextLine();
                            System.out.println("Enter Faculty Abbreviation: ");
                            String fAbbreviation = scanner.nextLine();
                            System.out.println("Enter Study Field (e.g., SOFTWARE_ENGINEERING): "); //TODO: Transfor this into a pick the field
                            StudyField field = StudyField.valueOf(scanner.nextLine());

                            Faculty faculty = new Faculty(fName, fAbbreviation, field);
                            // Faculty.displayAllFaculties(); Test code for checking the Faculty was added
//                      Faculty MTC = new Faculty("Media And Telecommunications", "MTC", StudyField.SOFTWARE_ENGINEERING); Example of faculty to add
                        }
                        case 2 -> {
                            scanner.nextLine();
                            System.out.println("Enter student email: ");
                            String sEmail = scanner.nextLine();

                            Faculty.displayStudentFaculty(sEmail);
                        }
                        case 3 -> Faculty.displayAllFaculties();
                        case 4 -> {
                            scanner.nextLine();
                            System.out.println("Enter a Study Field: "); //TODO: transfrom this into a pick the field
                            StudyField field = StudyField.valueOf(scanner.nextLine());

                            Faculty.displayAllFacultiesOfAField(field);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Faculty options: \n" +
                            "\t1.Create a new student\n" +
                            "\t2.Graduate student by email\n" +
                            "\t3.Display all enrolled students in a faculty\n" +
                            "\t4.Check if student belongs to faculty");
                    switch (scanner.nextInt()) {
                        case 1 -> {
                            scanner.nextLine();
                            System.out.println("Enter student first name: ");
                            String sFirstName = scanner.nextLine();
                            System.out.println("Enter student last name: ");
                            String sLastName = scanner.nextLine();
                            System.out.println("Enter student email: ");
                            String sEmail = scanner.nextLine();
                            System.out.println("Enter Faculty Abbreviation: ");
                            String fAbbreviation = scanner.nextLine();

                            Faculty studentFaculty = Faculty.getFacultyByAbbreviation(fAbbreviation);


                            Student student = new Student(sFirstName, sLastName, sEmail, new Date(), new Date(), studentFaculty, false);
                            System.out.println("student created!!!");
                            studentFaculty.createStudent(student);
                            // CSI.displayStudents("CSI"); Test code to check student was added
                        }
                    }
                    break;
                case 3:
                    // Search for student faculty
                    break;
                case 4:
                    // Display all faculties belonging to a field
                    break;
                default:
                    System.out.println("world");
            }
        }



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
//
//
//        // Step 2: Graduating a student by email
//        CSI.graduateStudent("ciuperca.andries@gmail.com");
//
//        // Step 3: Display current enrolled students by faculty (No graduates)
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

        // General Operations
        // Step 2: Display a students faculty by their Email


    }
}
