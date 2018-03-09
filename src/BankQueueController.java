import java.util.Scanner;

public class BankQueueController {

    public static int queueSize;
    public static boolean finished;

    public static void main(String[] args) throws EmptyQueueException {

        Teller teller1 = new Teller("Emily", 5);
        Teller teller2 = new Teller("Olivia", 2);
        Teller teller3 = new Teller("Diana",3);

        queueSize = teller1.getNumberOfCustomers() + teller2.getNumberOfCustomers() + teller3.getNumberOfCustomers();

        BankQueue queueNumbers = new BankQueue(queueSize);

        for (int i = 0 ; i < queueSize ; i++) {
            queueNumbers.createNumber(i+1);
        }
        // something is not right here, it stopped after issuing a ticket
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
                        catch (EmptyQueueException e) {
                            e.endTicketIssue();

                    }

                    break;

                case 2:
                    finished = true;
                    break;
            }

        }
    }
}



