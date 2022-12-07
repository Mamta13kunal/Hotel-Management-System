
package hotel.management.sytem;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem1","root", "Mamta@93");
            s=c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
