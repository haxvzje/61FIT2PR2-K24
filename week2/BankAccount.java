package week2;

public class BankAccount {
    double balance;
    int transactions;
    double interestRate;
    String holderName;

    public BankAccount(String holderName, double initial) {
        this.holderName = holderName;
        this.balance = initial;
        this.transactions = 1;
        this.interestRate = 0;
    }

    public static void transfer(BankAccount senderAccount, BankAccount receiverAccount, int amount) {
        if (senderAccount.balance < (amount + 0.5)) {
            System.out.println("You do not have enough money to transfer!");
            return;
        }

        senderAccount.withdraw(amount + 0.5);
        receiverAccount.deposit(amount);
    }

    public void annualInterest(double interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    @Override
    public String toString() {
        return String.format("%s, %s$%.2f", this.holderName, (this.balance < 0 ? "-" : ""), Math.abs(this.balance));
    }
}
