package automationregressiontests;


import com.pacificgeotech.framework.core.DbConnection;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Pacticesql {
    @Test



    public static void updateStatus_App () throws ClassNotFoundException, SQLException {
        String appNumScreen = "100027991 ";
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
        int PreparedStatement = 0;

        try {
            Statement st = con.createStatement();
            String sql = "update epm.epm_application set app_status_code = 9 where amendment_ad_num in ('100027991')";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
            con.close();
        }
    }










    public static void updateStatus_Application () throws ClassNotFoundException, SQLException {
        String appNumScreen = "100109873";
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
        int PreparedStatement = 0;

        try {
            Statement st = con.createStatement();
            String sql = "update epm.epm_application set approval_determination_number = application_number where application_id in  (\n" +
                    "select application_id from epm.epm_application where application_number = "+appNumScreen+"and revision_num = 0\n" +
                    ")\n";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
            con.close();
        }
    }










        public static void updateStatus_Workfliw () throws ClassNotFoundException, SQLException {
        String appNumScreen = "100109580";
            }

    }


























