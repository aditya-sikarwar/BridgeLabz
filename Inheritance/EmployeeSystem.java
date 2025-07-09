class Employee{
    String empName;
    int empId;
    double empSalary;

         Employee(String empName, int empId, double empSalary) {
            this.empName = empName;
            this.empId = empId;
            this.empSalary = empSalary;
        }

    

    void displayDetails(){
        //System.out.println("team size is:"+team);
        System.out.println("employee name :"+empName);
        System.out.println("employee id :"+empId);
        System.out.println("employee salary:"+empSalary);
    }

}
class Manager extends Employee{
     int teamSize;
    Manager(String empName,int empId,double empSalary,int teamSize){
    super(empName,empId,empSalary);
    this.teamSize=teamSize;
}

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team size: " + teamSize);
    }

}




class Developer extends Employee{
    int teamSize;
    String manager;
    Developer(String empName,int empId,double empSalary,int teamSize,String manager){
        super(empName,empId,empSalary);
        this.teamSize=teamSize;
        this.manager=manager;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("team size is :"+teamSize);
        System.out.println("managing director is :"+manager);

    }


}
class Intern extends Employee{
    int teamSize;
    String manager;
    String progLanguage;

    Intern(String empName,int empId,double empSalary,int teamSize,String manager,String progLanguage){
        super(empName,empId,empSalary);
        this.teamSize=teamSize;
        this.manager=manager;
        this.progLanguage=progLanguage;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("team size is :"+teamSize);
        System.out.println("managing director is :"+manager);
        System.out.println("proficient with language:"+progLanguage);

    }

}

public class EmployeeSystem{
public static void main(String[] args) {
    Manager m1=new Manager("dev", 1, 100000000,12);
    Developer d1 = new Developer("divi", 2, 3000000,25,"dev");
    Intern i1=new Intern("abhay", 3, 500000,26,"devansh","java");
    m1.displayDetails();
    System.out.println();
    d1.displayDetails();
    System.out.println();
    i1.displayDetails();
        
}
}