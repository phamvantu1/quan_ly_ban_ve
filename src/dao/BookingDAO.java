package dao;
import com.sun.jdi.connect.spi.Connection;
import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Bill;
import model.BookedTour;
import model.Booking;
import model.Client;
import model.Tour;
import model.User;
import java.sql.SQLException;
import model.Schedule;


public class BookingDAO extends DAO{

	public BookingDAO() {
		super();
	}
// them du lieu vao cac bang
        public boolean addBooking(Bill bill)
        {
            String sqlBooking = "INSERT INTO tblBooking( dateBooked, note, ClientID, UserID ) VALUES(?,? ,? ,?)";
            String sqlBooked = "INSERT INTO tblBookedTour( price, dateStart, dateEnd,  TourID, BookingID , numberClient ) VALUES(?,?,? ,?,? ,?)";
           
		try{
                    
// them bang booking                    
                        PreparedStatement ps = con.prepareStatement(sqlBooking);      
                        
                        ps.setString(1, bill.getBooking().getDateBooked());
                        ps.setString(2, bill.getBooking().getNote());
                        ps.setInt(3, bill.getBooking().getClient().getId());
                        ps.setInt(4, bill.getBooking().getUser().getID());
			ps.executeUpdate();
                        
 // lay id booking                       
                        ArrayList<Booking> list = new BookingDAO().getAllBooking();
                        int id = 1;
                        boolean bb ;
                        while(true){
                        bb= false;
                        for(Booking b : list){
                        if(id == b.getID()){
                        bb = true;
                        break;
                            }
                        }
                            if (!bb )break;
                            ++id;
                        }
                        id--;
        
//   them bang booked     
                            for(BookedTour bt : bill.getBooking().getBookedTour())
                            {
                         ps = con.prepareStatement(sqlBooked);
                         ps.setFloat(1, bt.getTour().getPriceTour() );
                         ps.setDate(2, (java.sql.Date) bt.getTour().getDateStart());
                         ps.setDate(3, (java.sql.Date) bt.getTour().getDateEnd());
                         ps.setInt(4,bt.getTour().getID());
                         ps.setInt(5, id);
                         ps.setInt(6, bt.getNumber());
                        ps.executeUpdate(); 
                            }
                            	
		}catch(Exception e){
                        return false;
		}         
            return true;           
        }
        
 // them bang Bill        
       public boolean addBill( Bill bill )
        {
            String sqlBooking = "INSERT INTO tblBooking( dateBooked, note, ClientID, UserID ) VALUES(?,? ,? ,?)";
            String sqlBooked = "INSERT INTO tblBookedTour( price, dateStart, dateEnd,  TourID, BookingID , numberClientBooked ) VALUES(?,?,? ,?,? ,?)";
            String sqlBill = "INSERT INTO tblBill( note , dateOfPayment,totalMoney, UserID, BookingID ) VALUES(?,?,? ,?,?)";
		try{

                        
// lay id cua booking
                        ArrayList<Booking> list = new BookingDAO().getAllBooking();
                        int id = 1;
                        boolean bb ;
                        while(true){
                        bb= false;
                        for(Booking b : list){
                            if(id == b.getID()){
                            bb = true;
                            break;
                            }
                        }
                            if (!bb )break;
                            ++id;
                        }
                        id--;
//                            float total = 0;
//                            for (BookedTour bt : bill.getBooking().getBookedTour())
//                            {
//                                float price = bt.getTour().getPriceTour();
//                                total += price * bt.getNumber();
//                            }
                        
                        
   // them bang tblBill
                        PreparedStatement ps = con.prepareStatement(sqlBill);
                        ps.setString(1,bill.getNote());
                        ps.setString(2, bill.getDateOfPayment());
                        ps.setFloat(3, bill.getTotalMoney());
                        ps.setInt(4, bill.getBooking().getUser().getID());
                        ps.setInt(5, id);
                        ps.executeUpdate();
                                
			
		}catch(Exception e){
                        return false;
		}         
            return true;           
        }
                 
  // lay cac booking de lay ID
	public ArrayList<Booking> getAllBooking(){
		ArrayList<Booking> result = new ArrayList<Booking>();
		String sql = "SELECT * FROM tblBooking";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
                                Booking booking = new Booking();
                                booking.setID(rs.getInt("ID"));
                                booking.setDateBooked(rs.getString("dateBooked"));
                                booking.setNote(rs.getString("note"));                    
				result.add(booking);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		return result;
	}
        
 // dem so luong tour da dat ( bo ko dung nua)
        public int countTourIDByValue(int value) {
                int count = 0;
                String sql = "SELECT COUNT(*) FROM tblBookedTour WHERE TourID = ?";
                try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, value);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    count = rs.getInt(1);
                }
                } catch (SQLException e) {
                  e.printStackTrace();
                 }
                    return count;
            }

        

}
