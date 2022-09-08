package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Overview {
    public static class Application_Overview {
        public static class Enter {

            public static void 	File_Reference_Number (String Enter) {
                Msg.Info("Enter Message for   'File Reference Number'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fileRefNumTxtId"))).sendKeys(Enter);
                Msg.Done(); }
            public static void 	Contact_Name () {
                Msg.Info("Enter Message for   'Contact Name'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:contactInTxtId_input"))).sendKeys("john");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='appFrmId:contactInTxtId_panel']/table/tbody/tr/td"))).click();
                Msg.Done();  }
            public static void 	Permit_Distribution_Contact_Name () {
                Msg.Info("Enter Message for   'Permit Distribution Contact Name'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:permitDistContactAcdPnlId:permitDistContactDtaGrdId:0:permitDistContactInTxtId_input"))).sendKeys("aron");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-item-label=\"Aaron Buckley\"]"))).click();
                Msg.Done();
            }
        }

        public static void Application() {

            Msg.Info("Click on the 'Application' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:applicationMnuBtnId_button"))).click();
            Msg.Done();
        }

        public static void Submit() {

            Msg.Info("Click on the 'Submit' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[1]/a/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:submitApplicationBtnId"))).click();
            Msg.Done();
        }
        public static void Validate() {

            Msg.Info("Click on the 'Validate' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[2]/a/span"))).click();
            Msg.Done();
        }
        public static void OGC_Operational_Zones() {

            Msg.Info("Click on the 'OGC Operational Zones' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:editOgcAppzoneOutTxtId']"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='appFrmId:applicationZoneTypCodeSlctId']//td[contains(text(),'Central')]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }
        public static void Discard() {

            Msg.Info("Click on the 'Discard' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[3]/a/span"))).click();
            Msg.Done();
        }
        public static void Print_Application() {

            Msg.Info("Click on the 'Print Application' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[4]/a/span"))).click();
            Msg.Done();
        }

        public static void Application_Validation() {

            Msg.Info("Click on the 'Application Validation' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:validateApplication1BtnId"))).click();
            Msg.Done();
        }

        public static void Validation_YES() {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("Click on the 'Application Validation yes' link");
         //   Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:validateApplication3BtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
            Msg.Done();
        }
        public static void FAC_ID() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            try { WebDriverWait wait1 = new WebDriverWait(Browser.driver, 30);
                wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Validation has been completed successfully and the application is complete with no errors. Would you like to validate the application again?')]"))).getText();
            } catch (Exception e) {
                Msg.Info("Click on the 'FAC_ID' link");
                Browser.Sleep(2300);
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:appAreaValidateMsgDtaLstId:1:j_idt145:0:j_idt149:0:validateMsgHeaderLnkId"))).click();
                } catch (Exception exception) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:appAreaValidateMsgDtaLstId:1:j_idt145:0:j_idt149:0:validateMsgHeaderLnkId"))).click();
                }
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))).click();
                EPM.Verify.Progress_Message();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:applicationMnuBtnId_button"))).click();
                } catch (Exception exception) {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:applicationMnuBtnId_button"))).click();

                }
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:applicationMnuBtnId_menu']/ul/li[2]/a/span"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:validateApplication3BtnId"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:appAreaValidateMsgDtaLstId:1:j_idt145:1:j_idt149:0:validateMsgHeaderLnkId"))).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Browser.Sleep(3500);
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:applicationMnuBtnId_button"))).click();
                } catch (Exception exception) {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:applicationMnuBtnId_button"))).click();

                }
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:applicationMnuBtnId_menu']/ul/li[2]/a/span"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:validateApplication3BtnId"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();

            }



            Msg.Done();
        }

        public static class Verify {
            public static void Validation_has_been_completed_successfully_and_the_application_is_complete_with_no_errors_Would_you_like_to_validate_the_application_again() {
                Msg.Info("Validation has been completed successfully and the application is complete with no errors. Would you like to validate the application again?" );
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 230);
                String ValidationMessage;
                try {
                    ValidationMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Validation has been completed successfully and the application is complete with no errors. Would you like to validate the application again?')]"))).getText();
                } catch (Exception e) {
                    ValidationMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Validation has been completed successfully and the application is complete with no errors. Would you like to validate the application again?')]"))).getText();
                }

                Assert.assertEquals(ValidationMessage, "Validation has been completed successfully and the application is complete with no errors. Would you like to validate the application again?");

                Msg.Done();
                System.out.println("    completed successfully  Message: " + ValidationMessage);
            }

        }



    }
}
