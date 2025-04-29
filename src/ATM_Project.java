import java.util.Scanner;

public class ATM_Project{
    private double balance = 1000.0;
    private String username = "user";
    private String pin = "1234";

    public void deposits(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void check() {
        System.out.println("Current Balance: " + balance);
    }

    public boolean autho(String enteredUsername, String enteredPin) {
        return enteredUsername.equals(username) && enteredPin.equals(pin);
    }

    public static void main(String[] args) {
        ATM_Project atm = new ATM_Project();
        Scanner sc = new Scanner(System.in);

        // User Authentication
        System.out.print("Enter Username: ");
        String enteredUsername = sc.nextLine();
        System.out.print("Enter PIN: ");
        String enteredPin = sc.nextLine();

        if (!atm.autho(enteredUsername, enteredPin)) {
            System.out.println("Invalid Username or PIN! Exiting...");
            System.exit(0);
        }

        // ATM Operations
        while(true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    atm.deposits(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    atm.withdraw(sc.nextDouble());
                    break;
                case 3:
                    atm.check();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
            }
        }
    }
}
