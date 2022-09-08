package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Shapefile;


import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Attachments {
    public static class Attachments_Details {
            public static void Upload_Attachment () {

                Msg.Info("Click on  'Upload_Attachment'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:uploadAttachmentBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:documentNatureCodeTreeId:3\"]/div/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='appFrmId:documentNatureCodeTreeId:3_1']"))).click();
                Msg.Done();
            }
        public static class Verify {
            public static void Verify_Upload_Attachment() {
                Msg.Info("Verify that the  message 'Upload Attachment' is displayed");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadAttachmentBtnId")));
                Msg.Done();
            }
            public static void Progress_Message() {
                Msg.Info("Verify that the  message 'Progress Successful' is displayed");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Msg.Done();
            }
        }

        public static class Upload_Requried_Attachment {
            public static void Mitigation_Stragegy() {
                Msg.Info(" Upload the  Attachment 'Mitigation Stragegy Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:selectDocNatureCodeNextBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:mattUploadBtnId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\TEST.PDF").getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file TEST.pdf");
               Browser.Sleep(Browser.Mill_Sec());
                UpLoad_File();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:newAttachmentDtaTblId_data")));
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:selectFileSaveBtnId"))).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Msg.Done();

            }
        }









    }
}
