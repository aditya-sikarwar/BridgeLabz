import java.util.*;
//we'll be using interface, which will act like an contract and will ensure common behaviour accross diff classes.!!
interface Transferrable {
    void transferTo(User receiver, double amount);
}

class Transaction {
    private String type;
    private String from;
    private String to;
    private double amount;
    private String description;

    public Transaction(String type, String from, String to, double amount, String description) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.description = description;
    }

    public String toString() {
        return type +" of ₹"+ amount + " from "+ from +" to " +to + " - "+description;
    }
}


abstract class Wallet implements Transferrable {
    private double balance;
    private User owner;

    public Wallet(double initialBalance,double referralBonus,User owner) {
        this.balance = initialBalance + referralBonus;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected void deductBalance(double amount) {
        balance -= amount;
    }

    public abstract void transferTo(User receiver, double amount);
}

class PersonalWallet extends Wallet {
    public PersonalWallet(double initialBalance, double referralBonus, User owner) {
        super(initialBalance, referralBonus, owner);
    }

u    public void transferTo(User receiver, double amount) {
        if (getBalance() >= amount) {
            deductBalance(amount);
            receiver.getWallet().addBalance(amount);

            getOwner().addTransaction(new Transaction("DEBIT", getOwner().getName(), receiver.getName(), amount, "Transferred from Personal Wallet"));
            receiver.addTransaction(new Transaction("CREDIT", getOwner().getName(), receiver.getName(), amount, "Received from Personal Wallet"));

            System.out.println("Transferred ₹" + amount + " to " + receiver.getName() + " from Personal Wallet");
        } else {
            System.out.println("Insufficient balance in Personal Wallet");
        }
    }
}

class BusinessWallet extends Wallet {
    public BusinessWallet(double initialBalance, double referralBonus, User owner) {
        super(initialBalance, referralBonus, owner);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;
        double total = amount + tax;

        if (getBalance() >= total) {
            deductBalance(total);
            receiver.getWallet().addBalance(amount);

            getOwner().addTransaction(new Transaction("DEBIT", getOwner().getName(), receiver.getName(), total, "Transferred with 2% tax from Business Wallet"));
            receiver.addTransaction(new Transaction("CREDIT", getOwner().getName(), receiver.getName(), amount, "Received from Business Wallet"));

            System.out.println("Transferred ₹" + amount + " (+2% tax) to " + receiver.getName() + " from Business Wallet");
        } else {
            System.out.println("Insufficient balance in Business Wallet");
        }
    }
}

class User {
    private String name;
    private Wallet wallet;
    private List<Transaction> transactionHistory;

    public User(String name) {
        this.name = name;
        this.transactionHistory = new ArrayList<>();
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Transaction t) {
        transactionHistory.add(t);
    }

    public void showTransactionHistory() {
        System.out.println("\nTransaction History of " + name + ":");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction t : transactionHistory) {
                System.out.println("- " + t);
            }
        }
    }
}

// Main class...
public class EWalletApp {
    public static void main(String[] args) {
    
        User aditya = new User("Aditya");
        User rahul = new User("Rahul");

        aditya.setWallet(new PersonalWallet(1000, 100, aditya));
        rahul.setWallet(new BusinessWallet(3000, 200, rahul));

        System.out.println("Initial Balances:");
        System.out.println(aditya.getName() + ": rs." + aditya.getWallet().getBalance());
        System.out.println(rahul.getName() + ": rs." + rahul.getWallet().getBalance());

        System.out.println("\nTransactions:");
        aditya.getWallet().transferTo(rahul, 500);
        rahul.getWallet().transferTo(aditya, 1000);

        System.out.println("\nFinal Balances:");
        System.out.println(aditya.getName() + ": rs." + aditya.getWallet().getBalance());
        System.out.println(rahul.getName() + ": rs." + rahul.getWallet().getBalance());

        aditya.showTransactionHistory();
        rahul.showTransactionHistory();
    }
}