package roombooking;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomBooking {

    protected static ArrayList<Account> Accounts = new ArrayList<>();
    protected static ArrayList<Booking> BookingList = new ArrayList<>();
    protected static String Login;

    public static void main(String[] args) {
        Accounts = FileHandling.readToFileAccount();
        BookingList = FileHandling.readFileBooking();

    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int choice;
             System.out.println("What would you like do: \n 1.Login \n 2. Register");
             
             // add switch-case with options

        }
    }
}

    
