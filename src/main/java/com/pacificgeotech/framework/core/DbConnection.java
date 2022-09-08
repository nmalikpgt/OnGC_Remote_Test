package com.pacificgeotech.framework.core;

import com.pacificgeotech.framework.PO.Environments.Browser;
import org.apache.log4j.Logger;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final Logger logger = Logger.getLogger("DbConnection");
    private static File fileUrl = new File(
            DbConnection.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParentFile();

    public static Connection getConnection() {
        String[] jdbc = null;

        try {
            jdbc = getJdbcInfo();
            Class.forName(jdbc[0]);
        } catch (ClassNotFoundException e) {
            logger.info("NO Oracle JDBC Driver found!");
            e.printStackTrace();
        }

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(jdbc[1], jdbc[2], jdbc[3]);
        } catch (SQLException e) {
            logger.info("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return connection;
    }



    public static String[] getJdbcInfo (){
        String jdbcDriverClassName, jdbcUrl, username, password;
        if (Browser.environment.equals(Browser.Environment.Local)){
            jdbcDriverClassName = "oracle.jdbc.driver.OracleDriver";
            jdbcUrl = "jdbc:oracle:thin:@rat3.pacificgeotech.local:1521:test";
            username = "PROXY_EPM";
            password = "PROXY_EPM";
            return new String[]{ jdbcDriverClassName, jdbcUrl, username, password };
        }
        else if(Browser.environment.equals(Browser.Environment.Dev)){
            jdbcDriverClassName = "oracle.jdbc.driver.OracleDriver";
            jdbcUrl = "jdbc:oracle:thin:@rat3.pacificgeotech.dev:1521:dev";
            username = "PROXY_EPM";
            password = "PROXY_EPM";
            return new String[]{ jdbcDriverClassName, jdbcUrl, username, password };
        }
        else if(Browser.environment.equals(Browser.Environment.Remote)){
            jdbcDriverClassName = "oracle.jdbc.driver.OracleDriver";
            jdbcUrl = "jdbc:oracle:thin:@//rhdbdt.bcogc.local:1521/d_ogc.bcogc.ca";
            username = "proxy_epm";
            password = "FERRYsteadyCYMBALgears";
            return new String[]{ jdbcDriverClassName, jdbcUrl, username, password };
        }

        return null;
    }


}
