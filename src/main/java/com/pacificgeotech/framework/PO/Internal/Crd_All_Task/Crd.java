package com.pacificgeotech.framework.PO.Internal.Crd_All_Task;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crd {
    public static class Click {



        public static void Conditions () {
            Msg.Info("Select 'No Conditions have been entered for this review task");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("addConditions"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("conditionsTxtArea0"))).sendKeys("Testing 123......");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("selectConditionsActivity0"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkAllBtnId"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("addAppActSelBtnId"))).click();
            Msg.Done();
        }
        public static void Advisory_Guidance () {
            Msg.Info("Select 'No Advisory Guidance have been entered for this review task");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("addAdvisoryGuidanceLnkId"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("advisoryGuidanceTxtArea0"))).sendKeys("Testing 123......");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("selectAdvisoryGuidanceActivityType0"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkAllBtnId"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("addAdvGuidanceActBtnId"))).click();
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
