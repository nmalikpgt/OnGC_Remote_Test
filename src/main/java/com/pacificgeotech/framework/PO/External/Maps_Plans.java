package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;

import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Maps_Plans {
    public static class Maps_Plans_Details {
        public static class Enter {

            public static void Job_Number () {

                Msg.Info("Enter Message for   'Job Number'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:jobNumberInTxtId"))).sendKeys("1223");
                Msg.Done();  }
            public static void Sheet_Number () {

                Msg.Info("Enter Message for   'Sheet Number'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sheetNumberInTxtId"))).sendKeys("10");
                Msg.Done(); }
            public static void Original_Plan_Date () {

                Msg.Info("Enter Message for   ' Original Plan Date'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();

                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date today1 = calendar.getTime();
                DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");


                String todayA = dateFormat1.format(today1);

                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:originalPlanDateInTxtId_input"))).sendKeys(todayA);

                Msg.Done();  }
            public static void Revised_Plan_Date () {

                Msg.Info("Enter Message for   ' Revised Plan Date'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();


                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date today1 = calendar.getTime();
                DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");

                String todayA = dateFormat1.format(today1);

                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:revisedPlanDateInTxtId_input"))).sendKeys(todayA);
               Browser.Sleep(Browser.Mill_Sec());

                Msg.Done();  }
            public static void Revised_Number () {

                Msg.Info("Enter   ' Revised Number'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:mpRevisionNumberInTxtId"))).clear();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:mpRevisionNumberInTxtId"))).sendKeys("1");
                Msg.Done();  }
            public static void Survey_Company () {

                Msg.Info("Enter Message for   'Survey Company'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
               // Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:surveyCompanyCodeId\"]/button"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:surveyCompanyCodeId_panel\"]/table/tbody/tr[3]"))).click();

                Msg.Done();  }
        }

        public static class Upload_Requried_Attachment {
            public static void Construction_Plan_Attached() {
                Msg.Info(" Upload the  Attachment 'Construction Plan Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:constructionPlanDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(Browser.Mill_Sec());
                UpLoad_File();
                //EPM.Verify.Upload_page_display_Hidden();
                Msg.Done();

                  Crd_Conditions_Advisory.Click.Scrolldown();
            }
            public static void Upload_1_20000_BCGS_Map() {
                Msg.Info(" Upload the  Attachment 'Upload 1:20,000 BCGS Map:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:oneTo20000bcgsMapDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();


                Msg.Done();

            }

            public static void CIAS_Sketch_Plan_Attached() {
                Msg.Info(" Upload the  Attachment 'CIAS Sketch Plan Attached:'");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:ciasSketchPlanDocUploadBtnId"))).click();
                EPM.Verify.Upload_pagedispaly();
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
                UpLoad_File();
                EPM.Verify.Upload_page_display_Hidden();


                Msg.Done();

            }


            public static void BCGS_Map_Attached() {
                Msg.Info(" Upload the  Attachment 'BCGS Map Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  Crd_Conditions_Advisory.Click.Scrolldown();
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:bcgsMapDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }
            public static void Diversion_Map_Attached() {
                Msg.Info(" Upload the  Attachment 'Diversion Map Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:diversionMapDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }
        }





    }
}
