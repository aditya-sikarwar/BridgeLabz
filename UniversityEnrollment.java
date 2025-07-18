// university campus enrollment
// scenario : student be able to enroll in course, faculty can assign grades
// concepts used :
// class - student, course, faculty, enrollment
// constructor - used to create students with/without elective preference
// access modifier ; private for internal gpa fields, public method to access transcript
// interface : graded with method assignGrade()
// operator : gpa calculation, comparisons (+,/,etc)
// OOP
// encapsulation - secure handling of grades
// inheritance - undergraduate, postgraduate extend student

interface Graded {
    void assignGrade(String courseName, String grade);
}

class Course {
    String courseName;
    int courseId;
    int credits;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.credits = 3;  // Default credits
    }
}

class Student {
    private String name;
    private int studentId;
    private double totalPoints = 0.0;
    private int totalCredits = 0;
    private String elective;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public Student(String name, int studentId, String elective) {
        this.name = name;
        this.studentId = studentId;
        this.elective = elective;
    }

    public void updateGPA(double gradePoints, int credits) {
        totalPoints += gradePoints * credits;
        totalCredits += credits;
    }

    public double getGPA() {
        if (totalCredits == 0) return 0.0;
        return totalPoints / totalCredits;
    }

    public void printTranscript() {
        System.out.println("Transcript for " + name + " (ID: " + studentId + ") | GPA: " + getGPA());
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }
}

class Undergraduate extends Student implements Graded {
    public Undergraduate(String name, int studentId) {
        super(name, studentId);
    }

    public Undergraduate(String name, int studentId, String elective) {
        super(name, studentId, elective);
    }

    @Override
    public void assignGrade(String courseName, String grade) {
        double points = GradeUtil.gradeToPoints(grade);
        updateGPA(points, 3);  // assuming 3 credit course
        System.out.println(getName() + " assigned grade " + grade + " in " + courseName);
    }
}

class Postgraduate extends Student implements Graded {
    public Postgraduate(String name, int studentId) {
        super(name, studentId);
    }

    @Override
    public void assignGrade(String courseName, String grade) {
        double points = GradeUtil.gradeToPoints(grade);
        updateGPA(points, 3);  // assuming 3 credit course
        System.out.println(getName() + " assigned grade " + grade + " in " + courseName);
    }
}

class Enrollment {
    Student student;
    Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void showEnrollment() {
        System.out.println("Student: " + student.getName() + " (ID: " + student.getStudentId() + ")"
                + " enrolled in Course: " + course.courseName + " (ID: " + course.courseId + ")");
    }
}

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void assignGrade(Graded student, String courseName, String grade) {
        System.out.println("Faculty " + name + " assigning grade...");
        student.assignGrade(courseName, grade);
    }
}

class GradeUtil {
    public static double gradeToPoints(String grade) {
        return switch (grade.toUpperCase()) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }
}

//main class with sample input
public class UniversityEnrollment {
    public static void main(String[] args) {
        Undergraduate s1 = new Undergraduate("Aditya", 1001, "AI");
        Undergraduate s2 = new Undergraduate("Devansh", 1007, "Cyber Security");
        Postgraduate s3 = new Postgraduate("Hritik", 2002);

        Course c1 = new Course("Object Oriented Programming", 501);
        Course c2 = new Course("Data Structures", 504);
        Course c3 = new Course("DBMS", 506);

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c2);
        Enrollment e3 = new Enrollment(s3, c3);
        e1.showEnrollment();
        e2.showEnrollment();
        e3.showEnrollment();

        Faculty prof = new Faculty("Mr. Kiran");
        prof.assignGrade(s1, c1.courseName, "A");
        prof.assignGrade(s2, c2.courseName, "B");
        prof.assignGrade(s3, c3.courseName, "c");

        s1.printTranscript();
        s2.printTranscript();
        s3.printTranscript();
    }
}