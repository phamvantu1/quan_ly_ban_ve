package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Booking implements Serializable{
	private int ID;
	private String dateBooked;
	private String note;
	private Client client;
	private User user;
	private ArrayList<BookedTour> bookedTour;
	
	public Booking() {
		super();
		bookedTour = new ArrayList<BookedTour>();
	}

    public Booking(int ID, String dateBooked, String note, Client client, User user, ArrayList<BookedTour> bookedTour) {
        this.ID = ID;
        this.dateBooked = dateBooked;
        this.note = note;
        this.client = client;
        this.user = user;
        this.bookedTour = bookedTour;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(String dateBooked) {
        this.dateBooked = dateBooked;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<BookedTour> getBookedTour() {
        return bookedTour;
    }

    public void setBookedTour(ArrayList<BookedTour> bookedTour) {
        this.bookedTour = bookedTour;
    }

    
	
}
