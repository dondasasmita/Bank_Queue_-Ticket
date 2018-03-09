import java.util.Scanner;

public class BankQueueController {

    public static int queueSize;
    public static boolean finished;

    public static void main(String[] args) throws EmptyException {

        Teller teller1 = new Teller("Emily", 5);
        Teller teller2 = new Teller("Olivia", 2);
        Teller teller3 = new Teller("Diana",3);

        queueSize = teller1.getNumberOfCustomers() + teller2.getNumberOfCustomers() + teller3.getNumberOfCustomers();

        BankQueue queueNumbers = new BankQueue(queueSize);

        for (int i = 0 ; i < queueSize ; i++) {
            queueNumbers.createNumber(i+1);
        }

        while (!finished){
            Scanner userInput = new Scanner(System.in);
            System.out.print("Type 1 to issue ticket or 2 to end :");
            int issueNumber = userInput.nextInt();
            switch (issueNumber){
                case 1:
                    System.out.println("\nWelcome to MYD Bank.");
                        try {
                            System.out.println("Your queue number is " + queueNumbers.createTickets() + ".");
                            System.out.println("Please be seated.\n");
                        }
                        catch (EmptyException e) {
                            e.endTicketIssue();
                        }
                        continue;
                case 2:
                    finished = true;
            }
        }
    }
}

