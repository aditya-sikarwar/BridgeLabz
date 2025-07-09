// Superclass
class Person {
    String name; int age;
    Person(String name, int age) { this.name = name; this.age = age; }
}

// Subclass 1
class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age); this.subject = subject;
    }
    void displayRole() { System.out.println("I am a Teacher."); }
}

// Subclass 2
class Student extends Person {
    String grade;
    Student(String name, int age, String grade) {
        super(name, age); this.grade = grade;
    }
    void displayRole() { System.out.println("I am a Student."); }
}

// Subclass 3
class Staff extends Person {
    String department;
    Staff(String name, int age, String department) {
        super(name, age); this.department = department;
    }
    void displayRole() { System.out.println("I am Staff."); }
}

// Test
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 35, "Math");
        Student s = new Student("Bob", 16, "10th Grade");
        Staff st = new Staff("Carol", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
