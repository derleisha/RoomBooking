package roombooking;

import java.util.Scanner;
import java.util.ArrayList;

public class LogIn {

    private static Scanner input = new Scanner(System.in);
    private static String FirstName = " ";
    private static String LastName = " ";
    private static String Name = FirstName + " " + LastName;
    private static String Email;
    private static String Password;

    public boolean login() {

        try {

            System.out.println("Enter your email: ");
            String email = input.next();
            System.out.println("Enter your password");
            String password = input.next();

            int num = checkLogin(email, password);
            if (!(num == -1)) {
                String correctEmail = RoomBooking.Accounts.get(num).getEmail();
                String correctPassword = RoomBooking.Accounts.get(num).getPassword();
                if (email.equals(correctEmail) && password.equals(correctPassword)) {
                    return true;
                }
            }

            System.out.println("Incorrect Email or Password");

        } catch (Exception e) {
            System.out.println("Error" + e);

        }
        return false;

    }

    public int checkLogin(String email, String password) {
        if (RoomBooking.Accounts.isEmpty()) {
            System.out.println("There is no Account with those detail");
        } else {

            for (int i = 0; i < RoomBooking.Accounts.size(); i++) {
                if (email.equals(RoomBooking.Accounts.get(i).getEmail()) && password.equals(RoomBooking.Accounts.get(i).getPassword())) {
                    return i;
                }

            }
        }
        return -1;
    }

    public static void Register() {
        try {

            System.out.print("Enter your first name: ");
            FirstName = input.next();

            System.out.println("Enter your last name: ");
            LastName = input.next();

            System.out.println("Enter your email: ");
            Email = input.next().toLowerCase();

            // check to seee that valid email is entered
            while (validEmailCheck(Email) == false) {
                System.out.println("Invalid email! Enter valid email");
                Email = input.next().toLowerCase();

            }
            System.out.println("Enter a password (must be at least 8 characters long and include a number(s)))");
            Password = input.next();

            boolean validPassword = false;
            if (Password.length() >= 8 && isValid(Password)) {
                validPassword = true;
            }
            System.out.println(validPassword ? "Valid password" : "Invalid password");

            // add registered detail to filehandling
            Account newAccount = new Account(Name, Email, Password);
            RoomBooking.Accounts.add(newAccount);
            FileHandling.writeToFileAccounts(RoomBooking.Accounts);

        } catch (Exception e){
            System.out.println("Error" + e);
        }
    }

    public static boolean validEmailCheck(String email) {
        return !(!email.contains("@") || !email.contains("."));
    }

    public static boolean isValid(String Password) {
        String number = ".*[0-9].*";
        String alphabet = ".*[A-Z].*";
        return Password.matches(number) && Password.matches(alphabet);
    }
}
