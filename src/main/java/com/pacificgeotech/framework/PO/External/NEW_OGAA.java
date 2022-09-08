package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NEW_OGAA {



    public static class Activity_information {
        public static class Activites {
            public static void   Road() {

                Msg.Info("Click on the '  Road ' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Road')]"))).click();
                Msg.Done();
            }
            public static void   Associated_Oil_and_Gas_Activity() {

                Msg.Info("Click on the '  Associated Oil and Gas Activity' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Associated Oil and Gas Activity')]"))).click();
                Msg.Done();
            }
            public static void   Changes_In_and_About_a_Stream() {

                Msg.Info("Click on the '  Changes In and About a Stream' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Changes In and About a Stream')]"))).click();
                Msg.Done();
            }
            public static void   Pipeline() {

                Msg.Info("Click on the '  Pipeline Right of Way' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Pipeline')]"))).click();
                Msg.Done();
            }
            public static void   Geophysical() {

                Msg.Info("Click on the '  Pipeline Right of Way' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Geophysical')]"))).click();
                Msg.Done();
            }
            public static void   Short_Term_Water_Use_POD() {

                Msg.Info("Click on the '  Short Term Water Use (POD)' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Short Term Water Use (POD)')]"))).click();
                Msg.Done();
            }
            public static void  Well_Land_Area_1() {

                Msg.Info("Click on the '  Well Land Area # ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:innerActInfoPnlId:0:activityAppAreaDtlId:0:activityAppAreaLnkId"))).click();
                Msg.Done();
            }
            public static void  Well_Land_Area_2() {

                Msg.Info("Click on the ' Well Land Area # ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:innerActInfoPnlId:0:activityAppAreaDtlId:1:activityAppAreaLnkId"))).click();
                Msg.Done();
            }
            public static void   Facility_Land_Area_1() {

                Msg.Info("Click on the '   Facility Land Area # ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:innerActInfoPnlId:1:activityAppAreaDtlId:0:activityAppAreaLnkId"))).click();
                Msg.Done();
            }
            public static void    Facility_Land_Area_2() {

                Msg.Info("Click on the ' Facility Land Area # ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:actInfoPndId:innerActInfoPnlId:1:activityAppAreaDtlId:1:activityAppAreaLnkId"))).click();
                Msg.Done();
            }

        }
    }

}
