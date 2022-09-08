package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Amendment {
    public static class Click {

        public static void Facility_Land_Area() {
            Browser.Sleep(500);
            Msg.Info("Click on the ' Facility Land Area' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:innerActInfoPnlId:0:activityAppAreaDtlId:0:activityAppAreaLnkId"))).click();
            Msg.Done();
        }
        public static void Geophysical() {
            Browser.Sleep(500);
            Msg.Info("Click on the 'Geophysical' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:activityNoAppAreaDtlId:0:activityNoAppAreaLnkId"))).click();
            Msg.Done();
        }
        public static void Pipeline() {
            Browser.Sleep(500);
            Msg.Info("Click on the 'Pipeline' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:activityNoAppAreaDtlId:0:activityNoAppAreaLnkId"))).click();
            Msg.Done();
        }
        public static void Road() {
            Browser.Sleep(500);
            Msg.Info("Click on the 'Road' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:activityNoAppAreaDtlId:0:activityNoAppAreaLnkId"))).click();
            Msg.Done();
        }
        public static void Well_Land_Area() {
            Browser.Sleep(500);
            Msg.Info("Click on the 'Well' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:innerActInfoPnlId:0:activityAppAreaDtlId:0:activityAppAreaLnkId"))).click();
            Msg.Done();
        }
    }


}
