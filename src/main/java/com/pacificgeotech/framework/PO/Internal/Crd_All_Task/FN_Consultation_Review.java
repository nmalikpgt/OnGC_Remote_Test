package com.pacificgeotech.framework.PO.Internal.Crd_All_Task;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FN_Consultation_Review {

    public static void Verify_Status__Completed() {
        Msg.Info("Verify that the  message 'Status Completed' is displayed");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 500);
        WebElement element = null;
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Completed')]")));
        } catch (Throwable e) {
            while (element == null || !element.isDisplayed()) {
                try {
                    wait.until(
                            ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Completed')]")));
                } catch (Throwable e2) {
                    element = null;
                }
            }
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Completed')]"))).getText();
        Msg.Done(); }

    public static int FN_Count(String appNumScreen ) {
        Msg.Info("Count the number of FN Task '");
        Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "FN Consultation");
        Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("showGroupTaskItemsOnPageBtnId"))).click();
        Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("groupTaskCodeSlctItem50Id"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"FN Consultation\")]")));

    int fnCount=  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(),\"FN Consultation\")]"))).size();

        Msg.Done();
        return fnCount;
    }



    public static class Referral_Package_Summary{
    public static class  Circulation_Method {
        public static void Online() {
            Msg.Info("Select Circulation Method to  'Online'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);

              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtncirculationMethodSlctId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemcirculationMethodSlctId0"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sendEconPackageBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"goAhead()\"]"))).click();
            Msg.Done();  }

        public static void Email(String Enter_Email) {
            Msg.Info("Select Circulation Method to  'Email'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtncirculationMethodSlctId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            if (Enter_Email.equals("Email")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemcirculationMethodSlctId1"))).click();
            }
            if (Enter_Email.equals("Fax")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemcirculationMethodSlctId2"))).click();
            }
            if (Enter_Email.equals("Mail")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemcirculationMethodSlctId3"))).click();
            }
            if (Enter_Email.equals("Bus")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemcirculationMethodSlctId4"))).click();
            }
            if (Enter_Email.equals("Hand")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemcirculationMethodSlctId5"))).click();
            }
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fnSentDateInTxt"))).sendKeys("2019-05-23");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sendManualPackageBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-ng-click=\"goAhead()\"]"))).click();
            Msg.Done();
        }
    }
        public static void Weekly_Status_Report_Comment() {
            Msg.Info("Enter the Text for  'Weekly Status Report Comment:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fnConsultationCommentTxtArea"))).sendKeys("Testing 123");
            Msg.Done(); }

        public static void Response_Due_Date() {
            Msg.Info("Enter the Text for  'Response Due Date:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fnResponseDueDateInTxt"))).sendKeys("2019-05-23");
            Msg.Done();  }
        public static void Consultation_Type() {
            Msg.Info("Enter the Text for  'Consultation Type::'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtnfnConsultationTypeCode0"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemfnConsultationTypeCode01"))).click();
            Msg.Done();
        }
        public static void Consultation_TypeOgaa() {
            Msg.Info("Enter the Text for  'Consultation Type::'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtnfnConsultationTypeCode0"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemfnConsultationTypeCode00"))).click();
            Msg.Done();
        }
        public static void FNConsultation_Type() {
            Msg.Info("Enter the Text for  'Consultation Type::'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtnfnConsultationTypeCode0"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemfnConsultationTypeCode00"))).click();
            Msg.Done();
        }

        public static void Consultation_Type_For_FNFN_TYPE(String Enter_Info_OR_Norm_OR_Com) {
            Msg.Info("Enter the Text for  'FN Review Status:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtnfnConsultationTypeCode0"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            if(Enter_Info_OR_Norm_OR_Com.equals("Info")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'ICP Information Only')]"))).click();
            }
            if(Enter_Info_OR_Norm_OR_Com.equals("Norm")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'ICP Normal')]"))).click();
            }
            if(Enter_Info_OR_Norm_OR_Com.equals("Com")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'ICP Notification with Opportunity to Comment')]"))).click();
            }
            Msg.Done(); }



        public static void FN_Review_Status(String Enter_Sum_OR_Conot_OR_RR) {
            Msg.Info("Enter the Text for  'FN Review Status:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtnfnReviewStatus0"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            if(Enter_Sum_OR_Conot_OR_RR.equals("Sum")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Summarize Consultation')]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"goAhead()\"]"))).click();
            }
            if(Enter_Sum_OR_Conot_OR_RR.equals("Conot")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Consultation Not Required')]"))).click();
            }
            if(Enter_Sum_OR_Conot_OR_RR.equals("RR")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Review & Response Period')]"))).click();
            }
            Msg.Done(); }
        public static void FN_Review_Log() {
            Msg.Info("Enter the Text for  'FN Review Log:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("addReviewLogBtnId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logDateInTxtId00"))).sendKeys("2019-05-23");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dueDateInTxtId00"))).sendKeys("2020-05-23");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reviewLogComment00"))).sendKeys("Processing under Review");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemBtnreviewLogTypeCodeId00"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeSlctItemreviewLogTypeCodeId000"))).click();
            Msg.Done();  }

       }


    public static class  Application_Activities{
        public static class Set_Activity_Recommendation{
            public static void Recommend() {
                Msg.Info("'Select on Actions 'Land Recommendation:' ");
               Browser.Sleep(Browser.Mill_Sec());
                  Crd_Conditions_Advisory.Click.Scrolldown();
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reviewSlctdefReviewTypeCode0"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                 Crd_Conditions_Advisory.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='reviewRcmddefReviewTypeCode0']"))));
               Browser.Sleep(Browser.Mill_Sec());

                Msg.Done();
            }
            public static void Apply_to_All() {
                Msg.Info("'Select on Actions 'Apply to All' ");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("applyAllLinkk0"))).click();
                Msg.Done();
            }
            public static void All_Activities() {
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                WebElement table = Browser.driver.findElement(By.xpath("//div[@reviewer-outcome-types=\"formData.reviewerOutcomeTypeCodeDescs\"]"));
                List<WebElement> compllie = table.findElements(By.xpath("//a[starts-with(@id,'appActivityTab')]"));
                Msg.Info("Select 'Recommend' from drop-down menu to all the rows");

                for (WebElement count : compllie) {
                    count.click();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Apply to All"))).click();
                }
                Msg.Done();  }
        }
    }
    public static class Click {
        public static void Task_Comment(String EnterNo) {
            Msg.Info("Click the 'Task Comment' button");
            Browser.Sleep(2300);     Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"formContainer\"]/form/div/div[1]/div[3]/div/div/div[2]/div[1]/div[4]/b"))).getText();

             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-ng-click=\"editTaskComment()\"]")));
             WebElement element=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-ng-click=\"editTaskComment()\"]")));
            JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
            executor.executeScript("arguments[0].click();", element);
           Browser.Sleep(Browser.Mill_Sec());
          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Enter task comment here']"))).sendKeys("Avengers");
           Browser.Sleep(Browser.Mill_Sec());
            if (EnterNo.equals("No")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cancelTaskCommentLnkId"))).click();
            }
            else {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("saveTaskCommentLnkId"))).click();
            }

            Msg.Done();
        }
        public static void Check_List() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.onoffswitch-switch"))).click();
            Msg.Info("Select 'ALL N/A' from drop-down menu to all the rows");

            if(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[starts-with(@for,'myonoffswitch')]"))).equals("2")){
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#switchApplicableChkBox1Id > span.onoffswitch-switch"))).click();
            }
            Msg.Done();
        }
        public static void FN_Consultation_Check_List() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@for,'myonoffswitch')]")));
            List<WebElement> compllie = Browser.driver.findElements(By.xpath(" //*[starts-with(@for,'myonoffswitch')]"));
            Msg.Info("Select 'ALL N/A' from drop-down menu to all the rows");

            for (WebElement count : compllie) {
                count.click();
                ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, 5300)");
               Browser.Sleep(Browser.Mill_Sec());
            }
            Msg.Done();
        }
        public static void Geophysical_Check_List1() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.onoffswitch-switch"))).click();
            Msg.Done();
        }
        public static void Geophysical_Check_List2() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0,8500)");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"switchApplicableChkBox1Id\"]/span[2]"))).click();
            Msg.Done();
        }
        public static void Save() {
            Msg.Info("'Select on Actions 'Save:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("rfSaveDataLnkId"))).click();
            Msg.Done();
        }

        public static void Complete_Task() {
            Msg.Info("'Select on Actions 'Complete Task:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Save"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Complete Task"))).click();
            Msg.Done();
        }
        public static void Continue() {
            Msg.Info("'Select on Actions 'Continue:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"goAhead()\"]"))).click();
            Msg.Done();
        }
        public static void Cancel() {
            Msg.Info("'Select on Actions 'Cancel:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"cancel()\"]"))).click();
            Msg.Done();
        }
        public static void Withdraw_Application() {
            Msg.Info("'Select on Actions 'Withdraw_Application:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("applicationRevNumberLnkId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("withdrawApplicationLnk"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=\"Enter reason here\"]"))).sendKeys("Test123....");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cancelWithdrawApplicationLnkId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }
    }
    public static void Review_Summary() {
        Msg.Info("Enter the Text for  'Review Summary'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reviewSummaryTxtArea"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo " +
                "ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, " +
                "ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, " +
                "arcu. In enim justo, rhoncus ut, imperdiet a");
        Msg.Done();  }


}
