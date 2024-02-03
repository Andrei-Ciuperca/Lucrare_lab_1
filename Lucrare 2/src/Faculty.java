import java.util.ArrayList;
import java.util.Iterator;

public class Faculty  {
    private ArrayList<Student> students;
    private String name;
    private String abbreviation;
    private ArrayList<Student> studentList;
    private StudyField studyField;
    private final ArrayList<Student> graduates;
    private  ArrayList<StudyField> faculties;

    public Faculty(){
        this.studentList = new ArrayList<>();
        this.graduates = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // General Operations
    public void addFaculty(StudyField studyField, String name, String abbreviation){
        System.out.println(name + " has been added as " + abbreviation + " to the " + studyField + " field.");
        faculties.add(studyField);
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
                System.out.println(graduatedStudent.getFirstName() + " " + graduatedStudent.getLastName() + " has graduated from: " + graduatedStudent.getStudyField());
                iterator.remove();
                return;
            }
        }

    }

    public void displayStudents(StudyField abbreviation){
        for (Student student : studentList) {
            if (student.getStudyField().equals(abbreviation)) {
                System.out.println("Current students enrolled in " + abbreviation + ":");
                for (Student student1 : studentList) {
                    System.out.println(student1.getFirstName());
                }
            }
        }
    }

    public void displayGraduatedStudents(StudyField abbreviation){
        for (Student student : studentList) {
            if (student.getStudyField().equals(abbreviation)) {
                System.out.println("Students who graduated " + abbreviation + ":");
                for (Student student1 : graduates) {
                    System.out.println(student1.getFirstName());
                }
            }
        }
    }

    public void isStudentFromFaculty(StudyField abbreviation, String email){
        for (Student student : studentList) {
            if (student.getStudyField().equals(abbreviation) && student.getEmail().equals(email)) {
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
