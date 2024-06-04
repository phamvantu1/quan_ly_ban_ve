/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class ServiceOfSupplier {
        private int id;
	private String note;
        private Supplier supplier;
        private ServiceOfPlace sop;
	
	public ServiceOfSupplier() {
		super();
	}

    public ServiceOfSupplier(int id, String note, Supplier supplier, ServiceOfPlace sop) {
        this.id = id;
        this.note = note;
        this.supplier = supplier;
        this.sop = sop;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public ServiceOfPlace getSop() {
        return sop;
    }

    public void setSop(ServiceOfPlace sop) {
        this.sop = sop;
    }
        
}
