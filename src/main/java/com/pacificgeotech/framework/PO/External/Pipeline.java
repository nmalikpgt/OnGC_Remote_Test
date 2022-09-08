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
import org.testng.Assert;

public class Pipeline {


    public static class Pipeline_overview_Upload_Files {

        public static void All_Attachments_of_this_Page() {
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("uploading on the 'All the Attachments of Pipeline_overview page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Done();
// ----------Piping and Instrumentation Diagram Attached::
            Msg.Info(" Upload the  Attachment 'Piping and Instrumentation Diagram Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:pipingInstrumentionDiagramUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipingInstrumentionDocIdFileUploadId_input")));
            browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
            // ----------Project Description Attached:
            Msg.Info(" Upload the  Attachment 'Project Description Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:projectDescriptionUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:projectDescriptionDocIdFileUploadId_input")));
            browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

// ----------Crossing Plans Attached:
            Msg.Done();
            Msg.Info(" Upload the  Attachment 'Crossing Plans Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:crossingPlanUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:crossingPlanDocIdFileUploadId_input")));
            browseButton3.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
   // ----------Aerial or Above Ground Protection and Support Drawings Attached:
            Msg.Info(" Upload the  Attachment 'Aerial or Above Ground Protection and Support Drawings Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:protSuppDrawUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton13 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:protSuppDrawDocIdFileUploadId_input")));
            browseButton13.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

// ----------Geotechnical Reviews Completed:
            Msg.Done();
            Msg.Info(" Upload the  Attachment 'Geotechnical Reviews Completed:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:geotechReviewUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton12 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:geotechnicalInformationDocIdFileUploadId_input")));
            browseButton12.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
           Browser.Sleep(2300);
            UpLoad_File();
//------------------------------
           Browser.Sleep(Browser.Mill_Sec());

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pneumaticPressurePlanIndBtnId"))).click();
            Msg.Done();
        }
        public static void HistoricalSubmission_All_Attachments_of_this_Page(String OGC) {
            Msg.Info("uploading on the 'All the Attachments of Pipeline_overview page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Done();
              Crd_Conditions_Advisory.Click.Scrolldown();
// ----------Piping and Instrumentation Diagram Attached::
            Msg.Info(" Upload the  Attachment 'Piping and Instrumentation Diagram Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:pipingInstrumentionDiagramUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipingInstrumentionDocIdFileUploadId_input")));
            browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
            // ----------Project Description Attached:
            Msg.Info(" Upload the  Attachment 'Project Description Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"appFrmId:projectDescAttdIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:projectDescriptionUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:projectDescriptionDocIdFileUploadId_input")));
            browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

// ----------Crossing Plans Attached:
            Msg.Done();
            Msg.Info(" Upload the  Attachment 'Crossing Plans Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:crossingPlanAttdIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:crossingPlanUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:crossingPlanDocIdFileUploadId_input")));
            browseButton3.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
            // ----------Aerial or Above Ground Protection and Support Drawings Attached:
            Msg.Info(" Upload the  Attachment 'Aerial or Above Ground Protection and Support Drawings Attached:'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:protSuppDrawAttdIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:protSuppDrawUploadBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton13 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:protSuppDrawDocIdFileUploadId_input")));
            browseButton13.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

// ----------Have you checked the OGC File Room:
            Msg.Done();
            if(OGC.equals("OGC")) {
                Msg.Info(" Upload the  Attachment 'Have you checked the OGC File Room:'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:checkedOgcFileRoomIndBtnId\"]/div[2]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:existingApprovalBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton12 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:existingApprovalDocIdFileUploadId_input")));
                browseButton12.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(2300);
            UpLoad_File();
