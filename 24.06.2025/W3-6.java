class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Invalid account number.");
        } else if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
        } else {
            this.accountNumber = accountNumber;
            this.balance = balance;
            System.out.println("Account created successfully.");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a1 = new Account("1234567890", 5000);
        Account a2 = new Account("", -100);
        a1.display();
    }
}
