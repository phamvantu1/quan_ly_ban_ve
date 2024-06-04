/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class ServiceOfPlace {
        private int id;
	private String note;
        private PlaceOfTour pot;
        private Service service;
	
	public ServiceOfPlace() {
		super();
	}

    public ServiceOfPlace(int id, String note, PlaceOfTour pot, Service service) {
        this.id = id;
        this.note = note;
        this.pot = pot;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public PlaceOfTour getPot() {
        return pot;
    }

    public void setPot(PlaceOfTour pot) {
        this.pot = pot;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
        
}
