package javademo;

class BankAccount
{
    String accountHolderName;
    int accountNumber;
    double currentBalance;
    String accountType;
    String contactNumber;
    String panCardNumber;
    int aadharNumber;

    BankAccount()
    {
        System.out.println("Called Default Constructor of BankAccount");
        this.accountHolderName = "Default Account";
        this.accountNumber = 1001;
        this.currentBalance = 10000.00;
        this.accountType = "Saving";
        this.contactNumber = "9999999999";
        this.panCardNumber = "ABCDE1234F";
        this.aadharNumber = 123456789;
    }

    BankAccount(String a1, int a2, double a3, String a4, String a5, String a6, int a7)
    {
        System.out.println("Called Parameterized Constructor of BankAccount");
        this.accountHolderName = a1;
        this.accountNumber = a2;
        this.currentBalance = a3;
        this.accountType = a4;
        this.contactNumber = a5;
        this.panCardNumber = a6;
        this.aadharNumber = a7;
    }

    void display()
    {
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Account Number      : " + this.accountNumber);
        System.out.println("Current Balance     : " + this.currentBalance);
        System.out.println("Account Type        : " + this.accountType);
        System.out.println("Contact Number      : " + this.contactNumber);
        System.out.println("PAN Card Number     : " + this.panCardNumber);
        System.out.println("Aadhar Number       : " + this.aadharNumber);
    }

} // BankAccount Ends



class SavingAccount extends BankAccount
{
    double minBalanceLimit;
    double fltInterest;
    double withdrawalLimit;

    SavingAccount()
    {
        super();
        System.out.println("Called Default Constructor of SavingAccount");
        this.minBalanceLimit = 1000.00;
        this.fltInterest = 4.5;
        this.withdrawalLimit = 25000.00;
    }

    SavingAccount(String a1, int a2, double a3, String a4, String a5, String a6, int a7,
                  double a8, double a9, double a10)
    {
        super(a1, a2, a3, a4, a5, a6, a7);
        System.out.println("Called Parameterized Constructor of SavingAccount");
        this.minBalanceLimit = a8;
        this.fltInterest = a9;
        this.withdrawalLimit = a10;
    }

    void display()
    {
        super.display();
        System.out.println("Minimum Balance Limit : " + this.minBalanceLimit);
        System.out.println("Interest Rate         : " + this.fltInterest);
        System.out.println("Withdrawal Limit      : " + this.withdrawalLimit);
        System.out.println("------------------------------------------");
    }

} // SavingAccount Ends



class CurrentAccount extends BankAccount
{
    double overdraftLimit;
    String businessName;
    double overdraftBalance;

    CurrentAccount()
    {
        super();
        System.out.println("Called Default Constructor of CurrentAccount");
        this.overdraftLimit = 50000.00;
        this.businessName = "Default Business";
        this.overdraftBalance = 0.00;
    }

    CurrentAccount(String a1, int a2, double a3, String a4, String a5, String a6, int a7,
                   double a8, String a9, double a10)
    {
        super(a1, a2, a3, a4, a5, a6, a7);
        System.out.println("Called Parameterized Constructor of CurrentAccount");
        this.overdraftLimit = a8;
        this.businessName = a9;
        this.overdraftBalance = a10;
    }

    void display()
    {
        super.display();
        System.out.println("Overdraft Limit   : " + this.overdraftLimit);
        System.out.println("Business Name     : " + this.businessName);
        System.out.println("Overdraft Balance : " + this.overdraftBalance);
        System.out.println("------------------------------------------");
    }

} // CurrentAccount Ends



class LoanAccount extends BankAccount
{
    double loanAmount;
    double paidAmount;
    double remainingAmount;

    LoanAccount()
    {
        super();
        System.out.println("Called Default Constructor of LoanAccount");
        this.loanAmount = 500000.00;
        this.paidAmount = 0.00;
        this.remainingAmount = 500000.00;
    }

    LoanAccount(String a1, int a2, double a3, String a4, String a5, String a6, int a7,
                double a8, double a9, double a10)
    {
        super(a1, a2, a3, a4, a5, a6, a7);
        System.out.println("Called Parameterized Constructor of LoanAccount");
        this.loanAmount = a8;
        this.paidAmount = a9;
        this.remainingAmount = a10;
    }

    void display()
    {
        super.display();
        System.out.println("Loan Amount     : " + this.loanAmount);
        System.out.println("Paid Amount     : " + this.paidAmount);
        System.out.println("Remaining Amount: " + this.remainingAmount);
        System.out.println("------------------------------------------");
    }

} // LoanAccount Ends



class TestBank
{
    public static void main(String[] args)
    {
        SavingAccount S1 = new SavingAccount();
        S1.display();

        CurrentAccount C1 = new CurrentAccount("Ravi Kumar", 201, 50000.00, "Current", "9876543210", "XYZAB1234C", 456789,
                                               100000.00, "Tech Solutions", 5000.00);
        C1.display();

        LoanAccount L1 = new LoanAccount("Priya Sharma", 301, 15000.00, "Loan", "9988776655", "LMNOP1234Q", 987654,
                                         500000.00, 100000.00, 400000.00);
        L1.display();
    }
} // TestBank Ends
