package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EPM {
    public static void Java_script_executor(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
        executor.executeScript("arguments[0].click();", element);


    }

    public static void Java_script_executor_Send_Keys(WebElement element,String Enter) {
        JavascriptExecutor js = (JavascriptExecutor)Browser.driver;

        js.executeScript("arguments[0].value='"+Enter+"';", element);

    }



    public static void Get_Application_Number() {
        Msg.Info("   'Get_Application_Number' is displayed");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:spatialDataUploadHistoryDtaTblId:0:uploadHistStsId")));
       Browser.Sleep(Browser.Mill_Sec());
        WebElement TxtBoxContent =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:applicationNumberOutTxtId")));
        String appNumScreen = TxtBoxContent.getText();
        System.out.println("App number " + appNumScreen);
        Msg.Done();
    }

    public static class Verify {
        public static void Verify_Status__BCGS_Map() {
            Msg.Info("Verify that the  message 'BCGS_Map Successful' is displayed");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 300);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sdValueOutLblId"))).getText();
            Msg.Done();
        }

        public static void Upload_pagedispaly() {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 23);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'fileUploadDialog ui-draggable') and @aria-live=\"polite\"]")));

        }

        public static Boolean Upload_page_display_Hidden() {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 23);

            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class=\"ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-hidden-container fileUploadDialog ui-draggable\"]")));

            return null;
        }







        public static void Progress_Message() {
            Msg.Info("Verify that the  message 'Progress Successful' is Disappeared");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
//div[@class="ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-hidden"]

            //div[@class="ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible"]
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            try {  WebDriverWait wait1 = new WebDriverWait(Browser.driver, 2);
                wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible")));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-hidden")));
            } catch (Exception e) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            }


            Msg.Done();
        }
        public static void Invisible_element() {
            Msg.Info("Verify that the  message 'Invisible_element' is displayed");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("ui-widget-overlay")));
            Msg.Done();
        }
    }

public static class Application_Management{

        public static void Administrative() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Administrative' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Administrative')]"))));
            Msg.Done();
        }

        public static void Land() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Land' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:eldCmdLnkId"))));
            Browser.Sleep(Browser.Mill_Sec());
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:noValueOutputLblId\"]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            Browser.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),\"Crown Provincial\")])[2]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title=\"Save\"]"))).click();


            Msg.Done();
        }

        public static void Forestry() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Forestry' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:efodCmdLnkId"))));
            Msg.Done();
        }

        public static void Stewardship() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Stewardship' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Stewardship')]"))));
            Msg.Done();
        }

        public static void Agriculture() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Agriculture' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Agriculture')]"))));
            Msg.Done();
        }

        public static void Archaeology() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Archaeology' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Archaeology')]"))));
            Msg.Done();
        }

        public static void Rights_Holder_Engagement() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Rights Holder Engagement' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Rights Holder Engagement')]"))));
            Msg.Done();
        }

        public static void Consultation_Notification() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Consultation & Notification' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Consultation & Notification')]"))));
            Msg.Done();
        }

        public static void First_Nations() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'First Nations' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'First Nations')]"))));
            Msg.Done();
        }

        public static void Maps_Plans() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Maps & Plans' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Maps & Plans')]"))));
            Msg.Done();
        }

        public static void Attachments() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Attachments' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:mattCmdLnkId"))));
            Msg.Done();
        }


    }

    public static class EPMPAY {

        public static void EPMpay() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'EPM pay' link");
            try { WebDriverWait wait = new WebDriverWait(Browser.driver,5);
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:submitPayLaterCmdLnkId"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:j_idt243"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"appFrmId:finishPaymentCmdLnkId\"]"))).click();

            } catch (Exception e) {
                System.out.println("Payment is not required");
            }

            Msg.Done();
        }

    }


    public static class Click {

        public static void Logout() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Logout' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:logoutBtnId"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }


        public static void CRD_Logout() {
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 23);

            try {
                Msg.Info("Click on the 'CRD Logout' link");
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/cata-header/div/div[2]/ul/li[5]/a/span[1]")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
                executor.executeScript("arguments[0].click();", element);

                Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/cata-header/div/div[2]/ul/li[5]/ul/li[3]/a/span"))).click();
                Msg.Done();
            } catch (Exception e) {

            }


        }

        public static void Failure_CRD_Logout() {
            Browser.Sleep(Browser.Mill_Sec());
            //  Msg.Info("Click on the 'CRD Logout' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/cata-header/div/div[2]/ul/li[5]/a/span[1]"))));
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/cata-header/div/div[2]/ul/li[5]/ul/li[3]/a/span"))));
            Browser.Sleep(Browser.Mill_Sec());
            Browser.driver.switchTo().alert().accept();
            Msg.Done();
        }


        public static void Application_information() {

            Msg.Info("Click on the 'Application Information' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Application Information')]"))));
            Msg.Done();
        }

        public static void Activity_information() {

            Msg.Info("Click on the 'Activity Information' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Activity Information')]"))));
            Msg.Done();
        }

        public static void Application_number(String APP) {

            Msg.Info("Click on the 'Application_number' link");

            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),\"" + APP + "\")]//parent::a"))));
            Msg.Done();
        }

        public static void Overview() {

            Msg.Info("Click on the 'Overview' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:overviewCmdLnkId"))));
            Msg.Done();
        }

        public static void Quick_Links() {

            Msg.Info("Click on the 'Quick Links' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Quick Links')]"))));
            Msg.Done();
        }

        public static void AttachmentsSide() {

            Msg.Info("Click on the 'Attachments' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:attachmentCmdLnkId"))));
            Msg.Done();
        }

        public static void Spatial_Data() {

            Msg.Info("Click on the 'Spatial Data' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Spatial Data')]"))));
            Msg.Done();
        }

        public static void Application() {

            Msg.Info("Click on the 'Application' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:applicationMnuBtnId_button"))));
            Msg.Done();
        }

        public static void Submit() {

            Msg.Info("Click on the 'Submit' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[1]/a/span"))));
            Msg.Done();
        }

        public static void Validate() {

            Msg.Info("Click on the 'Validate' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[2]/a/span"))));
            Msg.Done();
        }

        public static void Discard() {

            Msg.Info("Click on the 'Discard' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[3]/a/span"))));
            Msg.Done();
        }

        public static void Print_Application() {

            Msg.Info("Click on the 'Print Application' link");
            Crd_Conditions_Advisory.Java_script_executor(Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationMnuBtnId_menu\"]/ul/li[4]/a/span"))));
            Msg.Done();
        }

        public static void Save() {
            Msg.Info("Click on the 'Save' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            ((JavascriptExecutor) Browser.driver).executeScript("document.body.scrollHeight");
            Crd_Conditions_Advisory.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topsaveBtnId"))));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("confirmMessageGrowlId_container")));
            //  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@role='dialog']")));
            //  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("ui-widget-overlay")));
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }

        public static void Attachment_Save() {
            Msg.Info("Click on the 'Save' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            ((JavascriptExecutor) Browser.driver).executeScript("document.body.scrollHeight");
            Crd_Conditions_Advisory.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topsaveBtnId"))));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("confirmMessageGrowlId_container")));
            //  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@role='dialog']")));
            //  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("ui-widget-overlay")));
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }

        public static void Validate_Page() {
            Msg.Info("Click on the 'Validate Page' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            Crd_Conditions_Advisory.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }
    }
}