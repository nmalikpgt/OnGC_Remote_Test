package com.pacificgeotech.framework.core;


import org.apache.log4j.Logger;
import org.testng.Reporter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Msg {
    private static final String strCharacter = ".";
    private static final String starCharacter = "*";
    private static final String equalCharacter = "=";
    static Logger log;
    public static void Info(String info) {

        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1= dateFormat.format(date);



        int stringLength = info.length();
        StringBuilder sbString = new StringBuilder(stringLength);

        for(int i=0; i < 90-stringLength; i++){
            sbString.append(strCharacter);
        }
        Reporter.log("INFO: " +date1 +"    " + info + "   " +sbString);
       // Reporter.log("INFO: " + info + " " +sbString  + " Ok. " );

        System.out.print("INFO: " +date1 +"    " + info + "   " +sbString);
    }

    public static void Page(String page) {

        int stringLength = page.length();
        StringBuilder sbString = new StringBuilder(stringLength);
        int length = (90-stringLength)/2 - 6;
        for(int i=0; i < length; i++){
            sbString.append(starCharacter);
        }

        System.out.println("      " + sbString + "      " + page +"      " + sbString);
    }

    public static void Done() {

        System.out.println(" Ok.");
    }
    public static void Line() {

        int stringLength = 0;
        StringBuilder sbString = new StringBuilder(stringLength);
        System.out.println("");
        for(int i=0; i < 90-stringLength; i++){
            sbString.append(equalCharacter);
        }

        System.out.println("     "+sbString);
        Reporter.log("     "+sbString);

    }



}
