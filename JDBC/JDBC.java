
package jdb;
import java.sql.*;

public class JDB {

    public static void main(String[] args) {
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String host="jdbc:mysql://localhost:3306/jdb_practice", username="root", password="";
            try{
                Connection conn = (Connection) DriverManager.getConnection(host, username, password);
                System.out.println("Database connected!");
                
                
                //Insert data-----------
                /*PreparedStatement pstmt = conn.prepareStatement("INSERT INTO tbl(name, age) VALUES(?,?)");
                  'Parameters[je koita question marks se koita set hobe!]'
                  pstmt.setString(1, "Rakib");
                  pstmt.setInt(2, 20); 
                  pstmt.executeUpdate();
                */
                
                
                //See affected rows----------
                /*int c = pstmt.executeUpdate();
                  System.out.println(c) */
                
                
                //Delete data--------------
                /*PreparedStatement pstmt = conn.prepareStatement("DELETE FROM tbl WHERE id=?");
                pstmt.setInt('Parameters[je koita question marks se koita set hobe!]', 4);
                pstmt.setInt(1, 4);
                pstmt.executeUpdate(); */

         
                //Update data--------------------
                /* String sql = "UPDATE tbl SET name=?, age=? WHERE id=?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, "Jhon");
                pstmt.setInt(2, 10);
                pstmt.setInt(3, 6);
                pstmt.executeUpdate(); */
                
                
                //Retrive data---------------
                
               String sql = "SELECT * FROM tbl";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet fetch = pstmt.executeQuery();
                while(fetch.next()){
                    System.out.println(fetch.getInt("id")+" "+fetch.getString("name")+" "+fetch.getInt("age"));
                }
               
                
                pstmt.close();
                //pstmt.close();
                conn.close();
            }
            catch(Exception e){
                System.out.println(e+"\n"+"Database connection error!");
                //e.printStackTrace();
            }
        }
        catch(Exception e){
            System.out.println(e+"\n"+"Failed to load and register driver!");
            //e.printStackTrace();
        }
        
    }
    
}
