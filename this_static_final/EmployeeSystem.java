//package This_Static_final;

public class EmployeeSystem {

    static String companyName="google";
    String name;
    final int id;
    String designation;
   static int totalEmploye=0;

    public EmployeeSystem(String companyName,String name,int id,String designation) {
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmploye++;
    }

        void employeesDetails(){
        System.out.println("company name:"+companyName);
        System.out.println("name of employee:"+name);
        System.out.println("Emp id:"+id);
        System.out.println("designation"+designation);
        System.out.println();


    }
   static void displayTotalemployees(){
    System.out.println(totalEmploye);
   }


    public static void main(String[] args) {
        EmployeeSystem e1=new EmployeeSystem(companyName, "lakshya", 1, "bareily");
        EmployeeSystem e2=new EmployeeSystem(companyName, "dev", 2, "spn");
        e1.employeesDetails();
        e2.employeesDetails();

        EmployeeSystem.displayTotalemployees();
    }
    
}