//------------------------------
                EPM.Verify.Upload_page_display_Hidden();
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
            }
        }

    }
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






   public static class Segment_Details {
        public static void All_Information(String maxOperatingPressure) {
            Msg.Info("Enter the Details for 'Segment  Details' ");

           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();

              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:physicalPipeLengthInTxtId"))).sendKeys("1200.791");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineProductCodeSlctTxtId\"]/div[2]/ul/li[1]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:h2sInTxtId"))).sendKeys("1");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:pipeOuterDiameterInTxtId"))).sendKeys("2");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:co2InTxtId"))).sendKeys("3");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:wallThicknessInTxtId"))).sendKeys("4");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:designPressureInTxtId"))).sendKeys("5");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxOperatingPressureInTxtId"))).sendKeys(maxOperatingPressure);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:minDesignTemperatureInTxtId"))).sendKeys("6");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxDesignTemperatureInTxtId"))).sendKeys("7");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:coverDepthInTxtId"))).sendKeys("8");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:internalCoatingDescInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:externalCoatingDescInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentCsaClassLocCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentCsaClassLocCodeSlctId_panel\"]/div/ul/li[3]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentFlowDirectionCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentFlowDirectionCodeSlctId_panel\"]/div/ul/li[3]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
           EPM.Verify.Progress_Message();
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialStandardCodeSlctId\"]/div[3]/span"))).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialStandardCodeSlctId\"]/div[3]/span"))).click();
            }
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialStandardCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialGradeCodeSlctId\"]/div[3]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialGradeCodeSlctId_panel\"]/div/ul/li[4]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentInternalCoatingCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentInternalCoatingCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentExternalCoatingCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentExternalCoatingCodeSlctId_panel\"]/div/ul/li[2]"))).click();
            Msg.Done();
        }
       public static void Historical_All_Information() {
           Msg.Info("Enter the Details for 'Historical Segment  Details' ");
             Crd_Conditions_Advisory.Click.Scrolldown();
          Browser.Sleep(Browser.Mill_Sec());
           WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineProductCodeSlctTxtId\"]/div[2]/ul/li[1]"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:h2sInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:pipeOuterDiameterInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:co2InTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:wallThicknessInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:designPressureInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxOperatingPressureInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:minDesignTemperatureInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxDesignTemperatureInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:coverDepthInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:internalCoatingDescInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:externalCoatingDescInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:h2sInTxtId"))).sendKeys("10");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:pipeOuterDiameterInTxtId"))).sendKeys("11");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:co2InTxtId"))).sendKeys("13");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:wallThicknessInTxtId"))).sendKeys("14");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:designPressureInTxtId"))).sendKeys("5");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxOperatingPressureInTxtId"))).sendKeys("5");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:minDesignTemperatureInTxtId"))).sendKeys("35");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxDesignTemperatureInTxtId"))).sendKeys("10");
           EPM.Click.Validate_Page();
          Browser.Sleep(Browser.Mill_Sec());
           String titleText = Browser.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:minDesignTemperatureMsgId_error-detail\"]"))).getText();
           Msg.Info("Verify that the  'Minimum Design Temperature must be smaller than Maximum Design Temperature");
           Assert.assertEquals(titleText, "Minimum Design Temperature must be smaller than Maximum Design Temperature");//"Register Client > Select Person Type");
           Msg.Done();
           System.out.println("     Expected: Minimum Design Temperature must be smaller than Maximum Design Temperature");
           System.out.println("     Actual  : " + titleText);


           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxDesignTemperatureInTxtId"))).clear();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:maxDesignTemperatureInTxtId"))).sendKeys("100");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:coverDepthInTxtId"))).sendKeys("1.1");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:internalCoatingDescInTxtId"))).sendKeys("TBC");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:externalCoatingDescInTxtId"))).sendKeys("TBC");
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentCsaClassLocCodeSlctId\"]/div[3]/span"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           EPM.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentCsaClassLocCodeSlctId_panel\"]/div/ul/li[2]"))));
          Browser.Sleep(Browser.Mill_Sec());
           EPM.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentFlowDirectionCodeSlctId\"]/div[3]/span"))));
          Browser.Sleep(Browser.Mill_Sec());
           EPM.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentFlowDirectionCodeSlctId_panel\"]/div/ul/li[2]"))));
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialCodeSlctId\"]/div[3]/span"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialCodeSlctId_panel\"]/div/ul/li[2]"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialGradeCodeSlctId\"]/div[3]"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentMaterialGradeCodeSlctId_panel\"]/div/ul/li[4]"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentInternalCoatingCodeSlctId\"]/div[3]/span"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentInternalCoatingCodeSlctId_panel\"]/div/ul/li[5]"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentExternalCoatingCodeSlctId\"]/div[3]/span"))).click();
          Browser.Sleep(Browser.Mill_Sec());
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentExternalCoatingCodeSlctId_panel\"]/div/ul/li[8]"))).click();
           Msg.Done(); }
    }


    public static class Segment_Linkage_Details {
        public static void All_Information() {
            Msg.Info("Enter the Details for 'Segment Linkage Details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentLinkageAcdPnlId:addNewInputLinkageBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //*[@id=\"appFrmId:segmentLinkageAcdPnlId:inputLinkageDtaTblId:0:pipelineSegmentLinkageTypeCodeSlctId\"]/div[3]/span"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentLinkageAcdPnlId:inputLinkageDtaTblId:0:pipelineSegmentLinkageTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentLinkageAcdPnlId:inputLinkageDtaTblId:0:facilityIdInTxtId"))).sendKeys("11");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentLinkageAcdPnlId:addNewOutputLinkageBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("  //*[@id=\"appFrmId:segmentLinkageAcdPnlId:outputLinkageDtaTblId:0:pipelineSegmentLinkageTypeCodeSlctId\"]/div[3]/span"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentLinkageAcdPnlId:outputLinkageDtaTblId:0:pipelineSegmentLinkageTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentLinkageAcdPnlId:outputLinkageDtaTblId:0:facilityIdInTxtId"))).sendKeys("22");
            Msg.Done();
        }
    }
    public static class Pipeline_Specifications {
        public static void All_Information(String Geotechnical) {
            Msg.Info("Enter the Details for 'Pipeline Specifications' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:constructionCcBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:constructionCcBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:csaZ662StandardsIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:installMeetStandardIndBtnId\"]/div[2]/span"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:matUsedCsaZ662IndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:plIncorporratedIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:geotechReviewIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:geotechReviewIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:shopTestPlanIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:fieldBasedPressIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:pneumaticPressurePlanIndBtnId\"]/div[2]/span"))).click();
            Msg.Done();
            // ---------Is pneumatic pressure planned for this pipeline
            Msg.Info(" Upload the  Attachment 'Is pneumatic pressure planned for this pipeline:'");

           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pneumaticPressurePlanUploadBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            WebElement browseButton13 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pneumaticPressurePlanDocIdFileUploadId_input")));
            browseButton13.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
           Browser.Sleep(2300);
            UpLoad_File();
            Msg.Done();

            if(Geotechnical.equals("Geotechnical")) {
                Msg.Info(" Upload the  Attachment 'Geotechnical Reviews Completed:'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:geotechReviewIndBtnId\"]/div[2]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:geotechReviewIndBtnId\"]/div[2]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:geotechReviewUploadBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                WebElement browseButton12 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:geotechnicalInformationDocIdFileUploadId_input")));
                browseButton12.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(2300);
            UpLoad_File();
                Msg.Done();
            }

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
        public static void Engineer_Project_File_Name() {
            Msg.Info("Enter the  message For 'Engineer Project File Name:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:engineerProjectFileNameInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean m ...");
            Msg.Done();  }
    }
    public static class Click {
        public static void Pipeline_Overview() {
            Msg.Info("Click on the 'Pipeline Overview' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipelineOverviewTabId"))).click();
            Msg.Done();  }
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
        public static void Segment_Linkage_Details() {
            Msg.Info("Click on the 'Segment Linkage Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentLinkageAcdPnlId"))).click();
            Msg.Done(); }
        public static void Pipeline_Installation_Details() {
            Msg.Info("Click on the 'Pipeline Installation Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:installationAcdPnlId"))).click();
            Msg.Done();  }

        public static void Exemption() {
            Msg.Info("Click on the 'Exemption And enter the details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:lngfRegulationIndBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:prExemptionExplOutPnlId:0:sectionOfRegulationInTxtId"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:prExemptionExplOutPnlId:0:sectionOfRegulationInTxtId"))).sendKeys("123");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:prExemptionExplOutPnlId:0:exempExplanationInTxtId"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:prExemptionExplOutPnlId:0:exempExplanationInTxtId"))).sendKeys("123");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:lngfrExemptionExplOutPnlId:0:sectionOfRegulationInTxtId"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:lngfrExemptionExplOutPnlId:0:sectionOfRegulationInTxtId"))).sendKeys("123");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:lngfrExemptionExplOutPnlId:0:exempExplanationInTxtId"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:lngfrExemptionExplOutPnlId:0:exempExplanationInTxtId"))).sendKeys("123");

            Msg.Done(); }

        public static void AmendmnetExemption() {
            Msg.Info("Click on the 'Exemption And enter the details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:exemptionAcdPnlId:exemptionTabId_header\"]/table/tbody/tr/td"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:exemptionAcdPnlId:pipelineRegulationIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:prExemptionExplOutPnlId:0:sectionOfRegulationInTxtId"))).sendKeys("123");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:prExemptionExplOutPnlId:0:exempExplanationInTxtId"))).sendKeys("Test 1234");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:exemptionAcdPnlId:lngfRegulationIndBtnId\"]/div[2]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:lngfrExemptionExplOutPnlId:0:sectionOfRegulationInTxtId"))).sendKeys("123");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionAcdPnlId:lngfrExemptionExplOutPnlId:0:exempExplanationInTxtId"))).sendKeys("Test 123");

            Msg.Done(); }



        public static void SEGMENT_ID2() {
            Msg.Info("Click on the 'Segment_id' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:epddSegmentRptId:1:epddSegmentId"))).click();
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
            Msg.Done();  }
        public static void Internal_Coating() {
            Msg.Info("Click on the 'Internal Coating' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentInternalCoatingCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentInternalCoatingCodeSlctId_panel\"]/div/ul/li[3]"))).click();
            Msg.Done();
        }
        public static void External_Coating() {
            Msg.Info("Click on the 'External Coating' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentExternalCoatingCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:segmentDetailAcdPnlId:pipelineSegmentExternalCoatingCodeSlctId_panel\"]/div/ul/li[4]"))).click();
            Msg.Done();
        }

        public static void Line_Type() {
            Msg.Info("Click on the ' Line Type' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:segmentDetailAcdPnlId:pipelineSegmentLineTypeCodeSlctId']/div[3]"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:segmentDetailAcdPnlId:pipelineSegmentLineTypeCodeSlctId_panel']/div/ul/li[2]"))).click();
            Msg.Done();
        }




        public static void Remove_Segment() {
            Msg.Info("Click on the 'Remove Segment' ");
              Crd_Conditions_Advisory.Click.Scrolldown();
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:removeSegmentBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
            Msg.Done();  }
    }

}



