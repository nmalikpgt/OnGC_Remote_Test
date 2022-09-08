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

public class Changes_In_and_About_a_Stream_Overview {



    public static void Proposed_Completion_Date() {
        Msg.Info("Enter the Date 'Proposed Completion Date'");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        Date today1 = calendar.getTime();
        DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
        String todayA = dateFormat1.format(today1);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:costructionComplDateId_input"))).sendKeys(todayA);
        Msg.Done();
    }
    public static void Proposed_Start_Date() {
        Msg.Info("Enter the Date 'Proposed Start Date'");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();


        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date today1 = calendar.getTime();
        DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
        String todayA = dateFormat1.format(today1);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:costructionStartDateId_input"))).sendKeys(todayA);
        Msg.Done();
    }



    public static void Activity_Description() {
        Msg.Info("Enter the  message For 'Activity Description'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescriptionInTxtId"))).sendKeys("Activity Description here ...");
        Changes_In_and_About_a_Stream_Overview.Does_this_application_meet_the_criteria_under_s39_paragraph_of_the_Water_Sustainability_Regulation_for_notification();

        Msg.Done();  }

    public static void Geophysical_Stream_Crossing_NO() {

    /*    Msg.Info("Click no for the  'Geophysical Stream Crossing'");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:streamCrossAccordEMPRIndBtnId']/div[2]/span"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:streamCrossTempSenseIndBtnId']/div[2]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:streamCrossAreaProxIndBtnId']/div[2]/span"))).click();
        Msg.Done();
        */
        }


    public static void Does_this_application_meet_the_criteria_under_s39_paragraph_of_the_Water_Sustainability_Regulation_for_notification() {
        Msg.Info("Click on  'Does this application meet the criteria under s.39 paragraphs a) through n) of the Water Sustainability Regulation for notification?'");
        Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
        Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:meetWaterSustainabilityRegulationIndId\"]/div[2]/span"))).click();
        Msg.Done();   }


  public static class Upload_Document{

      public static void Crossing_Type_Meets_Peak_Flow() {
          Msg.Info(" Upload the  Attachment 'Crossing Type Meets Peak Flow:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:dvlpmntRclmtnPlnDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dvlpmntRclmtnPlnDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          UpLoad_File();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();

      }
      public static void Upload_Fisheries_Habitat_Assessment() {
          Msg.Info(" Upload the  Attachment 'Upload Fisheries Habitat Assessment:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='appFrmId:fisheriesHabitatAssessmentDocUploadBtnId']"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fisheriesHabitatAssessmentDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          UpLoad_File();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();

      }
  }

    public static class Stream_Impact{
        public static void If_no_File_XRef_Number_available_please_provide_a_rationale() {
            Msg.Info("Click on  'If no File XRef Number available, please provide a rationale'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:roadSegmentsOutPnlId:0:noXrefInTxtAreaId"))).sendKeys("If no File XRef Number available, please provide a rationale here...");
            Msg.Done(); }
        public static void Bank_Full_Stream_Width() {
            Msg.Info("Click on  'Bank Full Stream Width'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:roadSegmentsOutPnlId:0:bankFullStreamWidth_input"))).sendKeys("9,999.00");
            Msg.Done();  }
        public static void  Stream_Gradient() {
            Msg.Info("Click on  'Stream Gradient'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:roadSegmentsOutPnlId:0:streamGradient_input"))).sendKeys("9,999.00");
            Msg.Done(); }
        public static void Exemption () {
            Msg.Info("Click on  'Exemption'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Exemption\")]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:exemptionOutPnlId:0:bestManagementPracticeIndBtnId']/div[2]/span"))).click();
            Msg.Done();
        }
        public static void Crossing_Type_Meets_Peak_Flow (String EnterText) {
            Msg.Info("Click on  'Crossing Type Meets Peak Flow'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.ui-chkbox-icon.ui-c"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:roadSegmentsOutPnlId:0:crossPeakInTxtAreaId"))).sendKeys(EnterText);
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Done();

        }
    }

    public static class Click {
        public static void Changes_In_and_About_a_Stream_Details() {
            Msg.Info("Click on  'Changes In and About a Stream Details'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:esdDetailTabId"))).click();
            Msg.Done();   }

        public static void Stream_Impact_2() {
            Msg.Info("Click on 'Stream_Impact_'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.not-current"))).click();
            Msg.Done();  }

     /*   public static void Stream_Impact_3() {
            Msg.Info("Click on 'Stream_Impact_'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:j_idt118:2:j_idt120"))).click();
        }*/
        public static void Remove_Stream() {
            Msg.Info("Click on the 'Remove Stream' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:removeStreamImpactIdBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();  }
    }



}



