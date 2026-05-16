import java.util.Scanner;
class UserBank {
    double balance = 5000;
    public void depositMoney(double amount) {
        balance = balance + amount;
        System.out.println("Money Deposited Successfully");
    }
    public void withdrawMoney(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Please collect your cash");
        }
        else {
            System.out.println("Not enough balance");
        }
    }
    public void showBalance() {

        System.out.println("Available Balance : " + balance);
    }
}
public class ATMProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserBank user = new UserBank();
        int option;
        do {
            System.out.println("\n====== ATM MENU ======");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option : ");
            option = input.nextInt();
            switch(option) {
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    double deposit = input.nextDouble();
                    user.depositMoney(deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw : ");
                    double withdraw = input.nextDouble();
                    user.withdrawMoney(withdraw);
                    break;
                case 3:
                    user.showBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        } while(option != 4);
        input.close();
    }
}