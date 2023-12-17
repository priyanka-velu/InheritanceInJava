public class BankMain {
    public static void main(String[] args) {
        // BankAccount superclass 
        BankAccount regularAccount = new BankAccount();

        // setters
        regularAccount.setFirstName("Bob");
        regularAccount.setLastName("Miller");
        regularAccount.setAccountID(123456);

        // all methods
        regularAccount.deposit(1000);
        regularAccount.withdrawal(400);
        regularAccount.accountSummary();
        System.out.println();

        // CheckingAccount subclass
        CheckingAccount checkingAccount = new CheckingAccount(1.5);

        // setters
        checkingAccount.setFirstName("Ryan");
        checkingAccount.setLastName("Bush");
        checkingAccount.setAccountID(789101);

        // all methods
        checkingAccount.deposit(300);
        checkingAccount.processWithdrawal(500);
        checkingAccount.displayAccount();
    }
}