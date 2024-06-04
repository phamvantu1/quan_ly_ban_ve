package model;

import java.io.Serializable;
import java.util.Date;

public class Tour  implements Serializable{
	private int ID;
	private String name;
	private String place;
	private Date dateStart;
	private Date dateEnd;
        private Float priceTour;
        private String nameService;
        private String nameSupplier;
        private Float priceService;
        private Float total;
        
        public Tour() {
		super();
	}

    public Tour(int ID, String name, String place, Date dateStart, Date dateEnd, Float priceTour, String nameService, String nameSupplier, Float priceService, Float total) {
        this.ID = ID;
        this.name = name;
        this.place = place;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.priceTour = priceTour;
        this.nameService = nameService;
        this.nameSupplier = nameSupplier;
        this.priceService = priceService;
        this.total = total;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
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

    public Float getPriceTour() {
        return priceTour;
    }

    public void setPriceTour(Float priceTour) {
        this.priceTour = priceTour;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public Float getPriceService() {
        return priceService;
    }

    public void setPriceService(Float priceService) {
        this.priceService = priceService;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    
        
    
}
