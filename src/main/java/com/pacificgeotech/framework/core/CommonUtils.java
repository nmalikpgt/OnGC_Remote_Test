package com.pacificgeotech.framework.core;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

//import com.pacificgeotech.epermitTestFramework.core.Config;
//import com.pacificgeotech.epermitTestFramework.core.Constants;


/**
 * @author scheong
 *
 * This utility class stores common methods that are useful for multiple scripts.
 * Examples include logging in, going through the shopping cart, taking screenshots, etc.
 *
 */
public class CommonUtils {

    private static Logger log = Logger.getLogger(CommonUtils.class);

    public static void loginCRD() throws MalformedURLException {

        WebDriver driver = WebDriverManager.getDriver();
        WebElement element = WebDriverManager.getElement();
        WebDriverWait driverWait = WebDriverManager.getDriverWait();

        String username = null;
        String password = null;

        if(Config.ENVIROMENT.equals(Constants.LOCAL_HOST)) {
            driver.get("http://localhost:8080/epermit/module/core/module/login/ui/jsf/login.jsf");

            username = "admin";
            password = "admin";

        } else if(Config.ENVIROMENT.equals(Constants.LOCAL_ROLLBACK)) {
            driver.get("http://cheetah-vm1:29080/epermit/module/test/ui/jsf/startTest.jsf");

            username = "admin";
            password = "admin";


        } else if(Config.ENVIROMENT.equals(Constants.OGCTEST)) {
            driver.get("https://ams-crd-tst.bcogc.ca");

            username = "admin";
            password = "12345678";

        } else if(Config.ENVIROMENT.equals(Constants.OGCUAT)) {
            driver.get("https://ams-crd-uat.bcogc.ca");

            username = "admin";
            password = "12345678";

        } else if(Config.ENVIROMENT.equals(Constants.REMOTE)) {
            //driver.get("https://ams-crd-tst.bcogc.ca");
            driver.get("https://ams-crd-dev.bcogc.ca");

            username = "admin";
            password = "12345678";

        } else if(Config.ENVIROMENT.equals(Constants.LOCAL_TEST)) {
            driver.get("http://cheetah-vm1:31081/crd/login");


            username = "admin";
            password = "12345678";

        } else if(Config.ENVIROMENT.equals(Constants.ePayUAT)) {
            driver.get("http://matar-uamse.bcogc.local:8181/epay/module/core/module/login/ui/jsf/login.jsf");

            username = "payor";
            password = "payor";

        } else if(Config.ENVIROMENT.equals(Constants.STG)) {
            driver.get("https://ams-crd-stg.bcogc.ca");

            username = "admin";
            password = "12345678";

        }
        else if(Config.ENVIROMENT.equals(Constants.SERVER)) //-----------
        {
                DesiredCapabilities cap=new DesiredCapabilities();
                cap.setBrowserName("chrome");
                cap.setPlatform(Platform.WINDOWS);
                URL url = new URL("");
                driver =new RemoteWebDriver(url,cap);
                driver.get("https://ams-crd-tst.bcogc.ca");

                username = "admin";
                password = "12345678";


        }


        try{
            element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginSubmit")));
        }
        catch(Throwable e){

        }
        if (element!=null){

            element = driver.findElement(By.id("username"));
            element.sendKeys(username);

            element = driver.findElement(By.id("password"));
            element.sendKeys(password);

            element = driver.findElement(By.id("loginSubmit"));
            element.click();
        }


    }



