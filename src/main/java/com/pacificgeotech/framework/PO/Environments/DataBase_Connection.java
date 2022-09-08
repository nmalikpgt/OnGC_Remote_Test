package com.pacificgeotech.framework.PO.Environments;

import com.pacificgeotech.framework.core.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase_Connection {

    public static void updateStatus_100020214 () throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100020214' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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


    public static void updateStatus_100082131  () throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100082131' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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





    public static void updateStatus_100007456 () throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100007456' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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

    public static void updateStatus_100006745() throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100006745' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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

    public static void updateStatus_100027991() throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100027991' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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

    public static void updateStatus_100032195() throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100032195' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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

    public static void updateStatus_100072910() throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100072910' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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

    public static void updateStatus_100012288() throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100012288' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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


    public static void updateStatus_Workfliw (String appNumScreen) throws ClassNotFoundException, SQLException {
     /*   Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " Update epm.epm_well_activity set sd_within_submitted_cc_ind = 'N' where activity_app_area_id  in (\n" +
                    "select c. activity_app_area_id  from epm.epm_application a, epm.epm_activity_app_area b,\n" +
                    "epm.epm_well_activity c\n" +
                    "where a.application_id = b.application_id\n" +
                    "and b.activity_app_area_id = c.activity_app_area_id\n" +
                    "and a.application_number="+appNumScreen+")";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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

      */
    }



    public static void updateStatus_Application (String appNumScreen) throws  SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;
       
        try {
             st = con.createStatement();
            String sql = "update epm.epm_application set approval_determination_number = application_number where application_id in  (\n" +
                    "select application_id from epm.epm_application where application_number ="+appNumScreen+"and revision_num = 0\n" +
                    ")\n";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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














    public static void updateStatus_100023613 () throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);
                int PreparedStatement = 0;
        Statement st = null;

        try {
            st = con.createStatement();
            String sql = " update epm.epm_application  set app_status_code = 11 where amendment_ad_num = '100023613' and app_status_code in (1)";
            java.sql.PreparedStatement stmt = con.prepareStatement(sql);

            PreparedStatement = stmt.executeUpdate();

            System.out.println("UPdated count: " + PreparedStatement);

        } finally {
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
}
