package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;



public class BookedTour implements Serializable{
	private int id;
	private Tour tour;
	private Date dateStart;
	private Date dateEnd;
	private float price;
	
	private Booking booking;
        private int number;
	
	
	
	public BookedTour() {
		super();
		
	}

    public BookedTour(int id, Tour tour, Date dateStart, Date dateEnd, float price, Booking booking, int number) {
        this.id = id;
        this.tour = tour;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.price = price;
        this.booking = booking;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
        

    
}
