package com.pacificgeotech.framework.PO.Internal.Crd_All_Task;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Crd_Conditions_Advisory_OGAA {
    public static class Click {


        public static class Conditions {

            public static void Add_Standard_Conditon() {
                Msg.Info("Select 'Add Standard Condition");
                Msg.Done();
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();


               Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();

 WebElement element  =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Standard Condition')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor)Browser.driver;
                executor.executeScript("arguments[0].click();", element);
               Browser.Sleep(Browser.Mill_Sec());

               Browser.Sleep(Browser.Mill_Sec());
                if (wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Showing 0 to 0 of 0 entries')]"))).isDisplayed()) {
                    Msg.Info("Check is checklist is displayed or not if no click Cancel ");
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click='cancel()']"))).click();
                    Msg.Done();
                } else {
                   Browser.Sleep(Browser.Mill_Sec());
                    Msg.Info("Check is checklist is displayed or not if Yes Select required Checklist ");
                    List<WebElement> Select = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[starts-with(@data-ng-click,'updateSelectClausesModel(sr)')]")));

                    for (WebElement count : Select) {
                        count.click();
                    }
                    Msg.Done();
                   Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click='add()']"))).click();


                }
            }

            public static void Add_Custom_Condition() {

                WebDriverWait wait = new WebDriverWait(Browser.driver, 100);
                Actions mouse = new Actions(Browser.driver);

               Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();
         //  mouse.contextClick( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Custom Condition')]//parent::a")))).build().perform();

  WebElement element  =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Custom Condition')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor)Browser.driver;
                executor.executeScript("arguments[0].click();", element);Browser.Sleep(Browser.Mill_Sec());

          int size   =   Browser.driver.findElements(By.tagName("iframe")).size();

               System.out.println(size);
                Browser.driver.switchTo().frame(0);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@contenteditable='true']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@contenteditable='true']"))).sendKeys("Things need to be updated or not ");

                Browser.driver.switchTo().defaultContent();

               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("codeSlctItemBtnselectedConditionTypeCodeSlctId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                mouse.sendKeys(Keys.ENTER).build().perform();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"codeSlctItemBtnselectedIntendedResultCodeSlctId\"]/button/span[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                mouse.sendKeys(Keys.ENTER).build().perform();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"codeSlctItemBtnselectedClauseOpeventcodeSlctId\"]/button/span[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());


                mouse.sendKeys(Keys.ENTER).build().perform();



               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-model=\"taskClause.isChecked\"]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click='update()']"))).click();


            }
        }







        public static class Advisory_Guidance {

            public static void Add_Standard_Advisory_Guidance_Condition() {
                Msg.Info("Select 'Add Standard Condition");
                Msg.Done();
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();



                Actions mouse = new Actions(Browser.driver);

               Browser.Sleep(Browser.Mill_Sec());

                ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, 9300)");

 WebElement element  =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Standard Advisory Guidance')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor)Browser.driver;
                executor.executeScript("arguments[0].click();", element);Browser.Sleep(Browser.Mill_Sec());

               Browser.Sleep(Browser.Mill_Sec());
                if (wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Showing 0 to 0 of 0 entries')]"))).isDisplayed()) {
                    Msg.Info("Check is checklist is displayed or not if no click Cancel ");
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click='cancel()']"))).click();
                    Msg.Done();
                } else {
                   Browser.Sleep(Browser.Mill_Sec());
                    Msg.Info("Check is checklist is displayed or not if Yes Select required Checklist ");
                    List<WebElement> Select = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[starts-with(@data-ng-click,'updateSelectClausesModel(sr)')]")));

                    for (WebElement count : Select) {
                        count.click();
                    }
                    Msg.Done();
                   Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click='add()']"))).click();

                }
            }

            public static void Add_Custom_Advisory_Guidance_Condition() {

                WebDriverWait wait = new WebDriverWait(Browser.driver, 100);

                Actions mouse = new Actions(Browser.driver);

               Browser.Sleep(Browser.Mill_Sec());

                ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, 9300)");

 WebElement element  =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Custom Advisory Guidance')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor)Browser.driver;
                executor.executeScript("arguments[0].click();", element);Browser.Sleep(Browser.Mill_Sec());
                int size   =   Browser.driver.findElements(By.tagName("iframe")).size();

                System.out.println(size);
                Browser.driver.switchTo().frame(0);


                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@contenteditable='true']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@contenteditable='true']"))).sendKeys("Things need to be updated or not ");

                Browser.driver.switchTo().defaultContent();

               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"codeSlctItemBtnselectedActivityTypeCodeSlctId\"]/button"))).click();
               Browser.Sleep(Browser.Mill_Sec());


              mouse.sendKeys(Keys.ENTER).build().perform();


               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-model=\"taskClause.isChecked\"]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-ng-click='update()']"))).click();


            }
        }


    }

}
