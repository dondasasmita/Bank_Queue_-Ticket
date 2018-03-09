public class EmptyQueueException extends  Exception {

    public void endTicketIssue () {
        System.out.println("No more tickets, please return tomorrow");
    }
}
