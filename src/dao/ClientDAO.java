 package dao;
import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Booking;
import model.Client;
import model.Tour;

public class ClientDAO extends DAO{
	
	/**
	 * search all clients in the tblClient whose name contains the @key
	 * @param key
	 * @return list of client whose name contains the @key
	 */
    //
    // lay ra client
     public ArrayList<Client> getListClient(){
		ArrayList<Client> list = new ArrayList<Client>();
		String sql = "SELECT * FROM tblBill_2 ORDER BY id DESC LIMIT 1";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Client rm = new Client();
				rm.setId(rs.getInt("id"));
				rm.setName(rs.getString("name"));
                                rm.setIdCard(rs.getString("idcard"));
                                rm.setAddress(rs.getString("address"));
                                rm.setTel(rs.getString("tel"));
                                rm.setEmail(rs.getString("email"));
                                rm.setNote(rs.getString("note"));
                                
				list.add(rm);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		return list;
	}
    
    
    // tim client
	public ArrayList<Client> searchClient(String key){
		ArrayList<Client> result = new ArrayList<Client>();
		String sql = "SELECT * FROM tblclient WHERE name LIKE ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + key + "%");
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Client client = new Client();
				client.setId(rs.getInt("id"));
				client.setName(rs.getString("name"));
				client.setIdCard(rs.getString("idcard"));
				client.setAddress(rs.getString("address"));
				client.setTel(rs.getString("tel"));
				client.setEmail(rs.getString("email"));
				client.setNote(rs.getString("note"));
				result.add(client);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		return result;
	}
	
// lay ra tat ca client de tang id cho text
	
	public ArrayList<Client> getAllClient(){
		ArrayList<Client> result = new ArrayList<Client>();
		String sql = "SELECT * FROM tblclient";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Client client = new Client();
				client.setId(rs.getInt("id"));
				client.setName(rs.getString("name"));
				client.setIdCard(rs.getString("idcard"));
				client.setAddress(rs.getString("address"));
				client.setTel(rs.getString("tel"));
				client.setEmail(rs.getString("email"));
				client.setNote(rs.getString("note"));
				result.add(client);
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
		return result;
	}

	// them client khi bam add
        public boolean addClient(Client client)
        {
            String sql = "INSERT INTO tblclient(id , name, idcard, address, tel, email, note) VALUES(?,?,?,?,?,?,?)";
		try{

                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, client.getId());
			ps.setString(2, client.getName());
			ps.setString(3, client.getIdCard());
			ps.setString(4, client.getAddress());
			ps.setString(5, client.getTel());
			ps.setString(6, client.getEmail());
			ps.setString(7, client.getNote());

			ps.executeUpdate();
		
		}catch(Exception e){
                        return false;

		}
            
            return true;
            
        }
        
     
}
