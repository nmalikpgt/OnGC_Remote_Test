package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Administrative {



    public static class Administrative_Details {
        public static class Who_are_the_representatives_for_this_project {

            public static void  Company(String Entertext) {

                Msg.Info("Click on the '  Company' link");

               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByCompanyRdoBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newCompanyInTxtId_input"))).sendKeys(Entertext);
                Msg.Done();
            }
            public static void Contact_Archaeologist(String Entertext) {

                Msg.Info("Click on the 'Contact' link And Enter  Archaeologist Details");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newPersonInTxtId_input"))).sendKeys(Entertext);
               Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId']/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId_panel']/div/ul/li[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newContractorDescInTxtId"))).sendKeys("Description here ...");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newHcaPermitNumberInTxtId"))).sendKeys("1");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:addContractorBtnId"))).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                    Msg.Done();

            }
            public static void Contact_Drilling_Engineer(String Entertext) {

                Msg.Info("Click on the 'Contact' link And Enter  Drilling Engineer Details");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newPersonInTxtId_input"))).sendKeys(Entertext);
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId']/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId_panel']/div/ul/li[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newContractorDescInTxtId"))).sendKeys("Description here ...");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:addContractorBtnId"))).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Msg.Done();

            }
            public static void Contact_Environmental_Specialist(String Entertext) {

                Msg.Info("Click on the 'Contact' link  And Enter  Environmental Specialist Details");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newPersonInTxtId_input"))).sendKeys(Entertext);
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId']/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId_panel']/div/ul/li[4]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newContractorDescInTxtId"))).sendKeys("Description here ...");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:addContractorBtnId"))).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                Msg.Done();

            }
            public static void Contact_Facility_Engineer(String Entertext) {

                Msg.Info("Click on the 'Contact' link And Enter  Facility Engineer Details");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();
                } catch (Exception e) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();

                }
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newPersonInTxtId_input"))).sendKeys(Entertext);
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[4]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId']/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId_panel']/div/ul/li[5]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newContractorDescInTxtId"))).sendKeys("Description here ...");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:addContractorBtnId"))).click();
                Msg.Done();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            }

            public static void Contact_Pipeline_Engineer(String Entertext) {

                Msg.Info("Click on the 'Contact' link And Enter  Pipeline Engineer Details");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newPersonInTxtId_input"))).sendKeys(Entertext);
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId']/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId_panel']/div/ul/li[8]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newContractorDescInTxtId"))).sendKeys("Description here ...");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:addContractorBtnId"))).click();
                Msg.Done();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            }

            public static void Contact_Land_Agent(String Entertext) {

                Msg.Info("Click on the 'Contact' link And Enter  Land_Agent Engineer Details");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newPersonInTxtId_input"))).sendKeys(Entertext);
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[6]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId']/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='appFrmId:newContractorTypeCodeSlctId_panel']/div/ul/li[6]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newContractorDescInTxtId"))).sendKeys("Description here ...");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:addContractorBtnId"))).click();
                Msg.Done();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            }



            public static void Contacts( String Entertext, String Text1 ) {

                Msg.Info("Click on the 'Contact' link ");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:contractorByPersonRdoBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:newPersonInTxtId_input"))).sendKeys(Entertext);
               Browser.Sleep(Browser.Mill_Sec());

                if(Text1.equals("1")) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[1]"))).click();
                    Msg.Done();
                }
                if(Text1.equals("2")) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[2]"))).click();
                    Msg.Done();
                }
                if(Text1.equals("3")) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[3]"))).click();
                    Msg.Done();
                }
                if(Text1.equals("4")) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[4]"))).click();
                    Msg.Done();
                }
                if(Text1.equals("5")) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newPersonInTxtId_panel\"]/table/tbody/tr[5]"))).click();
                    Msg.Done();
                }
            }
        }
    }

}
