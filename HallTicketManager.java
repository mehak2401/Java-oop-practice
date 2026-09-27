class HallTicket {
    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class HallTicketManager {

    public static void main(String[] args) {
        // Create initial object
        HallTicket priya = new HallTicket("Priya", 0);

        // Assign second variable to point to the exact same reference
        HallTicket copy = priya;
        copy.seatNumber = 45;

        // Print seat number as observed via original variable
        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);

        // Check reference equality
        System.out.println("copy == priya: " + (copy == priya));

        // Create third separate object with identical values
        HallTicket separate = new HallTicket("Priya", 45);
        System.out.println("separate == priya: " + (separate == priya));
    }
}