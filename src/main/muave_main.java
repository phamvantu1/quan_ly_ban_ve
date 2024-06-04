/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.Booking;
import view.LoginFrm;


/**
 *
 * @author Admin
 */
public class muave_main {
    public static void main(String[] args)
    {
       LoginFrm myFrame = new LoginFrm(new Booking());	
		myFrame.setVisible(true);	
    }
        
}
