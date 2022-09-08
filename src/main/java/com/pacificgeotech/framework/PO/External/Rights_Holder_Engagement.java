package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;

import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Shapefile;

import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rights_Holder_Engagement {
    public static class Rights_Holder_Engagement_Details {


        public static void Verify_Sucess_mesage_Line_ListDoc() {
            Msg.Info("Verify that the  message 'Status Successful Line List' is displayed");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:rheLineListDtaTbl7Id:0:applicationTypeTxtId")));
            Msg.Done();
        }


        public static class Click {

            public static void Written_Submission_Received_by_Non_engaged_Persons () {

                Msg.Info("Click on  'Written Submission Received by Non-engaged Persons:  Yes/No'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wsCaseFileIndBtnId"))).click();

                Msg.Done(); }

            public static void Case_File_Numbe () {
                Msg.Info("Click on  'Case File Numbe'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only smallBlueButton']"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consultNotificationWsCaseFileTblId:0:wsCasFileNumInTxtId"))).sendKeys("123456789-123");
                Msg.Done(); }
        }

        public static class Upload_File {

            public static void Line_List_Attached() {
                Msg.Info(" Upload the  Attachment 'Line List Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:lineListDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\2021-06-23 New RHE Line List 2021 - Test.xlsx").getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file 2016-06-23 Rights Holder Engagement Line List_valid.xlsx");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();
                  Crd_Conditions_Advisory.Click.Scrolldown();

            }

            public static void Engagement_Map_Attached() {
                Msg.Info(" Upload the  Attachment 'Engagement Map Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:cnMapDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:engagementMapDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }
            public static void Package_of_Replies_and_Responses_Attached() {
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
            public static void Letters_of_Non_Objection_Attached() {
                Msg.Info(" Upload the  Attachment 'Letters of Non-Objection Attached'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:lettersNonObjectiveDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:erheLettersOfNonObjectionDocIdFileUploadId_input")));
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
