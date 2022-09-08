package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Create_Application {

    public static String Application_Number() {

        Msg.Info("Enter on the 'Application Number' ");
        Browser.Sleep(Browser.Mill_Sec());
       String Appnum= Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:applicationNumberOutTxtId"))).getText();
        Msg.Done();

        System.out.println(Appnum);

        return Appnum;
    }

    public static void Application_Description() {

        Msg.Info("Enter on the 'Application Description' ");
      Browser.Sleep(Browser.Mill_Sec());
        Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:applicationDescriptionInTxtId"))).sendKeys("done with selenium 2.0");
        Msg.Done();
    }


    public static void Application_Rationale() {

        Msg.Info("Enter on the 'Application Rationale' ");
      Browser.Sleep(Browser.Mill_Sec());
        Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:applicationRationaleTxtId"))).sendKeys("done with selenium 2.0");
        Msg.Done();
    }


    public static class Link {

        public static void New_CIA() {
            Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' New Commission Initiated Amendment' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationTypeSlctTxtId\"]/div[2]/ul/li/span"))).click();
            Msg.Done();
        }

        public static void New_OGAA() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' New OGAA' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationTypeSlctTxtId\"]/div[2]/ul/li[1]/span"))).click();
            Msg.Done();
        }
        public static void New_NEB_Related() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the '  New NEB Related' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationTypeSlctTxtId\"]/div[2]/ul/li[2]/span"))).click();
            Msg.Done();
        }
        public static void Amendment() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the 'Amendment' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationTypeSlctTxtId\"]/div[2]/ul/li[3]/span"))).click();
            Msg.Done();
        }
        public static void Historical_Submission() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Historical Submission' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationTypeSlctTxtId\"]/div[2]/ul/li[4]/span"))).click();
            Msg.Done();
        }
        public static void ALR_Assessment() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' ALR Assessment' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationTypeSlctTxtId\"]/div[2]/ul/li[5]/span"))).click();
            Msg.Done();
        }

        public static void  Forest_Act() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Forest Act' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:applicationTypeSlctTxtId\"]/div[2]/ul/li[6]/span"))).click();
            Msg.Done();
        }

    }

    public static class NewOGAA {

        public static class Activites {

            public static void All_Activies() {

                Actions builder = new Actions(Browser.driver);
                builder.keyDown(Keys.CONTROL).perform();
                Msg.Info("Click on the 'NEB All Activites' link");

              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Associated Oil and Gas Activity')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Changes In and About a Stream')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Facility')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Geophysical')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Pipeline')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Road')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Short Term Water Use (POD)')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Well')]"))).click();
                builder.keyUp(Keys.CONTROL).perform();
                Msg.Done();
            }


            public static void Associated_Oil_and_Gas_Activity() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the ' Associated Oil and Gas Activity' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Associated Oil and Gas Activity')]"))).click();
                Msg.Done();
            }

            public static void Changes_In_and_About_a_Stream() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Changes In and About a Stream' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Changes In and About a Stream')]"))).click();
                Msg.Done();
            }
            public static void Facility() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Facility' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Facility')]"))).click();
                Msg.Done();
            }
            public static void Geophysical() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Geophysical' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Geophysical')]"))).click();
                Msg.Done();
            }
            public static void Pipeline() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Pipeline' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Pipeline')]"))).click();
                Msg.Done();
            }
            public static void Road() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Road' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Road')]"))).click();
                Msg.Done();
            }
            public static void Short_Term_Water_Use_POD() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Short Term Water Use (POD)' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Short Term Water Use (POD)')]"))).click();
                Msg.Done();
            }
            public static void Well() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Well' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Well')]"))).click();
                Msg.Done();
            }
        }
    }
    public static class New_NEB_Related {

        public static class Activites {

            public static void All_Activies() {
                Actions builder = new Actions(Browser.driver);
                builder.keyDown(Keys.CONTROL).perform();
                Msg.Info("Click on the 'NEB All Activites' link");
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Changes In and About a Stream')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'NEB Related Ancillary')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Pipeline Right of Way')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Road Right of Way')]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Short Term Water Use (POD)')]"))).click();
                builder.keyUp(Keys.CONTROL).perform();
                Msg.Done();
            }

            public static void NEB_Related_Ancillary() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'NEB Related Ancillary' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'NEB Related Ancillary')]"))).click();
                Msg.Done();
            }

            public static void Changes_In_and_About_a_Stream() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Changes In and About a Stream' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Changes In and About a Stream')]"))).click();
                Msg.Done();
            }
            public static void Pipeline_Right_of_Way() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Pipeline Right of Way' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Pipeline Right of Way')]"))).click();
                Msg.Done();
            }
            public static void Road_Right_of_Way() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Road Right of Way' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Road Right of Way')]"))).click();
                Msg.Done();
            }
            public static void Short_Term_Water_Use_POD() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Short Term Water Use (POD)' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Short Term Water Use (POD)')]"))).click();
                Msg.Done();
            }
        }
    }

    public static class Historical_Submission {

        public static class Activites {

            public static void Facility() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Facility' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Facility')]"))).click();
                Msg.Done();
            }
            public static void Pipeline() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Pipeline' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Pipeline')]"))).click();
                Msg.Done();
            }
            public static void Road() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Road' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Road')]"))).click();
                Msg.Done();
            }
            public static void Activity_ID	(String Enter) {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Activity ID' ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:amdInputByAuthActNumRdoBtnId"))).click();
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:authorizedActivityNumberInTxtId"))).sendKeys(Enter);
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:retrieveAmendDetailBtnId"))).click();
                Msg.Done();
            }
        }
    }


    public static class ALR_Assessment {

        public static class Activites {

            public static void Associated_Oil_and_Gas_Activity() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Associated Oil and Gas Activity' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Associated Oil and Gas Activity')]"))).click();
                Msg.Done();
            }
        }
    }

       public static class Forest_Act {

        public static class Activites {

            public static void Cutting_Permit() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Cutting Permit' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Cutting Permit')]"))).click();
                Msg.Done();
            }
        }
    }
    public static class Amendment {

        public static class Enter {

            public static void Application_Determination_Number	(String Enter) {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Application Determination Number' ");

                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:amdInputByAdNumRdoBtnId\"]/div[2]/span"))).click();
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:approvalNumberInTxtId"))).sendKeys(Enter);
                Msg.Done();
            }
            public static void Legacy_OGC_File_Number	(String Enter) {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Legacy OGC File Number' ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:amdInputByLgOgcNumRdoBtnId"))).click();
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:legacyOgcNumberInTxtId"))).sendKeys(Enter);
                Msg.Done();
            }

            public static void Amendment_Activity_ID_FACID	(String Enter) {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Activity ID' ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:amdInputByAuthActNumRdoBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId\"]/div[3]/span"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId_panel\"]/div/ul/li[3]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:authorizedActivityNumberInTxtId"))).sendKeys(Enter);
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:retrieveAmendDetailBtnId"))).click();
                Msg.Done();
            }
            public static void Amendment_Activity_ID_Geophysical_Program (String Enter) {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Activity ID' ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:amdInputByAuthActNumRdoBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId\"]/div[3]/span"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId_panel\"]/div/ul/li[4]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:authorizedActivityNumberInTxtId"))).sendKeys(Enter);
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:retrieveAmendDetailBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:selectAmendActivitySlctTxtId\"]/div[2]/ul/li"))).click();
                Msg.Done();
                Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newActivityTypeSlctTxtId\"]/div[2]/ul/li[1]"))).click();
                Msg.Done();
            }
            public static void Amendment_Activity_ID_PipelineProject (String Enter) {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Activity ID' ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:amdInputByAuthActNumRdoBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId\"]/div[3]/span"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId_panel\"]/div/ul/li[5]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:authorizedActivityNumberInTxtId"))).sendKeys(Enter);
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:retrieveAmendDetailBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:selectAmendActivitySlctTxtId\"]/div[2]/ul/li[1]"))).click();
                Msg.Done();
            }
            public static void Amendment_Activity_ID_WA (String Enter) {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Activity ID' For WA#");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:amdInputByAuthActNumRdoBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId\"]/div[3]/span"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:authorizedActivityTypeSlctId_panel\"]/div/ul/li[8]"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:authorizedActivityNumberInTxtId"))).sendKeys(Enter);
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:retrieveAmendDetailBtnId"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:selectAmendActivitySlctTxtId\"]/div[2]/ul/li[1]"))).click();
                Msg.Done();
            }
            public static void Permitted_Activities() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Enter on the 'Legacy OGC File Number' ");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:selectAmendActivitySlctTxtId\"]/div[2]/ul/li[1]"))).click();

                Msg.Done();
            }


        }
    }

    public static class Select_Proponent {

            public static void Who_is_the_Project_Proponent() {
              Browser.Sleep(Browser.Mill_Sec());
                Msg.Info("Click on the 'Who is the Project Proponent?' link");
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:proponentInTxtId\"]/button"))).click();
              Browser.Sleep(Browser.Mill_Sec());
                //Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-item-label=\"ARC Resources Ltd.\"]"))).click();
                Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-item-label=\"PETRONAS Energy Canada Ltd.\"]"))).click();


                Msg.Done();
            }
    }
    public static class Click {

        public static void Create_Application() {
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Create Application' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:createAppBtnId"))).click();
            Msg.Done();
        }
        public static void Next() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Next' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:apeNextBtnId"))).click();
            Msg.Done();
        }
        public static void Amendment_Next_Page1() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Amendment Next' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:apeSelectAmendActivityNextBtnId"))).click();
            Msg.Done();
        }
        public static void Road_Next_Page1() {
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Amendment Next' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:apeSelectAmendTypeNextBtnId"))).click();
            Msg.Done();
        }
        public static void ForestoryNext() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Amendment Next' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:forestActApeSelectAmendActivityNextBtnId"))).click();
            Msg.Done();
        }
        public static void Amendment_Next_Page2() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Amendment Next' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:apeSelectAmendTypeNextBtnId"))).click();
            Msg.Done();
        }
        public static void Amendment_Land() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Amendment_Land' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:selectAmendTypeDtaTblId:0:landReivewChkId"))).click();
            Msg.Done();
        }
        public static void Technical() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Technical' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:selectAmendTypeDtaTblId:0:techReivewChkId"))).click();
            Msg.Done();
        }
        public static void FACID_00018790() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' FACID_00018790' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:selectAmendActivitySlctTxtId\"]/div[2]/ul/li[2]"))).click();
            Msg.Done();
            Browser.Sleep(Browser.Mill_Sec());
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newActivityTypeSlctTxtId\"]/div[2]/ul/li[1]"))).click();
            Msg.Done();
        }
        public static void FACID_00019456() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' FACID_00019456' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:selectAmendActivitySlctTxtId\"]/div[2]/ul/li"))).click();
            Msg.Done();
        }
        public static void Pipeline_Project_000007073() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Pipeline_Project_000007073");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:selectAmendActivitySlctTxtId\"]/div[2]/ul/li"))).click();
            Msg.Done();
        }
        public static void Road_Project_03255() {
           Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Road_Project_03255");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:newActivityTypeSlctTxtId\"]/div[2]/ul/li"))).click();
            Msg.Done();
        }
        public static void 	I_agree() {
          Browser.Sleep(Browser.Mill_Sec());
            Msg.Info("Click on the ' Technical' link");
            Browser.wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:agreeSlctBoxId"))).click();
            Msg.Done();
        }

    }


}
