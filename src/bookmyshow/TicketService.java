package bookmyshow;

public class TicketService {


    public int tickets(int seats) throws PaymentException {

        try {
            int noOfseats = 5;
            if (seats <= noOfseats) {
                noOfseats=noOfseats-seats;
                System.out.println("Booking seats: "+seats);
                System.out.println("AvailableSeats: " + noOfseats);

            }

        }
            finally{

                       boolean SeatAccess=false;
                         if (!SeatAccess)
                         {
                             throw new PaymentException("Payment failed. Tickets Blocked.Released to Repository");
            }
        }
        return seats;
    }
}