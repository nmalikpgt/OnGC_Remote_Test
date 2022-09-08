package com.pacificgeotech.framework.PO.Internal;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crd_HomePage {
    public static class Click{
        public static void Search(){
            Msg.Info("Click 'Search' on the Main Menu");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(search))).click();
            Msg.Done();
        }
        public static void My_Task(){
            Msg.Info("Click 'My_Task' on the Main Menu");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 100);
            wait.until(ExpectedConditions.elementToBeClickable(By.id(mytasks))).click();
            Msg.Done();
        }
        public static void Group_Tasks(){
            Msg.Info("Click 'Group_Tasks' on the Main Menu");
            Browser.Sleep(2300);
            WebDriverWait wait = new WebDriverWait(Browser.driver, 100);
            wait.until(ExpectedConditions.elementToBeClickable(By.id(grouptask))).click();
            Msg.Done();
        }

        public static void Home(){
            Msg.Info("Click 'Home' on the Main Menu");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(home))).click();
            Msg.Done();
        }
    }

    private static final String search ="dashboardSearchLnkId";
    private static final String mytasks="dashboardMyTasksLnkId";
    private static final String grouptask="dashboardGroupTasksLnkId";
    private static final String home="dashboardMyTasksLnkId";
}
