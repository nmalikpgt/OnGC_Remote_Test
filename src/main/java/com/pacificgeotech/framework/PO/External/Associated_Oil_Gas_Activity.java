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

public class Associated_Oil_Gas_Activity {

    public static class Verify {
      public static void Progress_Message() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("progressDialogId")));
          Msg.Done();
      }
  }


    public static class Associated_Oil_Gas_Activity_Upload_Files{

        public static void All_Attachments_of_this_Page() {
            Msg.Info("uploading on the 'All the Attachments of Facility_overview page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Done();
// ----------Development & Reclamation Plan:
            Msg.Info(" Upload the  Attachment 'Development & Reclamation Plan:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:dvlpmntRclmtnPlnDocUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dvlpmntRclmtnPlnDocIdFileUploadId_input")));
            browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();


            Msg.Done();
            // ----------Emergency Response Plan
            Msg.Info(" Upload the  Attachment 'Emergency Response Plan:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:emrgncyRspnsPlnDocUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:emrgncyRspnsPlnDocIdFileUploadId_input")));
            browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
           Browser.Sleep(2300);
            UpLoad_File();
              Crd_Conditions_Advisory.Click.Scrolldown();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
        }


    }





    public static class Associated_Oil_Gas_Activity_Details {
        public static void All_Information() {
            Msg.Info("Enter the Details for 'Associated_Oil_Gas_Activity_Details' ");
           Browser.Sleep(Browser.Mill_Sec());      Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescriptionInTxtId"))).sendKeys("Activity Description here ...");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:estAnnualExtractionInTxtId_input"))).sendKeys("999999");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:estTotalReservesLifeInTxtId_input"))).sendKeys("999999");

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, 2);
            Date today1 = calendar.getTime();
            DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
            String todayA = dateFormat1.format(today1);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proposedStartDateClrId_input"))).sendKeys(todayA);

            Calendar calendar1 = Calendar.getInstance();
            calendar1.add(Calendar.DAY_OF_YEAR, 23);
            Date Duetoday = calendar1.getTime();
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            String Tilltoday = dateFormat.format(Duetoday);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proposedCompletitionDateClrId_input"))).sendKeys(Tilltoday);
           Browser.Sleep(Browser.Mill_Sec());
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:applMaterialCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:applMaterialCodeSltMnyLstId\"]/ul/li[1]"))).click();
            }
            Browser.Sleep(Browser.Mill_Sec());
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:materialPurposeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:materialPurposeSltMnyLstId\"]/ul/li[1]"))).click();
            }
            Browser.Sleep(Browser.Mill_Sec());
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:descriptionOfWorkSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:descriptionOfWorkSltMnyLstId\"]/ul/li[1]"))).click();
            }
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:timingOfActivitiesSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:timingOfActivitiesSlctId_panel\"]/div/ul/li[2]"))).click();
            Msg.Done();  }
    }

    public static class Click {
        public static void Save() {
            Msg.Info("Click on the 'Save' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topsaveBtnId"))).click();
            Msg.Done();  }
        public static void Validate_Page() {
            Msg.Info("Click on the 'Validate Page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))).click();
            Msg.Done();  }
    }

}



