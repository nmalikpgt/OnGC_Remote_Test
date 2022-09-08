package com.pacificgeotech.framework.PO.Internal.Crd_All_Task;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Land_Habitat_Review {

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


    public static class Application_Activities {
        public static class Set_Activity_Recommendation {
            public static void Recommend() {
                Msg.Info("'Select on Actions 'Land Recommendation:' ");
               Browser.Sleep(Browser.Mill_Sec());
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
                Msg.Done(); }
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
            } else {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("saveTaskCommentLnkId"))).click();
            }

            Msg.Done();
        }

        public static void Land_And_Habitat_Checklist() {
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[starts-with(@for,'myonoffswitch')]")));
            List<WebElement> compllie = Browser.driver.findElements(By.xpath(" //*[starts-with(@for,'myonoffswitch')]"));
            Msg.Info("Select 'ALL N/A' from drop-down menu to all the rows");

            for (WebElement count : compllie) {
                count.click();
                ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0,6500)");
            }
            Msg.Done();
        }

        public static void Save() {
            Msg.Info("'Select on Actions 'Save:' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rfSaveDataLnkId"))).click();
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

    }



}