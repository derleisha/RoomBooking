package roombooking;

public class Account {

    private String Name;
    private String Email;
    private String Password;

    public Account(String Name, String Email, String Password) {
        this.Name = Name;

        this.Email = Email;
        this.Password = Password;
    }

    public String toString() {
        return Name + ", " + Email + ", " + Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
