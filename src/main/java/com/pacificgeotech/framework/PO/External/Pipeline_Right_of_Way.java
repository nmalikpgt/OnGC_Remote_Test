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

public class Pipeline_Right_of_Way {

  public static class Verify {
      public static void Verify_Status__BCGS_Map() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sdValueOutLblId")));
          Msg.Done();
      }
      public static void Progress_Message() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("progressDialogId")));
          Msg.Done();
      }
  }

    public static class Segment_ID_001 {
        public static void Pipe_Outer_Diameter() {
            Msg.Info("Enter the Massage 'Pipe Outer Diameter' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:pipeOuterDiameterInTxtId"))).sendKeys("500");
            Msg.Done();
        }
        public static void Physical_Pipe_Length() {
            Msg.Info("Enter the  message 'Physical Pipe Length' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:physicalPipeLengthInTxtId"))).clear();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:physicalPipeLengthInTxtId"))).sendKeys("964.00");
            Msg.Done();
        }
    }


    public static class Upload_Requried_Attachment {
        public static void Project_Description_Attached() {
            Msg.Info(" Upload the  Attachment 'Project Description Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
              WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:projectDescriptionUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:projectDescriptionDocIdFileUploadId_input")));
            browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
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
    public static class Click {
        public static void Pipeline_Overview() {
            Msg.Info("Click on the 'Pipeline Overview' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipelineOverviewTabId"))).click();
            Msg.Done(); }
        public static void Pipeline_Details() {
            Msg.Info("Click on the 'Pipeline Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipelineDetailTabId"))).click();
            Msg.Done(); }
        public static void Pipeline_Land_Details() {
            Msg.Info("Click on the 'Pipeline Land Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipelineLandDetailTabId"))).click();
            Msg.Done(); }
        public static void Save() {
            Msg.Info("Click on the 'Save' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topsaveBtnId"))).click();
            Msg.Done(); }
        public static void Validate_Page() {
            Msg.Info("Click on the 'Validate Page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))).click();
        }
        public static void Segment_ID_001() {
            Msg.Info("Click on the 'Segment ID 001' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipeSegmentIdentifierTblId:0:psiRowRptId:0:epdaSegmentId"))).click();
            Msg.Done();  }
        public static void Segment_ID_002() {
            Msg.Info("Click on the 'Segment ID 002' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Segment ID 002\")]//parent::div//parent::a"))).click();
            Msg.Done(); }
        public static void Segment_ID_003() {
            Msg.Info("Click on the 'Segment ID 003' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Segment ID 003\")]//parent::div//parent::a"))).click();
            Msg.Done(); }
        public static void Remove_Segment() {
            Msg.Info("Click on the 'Remove Segment' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:removeSegmentBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("progressDialogId")));
            Msg.Done(); }
    }

}



