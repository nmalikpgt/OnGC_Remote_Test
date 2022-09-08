package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Road {

    public static void Road_width() {
        Msg.Info("Enter the text for Road width");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("appFrmId:roadSegmentsOutPnlId:roadWidthInTxtId"))).clear();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("appFrmId:roadSegmentsOutPnlId:roadWidthInTxtId"))).sendKeys("9999");
        Msg.Done();
    }

    public static class Verify {
      public static void Verify_Status__BCGS_Map() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sdValueOutLblId")));
          Msg.Done();
      }
      public static void Progress_Message() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("progressDialogId")));
          Msg.Done();
      }
  }
    public static class Road_Overview_Details {
        public static void All_Information() {
            Msg.Info("Enter the Details for 'Road Overview Details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescriptionInTxtId"))).sendKeys("Activity Description here ...");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:minRightOfWayTxtId"))).sendKeys("999");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:rightOfWayInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit." +
                    " Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque " +
                    "eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:roadApplicationSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:roadApplicationSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:roadTypeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:roadTypeSlctId_panel\"]/div/ul/li[3]"))).click();
            Msg.Done();
        }



            public static void Historical_Road_Overview_Details() {
                Msg.Info("Enter the Details for 'Road Overview Details' ");
               Browser.Sleep(Browser.Mill_Sec());
                  Crd_Conditions_Advisory.Click.Scrolldown();
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescriptionInTxtId"))).sendKeys("Activity Description here ...");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:minRightOfWayTxtId"))).sendKeys("999");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:rightOfWayInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit." +
                        " Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque " +
                        "eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:withinExistingCcIndBtnId\"]/div[2]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:withinExistingCcIndBtnId\"]/div[2]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:roadTypeSlctId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:roadTypeSlctId_panel\"]/div/ul/li[3]"))).click();
                Msg.Done();
            }
    }

    public static class Click {
        public static void Road_Overview() {
            Msg.Info("Click on the 'Road Overview' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:roadOverviewTab"))).click();
        }
        public static void Road_Details() {
            Msg.Info("Click on the 'Road Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:roadDetailsTab"))).click();
        }
        public static void Road_Land_Details() {
            Msg.Info("Click on the 'Road Land Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:roadLandDetailsTab"))).click();
        }

        public static void SEGMENT_ID2() {
            Msg.Info("Click on the 'Segment_id' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.not-current"))).click();
        }
        public static void Save() {
            Msg.Info("Click on the 'Save' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topsaveBtnId"))).click();
        }
        public static void Validate_Page() {
            Msg.Info("Click on the 'Validate Page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))).click();
        }
        public static void Remove_Segment() {
            Msg.Info("Click on the 'Remove Segment' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:removeSegmentBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
        }
    }

}



