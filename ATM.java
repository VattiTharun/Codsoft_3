import java.util.Scanner;

public class ATM {
    private  double balance;
    public ATM(double initialBalance)
    {
        this.balance = initialBalance;
    }
    private void Deposit()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. Current balance: $" + balance);
    }
    private void Withdrawal()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }
    private void  checkBalance()
    {
        System.out.println("Current Balance : $"+balance);
    }
    public void DisplayMenu()
    {
        System.out.println("Enter the Option You Want To Choose: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdrawal");
        System.out.println("4.Exit");
    }
    public void ProcessOption(int option)
    {
        switch (option)
        {
            case 1:
                checkBalance();
                break;
            case 2:
                Deposit();
                break;
            case 3:
                Withdrawal();
                break;
            case 4:
                System.out.println("Exiting the ATM");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
    }

