package com.pacificgeotech.framework.Listenters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.Document_path;
import com.pacificgeotech.framework.core.ExtentTestngReportBuilder;
import com.pacificgeotech.framework.core.Msg;
import org.apache.commons.io.FileUtils;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
import static org.monte.media.VideoFormatKeys.*;


public class Listernerold implements ITestListener  {


  /*

    private Document document = null;

    PdfPTable successTable = null, failTable = null;

    private HashMap<Integer, Throwable> throwableMap = null;

    private int nbExceptions = 0;


    public Listerner() {
        Msg.Info("Listerner()");

        this.document = new Document();
        this.throwableMap = new HashMap<Integer, Throwable>();
    }

*/
    private static ExtentReports extent = ExtentTestngReportBuilder.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal();
    @Override
    public void onTestStart(ITestResult result) {
        Msg.Info(  result.getName() + " :  TEST Case Started and  executing "   );
        Reporter.log(  result.getName() + " :   TEST Case Started and  executing "   );
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
        test.set(extentTest);
        Msg.Done();
        Msg.Line();
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        Msg.Info(  result.getName() + " :  TEST is successfully executed and passed "   );
       Reporter.log(  result.getName() + " :  TEST is successfully executed and passed "   );
        Msg.Done();
        test.get().pass("Test passed");

/*
        if (successTable == null) {

            this.successTable = new PdfPTable(new float[]{.3f, .3f, .1f, .1f,.3f});
            Paragraph p = new Paragraph("PASSED TESTS", new Font(Font.TIMES_ROMAN, Font.DEFAULTSIZE, Font.BOLD));
            p.setAlignment(Element.ALIGN_CENTER);
            PdfPCell cell = new PdfPCell(p);
            cell.setColspan(5);
            cell.setBackgroundColor(Color.GREEN);
            this.successTable.addCell(cell);

            cell = new PdfPCell(new Paragraph("Class"));
            cell.setBackgroundColor(Color.GRAY);
            this.successTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Method"));
            cell.setBackgroundColor(Color.GRAY);
            this.successTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Time (ms)"));
            cell.setBackgroundColor(Color.GRAY);
            this.successTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Results"));
            cell.setBackgroundColor(Color.GRAY);
            this.successTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Exception"));
            cell.setBackgroundColor(Color.GRAY);
            this.successTable.addCell(cell);
        }

        PdfPCell cell = new PdfPCell(new Paragraph(result.getTestClass().toString()));
        cell.setBackgroundColor(new Color(10,100,250));
        this.successTable.addCell(cell);
        cell = new PdfPCell(new Paragraph(result.getMethod().toString()));
        cell.setBackgroundColor(new Color(100,150,150));
        this.successTable.addCell(cell);
        cell = new PdfPCell(new Paragraph("" + (result.getEndMillis()-result.getStartMillis())));
        cell.setBackgroundColor(Color.lightGray);
        this.successTable.addCell(cell);

        cell = new PdfPCell(new Paragraph("" + (result.isSuccess())));
        cell.setBackgroundColor(new Color(10,150,50));
        this.successTable.addCell(cell);


        Throwable throwable = result.getThrowable();
        if (throwable != null) {
            this.throwableMap.put(new Integer(throwable.hashCode()), throwable);
            this.nbExceptions++;
            Paragraph excep = new Paragraph(
                    new Chunk(throwable.toString(),
                            new Font(Font.TIMES_ROMAN, Font.DEFAULTSIZE, Font.UNDERLINE)).
                            setLocalGoto("" + throwable.hashCode()));
            cell = new PdfPCell(excep);
            cell.setBackgroundColor(new Color(150,150,100));
            this.successTable.addCell(cell);
        } else {
            this.successTable.addCell(new PdfPCell(new Paragraph("")));
        }


*/



        Msg.Line();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Msg.Info("Sorry For The Issue I will Correct And Update the Test Case Again EPM-CRD Project Automation Testing :   "  + result.getName() );

        Reporter.log("Sorry For The Issue I will Correct And Update the Test Case Again EPM-CRD Project Automation Testing :   "  + result.getName() );
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

      //  String File  ="E:\\repo\\DEMO-EPM- Copy\\Screenshorts-EPMTest-Failure\\"+sdf.format(d)+".png" ;


     /*   try {
          EPM.Click.Logout();

        } catch (Throwable e) {
            EPM.Click.Failure_CRD_Logout();
        }




        if (this.failTable == null) {
            this.failTable = new PdfPTable(new float[]{.3f, .3f, .1f, .1f,.3f});
            this.failTable.setTotalWidth(30f);
            Paragraph p = new Paragraph("FAILED TESTS", new Font(Font.TIMES_ROMAN, Font.DEFAULTSIZE, Font.BOLD));
            p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
            PdfPCell cell = new PdfPCell(p);
            cell.setColspan(5);
            cell.setBackgroundColor(Color.RED);
            this.failTable.addCell(cell);

            cell = new PdfPCell(new Paragraph("Class"));
            cell.setBackgroundColor(Color.GRAY);
            this.failTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Method"));
            cell.setBackgroundColor(Color.GRAY);
            this.failTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Time (ms)"));
            cell.setBackgroundColor(Color.GRAY);
            this.failTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Results"));
            cell.setBackgroundColor(Color.GRAY);
            this.failTable.addCell(cell);
            cell = new PdfPCell(new Paragraph("Exception"));
            cell.setBackgroundColor(Color.GRAY);
            this.failTable.addCell(cell);


        }

        PdfPCell cell = new PdfPCell(new Paragraph(result.getTestClass().toString()));
        cell.setBackgroundColor(new Color(80,120,250));
        this.failTable.addCell(cell);
        cell = new PdfPCell(new Paragraph(result.getMethod().toString()));
        cell.setBackgroundColor(new Color(100,150,180));
        this.failTable.addCell(cell);
        cell = new PdfPCell(new Paragraph("" + (result.getEndMillis()-result.getStartMillis())));
        cell.setBackgroundColor(Color.lightGray);
        this.failTable.addCell(cell);
        //String exception = result.getThrowable() == null ? "" : result.getThrowable().toString();
        //cell = new PdfPCell(new Paragraph(exception));
        //this.failTable.addCell(cell);
        cell = new PdfPCell(new Paragraph("" + (result.isSuccess())));
        cell.setBackgroundColor(new Color(10,150,50));
        this.failTable.addCell(cell);


        Throwable throwable = result.getThrowable();
        if (throwable != null) {
            this.throwableMap.put(new Integer(throwable.hashCode()), throwable);
            this.nbExceptions++;

            Chunk imdb = new Chunk("[Screen Shot]", new Font(Font.TIMES_ROMAN,Font.DEFAULTSIZE,Font.UNDERLINE));
                    imdb.setAction(new PdfAction("file:///"+scrFile));
            Paragraph excep = new Paragraph(throwable.toString());
            excep.add(imdb);
            cell = new PdfPCell(excep);
            cell.setBackgroundColor(new Color(150,150,120));
            this.failTable.addCell(cell);

        } else {
            this.failTable.addCell(new PdfPCell(new Paragraph("")));
        }


  */


        Msg.Done();
        Msg.Line();

    //    Browser.CleanUp();

    }

