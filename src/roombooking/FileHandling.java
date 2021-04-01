package roombooking;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class FileHandling {

    public static String folderDirectory = System.getProperty("user.dir");

    public static void writeToFileAccounts(ArrayList<Account> Accounts) {
        folderDirectory = System.getProperty("user.dir") + "\\Accounts.txt";
        try {
            FileWriter writeToFile = new FileWriter(folderDirectory, false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < Accounts.size(); i++) {
                printToFile.println(Accounts.get(i).toString());

            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

    public static ArrayList<Account> readToFileAccount() {
        folderDirectory = System.getProperty("user.dir") + "\\Accounts.txt";
        ArrayList<Account> Accounts = new ArrayList<>();
        String lineFromFile;

        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while ((lineFromFile = read.readLine()) != null) {
                String[] AccountDetails = lineFromFile.split(",");
                Account myAccount = new Account(AccountDetails[0], AccountDetails[1], AccountDetails[2]);
                Accounts.add(myAccount);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error " + e);

        }
        return Accounts;
    }

    public static void writeToFileBookings(ArrayList<Booking> BookingList) {
        folderDirectory = System.getProperty("user.dir") + "\\BookingList.txt";
        try {
            FileWriter writeToFile = new FileWriter(folderDirectory, false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < BookingList.size(); i++) {
                printToFile.println(BookingList.get(i).toString());

            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

    public static ArrayList<Booking> readFileBooking() {
        folderDirectory = System.getProperty("user.dir") + "\\BookingList.txt";
        ArrayList<Booking> BookingList = new ArrayList<>();
        String lineFromFile;

        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while ((lineFromFile = read.readLine()) != null) {
                String[] BookingDetails = lineFromFile.split(",");
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Booking booking = new Booking(BookingDetails[0], BookingDetails[1], Integer.parseInt(BookingDetails[2]), format.parse(BookingDetails[3]), Integer.parseInt(BookingDetails[4]));
                BookingList.add(booking);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error " + e);

        }
        return BookingList;

    }
}
