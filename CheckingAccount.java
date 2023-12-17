// CheckingAccount subclass
public class CheckingAccount extends BankAccount {
    private double interestRate;

    // constructor
    public CheckingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    // processWithdrawal method: including overdraft fee
    public void processWithdrawal(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdrawal(amount);
        } else if (amount > getBalance()) {
            double overdraftFee = 30.0;
            super.withdrawal(amount + overdraftFee);
            System.out.println("An Overdraft Fee has been charged since your withdrawal amount exceeded your balance.");
            System.out.println("Overdraft fee: $" + overdraftFee);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // displayAccount method: displays superclass attributes and interest rate
    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}