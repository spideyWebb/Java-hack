class Account {
    private double balance; // Private instance variable

    // Getter method to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to set the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited Rs " + amt);
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else {
            System.out.println("Insufficient amount.");
        }
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();

        // Start the account with Rs 2000
        myAccount.setBalance(2000);

        // Deposit Rs 500
        myAccount.deposit(500);

        // Withdraw Rs 1800
        myAccount.withdraw(1800);

        // Show the balance
        System.out.println("Current Balance: Rs " + myAccount.getBalance());
    }
}
