package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;

public class UserDAO extends DAO{
	
	public UserDAO() {
		super();
	}
	// kiem tra login khi dang nhap 
	public boolean checkLogin(User user) {
		boolean result = false;
		String sql = "SELECT fullname, position , id FROM tblUser WHERE username = ? AND password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassWord());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
                                user.setID(rs.getInt("id"));
				user.setFullName(rs.getString("fullname"));
				user.setPosition(rs.getString("position"));
				result = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
