//package This_Static_final;

public class BankAccount{
   static String bankName="icici";
   String accountHolderName;
   final int accountNumber;
   static int TotalAccounts=0;

   static void getTotalAccounts(){
    System.out.println("total number of account "+ TotalAccounts);

    }
    void displayDetails(){
        System.out.println("Bank name = "+ bankName);
        System.out.println("account holder name="+accountHolderName);
        System.out.println("account number = "+accountNumber);
    }

     BankAccount(String accountHolderName,int accountNumber) {
       // this.bankName=bankName;
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        TotalAccounts++;
    }
    

    public static void main(String[] args) {
        BankAccount acc1 =new BankAccount( "dev", 2145);
        BankAccount acc2=new BankAccount("rick", 2146);
        BankAccount.getTotalAccounts();
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }
        BankAccount.getTotalAccounts();


        
    }
}