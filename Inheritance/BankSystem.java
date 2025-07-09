// Superclass
class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber; this.balance = balance;
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); this.interestRate = interestRate;
    }
    void displayAccountType() { System.out.println("Savings Account"); }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() { System.out.println("Checking Account"); }
}

// Subclass 3
class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance); this.maturityPeriod = maturityPeriod;
    }
    void displayAccountType() { System.out.println("Fixed Deposit Account"); }
}

// Test
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 3.5);
        CheckingAccount ca = new CheckingAccount("CA456", 2000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