    public static void loginePermit()  {

        WebDriver driver = WebDriverManager.getDriver();
        WebElement element = WebDriverManager.getElement();
        WebDriverWait driverWait;
        driverWait = WebDriverManager.getDriverWait();

        String username = null;
        String password = null;

        if (Config.ENVIROMENT.equals(Constants.LOCAL_TEST)) {
            driver.get("http://cheetah-vm1:31080/epermit/login.jsf");

            username = "agent";
            password = "agent";


        } else if(Config.ENVIROMENT.equals(Constants.OGCTEST)) {
            driver.get("https://ams-epm-tst.bcogc.ca");

            username = "agent";
            password = "agent";

        }  else if(Config.ENVIROMENT.equals(Constants.OGCUAT)) {
            driver.get("https://ams-epm-uat.bcogc.ca");

            username = "agent";
            password = "agent";

        }  else if(Config.ENVIROMENT.equals(Constants.OGCDEV)) {
            driver.get("https://ams-epm-dev.bcogc.ca");

            username = "agent";
            password = "agent";

        } else if(Config.ENVIROMENT.equals(Constants.STG)) {
            driver.get("https://ams-epm-stg.bcogc.ca");

            username = "agent";
            password = "agent";

        }

        try{
            element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitCmdBtnId")));
        }
        catch(Throwable e){

        }
        if (element!=null){

            element = driver.findElement(By.id("loginUsernameInTxtId"));
            element.sendKeys(username);

            element = driver.findElement(By.id("loginPasswordInTxtId"));
            element.sendKeys(password);

            element = driver.findElement(By.id("submitCmdBtnId"));
            element.click();
        }
    }


    public static void loginExternal() throws Exception {

        WebDriver driver = WebDriverManager.getDriver();
        WebElement element = WebDriverManager.getElement();
        WebDriverWait driverWait = WebDriverManager.getDriverWait();

        String username = null;
        String password = null;

        if (Config.ENVIROMENT.equals(Constants.LOCAL_TEST)) {
            driver.get("http://cheetah-vm1:31080/epermit/login.jsf");

            username = "Tpham";
            password = "9zz9VgNe";


        } else if(Config.ENVIROMENT.equals(Constants.OGCTEST)) {
            driver.get("https://ams-epm-tst.bcogc.ca");

            username = "Tpham";
            password = "9zz9VgNe";

        }  else if(Config.ENVIROMENT.equals(Constants.OGCUAT)) {
            driver.get("https://ams-epm-uat.bcogc.ca");

            username = "Tpham";
            password = "9zz9VgNe";

        }  else if(Config.ENVIROMENT.equals(Constants.OGCDEV)) {
            driver.get("https://ams-epm-dev.bcogc.ca");

            username = "eutoaxen";
            password = "BCogc2013";

        }

        try{
            element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitCmdBtnId")));
        }
        catch(Throwable e){

        }
        if (element!=null){
            Thread.sleep(1000);
            element = driver.findElement(By.id("authTypeSelector"));
            element.click();
            Thread.sleep(1000);
            new Select(driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("authTypeSelector")))).selectByVisibleText("BCOGC Domain User");
            Thread.sleep(2000);
            element = driver.findElement(By.id("loginUsernameInTxtId"));
            element.sendKeys(username);

            element = driver.findElement(By.id("loginPasswordInTxtId"));
            element.sendKeys(password);

