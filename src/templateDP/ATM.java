package templateDP;

import java.util.Scanner;

public class ATM extends TransactionOperation {
    private  int amount;

    @Override
    public void insertCard() {
        System.out.println("Please insert your card");
    }

    @Override
    public void enterPin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the pin number : ");
        amount = scanner.nextInt();


    }

    @Override
    public void enterAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount you want to withdraw : ");
        amount = scanner.nextInt();

    }

    @Override
    public void collectCash() {
        System.out.println("Please collect your cash and card before leaving");
    }


}
