import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000, amount;

        System.out.print("Enter withdrawal amount: ");
        amount = sc.nextDouble();

        try {
            if (amount > balance)
                throw new InsufficientBalanceException("Insufficient Balance");
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Balance = " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}