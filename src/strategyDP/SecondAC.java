package strategyDP;

import java.util.Scanner;

public class SecondAC implements BookTicketStratergy {
    private  String coachName;
    private  int ticketsCount;

    public SecondAC(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public void bookTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many tickets you want ? ");
        ticketsCount = scanner.nextInt();
        System.out.println("Your" + ticketsCount + " tickets are booked successfully , Thank you for selecting" + this.coachName);
    }
}
