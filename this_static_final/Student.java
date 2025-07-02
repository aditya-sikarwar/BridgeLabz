public class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    String name;
    String grade;
    final int rollNumber;

    public Student(String name, String grade, int rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", "A", 101);
        Student s2 = new Student("Bob", "B", 102);

        s1.displayDetails(s1);
        s2.displayDetails(s2);

        Student.displayTotalStudents();
    }
}
