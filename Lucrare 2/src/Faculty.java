import java.util.ArrayList;
import java.util.Iterator;

public class Faculty  {
    private ArrayList<Student> students;
    private String name;
    private String abbreviation;
    private static ArrayList<Student> studentList;
    private StudyField studyField;
    private final ArrayList<Student> graduates;
    private static final ArrayList<Faculty> faculties = new ArrayList<>();



    public Faculty(String name, String abbreviation, StudyField studyField) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.studyField = studyField;
        studentList = new ArrayList<>();
        this.graduates = new ArrayList<>();
        faculties.add(this);

    }

    public static Faculty getFacultyByAbbreviation(String abbreviation){
        for (Faculty faculties : faculties) {
            if (faculties.getAbbreviation().equals(abbreviation)) {
                return faculties;
            }
        }
        return null;
    }
    // General Operations
    public static void displayStudentFaculty(String email){
        for (Student student : studentList) {
            if (student.getEmail().equals(email)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " belongs to the " + student.getFaculty().getName() + " faculty.");
            }
        }
    }


    public static void displayAllFaculties() {
        System.out.println("Here are all the faculties:");

        for (Faculty faculty : faculties) {
            System.out.println("Name: " + faculty.getName() + ", Abbreviation: " + faculty.getAbbreviation() + ", Study Field: " + faculty.getStudyField());
        }

    }

    public static void displayAllFacultiesOfAField(StudyField studyField){
        System.out.println("Here are all the faculties belonging to " + studyField);
        for (Faculty faculty : faculties){
            if (faculty.getStudyField().equals(studyField)){
                System.out.println(faculty.getName());
            }
        }
    }

    // Faculty Operations
    public void createStudent(Student student){
        studentList.add(student);
        System.out.println(student.getFirstName() + " " + student.getLastName() + " was added to the student list");
        student.setGraduated(false);
        System.out.println(student.isGraduated());
    }


    public static void graduateStudent(String email){
        for (Student student : studentList){
            if (student.getEmail().equals(email)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " has graduated from: " + student.getFaculty().getName());
                student.setGraduated(true);
            }
        }
    }



// WHAT THE ACTUAL FUCK IS GOING ON
    public static void displayStudents(String abbreviation, boolean isGraduated){
        for (Student student : studentList) {
            if (student.getFaculty().getAbbreviation().equals(abbreviation) && !student.isGraduated() && !isGraduated) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            } else if (student.getFaculty().getAbbreviation().equals(abbreviation) && student.isGraduated() && isGraduated) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }


    public static void isStudentFromFaculty(String abbreviation, String email){
        for (Student student : studentList) {
            if (student.getFaculty().getAbbreviation().equals(abbreviation) && student.getEmail().equals(email)) {
                System.out.println("Student does belong to faculty");
            } else {
                System.out.println("Student does not belong to faculty");
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        Faculty.studentList = studentList;
    }

    public StudyField getStudyField() {
        return studyField;
    }

    public void setStudyField(StudyField studyField) {
        this.studyField = studyField;
    }
}
