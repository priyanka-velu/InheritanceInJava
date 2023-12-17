// BankAccount superclass
public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // withdrawal method
    public void withdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    // getBalance method
    public double getBalance() {
        return balance;
    }

    // accountSummary method
    public void accountSummary() {
        System.out.println("Account Information for " + getFirstName() + " " + getLastName() + ":");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Account ID: " + getAccountID());
        System.out.println("Balance: $" + getBalance());
    }
}