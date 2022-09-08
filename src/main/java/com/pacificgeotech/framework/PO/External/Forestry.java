package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forestry {
    public static class Forestry_Details {
        public static class Click {

            public static void New_Cut_Required () {

                Msg.Info("Click on  'New Cut Required  Yes/No'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:newCutRequiredBtnId"))).click();
                Msg.Done();
            }
        }
        public static void Fort_Nelson_Natural_Resource_District () {

            Msg.Info("Click on  'Fort Nelson Natural Resource District'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:forestryLicenceTOsDtaTblId:0:editForestryDistrictCodeOutTxtId"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='appFrmId:forestryLicenceTOsDtaTblId:0:forestryDistrictNameInTxtId_label']"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='appFrmId:forestryLicenceTOsDtaTblId:0:forestryDistrictNameInTxtId_panel']/div/ul/li[6]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }
        public static void OGAA_Forestry_Detailst () {

            Msg.Info("Enter details for 'OGAA_Forestry_Detailst'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:forestryLicenceTOsDtaTblId:0:areaOfNewCutInTxtId_input"))).sendKeys("211.210");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            new Actions(Browser.driver).moveToElement( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"appFrmId:totalAreaOfNewCutOtherProjectInTxtId_input\"]")))).click().build().perform();
            Browser.Sleep(Browser.Mill_Sec());
            new Actions(Browser.driver).moveToElement( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"appFrmId:totalAreaOfNewCutOtherProjectInTxtId_input\"]")))).sendKeys("12,132.000").build().perform();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }

        public static void Additional_Area_of_Proposed_Cut_Over_Crown_Land_and_MoTI_ha() {

            Msg.Info("Entered 200 in the 'Additional Area of Proposed Cut Over Crown Land and MoTI(ha)' field'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='appFrmId:forestryLicenceTOsDtaTblId:0:areaOfProposedCutOverCrwnLndAndMotiInTxtId_input']"))).sendKeys("200");
            Browser.Sleep(Browser.Mill_Sec());
            Browser.Sleep(Browser.Mill_Sec());


            Msg.Done();
        }

    }


}
