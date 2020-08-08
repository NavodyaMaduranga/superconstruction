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
public class GetTranspoterDetails {
    Connection con;
    Statement st;
    private String VehicleNumber;
    private String Model;
    private String Charge;
    
    
    
    public void SetDetails(String uname){
        
        DBConnection();
        PreparedStatement pst;
    
        try {
            pst = con.prepareStatement("SELECT * FROM transpoter WHERE user_name=?");
            pst.setString(1, uname);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                rs.getString(1);
                VehicleNumber = rs.getString(2);
                Model = rs.getString(3);
                Charge = rs.getString(4);
                
            }
            
        } catch (Exception ex) {
            //Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public String getModel() {
        return Model;
    }

    public String getCharge() {
        return Charge;
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