    @Override    public void onTestSkipped(ITestResult result) {
        Msg.Info((result.getMethod().getMethodName() + " skipped! To Retry the test case again"));
        test.get().skip(result.getThrowable());
        Msg.Done();
        Msg.Line();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext result) {
        ExtentTest extentTest = extent.createTest(result.getName());
        test.set(extentTest);
        Msg.Info("Welcome to PGTS  EPM-CRD Project Automation Testing  Regression  :  " );

        Reporter.log("Welcome to PGTS  EPM-CRD Project Automation Testing  Regression  :  " );
        //        try {
//            videoRecorderStart();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
       Msg.Done();




/*
        try {
            PdfWriter.getInstance(this.document, new FileOutputStream(result.getName()+System.currentTimeMillis()+".pdf"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.document.open();

        Paragraph p = new Paragraph(result.getName() + " TESTNG RESULTS",
                    FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLD, new Color(0, 0, 250)));

        try {
            this.document.add(p);
            this.document.add(new Paragraph(new Date().toString()));
        } catch (DocumentException e1) {
            e1.printStackTrace();
        }

*/

        Msg.Line();
    }

    @Override
    public void onFinish(ITestContext result) {
        Msg.Info("Thanks For Your Time For Watching EPM-CRD Project Automation Testing :   "  );
        Reporter.log("Thanks For Your Time For Watching EPM-CRD Project Automation Testing :   "  );
        extent.flush();


        //        try {
//            videoRecordEnd();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Msg.Line();
//        Browser.CleanUp();
//        if (Browser.HeadlessBrowser.equals("true")) {
//
//            try {
//                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        Msg.Done();

 /*

        try {
            if (this.failTable != null) {
                Msg.Info("Added fail table");
                this.failTable.setSpacingBefore(15f);
                this.document.add(this.failTable);
                this.failTable.setSpacingAfter(15f);
            }

            if (this.successTable != null) {
                Msg.Info("Added success table");
                this.successTable.setSpacingBefore(15f);
                this.document.add(this.successTable);
                this.successTable.setSpacingBefore(15f);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        Paragraph p = new Paragraph("EXCEPTIONS SUMMARY",
               FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD, new Color(250, 0, 0)));

        try {
            this.document.add(p);
        } catch (DocumentException e1) {
            e1.printStackTrace();
        }

        Set<Integer> keys = this.throwableMap.keySet();

        assert keys.size() == this.nbExceptions;

        for(Integer key : keys) {
            Throwable throwable = this.throwableMap.get(key);

            Chunk chunk = new Chunk(throwable.toString(),
                    FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, new Color(250, 0, 0)));
            chunk.setLocalDestination("" + key);
            Paragraph throwTitlePara = new Paragraph(chunk);
            try {
                this.document.add(throwTitlePara);
            } catch (DocumentException e3) {
                e3.printStackTrace();
            }

            StackTraceElement[] elems = throwable.getStackTrace();
            String exception = "";
            for(StackTraceElement ste : elems) {
                Paragraph throwParagraph = new Paragraph(ste.toString());
                try {
                    this.document.add(throwParagraph);
                } catch (DocumentException e2) {
                    e2.printStackTrace();
                }
            }
        }

        this.document.close();

*/


        Msg.Line();
    }

    @BeforeSuite
    public void videoRecorderStart() throws IOException, AWTException {

        Msg.Info("Starting Video Recording Automation Testing  Regression  :  ");

        GraphicsConfiguration gc = GraphicsEnvironment//
                .getLocalGraphicsEnvironment()//
                .getDefaultScreenDevice()//
                .getDefaultConfiguration();
        File file = new File(Document_path.VideoRecording_path);

        screenRecorder = new ScreenRecorder(gc, null, new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
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
