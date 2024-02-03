import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("TUM Board Command Line \n" +
//                "\t1. General Operations \n" +
//                "\t2. Faculty Operations \n" +
//                "\t3. Student Operations \n" +
//                "\t4. Quit \n" +
//                "Please chose one of the above options: ");












        // Step 1: Create and assign student to a faculty
        StudyField SE = StudyField.SOFTWARE_ENGINEERING;
        Student student1 = new Student("Andrei", "Ciuperca", "ciuperca.andries@gmail.com", new Date(), new Date(), SE);
        Student student2 = new Student("Sebastian", "Finciuc", "sebastian.finciuc@gmail.com", new Date(), new Date(), SE);
        Faculty faculty = new Faculty();
        faculty.createStudent(student1);
        faculty.createStudent(student2);
        // System.out.println(student1.getSpecialitate());

        // Step 2: Graduating a student by email
        faculty.graduateStudent("ciuperca.andries@gmail.com");

        // Step 3: Display current enrolled students by faculty (No graduates)
        faculty.displayStudents(SE);

        // Step 4: Display graduates (No enrolled students)
        faculty.displayGraduatedStudents(SE);

        // Step 5: Tell if students belongs or not to faculty
        faculty.isStudentFromFaculty(SE, "sebastian.finciuc@gmail.com");
    }
}