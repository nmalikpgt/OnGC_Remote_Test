package com.pacificgeotech.framework.core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.Document_path;
import org.apache.commons.io.FileUtils;
import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.*;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.VideoFormatKeys.*;
import static org.monte.media.VideoFormatKeys.QualityKey;


public class Listerner  implements ITestListener  {

    private static final ExtentReports extent = ExtentTestngReportBuilder.createInstance();
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();


    @Override
    public void onTestStart(ITestResult result) {

        //    Browser.UserAccess();

        Msg.Info(result.getName() + " :  TEST Case Started and  executing ");
        Reporter.log(result.getName() + " :   TEST Case Started and  executing ");
        ExtentTest extentTest = extent.createTest(result.getName(), result.getMethod().getDescription());
        test.set(extentTest);
        Msg.Done();
        Msg.Line();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Msg.Info(result.getName() + " :  TEST is successfully executed and passed ");
        Reporter.log(result.getName() + " :  TEST is successfully executed and passed ");

        test.get().pass("Test passed");


        //   Browser.driver.quit();
        Msg.Done();
        Msg.Line();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Msg.Info("Sorry For The Failure I will take a look into it And Update the Test Case Again : 'ANNA Project Automation Testing ':   " + result.getName());

        ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, 50)");
        Reporter.log("Sorry For The Failure I will take a look into it And Update the Test Case Again : 'ANNA Project Automation Testing ': :   " + result.getName());
        File scrShot = ((TakesScreenshot) Browser.driver).getScreenshotAs(OutputType.FILE);
//================================================================================================================================================
        if (Browser.HeadlessBrowser.equals("true")) {
            String name = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(Calendar.getInstance().getTime()) + "_"
                    + result.getName() + ".png";
            String screenShot = (Document_path.Screenshot + name);
            File destinationPath = new File(screenShot);
            try {

                FileUtils.copyFile(scrShot, destinationPath);
                test.get().fail(result.getThrowable(),
                        MediaEntityBuilder.createScreenCaptureFromPath(screenShot).build());

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
            ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, 50)");

            String dest = (Document_path.RetryPath + "\\" + sdf.format(d) + result.getName() + ".png");
            File ScreenshotPath = new File(dest);

            try {
                FileUtils.copyFile(scrShot, ScreenshotPath);

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        Msg.Done();
        Msg.Line();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Msg.Info((result.getMethod().getMethodName() + " skipped! To Retry the Test case Again"));
        test.get().skip(result.getThrowable());

        //   Browser.driver.quit();
        Msg.Done();
        Msg.Line();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        Msg.Info("Test failed but it is in defined success ratio " + result.getTestClass());

    }

    @Override
    public void onStart(ITestContext result) {
        ExtentTest extentTest = extent.createTest(result.getName());
        test.set(extentTest);
        Msg.Info("Welcome to PGTS  ANNA Project Automation Testing  Regression  :  ");
        Reporter.log("Welcome to PGTS ANNA Project Automation Testing  Regression  :  ");
//        try {
//            videoRecorderStart();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
        Msg.Done();

        Msg.Line();
    }

    @Override
    public void onFinish(ITestContext result) {
        Msg.Info("Thanks For Your Time For Watching ANNA Project Automation Testing :   ");
        Reporter.log("Thanks For Your Time For Watching ANNA Project Automation Testing :   ");

        extent.flush();
//        try {
//            videoRecordEnd();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Msg.Line();
//        Browser.driver.quit();
//        if (Browser.HeadlessBrowser.equals("true")) {
//
//            try {
//                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        Msg.Done();
    }


    @BeforeSuite
    public void videoRecorderStart() throws IOException, AWTException {

        Msg.Info("Starting Video Recording Automation Testing  Regression  :  ");

        GraphicsConfiguration gc = GraphicsEnvironment//
                .getLocalGraphicsEnvironment()//
                .getDefaultScreenDevice()//
                .getDefaultConfiguration();
        File file = new File(Document_path.VideoRecording_path);

        screenRecorder = new ScreenRecorder(gc, null, new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
                        Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(15)),
                null, file);

        //   if (Different_Environment_Client_Info.VIDEO_RECORDING.equals("true")) {
        screenRecorder.start();
        //   }

        Msg.Done();
    }


    @AfterSuite
    public void videoRecordEnd() throws IOException {
        Msg.Info("Starting Video Recording Automation Testing  Regression  :  ");
        //  if (Different_Environment_Client_Info.VIDEO_RECORDING.equals("true")) {
        screenRecorder.stop();
        //   }
        Msg.Done();
    }

    public String captureScreen(String name) throws IOException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH-mm-ss");         // Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"

        ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, 100)");

        File scrShot = ((TakesScreenshot) Browser.driver).getScreenshotAs(OutputType.FILE);
        String dest = (Document_path.RetryPath + "\\" + sdf.format(d) + name + ".png");

        File destinationPath = new File(dest);
        FileUtils.copyFile(scrShot, destinationPath);
        return dest;
    }

    private ScreenRecorder screenRecorder;


}
