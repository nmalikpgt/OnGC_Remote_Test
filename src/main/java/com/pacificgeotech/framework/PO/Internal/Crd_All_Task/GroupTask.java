package com.pacificgeotech.framework.PO.Internal.Crd_All_Task;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroupTask {
    public static class Actions {
        public static class Select {
            public static void Comments() {
                Msg.Info("'Select on Actions 'Comments' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("commentsLnkId0"))).click();
                Msg.Done();
            }

            public static void View_Task_Process_Instance() {
                Msg.Info("'Select on Actions 'Selecting View Task Process Instance' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("viewBpmModelLnkId0"))).click();
                Msg.Done();
            }

            public static void Assign_Task() {
                Msg.Info("'Select on Actions 'Selecting  Assign Task' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("assignTaskLnkId0"))).click();
                Msg.Done();
            }

            public static void Assign_Task_to_Me() {
                Msg.Info("'Select on Actions 'Selecting Assign Task to Me' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("assignToMeBtnId0"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }


            public static void Execute_Task() {
                Msg.Info("'Select on Actions 'Selecting Execute Task' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-tooltip=\"Execute task\"]"))).isDisplayed();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tooltip=\"Execute task\"]"))).click();
                } catch (Exception e) {
                    Crd_Conditions_Advisory.Java_script_executor( wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-tooltip=\"Execute task\"]"))));
                }

                String App = wait.until(ExpectedConditions.elementToBeClickable(By.id("applicationRevNumberLnkId"))).getText();
                String Task = wait.until(ExpectedConditions.elementToBeClickable(By.id("taskIdLblId"))).getText();
                System.out.println(App);
                System.out.println(Task);
                Msg.Done();
            }

            public static void Execute_Task2() {
                Msg.Info("'Select on Actions 'Selecting Execute Task' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("executeTaskLnkId1"))).click();
                Msg.Done();
            }

            public static void Execute_Task3() {
                Msg.Info("'Select on Actions 'Selecting Execute Task' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("executeTaskLnkId2"))).click();
                Msg.Done();
            }

        }
    }

    /*  public static class Enter {
          public static void Input_Quick_Filtering(String FilterApplicationnumber, String Enter_task ) {
              Msg.Info("'Enter Application Nukmber ");
             Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                  Crd_Conditions_Advisory.Click.Scrolldown();
              wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedAppNumInTxtId"))).sendKeys(FilterApplicationnumber);
             Browser.Sleep(Browser.Mill_Sec());
              wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedTaskTypeInTxtId"))).sendKeys(Enter_task);
              Msg.Done();
          }
  */
    public static class Enter {
        public static void Input_Quick_Filtering(String FilterApplicationnumber, String Enter_task) {
            Msg.Info("'Enter Transaction Number ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 8);

            WebElement appElement = null;
            WebElement element;
            try {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='groupTaskAdvanceSearchChk2Id']")));
                element.click();
                Thread.sleep(1000);
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='advancedAppNumInTxtId']")));
                element.clear();
                Thread.sleep(1000);
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='advancedAppNumInTxtId']")));
                element.sendKeys(FilterApplicationnumber);
                Thread.sleep(4000);
                appElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='applNumberLnkId0']")));
            } catch (Throwable e) {
            }

            for (int i = 0; i < 8; i++) {
                if (appElement == null || !appElement.isDisplayed()) {
                    try {
                        Msg.Info("'Searching for  Transaction Number ");
                        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='groupTaskAdvanceSearchChk2Id']")));
                        element.click();
                        Thread.sleep(1000);
                        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='advancedAppNumInTxtId']")));
                        element.clear();
                        Thread.sleep(1000);
                        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='advancedAppNumInTxtId']")));
                        element.sendKeys(FilterApplicationnumber);
                       Browser.Sleep(Browser.Mill_Sec());
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedTaskTypeInTxtId"))).sendKeys(Enter_task);
                        appElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='applNumberLnkId0']")));
                        break;
                    } catch (Throwable e) {
                        appElement = null;
                    }
                }
            }
//                    for(int i =0;i<3;i++){
//                    try {
//                        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedAppNumInTxtId"))).clear();
//                        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedAppNumInTxtId"))).sendKeys(FilterApplicationnumber);
//                       Browser.Sleep(Browser.Mill_Sec());
//                        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedTaskTypeInTxtId"))).clear();
//                       Browser.Sleep(Browser.Mill_Sec());
//                        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedTaskTypeInTxtId"))).sendKeys(Enter_task);
//                       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("applNumberLnkId0")));
//                    break;
//                    } catch (Throwable e) {
//
//                    }
//                }

            Msg.Done();
        }


        public static void MyTask_Input_Quick_Filtering(String FilterApplicationnumber, String Enter_task) {
            Msg.Info("'Enter Transaction Number ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedAppNumInTxtId"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedAppNumInTxtId"))).sendKeys(FilterApplicationnumber);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedTaskTypeInTxtId"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("advancedTaskTypeInTxtId"))).sendKeys(Enter_task);

            Msg.Done();


        }
    }
    public static class Click {

        public static void Search_Box(String AppNumber) {
            Msg.Info("Enter the Application number in the 'Search_Box' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys(AppNumber);
            Msg.Done();
        }


        public static void Group_Advanced_Filtering() {
            Msg.Info("Click the 'Advanced Filtering' button");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 8);

            if (wait.until(ExpectedConditions.presenceOfElementLocated(By.id("groupTaskAdvanceSearchChk2Id"))).isSelected()) {
                Msg.Info("Advanced Filtering is Selected");
            } else {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("groupTaskAdvanceSearchChk2Id"))).click();

            }

            Msg.Done();
        }

        public static void MyTask_Advanced_Filtering() {
            Msg.Info("Click the 'Advanced Filtering' button");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 8);


            if (wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myTaskAdvanceSearchChk2Id"))).isSelected()) {
                Msg.Info("Advanced Filtering is Selected");
                Msg.Done();
            } else {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myTaskAdvanceSearchChk2Id"))).click();

            }

            Msg.Done();
        }
    }

}
