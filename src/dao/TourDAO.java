package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Client;

import model.Tour;

public class TourDAO extends DAO{
	
	public TourDAO() {
		super();
	}
// tim tour khi bam search
	public ArrayList<Tour> searchTour(String key, Date dateStart){
		ArrayList<Tour> result = new ArrayList<Tour>();
		String sql = "SELECT * FROM tblTour WHERE place LIKE ? AND dateStart = ? ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + key + "%");
                        ps.setDate(2, new java.sql.Date(dateStart.getTime()));
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Tour rm = new Tour();
				rm.setID(rs.getInt("id"));
				rm.setName(rs.getString("name"));
                                rm.setPlace(rs.getString("place"));
                                rm.setDateStart(rs.getDate("dateStart"));
                                rm.setDateEnd(rs.getDate("dateEnd"));
                                rm.setPriceTour(rs.getFloat("priceTour"));
                                rm.setNameService(rs.getString("nameService"));
                                rm.setNameSupplier(rs.getString("nameSupplier"));
                                rm.setPriceService(rs.getFloat("priceService"));
                                rm.setTotal(rs.getFloat("total"));
				result.add(rm);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		return result;
	}
	
        
        
        /// lay cac tour
        
        public ArrayList<Tour> getListTour(){
		ArrayList<Tour> list = new ArrayList<Tour>();
		String sql = "SELECT * FROM tblBill_1 ORDER BY id DESC LIMIT 1";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Tour rm = new Tour();
				rm.setID(rs.getInt("id"));
				rm.setName(rs.getString("name"));
                                rm.setPlace(rs.getString("place"));
                                rm.setDateStart(rs.getDate("dateStart"));
                                rm.setDateEnd(rs.getDate("dateEnd"));
                                rm.setPriceTour(rs.getFloat("priceTour"));
                                rm.setNameService(rs.getString("nameService"));
                                rm.setNameSupplier(rs.getString("nameSupplier"));
                                rm.setPriceService(rs.getFloat("priceService"));
                                rm.setTotal(rs.getFloat("total"));
				list.add(rm);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		return list;
	}
	
     
}
