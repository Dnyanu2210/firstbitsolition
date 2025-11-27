package polymorphism;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class BankAccount {
    String accountHolderName;
    int accountNumber;
    double currentBalance;
    String accountType;
    String contactNumber;
    String panCardNumber;
    int aadharNumber;

    BankAccount() {
        System.out.println("Called Default Constructor of BankAccount");
        this.accountHolderName = "Default Account";
        this.accountNumber = 1001;
        this.currentBalance = 10000.00;
        this.accountType = "Saving";
        this.contactNumber = "9999999999";
        this.panCardNumber = "ABCDE1234F";
        this.aadharNumber = 123456789;
    }

    BankAccount(String a1, int a2, double a3, String a4, String a5, String a6, int a7) {
        System.out.println("Called Parameterized Constructor of BankAccount");
        this.accountHolderName = a1;
        this.accountNumber = a2;
        this.currentBalance = a3;
        this.accountType = a4;
        this.contactNumber = a5;
        this.panCardNumber = a6;
        this.aadharNumber = a7;
    }

    void display() {
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Account Number      : " + this.accountNumber);
        System.out.println("Current Balance     : " + this.currentBalance);
        System.out.println("Account Type        : " + this.accountType);
        System.out.println("Contact Number      : " + this.contactNumber);
        System.out.println("PAN Card Number     : " + this.panCardNumber);
        System.out.println("Aadhar Number       : " + this.aadharNumber);
    }

    double withdraw(double amount) {
        if (amount <= currentBalance) {
            currentBalance =currentBalance-amount;
        }
        return currentBalance;
    }
}


class SavingAccount extends BankAccount {
    double minBalanceLimit;
    double fltInterest;
    double withdrawalLimit;

    SavingAccount() {
        super();
        System.out.println("Called Default Constructor of SavingAccount");
        this.minBalanceLimit = 1000.00;
        this.fltInterest = 4.5;
        this.withdrawalLimit = 25000.00;
    }

    SavingAccount(String a1, int a2, double a3, String a4, String a5, String a6, int a7,
                  double a8, double a9, double a10) {

        super(a1, a2, a3, a4, a5, a6, a7);
        System.out.println("Called Parameterized Constructor of SavingAccount");
        this.minBalanceLimit = a8;
        this.fltInterest = a9;
        this.withdrawalLimit = a10;
    }

    void display() {
        super.display();
        System.out.println("Minimum Balance Limit : " + this.minBalanceLimit);
        System.out.println("Interest Rate         : " + this.fltInterest);
        System.out.println("Withdrawal Limit      : " + this.withdrawalLimit);
        System.out.println("------------------------------------------");
    }

    double withdraw(double amount) {
        if (currentBalance - amount > minBalanceLimit) {
            currentBalance = currentBalance- amount;
        } else {
            System.out.println("Cannot withdraw below minimum balance!");
        }
        return currentBalance;
    }
}


class CurrentAccount extends BankAccount {
    double overdraftLimit;
    String businessName;
    double overdraftBalance;

    CurrentAccount() {
        super();
        System.out.println("Called Default Constructor of CurrentAccount");
        this.overdraftLimit = 50000.00;
        this.businessName = "Default Business";
        this.overdraftBalance = 0.00;
    }

    CurrentAccount(String a1, int a2, double a3, String a4, String a5, String a6, int a7,
                   double a8, String a9, double a10) {

        super(a1, a2, a3, a4, a5, a6, a7);
        System.out.println("Called Parameterized Constructor of CurrentAccount");
        this.overdraftLimit = a8;
        this.businessName = a9;
        this.overdraftBalance = a10;
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit   : " + this.overdraftLimit);
        System.out.println("Business Name     : " + this.businessName);
        System.out.println("Overdraft Balance : " + this.overdraftBalance);
        System.out.println("------------------------------------------");
    }

    double withdraw(double amount) {
        if (amount < overdraftLimit + currentBalance) {
            currentBalance = currentBalance- amount;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
        return currentBalance;
    }
}



class SalaryAccount extends BankAccount {

    double loanAmount;
    double paidAmount;
    double remainingAmount;
    LocalDate lastTransactionDate;

    SalaryAccount() {
        super();
        System.out.println("Called Default Constructor of SalaryAccount");

        this.loanAmount = 500000;
        this.paidAmount = 0;
        this.remainingAmount = 500000;


        this.lastTransactionDate = LocalDate.of(2025, 1, 5);
    }

    SalaryAccount(String a1, int a2, double a3, String a4, String a5, String a6,
                  int a7, double loan, double paid, double remain, LocalDate dt) {

        super(a1, a2, a3, a4, a5, a6, a7);

        this.loanAmount = loan;
        this.paidAmount = paid;
        this.remainingAmount = remain;

        
        this.lastTransactionDate = LocalDate.of(2025, 1, 5);
    }

    double withdraw(double amount) {
        LocalDate today = LocalDate.now();
        long daysDiff = ChronoUnit.DAYS.between(lastTransactionDate, today);

        if (daysDiff < 60) {
            System.out.println("❌ Withdrawal Denied: Only " + daysDiff +
                               " days passed since last transaction.");
            return remainingAmount;
        }

        System.out.println("✔ Withdrawal Allowed.");
        currentBalance -= amount;

        paidAmount += amount;
        remainingAmount = loanAmount - paidAmount;

        lastTransactionDate = today;

        return remainingAmount;
    }

    void display() {
        super.display();
        System.out.println("Loan Amount       : " + loanAmount);
        System.out.println("Paid Amount       : " + paidAmount);
        System.out.println("Remaining Amount  : " + remainingAmount);
        System.out.println("Last Transaction  : " + lastTransactionDate);
        System.out.println("------------------------------------------");
    }
}





class TestBank {
    public static void main(String[] args) {
    	 BankAccount b1;

       b1 = new  BankAccount();
        b1.display();

        b1 = new CurrentAccount(
                "Ravi Kumar", 201, 50000.00, "Current",
                "9876543210", "XYZAB1234C", 456789,
                100000.00, "Tech Solutions", 5000.00
        );
        b1.display();

        b1 = new SalaryAccount(
                "Priya Sharma", 301, 15000.00, "Loan",
                "9988776655", "LMNOP1234Q", 987654,
                500000.00, 100000.00, 400000.00,
                LocalDate.of(2025, 1, 5)
        );
        b1.display();
        

        // Test SalaryAccount withdrawal
        System.out.println("Withdraw result is : " + b1.withdraw(5000));
    }
}

