package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NEW_NEB_RELATED {



    public static class Activity_information {
        public static class Activites {
            public static void   Road_Right_of_Way() {

                Msg.Info("Click on the '  Road Right of Way' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Road Right of Way')]"))).click();
                Msg.Done();
            }
            public static void NEB_Related_Ancillary() {

                Msg.Info("Click on the 'NEB Related Ancillary' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'NEB Related Ancillary')]"))).click();
                Msg.Done();
            }
            public static void   Changes_In_and_About_a_Stream() {

                Msg.Info("Click on the '  Changes In and About a Stream' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Changes In and About a Stream')]"))).click();
                Msg.Done();
            }
            public static void   Pipeline_Right_of_Way() {

                Msg.Info("Click on the '  Pipeline Right of Way' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Pipeline Right of Way')]"))).click();
                Msg.Done();
            }
            public static void   Short_Term_Water_Use_POD() {

                Msg.Info("Click on the '  Short Term Water Use (POD)' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Short Term Water Use (POD)')]"))).click();
                Msg.Done();
            }

        }
    }

}
