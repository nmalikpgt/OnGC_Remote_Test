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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Crd_Conditions_Advisory {

    public static void Java_script_executor(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
        executor.executeScript("arguments[0].click();", element);


    }

    public static void Java_script_executor_Send_Keys(WebElement element,String Enter) {
        JavascriptExecutor js = (JavascriptExecutor)Browser.driver;

        js.executeScript("arguments[0].value='"+Enter+"';", element);

    }


    public static class Click {


        public static void Condition() {
            Msg.Info("Select 'No Conditions have been entered for this review task");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("addConditions"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("conditionsTxtArea0"))).sendKeys("Testing 123......");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("selectConditionsActivity0"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkAllBtnId"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("addAppActSelBtnId"))).click();
            Msg.Done();
        }

        public static void Advisory_Guidanc() {
            Msg.Info("Select 'No Advisory Guidance have been entered for this review task");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("addAdvisoryGuidanceLnkId"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("advisoryGuidanceTxtArea0"))).sendKeys("Testing 123......");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("selectAdvisoryGuidanceActivityType0"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkAllBtnId"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("addAdvGuidanceActBtnId"))).click();
            Msg.Done();
        }

        public static class Conditions {

            public static void Add_Standard_Conditon() {
                Msg.Info("Select 'Add Standard Condition");
                Msg.Done();
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();


                Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();

                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Standard Condition')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
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

            public static void SDM_Add_Conditon() {
                Msg.Info("Select 'Add Standard Condition");
                Msg.Done();
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();


                Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();

                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Condition')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
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
                Msg.Info("Select 'Add Custom Condition");
                WebDriverWait wait = new WebDriverWait(Browser.driver, 100);
                Actions mouse = new Actions(Browser.driver);

                Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();
                //     mouse.click( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Custom Condition')]//parent::a")))).build().perform();

                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Custom Condition')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
                executor.executeScript("arguments[0].click();", element);
                Browser.Sleep(Browser.Mill_Sec());


                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@frameborder='0']")));
                int size = Browser.driver.findElements(By.tagName("iframe")).size();

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
                Click.Scrolldown();


                Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();

                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Standard Advisory Guidance')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
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


            public static void SDM_Add_Advisory_Guidance_Condition() {
                Msg.Info("Select 'Add Standard Condition");
                Msg.Done();
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();

                Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();

                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Advisory Guidance')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
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


            public static void Add_Custom_Advisory_Guidance_Condition() {

                WebDriverWait wait = new WebDriverWait(Browser.driver, 100);

                Actions mouse = new Actions(Browser.driver);

                Browser.Sleep(Browser.Mill_Sec());

                  Crd_Conditions_Advisory.Click.Scrolldown();

                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Custom Advisory Guidance')]//parent::a")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
                executor.executeScript("arguments[0].click();", element);


                Browser.Sleep(Browser.Mill_Sec());
                int size = Browser.driver.findElements(By.tagName("iframe")).size();

                System.out.println(size);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@frameborder='0']")));

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


        public static void Custom_Agriculture_Edit_Highlited() {

            try {
                Msg.Info("'Select on Agriculture Highlighted yellow And edit Required text ' ");

                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Date of Permission}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-datepicker-popup=\"MMMM dd, yyyy\"]"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-datepicker-popup='MMMM dd, yyyy']//following-sibling::ul//child::li[2]//following-sibling::span//*[@ng-click=\"select('today')\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Use of Area}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='Use of Area']//option[@label=\"of completion of pipeline construction,\"]"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Msg.Done();
        }

        public static void Custom_Land_Edit_Highlited() {
            try {
                Msg.Info("'Select on Land Highlighted yellow And edit Required text For Metres of Line Shift Variance' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);

                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Metres of Line Shift Variance}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));

                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Metres of Line Shift Variance\"]"))).sendKeys("230");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                Msg.Done();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void FN_Edit_Highlited() {
            try {

                Msg.Info("'Select on FN Highlighted yellow And edit Required text For {From Month Day}{From Month Day}{H2S%}' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taskClauseTable\"]/tr[1]/td[8]/span/a"))).click();
                Browser.Sleep(Browser.Mill_Sec());

                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, 0);
                Date today1 = calendar.getTime();
                DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
                String todayA = dateFormat1.format(today1);

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-datepicker-popup='MMMM dd']"))).sendKeys(todayA);
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"H2S%\"]"))).sendKeys("23");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();

                Msg.Done();


            } catch (Exception e) {

            }
        }


        public static void Advisory_SDM_Edit_Highlited() {

            try {
                Msg.Info("'Select on  Highlighted yellow And edit Required text for Flaring.pdf Number' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Arch permit number}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Arch permit number\"]"))).sendKeys("2305");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                Msg.Done();
            } catch (Exception e) {
                System.out.println("No");
            }
        }

        public static void OGAA_Water_Course_Edit_Highlited() {
            Msg.Info("'Select on  Highlighted yellow And edit Required text for Flaring.pdf Number' ");
            Browser.Sleep(Browser.Mill_Sec());

            WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
            try {
                  Crd_Conditions_Advisory.Click.Scrolldown();
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Reduced Risk Work Windows}']//ancestor::td//following-sibling::td[3]/child::a//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Reduced Risk Work Windows\"]//option[@label='Lower Mainland - Reduced Risk Work Windows']"))).click();

                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
            } catch (Exception e) {
                System.out.println("No");
            }

            Msg.Done();

        }

        public static void Custom_NEB_Land_Edit_Highlited() {
            try {
                Msg.Info("'Select on  Highlighted yellow And edit Required text for Map Reserve Number' ");
                Browser.Sleep(2000);
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Click.Scrolldown();
                List<WebElement> Input1 = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='{Map Reserve Number}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]")));
                Browser.Sleep(Browser.Mill_Sec());

                for (int i = 0; i < Input1.size(); i++) {
                    Browser.Sleep(Browser.Mill_Sec());
                    Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='{Map Reserve Number}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));

                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Map Reserve Number\"]"))).sendKeys("2300000");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                }
                Msg.Done();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Scrolldown() {
            Browser.Sleep(1500);
            ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }


        public static void Custom_Pipeline_Edit_Highlited() {
            try {
                Msg.Info("'Select on Pipeline Highlighted yellow And edit Required text ' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Location}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Location\"]"))).sendKeys("123");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"MOP kPa\"]"))).sendKeys("23.5");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"H2S mol%\"]"))).sendKeys("23.5");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                Msg.Done();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void SDMCustom_Pipeline_Edit_Highlited() {
            try {
                Msg.Info("'Select on Pipeline Highlighted yellow And edit Required text ' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taskClauseTable\"]/tr[2]/td[8]/span/a"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"List Appropriate Equipment\"]"))).sendKeys("123");
                Browser.Sleep(Browser.Mill_Sec());
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"H2S mol%\"]"))).sendKeys("23.5");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                Msg.Done();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static void Custom_Borden_numbers_Edit_Highlited() {
            Msg.Info("'Select on Borden numbers Highlighted yellow And edit Required text ' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
            try {
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Borden numbers}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
            } catch (Exception e) {
                e.printStackTrace();
            }
            WebDriverWait wait1 = new WebDriverWait(Browser.driver, 5);
            try {

                wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Borden Numbers\"]"))).sendKeys("230");
            } catch (Exception e) {
                wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Borden numbers\"]"))).sendKeys("230");
            }

            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
            Msg.Done();
        }

        public static void Dam_NAme_Edit_Highlited() {

            try {
                Msg.Info("'Select on Dam Name Highlighted yellow And edit Required text ' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);

                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Dam Name}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Dam Name\"]"))).sendKeys("WAC Bennet");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                Msg.Done();


            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        public static void Forest_District_Table() {
            try {

                Msg.Info("'Select on Forestry Highlighted yellow And edit Required text ' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                Actions mouse = new Actions(Browser.driver);
                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Forest District Table}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Forest District Table\"]"))).click();

                mouse.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();

                Msg.Done();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        public static void Custom_DP_Engineering_Edit_Highlited() {

            try {
                Msg.Info("'Select on D&P Engineering Highlighted yellow And edit Required text ' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();

                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{Surface Casing Depth m}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Surface Casing Depth m\"]"))).sendKeys("235");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"Bedrock Depth m\"]"))).sendKeys("23");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                Msg.Done();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Facility() {
            try {
                Msg.Info("'Select on Facility And edit Required text ' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();

                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='{List Appropriate Equipment}']//ancestor::td//following-sibling::td[3]/child::a[2]//following-sibling::span//a[@data-tooltip=\"Edit Variable Data\"]"))));
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"List Appropriate Equipment\"]"))).sendKeys("235");
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-ng-click='update();']"))).click();
                Msg.Done();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        public static void Save() {
            Msg.Info("'Select on Actions 'Save:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rfSaveDataLnkId"))).click();
            Msg.Done();
        }

        public static void Continue() {
            Msg.Info("'Select on Actions 'Continue:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"goAhead()\"]"))).click();
            Msg.Done();
        }

        public static void Cancel() {
            Msg.Info("'Select on Actions 'Cancel:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-ng-click=\"cancel()\"]"))).click();
            Msg.Done();
        }

        public static void Withdraw_Application() {
            Msg.Info("'Select on Actions 'Withdraw_Application:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("applicationRevNumberLnkId"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("withdrawApplicationLnk"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=\"Enter reason here\"]"))).sendKeys("Test123....");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cancelWithdrawApplicationLnkId"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Done();
        }

        public static void Complete_Task() {
            Msg.Info("'Select on Actions 'Complete Task:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Save"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Complete Task"))).click();
            Msg.Done();
        }

    }

}
