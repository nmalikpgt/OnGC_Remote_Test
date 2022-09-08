package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Geophysical {

    public static class Verify {
      public static void Progress_Message() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("progressDialogId")));
          Msg.Done();
      }
  }
    public static class Amendment_Geophysical_Activity_Details {
        public static void All_Information() {
            Msg.Info("Enter the Details for 'Associated_Oil_Gas_Activity_Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:programTypeCodeSlctId']/div[3]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:programTypeCodeSlctId_panel']/div/ul/li[2]"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:programNameInTxtId"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:programNameInTxtId"))).sendKeys("ana");
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:constructionTypeCodeSlctId']/div[3]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:constructionTypeCodeSlctId_panel']/div/ul/li[2]"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:energySourceCodeSlctId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:energySourceCodeSlctId_panel']/div/ul/li[2]"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:linesWithin400mIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:linesWithin400mIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:overlapOtherProgramIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:overlapOtherProgramIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescInTxtId"))).sendKeys("Activity Description here ...");
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Done();
        }
    }
    public static class Geophysical_Activity_Details {
        public static void All_Information() {
            Msg.Info("Enter the Details for 'Associated_Oil_Gas_Activity_Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescInTxtId"))).sendKeys("Activity Description here ...");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:programNameInTxtId"))).sendKeys("abc");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:programTypeCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:programTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:constructionTypeCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:constructionTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:energySourceCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:energySourceCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:varianceExplanationIndBtnId"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:varianceExplanationInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean " +
                    "commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, " +
                    "pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Done();
        }
    }

    public static class Click {
        public static void Save() {
            Msg.Info("Click on the 'Save' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topsaveBtnId"))).click();
            Msg.Done(); }
        public static void Validate_Page() {
            Msg.Info("Click on the 'Validate Page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))).click();
            Msg.Done(); }

    }

}