            element = driver.findElement(By.id("submitCmdBtnId"));
            element.click();
        }
    }




    public static void getThroughShoppingCart() throws Exception {

        WebDriver driver = WebDriverManager.getDriver();
        WebDriverWait driverWait = WebDriverManager.getDriverWait();
        WebElement element = WebDriverManager.getElement();
        Select select = WebDriverManager.getSelect();

        //get amount
        Thread.sleep(Config.SLEEP_TIME_FULL_REFRESH);
        element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:shoppingCrtItmsDtaTblId:shoppingCrtTtlOutTxtId")));
        String totalCost = element.getText().substring(1, element.getText().length());

        //click Next (show shopping cart page)
        CommonUtils.takeScreenshot();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:next"))).click();

        //click "New Receipt" radio
        Thread.sleep(Config.SLEEP_TIME_FULL_REFRESH);
        element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:newRcptIndRdoId:0")));
        element.click();

        //click Next (select receipt page)
        CommonUtils.takeScreenshot();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:downNavNextCmdBtn"))).click();

        //select payer
        Thread.sleep(Config.SLEEP_TIME_PART_REFRESH);
        element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:payerInTxtId")));
        new Actions(driver).moveToElement(element).sendKeys(Config.CLIENT_ID).perform();
        Thread.sleep(Config.SLEEP_TIME_PART_REFRESH);
        new Actions(driver).moveToElement(element).sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(Config.SLEEP_TIME_PART_REFRESH);

        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pickPayerAddrCmdBtnId"))).click();
        Thread.sleep(Config.SLEEP_TIME_PART_REFRESH);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:addrListDtaTblId:0:slctAddrCmdBtnId"))).click();
        Thread.sleep(Config.SLEEP_TIME_PART_REFRESH);

        //payment type drop down - cash
        element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:paymentDetailsDtaTblId:0:pymntTypeMnuId")));
        select = new Select(element);
        select.selectByVisibleText("Cash");

        element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:paymentDetailsDtaTblId:0:subamtInTxtId")));
        element.clear();
        element.sendKeys(totalCost);

        //click Next (Input Payment Details page)
        CommonUtils.takeScreenshot();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:downNavNextCmdBtn"))).click();

        //click Next (payment summary page)
        CommonUtils.takeScreenshot();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:downNavNextCmdBtn"))).click();

        //click Next (payment confirmation page)
        CommonUtils.takeScreenshot();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:downNavNextCmdBtn"))).click();

        //show conf page
        CommonUtils.takeScreenshot();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:eventsDtaTblId:0:showConfPage"))).click();
        CommonUtils.takeScreenshot();
    }

    public static void goToMainMenu() throws Exception {

        WebDriverWait driverWait = WebDriverManager.getDriverWait();

        CommonUtils.takeScreenshot();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:goMainMenuCmdLnkId"))).click();
        CommonUtils.takeScreenshot();
    }

    public static void takeScreenshot() throws Exception {

        WebDriver driver = WebDriverManager.getDriver();

        //sleep process to give the page time to load
        Thread.sleep(Config.SLEEP_TIME_FULL_REFRESH);

        String url = driver.getCurrentUrl();
        int lastSlash = url.lastIndexOf("/");
        String page = url.substring(lastSlash+1, url.length());

        Date date = new Date();
        String timestamp = new Timestamp(date.getTime()).toString().replace(":", ".");

        String filename = timestamp + " " + page + ".png";
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshots\\" + Config.TEST_SCENARIO + "\\" + filename));

        log.info("Processed: " + filename);
    }

    public static List executeQuery(String query) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = null;
        if(Config.ENVIROMENT.equals(Constants.LOCAL_HOST)) {
            con = DriverManager.getConnection ("jdbc:oracle:thin:@WILDDOG:1521:dev", "EPM", "EPM");
        } else if(Config.ENVIROMENT.equals(Constants.LOCAL_DEV)) {
            con = DriverManager.getConnection ("jdbc:oracle:thin:@WILDDOG:1521:dev", "EPM", "EPM");
        } else if(Config.ENVIROMENT.equals(Constants.LOCAL_TEST)) {
            con = DriverManager.getConnection ("jdbc:oracle:thin:@WILDDOG:1521:test", "EPM", "EPM");
        }

        Statement queryer = con.createStatement();
        ResultSet rs =  queryer.executeQuery( query );

        List rows = new ArrayList();

        try {
            while (rs.next()) {
                rows.add(rs.getString(1));
            }
        } catch (SQLException e) {
            return null;	//just execute update (not expecting any results back)
        }

        con.close();
        return rows;
    }

    public static String getAvailableClsrNumber() throws Exception {

        int min = 1000;
        int max = 80000;
        Random random = new Random();
        int clsrNumber = random.nextInt(max - min) + min;

        return new Integer(clsrNumber).toString();
    }

    public static BigDecimal getArea(String tenureNumber) throws Exception {

        StringBuilder sb = new StringBuilder();
        sb.append( " select a.area_ha ");
        sb.append( " from mta_tenure a " );
        sb.append( " where a.STAKED_CLAIM_ID = '" + tenureNumber + "'" );
        return new BigDecimal(CommonUtils.executeQuery(sb.toString()).get(0).toString());
    }
}
