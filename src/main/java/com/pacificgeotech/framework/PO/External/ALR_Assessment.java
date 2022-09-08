package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;

import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ALR_Assessment {

    public static void 	Click() {

        Msg.Info("Click on  'ALR_Assessment link'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:alrAssCmdLnkId"))).click();
        Msg.Done();
    }
    public static void Verify_Status_Yes() {
        Msg.Info("Verify that the  message 'Yes Successful' is displayed");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sdYesNoueAreaOverlappingSlctId"))).getText();
        Msg.Done();
    }

    public static class ALR_Assessment_Details {
        public static class Enter {

            public static void 	Appendix_II_Rationale() {

                Msg.Info("Click on  'Appendix II Rationale:'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id=\"appFrmId:appendix2rationaleInTxtId\"]"))).sendKeys("Test....");
                Msg.Done();
            }
        }

        public static class Upload_Requried_Attachment {
            public static void 	Schedule_A_required() {
                Msg.Info(" Upload the  Attachment 'Schedule A required Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:scheduleADocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:scheduleADocIdFileUploadId_input")));
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
