/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class PlaceOfTour {
    private int id;
	private String name;
	private String note;
        private  Place place;
        private Schedule shedule;
	
	public PlaceOfTour() {
		super();
	}

    public PlaceOfTour(int id, String name, String note, Place place, Schedule shedule) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.place = place;
        this.shedule = shedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Schedule getShedule() {
        return shedule;
    }

    public void setShedule(Schedule shedule) {
        this.shedule = shedule;
    }
        
}
