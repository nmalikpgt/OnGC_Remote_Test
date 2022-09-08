package automationregressiontests;

import com.pacificgeotech.framework.core.DbConnection;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

public class DatabaseConnection {


    @Test

    public void updateStatusApp() throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        // Connection con=  DBconnection.getConnection();
        con.setAutoCommit(false);
        int PreparedStatement = 0;
        java.sql.Statement st = null;
        try {
             st = con.createStatement();
        //  String sql = "update epm.epm_application  set app_status_code = 11 where application_number=100000068";
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '\' and app_status_code in (1)";


            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

           System.out.println("UPdated count: " + PreparedStatement);
        } finally {
            // con.commit();
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Test
public void randomnumber(){


    String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 2) { // length of the random string.
        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String first = salt.toString();

    System.out.print(first);


}


}
