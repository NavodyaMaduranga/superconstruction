/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Singer
 */
public class GetAccountDetails {
    
    Connection con;
    Statement st;
    private String Name;
    private String FName;
    private String LName;
    private String Birthday;
    private String Address;
    private String City;
    private String Email;
    private String Mobile;
    private String Type;
    private String Password;
    
    
    
    public void SetDetails(String uname){
        
        DBConnection();
        PreparedStatement pst;
    
        try {
            pst = con.prepareStatement("SELECT * FROM userdetails WHERE user_name=?");
            pst.setString(1, uname);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                FName = rs.getString(1);
                LName = rs.getString(2);
                rs.getString(3);
                Birthday = rs.getString(4);
                Address =rs.getString(5);
                City = rs.getString(6);
                Email = rs.getString(7);
                Mobile = rs.getString(8);
                Password = rs.getString(9);
                Type = rs.getString(10);
                Name = FName + " " + LName;
            }
            
        } catch (Exception ex) {
            //Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getName() {
        return Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getEmail() {
        return Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getType() {
        return Type;
    }
    public String getPassword() {
        return Password;
    }
    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }
    
    private void DBConnection(){
        String path = "jdbc:mysql://localhost:3306/constructiondatabase";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(path,"root","");
            st =  con.createStatement();
        } catch (Exception ex) {
            //Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } /*catch (SQLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
