import java.util.ArrayList;
import java.util.Iterator;

public class Faculty  {
    private ArrayList<Student> students;
    private String name;
    private String abbreviation;
    private ArrayList<Student> studentList;
    private StudyField studyField;
    private ArrayList<Student> graduates;
    private static ArrayList<Faculty> faculties = new ArrayList<>();



    public Faculty(String name, String abbreviation, StudyField studyField) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.studyField = studyField;
        this.studentList = new ArrayList<>();
        this.graduates = new ArrayList<>();
        faculties.add(this);

    }
    // General Operations
    public  void displayStudentFaculty(String email){
        Iterator<Student> iterator = studentList.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if (student.getEmail().equals(email)){
                System.out.println(student.getFirstName() + " " + student.getLastName() + " belongs to the " + student.getFaculty().getName() + " faculty.");
            }
        }
    }


    public static void displayAllFaculties(){
        System.out.println("Here are all the faculties:");
        for (Faculty faculty : faculties){
            System.out.println(faculty.getName());
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
    }

    public void graduateStudent(String email){
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student graduatedStudent = iterator.next();
            if (graduatedStudent.getEmail().equals(email)){
                graduates.add(graduatedStudent); // Used for displaying graduated students later
                System.out.println(graduatedStudent.getFirstName() + " " + graduatedStudent.getLastName() + " has graduated from: " + graduatedStudent.getFaculty().getName());
                iterator.remove();
                return;
            }
        }

    }

    public void displayStudents(String abbreviation){
        for (Student student : studentList) {
            if (student.getFaculty().getAbbreviation().equals(abbreviation)) {
                System.out.println("Current students enrolled in " + abbreviation + ":");
                for (Student student1 : studentList) {
                    System.out.println(student1.getFirstName());
                }
            }
        }
    }

    public void displayGraduatedStudents(String abbreviation){
        for (Student student : studentList) {
            if (student.getFaculty().getAbbreviation().equals(abbreviation)) {
                System.out.println("Students who graduated " + abbreviation + ":");
                for (Student student1 : graduates) {
                    System.out.println(student1.getFirstName());
                }
            }
        }
    }

    public void isStudentFromFaculty(String abbreviation, String email){
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
        this.studentList = studentList;
    }

    public StudyField getStudyField() {
        return studyField;
    }

    public void setStudyField(StudyField studyField) {
        this.studyField = studyField;
    }
}
