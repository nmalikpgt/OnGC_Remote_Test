package com.pacificgeotech.framework.PO.Environments;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Document_path {

    protected static final String Sep = File.separator;
    static final String Systempath = System.getProperty("user.dir");

    public static final String Uploadfilepath = Systempath + "\\src\\test\\NEWFlaringDocument.pdf";
    public static final String Shapefile = Systempath + "\\src\\test";
    public static final String RetryPath = Systempath + "\\ScreenShot_For_failure_TestCases";
    public static final String Screenshot = "src" + Sep + "test" + Sep + "resources" + Sep + "screenshot" + Sep;
    public static String DBPath = Systempath + "\\src\\test\\resourcesproperties\\jdbc.properties";
    public static final String ChromePath = Systempath + "\\src\\test\\resources\\lib\\chromedriver.exe";
    public static String Extent_Report = Systempath + "\\src\\test\\resources\\Automaton-TestReport";
    public static final String VideoRecording_path = Systempath + "\\src\\test\\resources\\Video_Recording";


    public static final String DatePattern = "dd/MMM/yyyy";

    public static int Mill_Sec() {

        int Sleep_time;
        if (Browser.environment.equals(Browser.Environment.Remote)) {
            Sleep_time = 1500;
        } else {
            Sleep_time = 1500;
        }
        return Sleep_time;

    }

    public static int Wait_sec() {

        int Wait_Time = 50;
        return Wait_Time;


    }

    public static void Select_Date_By_Element(String Attribute, String Value, int days) {

        WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        Date today1 = calendar.getTime();
        DateFormat dateFormat1 = new SimpleDateFormat(DatePattern);

        String todayA = dateFormat1.format(today1);
        switch (Attribute) {
            case "id":
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Value)))).click().build().perform();
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Value)))).click().build().perform();
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Value)))).sendKeys(todayA).build().perform();

                break;
            case "name":
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.name(Value)))).click().build().perform();
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.name(Value)))).click().build().perform();
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Value)))).sendKeys(todayA).build().perform();

                break;
            case "xpath":
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Value)))).click().build().perform();
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Value)))).click().build().perform();
                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Value)))).sendKeys(todayA).build().perform();
                break;
        }

    }


}
