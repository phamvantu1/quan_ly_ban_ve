package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Bill implements Serializable{
	private int ID;
        private String note;
        private String dateOfPayment;
        private Float totalMoney;
        private User user;
        private Booking  booking;
	
	public Bill() {
		super();
	}

    public Bill(int ID, String note, String dateOfPayment, Float totalMoney, User user, Booking booking) {
        this.ID = ID;
        this.note = note;
        this.dateOfPayment = dateOfPayment;
        this.totalMoney = totalMoney;
        this.user = user;
        this.booking = booking;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(String dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    
}
