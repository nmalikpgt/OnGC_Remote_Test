package com.pacificgeotech.framework.PO.Internal.Crd_All_Task;

import com.pacificgeotech.framework.PO.Environments.Browser;

import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;


import com.pacificgeotech.framework.PO.Environments.DataBase_Connection;
import com.pacificgeotech.framework.core.FileUpload;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SDM_Review_And_Determination {


    public static void High_Risk(String EnterYes_Or_No) {
        Msg.Info("Click the 'High_Risk' button");
        Browser.Sleep(2300);
          Crd_Conditions_Advisory.Click.Scrolldown();
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@ng-model=\"determinationAndRationaleRef.highRiskInd\"]"))).click();

       Browser.Sleep(Browser.Mill_Sec());
        if (EnterYes_Or_No.equals("Yes")) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesNoIndYes"))).click();
        } else {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesNoIndNo"))).click();
        }

        Msg.Done();
    }

    public static void Cutting_permit() {
        Msg.Info("Click the 'High_Risk' button");
          Crd_Conditions_Advisory.Click.Scrolldown();
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("approvedAreaOfNewCut0InTxt"))).sendKeys("200");
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ol[@ng-model='cuttingPermit.decisionCode']/button"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/div/div[7]/div/div/div[3]/div/table/tbody/tr/td[11]/ol/div/ul/li[1]/a/span[1]"))).click();

        Msg.Done();
    }

    public static void Decision_Maker_Notes() {
        Msg.Info("Enter the Text for  'Decision Maker Notes'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("decisionRationaleId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo " +
                "ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, " +
                "ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, " +
                "arcu. In enim justo, rhoncus ut, imperdiet a");
        Msg.Done();
    }

    public static void Amendment_Fee_Type() {
        Msg.Info("Enter the Text for  'Amendment Fee Type'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("amendmentFeeReasonId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo " +
                "ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, " +
                "ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, " +
                "arcu. In enim justo, rhoncus ut, imperdiet a");
        Msg.Done();
    }


    public static class Decision_Maker_Checklist {

        public static void Complete() {
              Crd_Conditions_Advisory.Click.Scrolldown();
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@messages=\"messages\"]")));
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ol[@ng-change=\"unsavedChangesPrompt()\"]")));
            List<WebElement> compllie = table.findElements(By.xpath("//ol[@ng-change=\"unsavedChangesPrompt()\"]"));
            Msg.Info("Select 'Complete' from drop-down menu to all the rows");

            for (WebElement count : compllie) {
                count.click();
                Browser.Sleep(200);
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Complete"))).click();
                  Crd_Conditions_Advisory.Click.Scrolldown();
            }

            Msg.Done();
        }

        public static void Enter_Text() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@messages=\"messages\"]")));
            List<WebElement> compllie = table.findElements(By.xpath("//textarea[@ng-change=\"unsavedChangesPrompt()\"]"));
            Msg.Info("Select 'Complete' from drop-down menu to all the rows");

            for (WebElement count : compllie) {
                count.sendKeys("Your Application is under processing");

            }

            Msg.Done();
        }
    }


    public static class Application_Activities {
        public static class Set_Activity_Recommendation {
            public static void Recommend() {
                Msg.Info("'Select on Actions 'Agriculture Recommendation:' ");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reviewSlctdefReviewTypeCode0"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                 Crd_Conditions_Advisory.Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='reviewRcmddefReviewTypeCode0']"))));
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
                WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@reviewer-outcome-types=\"formData.reviewerOutcomeTypeCodeDescs\"]")));
                List<WebElement> compllie = table.findElements(By.xpath("//a[starts-with(@id,'appActivityTab')]"));
                Msg.Info("Select 'Recommend' from drop-down menu to all the rows");

                for (WebElement count : compllie) {
                    count.click();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Apply to All"))).click();
                }
                Msg.Done();
            }
        }
    }



   public static class Permit_Generation {
        public static class Permit_Template {
            public static void NEB_Amendment() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formSlctId"))).sendKeys("NEB Amendment (v1)");
                Browser.Sleep(2300);
                Msg.Info("'Select on Actions 'NEB Amendment'  And selects Water Course Crossing & Works: All Checked");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/button"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/ul/li[1]/a"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                Msg.Info("when user clicks on Print Doc And Print PDF , system generates And Download  for the page");
               Browser.Sleep(Browser.Mill_Sec());

                Msg.Done();
            }
            public static void New_NEB() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formSlctId"))).sendKeys("New NEB (v1)");
                Browser.Sleep(2300);
                Msg.Info("'Select on Actions 'New NEB (v1)'  And selects Water Course Crossing & Works: All Checked");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/button"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/ul/li[1]/a"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                Msg.Info("when user clicks on Print Doc And Print PDF , system generates And Download  for the page");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }

            public static void New_Non_OGAA() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formSlctId"))).sendKeys("New Non-OGAA (v1)");
                Browser.Sleep(2300);
                Msg.Info("'Select on Actions 'New Non-OGAA (v1)'  And selects Water Course Crossing & Works: All Checked");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/button"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/ul/li[1]/a"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                Msg.Info("when user clicks on Print Doc And Print PDF , system generates And Download  for the page");
               Browser.Sleep(Browser.Mill_Sec());

                Msg.Done();
            }

            public static void New_OGAA() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formSlctId"))).sendKeys("New OGAA (v1)");
                Browser.Sleep(2300);
                Msg.Info("'Select on Actions 'New OGAA (v1)'  And selects Water Course Crossing & Works: All Checked");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/button"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/ul/li[1]/a"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                Msg.Info("when user clicks on Print Doc And Print PDF , system generates And Download  for the page");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }
            public static void Non_OGAA_Amendment() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formSlctId"))).sendKeys("Non-OGAA Amendment (v1)");
                Browser.Sleep(2300);
                Msg.Info("'Select on Actions 'Non-OGAA Amendment (v1)'  And selects Water Course Crossing & Works: All Checked");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/button"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/ul/li[1]/a"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                Msg.Info("when user clicks on Print Doc And Print PDF , system generates And Download  for the page");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }
            public static void OGAA_Amendment() {
                  Crd_Conditions_Advisory.Click.Scrolldown();
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formSlctId"))).sendKeys("OGAA Amendment (v1)");
                Browser.Sleep(2300);
                Msg.Info("'Select on Actions 'OGAA Amendment (v1)'  And selects Water Course Crossing & Works: All Checked");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/button"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wccwTypeCodesSlctId\"]/div/ul/li[1]/a"))).click();
                Browser.Sleep(2300);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("printDocBtnId"))).click();
                Browser.Sleep(4000);
                Msg.Info("when user clicks on Print Doc And Print PDF , system generates And Download  for the page");
               Browser.Sleep(Browser.Mill_Sec());

                Msg.Done();
            }


        }
    }






    public static class Click {
        public static void Task_Comment(String EnterNo) {
            Msg.Info("Click the 'Task Comment' button");
              Crd_Conditions_Advisory.Click.Scrolldown();
            Browser.Sleep(2300);
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Task Comment:')]"))).getText();

             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-ng-click=\"editTaskComment()\"]")));
             WebElement element=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-ng-click=\"editTaskComment()\"]")));
            JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
            executor.executeScript("arguments[0].click();", element);
           Browser.Sleep(Browser.Mill_Sec());
          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Enter task comment here']"))).sendKeys("Avengers");
           Browser.Sleep(Browser.Mill_Sec());
            if (EnterNo.equals("No")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cancelTaskCommentLnkId"))).click();
            } else {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("saveTaskCommentLnkId"))).click();
            }

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
        public static void ContinueValidation() {
            Msg.Info("'Select on Actions 'Continue:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-ng-click=\"confirm();\"]"))).click();
            } catch (Exception e) {
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click=\"navigateAway()\"]"))).click();
                } catch (Exception exception) {

                }
            }
            Msg.Done();
        }
        public static void Continue()  {
            Msg.Info("'Select on Actions 'Continue:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                Crd_Conditions_Advisory.Click.Scrolldown();
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-ng-click=\"confirm();\"]"))).click();
            } catch (Exception e) {
                try {  WebDriverWait wait1 = new WebDriverWait(Browser.driver, 8);
                    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click=\"navigateAway()\"]"))).click();
                } catch (Exception exception) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-ng-click=\"confirm();\"]"))).click();
                }
            }
            Msg.Done();
        }

        public static void Cancel() {
            Msg.Info("'Select on Actions 'Cancel:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"cancel();\"]"))).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-ng-click=\"cancel()\"]"))).click();
            }
            Msg.Done();
        }

        public static void Withdraw_Application() {
            Msg.Info("'Select on Actions 'Withdraw_Application:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("applicationRevNumberLnkId"))).click();
            try {
                ContinueValidation();
            } catch (Exception e) {

            }
            Browser.Sleep(Browser.Mill_Sec());

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("withdrawApplicationLnk"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@ng-model='formData.comment']"))).sendKeys("Test123....");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cancelWithdrawApplicationLnkId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }

        public static void Complete_Task() {
            Msg.Info("'Select on Actions 'Complete Task:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Save"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Complete Task"))).click();
            Msg.Done();
        }
        public static void SDM_Complete_Task() {
            Msg.Info("'Select on Actions 'Complete Task:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Save"))).click();
          // Browser.Sleep(Browser.Mill_Sec());
          //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"goAhead()\"]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Complete Task"))).click();
            Msg.Done();
        }

        public static void Decision_Maker_Checklist() {
            Msg.Info("'Select on Actions ' Decision Maker Checklist:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            new Actions(Browser.driver).moveToElement( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/ul/li[3]/a/tab-heading/span/span")))).click().build().perform();
            Msg.Done();
        }

        public static void Permit_Generation () {
            Msg.Info("'Select on Actions ' Permit Generation :' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/ul/li[5]/a/tab-heading/span/span"))).click();
            new Actions(Browser.driver).moveToElement( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/ul/li[5]/a/tab-heading/span/span")))).click().build().perform();
            Msg.Done();
        }

        public static void Advisory_Guidance() {
            Msg.Info("'Select on Actions 'Advisory Guidance :' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/ul/li[5]/a/tab-heading/span/span"))).click();
            Msg.Done();
        }

        public static void Attachments() {
            Msg.Info("'Select on Actions 'Attachments :' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/ul/li[6]/a/tab-heading/span/span"))).click();


            WebElement browseButton1 =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@file-model='attachment']")));
            browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@ng-model='attachment.documentType']"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Java_script_executor( wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"attachmentTable\"]/tr/td[4]/ol/div/ul/li[12]/a"))));


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-ng-change=\"selectAll()\"]"))).click();


            Msg.Done();
        }








        public static void Determination() {
            Msg.Info("'Select on Actions 'Determination :' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/ul/li[7]/a/tab-heading/span/span"))).click();
            Msg.Done();
        }

        public static void Short_Term_Water_Use() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("'Click and enter the details for  Short_Term_Water_Use :' ");
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            Date today1 = calendar.getTime();
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String todayA = dateFormat1.format(today1);

            Calendar calendar1 = Calendar.getInstance();
            calendar1.add(Calendar.DAY_OF_YEAR, 2);
            Date today2 = calendar1.getTime();
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            String today = dateFormat2.format(today2);


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Short Term Water Use')]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("podApprovedStartDateInptId"))).sendKeys(todayA);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("podApprovedEndDateInptId"))).sendKeys(today);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ol[@ng-model=\"podActivity.decisionCode\"]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            Msg.Done();
        }
        public static void NEB_Short_Term_Water_Use() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("'Click and enter the details for  Short_Term_Water_Use :' ");
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, 0);
            Date today1 = calendar.getTime();
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String todayA = dateFormat1.format(today1);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Short Term Water Use')]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("podApprovedStartDateInptId"))).sendKeys(todayA);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("podApprovedEndDateInptId"))).sendKeys(todayA);
           Browser.Sleep(Browser.Mill_Sec());


            List<WebElement> compllie =  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ol[@ng-model=\"podActivity.decisionCode\"]")));
            Msg.Info("Select 'Approve' from drop-down menu to all the rows");

            for (WebElement count : compllie) {
                Crd_Conditions_Advisory.Click.Scrolldown();
                count.click();
                Browser.Sleep(300);

                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }
            Msg.Done();
        }
        public static void Road_Right_of_Way() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("'Click and enter the details for  Road Right of Way :' ");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Road Right of Way')]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ol[@ng-model=\"roadSegment.decisionCode\"]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            Msg.Done();
        }

        public static void Pipeline_Right_of_Way() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("'Click and enter the details for Pipeline Right of Way :' ");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Pipeline Right of Way')]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ol[@ng-model=\"appReviews.pipelineRightOfWayReviews.decisionCode\"]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            Msg.Done();
        }

        public static void Changes_In_and_About_a_Stream() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("'Click and enter the details for  Changes In and About a Stream :' ");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Changes In and About a Stream')]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ol[@ng-model=\"changesInAndAboutStreamActivity.decisionCode\"]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            Msg.Done();
        }

        public static void Ancillary() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("'Click and enter the details for Ancillary :' ");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Ancillary')]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/div/div[7]/div/div/div[2]/div/div/div/div[3]/div[1]/div/div[2]/table/tbody/tr/td[2]/ol/button/span[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/div/div[7]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[2]/table/tbody/tr/td[2]/ol/button/span[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();


            Msg.Done();
        }


        public static void Approve_Desicion() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@ng-if,'appHasActivityTypeCodes')]")));
            List<WebElement> compllie = Browser.driver.findElements(By.xpath("//ol[@ng-change=\"unsavedChangesPrompt()\"]"));
            Msg.Info("Select 'Approve' from drop-down menu to all the rows");
              Crd_Conditions_Advisory.Click.Scrolldown();
            for (WebElement count : compllie) {
                count.click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }

            Msg.Done();
        }
        public static void WEll_Approve_Desicion() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@ng-if,'appHasActivityTypeCodes')]")));
            List<WebElement> compllie = Browser.driver.findElements(By.xpath("//ol[@ng-model=\"wellActivity.decisionCode\"]"));
            Msg.Info("Select 'Approve' from drop-down menu to all the rows");
              Crd_Conditions_Advisory.Click.Scrolldown();
            for (WebElement count : compllie) {
                count.click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }
            List<WebElement> compllie1 = Browser.driver.findElements(By.xpath("//ol[@ng-model=\"facilityActivity.decisionCode\"]"));

            for (WebElement count1 : compllie1) {
                count1.click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }




            Msg.Done();
        }



        public static void Pipeline_Approve_Desicion() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Pipeline')]"))).click();
            List<WebElement> compllie1 = Browser.driver.findElements(By.xpath("//ol[@ng-model=\"appReviews.pipelineReviews.decisionCode\"]"));
            Msg.Info("Select 'Approve' from drop-down menu to all the rows");

            for (WebElement count : compllie1) {
                count.click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }

            Msg.Done();
        }


        public static void Road_Approve_Desicion() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Road')]"))).click();
            List<WebElement> compllie1 = Browser.driver.findElements(By.xpath("//ol[@ng-model=\"roadSegment.decisionCode\"]"));
            Msg.Info("Select 'Approve' from drop-down menu to all the rows");

            for (WebElement count : compllie1) {
                count.click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }

            Msg.Done();
        }

        public static void Associated_Oil_Gas_Activity_Approve_Desicion() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Associated Oil & Gas Activity')]"))).click();
            List<WebElement> compllie1 = Browser.driver.findElements(By.xpath("//ol[@ng-model=\"associatedOilAndGasActivity.decisionCode\"]"));
            Msg.Info("Select 'Approve' from drop-down menu to all the rows");

            for (WebElement count : compllie1) {
                count.click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }

            Msg.Done();
        }

        public static void Geophysical_Approve_Desicion() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
              Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Geophysical')]"))).click();
            List<WebElement> compllie1 = Browser.driver.findElements(By.xpath("//ol[@ng-model=\"geophysicalActivity.decisionCode\"]"));
            Msg.Info("Select 'Approve' from drop-down menu to all the rows");

            for (WebElement count : compllie1) {
                count.click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Approve"))).click();
            }

            Msg.Done();
        }

    }


}
