/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Singer
 */
public class InsertDeveloperDetails {
    
    Statement stmt;
    
    public void setDetails(String UserName, boolean Mason,boolean Tile, 
            boolean Carpentor, boolean Plumber, boolean Electrician, boolean Painter, 
            boolean ConcreteSlab, boolean Ceiling, boolean Welding, boolean Aluminium){
    
        DBConnection();
        String query = "INSERT INTO developer VALUES ('"+UserName+"',"+Mason
                +","+Tile+","+Carpentor+","+Plumber+","+Electrician
                +","+Painter+","+ConcreteSlab+","+Ceiling+","+Welding+","
                +Aluminium+")";
        
        try {
            
            stmt.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void DBConnection(){
        String driver = "com.mysql.jdbc.Driver";
        String path = "jdbc:mysql://localhost:3306/constructiondatabase";
        
        try {
            
            Class.forName(driver);
            Connection con = DriverManager.getConnection(path,"root","");
            stmt = con.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
