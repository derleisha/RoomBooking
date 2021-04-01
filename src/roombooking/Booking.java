package roombooking;

import java.util.Date;

public class Booking {

    private String name;
    private String userID;
    private int roomSelected;
    private Date dateSelected;
    private int timeSlot;

    public Booking() {

    }

    public Booking(String name, String userID, int roomSelected, Date dateSelected, int timeSlot) {
        this.name = name;
        this.userID = userID;
        this.roomSelected = roomSelected;
        this.dateSelected = dateSelected;
        this.timeSlot = timeSlot;
    }

    public String toString() {
        return name + ", " + userID + ", " + roomSelected + ", " + dateSelected + ", " + timeSlot;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getRoomSelected() {
        return roomSelected;
    }

    public void setRoomSelected(int roomSelected) {
        this.roomSelected = roomSelected;
    }

    public Date getDateSelected() {
        return dateSelected;
    }

    public void setDateSelected(Date dateSelected) {
        this.dateSelected = dateSelected;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }
}
