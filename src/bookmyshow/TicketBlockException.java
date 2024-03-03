package bookmyshow;

public class TicketBlockException extends Exception{
    private String tickets;

    public TicketBlockException(String tickets,String message) {
        super(message);
        this.tickets=tickets;
    }



    public String getTickets() {
        return tickets;
    }
}
