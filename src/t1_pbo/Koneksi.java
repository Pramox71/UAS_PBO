
package t1_pbo;

import java.sql.*;
import javax.swing.JOptionPane;
public class Koneksi {
    Connection con;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/uas_pbo","root","");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Base Tidak Ada");
        }
    }
}
