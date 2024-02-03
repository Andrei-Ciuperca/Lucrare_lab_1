import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("TUM Board Command Line \n" +
//                "\t1. General Operations \n" +
//                "\t2. Faculty Operations \n" +
//                "\t3. Student Operations \n" +
//                "\t4. Quit \n" +
//                "Please chose one of the above options: ");









        // General operations:
        // Step 1: Creating a faculty
        Faculty CSI = new Faculty("Computer Science", "CSI", StudyField.SOFTWARE_ENGINEERING);
        Faculty MTC = new Faculty("Media And Telecommunications", "MTC", StudyField.SOFTWARE_ENGINEERING);
        // Step 3: Display all faculties
        Faculty.displayAllFaculties();
        // Step 4: Display all faculties of a Field
        Faculty.displayAllFacultiesOfAField(StudyField.SOFTWARE_ENGINEERING);

        // Faculty operations
        // Step 1: Create and assign student to a faculty
        StudyField SE = StudyField.SOFTWARE_ENGINEERING;
        Student student1 = new Student("Andrei", "Ciuperca", "ciuperca.andries@gmail.com", new Date(), new Date(), CSI);
        Student student2 = new Student("Sebastian", "Finciuc", "sebastian.finciuc@gmail.com", new Date(), new Date(), CSI);
        CSI.createStudent(student1);
        CSI.createStudent(student2);


        // Step 2: Graduating a student by email
        CSI.graduateStudent("ciuperca.andries@gmail.com");

        // Step 3: Display current enrolled students by faculty (No graduates)
        CSI.displayStudents("CSI");

        // Step 4: Display graduates (No enrolled students)
        CSI.displayGraduatedStudents("CSI");

        // Step 5: Tell if students belongs or not to faculty
        CSI.isStudentFromFaculty("CSI", "sebastian.finciuc@gmail.com");

        // General Operations
        // Step 2: Display a students faculty by their Email
        CSI.displayStudentFaculty("sebastian.finciuc@gmail.com");

    }
}
