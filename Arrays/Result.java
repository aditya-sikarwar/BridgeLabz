import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int num=sc.nextInt();

        int[][] record = new int [num][3];
        double[] percentage=new double[num];
        char [] grades=new char[num];

        for(int i=0;i<num; i++){
            System.out.println("Enter marks of student "+ (1+i));
            for(int j=0; j<3; j++){
                String subject;
                if(j==0){
                    subject="Physics";
                }
                else if(j==1){
                    subject="Chemistry";
                }
                else {
                    subject="Maths";
                }

                while(true){
                    System.out.println("Enter marks of "+subject+": ");
                    int marks=sc.nextInt();
                    if(marks>=0 && marks<=100){
                        record[i][j]=marks;
                        break;
                    }
                    else{
                        System.out.println("Enter valid marks(between 0-100)");
                    }
                }
    
            }
        }

        for(int i=0; i<num; i++){
            int total=record[i][0]+record[i][1]+record[i][2];
            percentage[i]=total/3.0;

            if(percentage[i] >= 90) {
                grades[i] = 'A';
            } else if (percentage[i] >= 75) {
                grades[i] = 'B';
            } else if (percentage[i] >= 60) {
                grades[i] = 'C';
            } else if (percentage[i] >= 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        
        System.out.println("----Student Report----");

        for(int i=0; i<num; i++){
            
            System.out.println("Student: "+(i+1));

            System.out.println("Marks in Physics: "+ record[i][0]);
            System.out.println("Marks in Chemistry: "+ record[i][1]);
            System.out.println("Marks in Maths: "+ record[i][2]);
            System.out.println("Percentage: "+percentage[i]);
            System.out.println("Grade: "+ grades[i]);
        }
    }
    
}
