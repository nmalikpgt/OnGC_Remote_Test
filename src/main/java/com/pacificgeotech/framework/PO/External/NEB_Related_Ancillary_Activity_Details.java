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

public class NEB_Related_Ancillary_Activity_Details {

  public static class Aggregate_Operations_Summary_Details {
      public static void Proposed_Start_Date() {
          Msg.Info("Enter the Date 'Proposed Start Date'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();

          Calendar calendar = Calendar.getInstance();
          calendar.add(Calendar.DAY_OF_YEAR, 3);
          Date today1 = calendar.getTime();
          DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");


          String todayA = dateFormat1.format(today1);


          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proposedStartDateClrId_input"))).sendKeys(todayA);

          Msg.Done();
      }
      public static void Proposed_Completion_Date() {
          Msg.Info("Enter the Date 'Proposed Completion Date'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();


          Calendar calendar = Calendar.getInstance();
          calendar.add(Calendar.DAY_OF_YEAR, 23);
          Date today1 = calendar.getTime();
          DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");


          String todayA = dateFormat1.format(today1);

          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proposedCompletitionDateClrId_input"))).sendKeys(todayA);

          Msg.Done();
      }
      public static void Proposed_Timing_of_Activities() {
          Msg.Info("Enter the Date 'Proposed Timing of Activities'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:timingOfActivitiesSlctId"))).click();
         Browser.Sleep(Browser.Mill_Sec());
          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:timingOfActivitiesSlctId_panel\"]/div/ul/li[2]"))).click();
          Msg.Done();  }
      public static void Estimated_Annual_Extraction() {
          Msg.Info("Enter the  message For 'Estimated Annual Extraction'");
         Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:estAnnualExtractionInTxtId_input"))).sendKeys("999,999");
          Msg.Done(); }
      public static void 	Estimated_Total_Reserves_of_Life() {
          Msg.Info("Enter the  message For 'Estimated Total Reserves of Life'");
         Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:estTotalReservesLifeInTxtId_input"))).sendKeys("9,999,999");
          Msg.Done();  }
  }

  public static class Upload_Document{

      public static void Development_Reclamation_Plan() {
          Msg.Info(" Upload the  Attachment 'Development & Reclamation Plan'");
          Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);

          Msg.Info("Dialog Box");
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:dvlpmntRclmtnPlnDocUploadBtnId"))).click();
          //Browser.Sleep(Browser.Mill_Sec());
          //EPM.Verify.Upload_pagedispaly("appFrmId:facilitySpecificAcdPnlId:proliferationDocIdDialogId_content");

          Msg.Info("Choose Button");
          WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dvlpmntRclmtnPlnDocIdFileUploadId_input")));
          //Browser.Sleep(Browser.Mill_Sec());
          //browseButton.click();

          Msg.Info("Choose File");
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());

          Msg.Info("Upload");
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
          Browser.Sleep(Browser.Mill_Sec());

          UpLoad_File();

          EPM.Verify.Upload_page_display_Hidden();

          Msg.Done();

      }

      public static void Emergency_Response_Plan() {
          Msg.Info(" Upload the  Attachment 'Emergency Response Plan:'");
          Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);

          Msg.Info("Dialog Box");
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:emrgncyRspnsPlnDocUploadBtnId"))).click();
          //Browser.Sleep(Browser.Mill_Sec());
          //EPM.Verify.Upload_pagedispaly("appFrmId:facilitySpecificAcdPnlId:proliferationDocIdDialogId_content");

          Msg.Info("Choose Button");
          WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:emrgncyRspnsPlnDocIdFileUploadId_input")));
          //Browser.Sleep(Browser.Mill_Sec());
          //browseButton.click();

          Msg.Info("Choose File");
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());

          Msg.Info("Upload");
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
          Browser.Sleep(Browser.Mill_Sec());

          UpLoad_File();

          EPM.Verify.Upload_page_display_Hidden();

          Msg.Done();

      }

  }

    public static class Enter {
        public static void Activity_Description() {
            Msg.Info("Enter the  message For 'Activity Description'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescriptionInTxtId"))).sendKeys("Activity Description here ...");
            Msg.Done(); }
    }
public static class NEB_Related_Ancillary_Activity_Summary{
    public static class Click {

        public static void Application_Material  () {
            Msg.Info("Click on  'Application Material : Sand'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:applMaterialCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Msg.Done();  }
        public static void Intended_Purpose  () {
            Msg.Info("Click on  'Intended_Purpose : Pipelines'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:materialPurposeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Msg.Done();  }
        public static void Description_of_Work  () {
            Msg.Info("Click on  'Description of Work : Crushing'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:associatedActSumOutPnlId:0:assoActSumDtaTblId:0:descriptionOfWorkSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Msg.Done();  }

    }
  }




}



