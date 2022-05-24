package strategyDP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Ticket Booking Section!!");
        Scanner scanner = new Scanner(System.in);
        TicketBookingApp ticketBookingApp = new TicketBookingApp();
        int choice;
        System.out.println("1. FirstAC 2. SecondAC 3. SleeperClass");
        boolean check = true;
        while (check)
        {
            System.out.print("Choose an option : ");
            choice = scanner.nextInt();
            switch (choice)
            {
                case  1 : ticketBookingApp.bookTicket(new FirstAC("First AC Coach"));

                            check  = false;
                            break;


                case 2 : ticketBookingApp.bookTicket(new SecondAC("Second AC Coach"));
                             check  = false;
                             break;
                case 3 : ticketBookingApp.bookTicket(new SleeperClass("Sleeper Coach"));
                          check  = false;
                          break;

                default:
                    System.out.println("Enter a valid option");
                    break;

            }

        }

    }
}
