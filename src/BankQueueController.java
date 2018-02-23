import java.util.Scanner;

public class BankQueueController {

    public static int queueSize;
    public static boolean finished;

    public static void main(String[] args) {

        Teller teller1 = new Teller("Emily", 5);
        Teller teller2 = new Teller("Olivia", 2);

        queueSize = teller1.getNumberOfCustomers() + teller2.getNumberOfCustomers();

        BankQueue queueNumbers = new BankQueue(queueSize);

        for (int i = 0 ; i < queueSize ; i++) {
            queueNumbers.createNumber(i+1);
        }

        while (!finished) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("\nType 1 to issue ticket or 2 to end :");
            int issueNumber = userInput.nextInt();
            switch (issueNumber){
                case 1:
                    try {
                        System.out.print("Welcome to MYD Bank. Your queue number is " + queueNumbers.createTickets() + ". Please be seated.\n");
                        continue;
                    }
                    catch (CustomException e) {
                        e.endTicketIssue();
                        break;
                    }
                case 2:
                    finished = true;
            }

        }

    }
}
