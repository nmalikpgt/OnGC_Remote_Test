package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dammi {



    public static void Check_List() {
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.onoffswitch-switch"))).click();
        Msg.Info("Select 'ALL N/A' from drop-down menu to all the rows");

     Integer number=   wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[starts-with(@for,'myonoffswitch')]"))).size();


        if(number.equals("2")){

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#switchApplicableChkBox1Id > span.onoffswitch-switch"))).click();
        }
        Msg.Done();
    }
}
