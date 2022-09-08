package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;

import static com.pacificgeotech.framework.PO.Environments.Document_path.Shapefile;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.*;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;

import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Consultation_Notification {
    public static class Consultation_Notification_Details {

        public static class Click {

            public static void Written_Submission_Received_by_Non_engaged_Persons () {

                Msg.Info("Click on  'Written Submission Received by Non-engaged Persons:  Yes/No'");
              Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wsCaseFileIndBtnId"))).click();
                Msg.Done();  }
            public static void Unresolved_Concerns_by_persons_not_engaged () {

                Msg.Info("Click on  'Unresolved Concerns by persons not engaged:'");
              Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:ucCaseFileIndBtnId"))).click();
                Msg.Done();  }

            public static void  Case_File_Numbe () {
                Msg.Info("Click on  ' Case File Number'");
              Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only smallBlueButton']"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultNotificationWsCaseFileTblId:0:wsCasFileNumInTxtId"))).sendKeys("123456789-123");
                Msg.Done();
            }
            public static void  Unresolved_Concerns_by_persons_not_engaged_Case_File_Number () {
                Msg.Info("Click on  ' Case File Number'");
              Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only smallBlueButton']"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultNotificationUcCaseFileTblId:0:ucCasFileNumInTxtId"))).sendKeys("123456789-123");
                Msg.Done();
            }
        }


        public static class Enter {
            public static void Consultation_Notification_Details () {
                Msg.Info("Click on  'Consultation & Notification Details'");
              Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:0:consultationRadiusInTxtId_input"))).sendKeys("5000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:0:notificationRadiusInTxtId_input"))).sendKeys("5000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:1:consultationRadiusInTxtId_input"))).sendKeys("5800");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:1:notificationRadiusInTxtId_input"))).sendKeys("1500");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:2:consultationRadiusInTxtId_input"))).sendKeys("200");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:2:notificationRadiusInTxtId_input"))).sendKeys("17000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:3:notificationRadiusInTxtId_input"))).sendKeys("32000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:3:consultationRadiusInTxtId_input"))).sendKeys("5000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:4:consultationRadiusInTxtId_input"))).sendKeys("5000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:4:notificationRadiusInTxtId_input"))).sendKeys("1000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:5:consultationRadiusInTxtId_input"))).sendKeys("1000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:5:notificationRadiusInTxtId_input"))).sendKeys("2800");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:6:consultationRadiusInTxtId_input"))).sendKeys("17000");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:6:notificationRadiusInTxtId_input"))).sendKeys("32000");
                Msg.Done();
            }
            public static void Amrndment_Consultation_Notification_Details () {
                Msg.Info("Click on  'Consultation & Notification Details'");
              Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultationRadiusRptId:0:consultationRadiusInTxtId_input"))).sendKeys("18000.00");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:notificationRadiusRptId:0:notificationRadiusInTxtId_input"))).sendKeys("2000.00");
                Msg.Done();
            }
        }

        public static class Upload_File {

            public static void Line_List_Attached() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
                Msg.Info(" Upload the  Attachment 'Line List Attached:'");
              Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:lineListDocUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\2021-06-23 New C&N Line List June 2021 Test.xlsx").getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file 2016-06-23 C&N Line List_VALID.xlsx");
               Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
               Browser.Sleep(Browser.Mill_Sec());
            }

            public static void Consultation_Map_Attached() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
                Msg.Info(" Upload the  Attachment 'Engagement Map Attached:'");
              Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
              //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:j_idt244\"]")));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:cnMapDocUploadBtnId")));
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:cnMapDocUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:cnMapDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }
            public static void Package_of_Replies_and_Responses_Attached() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
                Msg.Info(" Upload the  Attachment 'Package of Replies and Responses Attached:'");
              Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:packageReplyResponseDocUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:packageReplyResponseDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }
            public static void Exemption_Approval() {
                Msg.Info(" Upload the  Attachment 'Exemption Approval Attached:'");
              Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();

                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:exemptionApprovalIndBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:exemptionApprovalDocUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionApprovalDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }

            public static void Consultation_Letters_of_Non_Objection_Attached() {
                Msg.Info(" Upload the  Attachment 'Letters of Non-Objection Attached'");
              Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:lettersNonObjectiveDocUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:lettersNonObjectiveDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }
            public static void Ownership_Map_Doc() {
                Msg.Info(" Upload the  Attachment 'Ownership_Map_Doc Attached'");
              Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:ownershipMapDocUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:ownershipMapDocIdFileUploadId_input")));
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
