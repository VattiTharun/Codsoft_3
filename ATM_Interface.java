import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        double initialBalance = 1000;

        ATM atm = new ATM(initialBalance);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            atm.DisplayMenu();
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();
            atm.ProcessOption(option);
            System.out.println();
        }
    }

}
