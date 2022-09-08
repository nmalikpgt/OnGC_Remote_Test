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

public class Stewardship {
    public static class Stewardship_Details {
        public static class Click {

            public static void Environmental_Protection_and_Management_Guideline() {

                Msg.Info("Click on  'Environmental Protection and Management Guideline:'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:deviationEpmrGuidanceBtnId"))).click();
                Msg.Done();
            }

            public static void Rationale() {

                Msg.Info("Enter on  'Rationale:'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:devEpmrGuidanceRationaleInTxtId"))).sendKeys("Testing....");
                Msg.Done();
            }

            public static void Is_an_exemption_requested_from_Part_3_of_the_Environmental_Protection_and_Management_Regulation() {

                Msg.Info("Click on  'Is an exemption requested from Part 3 of the Environmental Protection and Management Regulation:'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:exemptionEpmrRegBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionFromStewardshipOutPnlId:0:sectionOfRegulationInTxtId"))).sendKeys("Section B(34)");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionFromStewardshipOutPnlId:0:exempExplanationInTxtId"))).sendKeys("required for the project");
                Msg.Done();
            }



        }

        public static class Upload_Requried_Attachment {
            public static void Mitigation_Stragegy() {
                Msg.Info(" Upload the  Attachment 'Mitigation Stragegy Attached:'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:mitigationStragegyDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:mitigationStragegyDocIdFileUploadId_input")));
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
