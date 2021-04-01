package roombooking;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import static roombooking.RoomBooking.BookingList;

public class ScheduledBooking {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Booking> bookingChoice = new ArrayList<>();
    
    // 2d to represent booking table: show the slot(morning, afternoon)- 
    //each have 2 hour time slot ( 30 minutes waiting after each for cleaning)
    // shows the room available /(marked 'booked' if unavailable)
    // 2D array to act as table for bookings
    // add resources method 
    private static String[][] bookingDisplay = new String[5][7];

    public static void bookingsTableSetUp() {

        bookingDisplay[0][0] = "|    Slots   | ";
        bookingDisplay[0][1] = "     Rooms   | ";

        bookingDisplay[1][0] = "| 9:00-11:00 | ";
        bookingDisplay[2][0] = "| 11:30-13:30| ";
        bookingDisplay[3][0] = "| 14:00-16:00| ";
        bookingDisplay[4][0] = "| 16:30-18:30| ";

        bookingDisplay[0][2] = "|     1      | ";
        bookingDisplay[0][3] = "|     2      | ";
        bookingDisplay[0][4] = "|     3      | ";
        bookingDisplay[0][5] = "|     4      | ";
        bookingDisplay[0][6] = "|     5      | ";

        for (int slot = 1; slot < 5; slot++) {
            for (int room = 0; room < 6; room++) {
                bookingDisplay[slot][room] = "|     available      |";
              
            }

        }
    }

    public static void printBookingTable() {
        for (int slot = 1; slot < 5; slot++) {
            for (int room = 0; room < 6; room++) {
                System.out.println(bookingDisplay[slot][room]);
            }
            System.out.println();

        }
    }

    public static void Bookings() {
        // run through the array and the fill in the slots that are booked
        if (!bookingChoice.isEmpty()) {
            for (int i = 0; i < bookingChoice.size(); i++) {
                int room = bookingChoice.get(i).getRoomSelected();
                int slot = bookingChoice.get(i).getTimeSlot();
                bookingDisplay[slot][room] = "|     booked      |";
               
            }
        }
    }

    public static void userBooking() {
        // get the user to select the room they'll like to book
        System.out.println("what room would you like to book? \n 1: Room 1\n 2: Room 2\n 3: Room 3\n 4: Room 4\n 5: Room 5 ");
        int roomSelection = input.nextInt();
        // get the user to select the slot they'll like to book
        System.out.println("Select the slot you'll like to book: \n 1: 9:00-11:00\n 2: 11:30-13:30\n 3: 14:00-16:00\n 4: 16:30-18:30 ");
        int slotSelection = input.nextInt();
        
        
    
    }
    public static void DisplayOptions(){
        // array table displaying info about room
       
        
    }

}
