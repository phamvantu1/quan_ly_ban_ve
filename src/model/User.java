package model;

import java.io.Serializable;

public class User implements Serializable{
	private int ID;
	private String fullName;
	private String passWord;
	private String userName;
	private String position;

    public User(int ID, String fullName, String passWord, String userName, String position) {
        this.ID = ID;
        this.fullName = fullName;
        this.passWord = passWord;
        this.userName = userName;
        this.position = position;
    }

    public User() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
	
	
	
}
