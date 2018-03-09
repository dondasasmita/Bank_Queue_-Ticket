public class BankQueue {

    private int putNumber;
    private int getNumber;
    private int [] q;


    //Constructor to determine the length of the queue
    BankQueue(int number) {
        q = new int [number];
        putNumber = 0;
        getNumber = 0;
    }

    // method to create numbers for the queue
    void createNumber(int number) {
        if (q.length == 0) {
            System.out.println("Bank tellers are unavailable. Sorry for the inconvenience. ");
            return;
        }
        q [putNumber++] = number;

    }

    // method to issue the number and emptying the queue
    int createTickets() throws EmptyException {
//        if (putNumber == getNumber) {
//            System.out.println("No tickets available.");
//        }
        return q[getNumber++];

    }
}
