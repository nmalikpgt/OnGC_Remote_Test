package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;

import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class First_Nations {
    public static class First_Nations_Details {
        public static class Click {

            public static void Fort_Nelson_First_Nation () {

                Msg.Info("Click on  'Fort Nelson First Nation'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"appFrmId:t8FnConsultationAcdPnlId\"]//td[contains(text(),'Fort Nelson First Nation')]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:0:categoryTypeCodeSlctId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:0:categoryTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:0:criteriaReferenceCodeSlctId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:0:criteriaReferenceCodeSlctId_panel\"]/div/ul/li[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:t8FnConsultationAcdPnlId:0:consultationDescInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing " +
                        "elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec," +
                        " pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet ");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }



            public static void Acho_Dene_Koe_First_Nation () {

                Msg.Info("Click on  'Acho Dene Koe First Nation'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
               wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:nonT8FnConsultationAcdPnlId:0:nonT8FnConsultationTabId_header\"]/table/tbody/tr/td"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nonT8FnConsultationAcdPnlId:0:consultationDescInTxtId"))).sendKeys("Consultation level will be determined upon review by Commission staff.:");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }




            public static void Daylu_Dena_Council () {

                Msg.Info("Click on  'Daylu Dena Council'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"appFrmId:nonT8FnConsultationOutPnlId\"]//td[contains(text(),'Daylu Dena Council')]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nonT8FnConsultationAcdPnlId:0:consultationDescInTxtId"))).sendKeys("Consultation level will be determined upon review by Commission staff.:");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done(); }
            public static void Gitxsan_Hereditary_Chiefs_GDC () {

                Msg.Info("Click on  'Gitxsan Hereditary Chiefs (GDC)'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:nonT8FnConsultationAcdPnlId\"]/h3/a/table/tbody/tr/td"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nonT8FnConsultationAcdPnlId:0:consultationDescInTxtId"))).sendKeys("Consultation level will be determined upon review by Commission staff.:");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }

            public static void Kaska_Dena_Council () {
                  Crd_Conditions_Advisory.Click.Scrolldown();
                Msg.Info("Click on  'Kaska Dena Council'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"appFrmId:nonT8FnConsultationOutPnlId\"]//td[contains(text(),'Kaska Dena Council')]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nonT8FnConsultationAcdPnlId:1:consultationDescInTxtId"))).sendKeys("Consultation level will be determined upon review by Commission staff...");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();  }
            public static void Liard_First_Nation () {

                Msg.Info("Click on  'Liard First Nation'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"appFrmId:nonT8FnConsultationOutPnlId\"]//td[contains(text(),'Liard First Nation')]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nonT8FnConsultationAcdPnlId:2:consultationDescInTxtId"))).sendKeys("Consultation level will be determined upon review by Commission staff...");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done(); }
        }


        public static class Upload_File {

            public static void First_Nations_Project_Description_Form() {
                Msg.Info(" Upload the  Attachment 'First Nations Project Description Form:'");
               Browser.Sleep(Browser.Mill_Sec());

                  WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fnProjectFormBtnId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fnProjectFormBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fnProjectFormDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

                Msg.Done();

            }

        }

        public static void Non_T8_First_Nations(String  Enter) {
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
            WebElement table= Browser.driver.findElement(By.id("appFrmId:nonT8FnConsultationOutPnlId"));
            List<WebElement> Non_FirstNation = table.findElements(By.xpath("//div[@role=\"tab\"]/table/tbody/tr/td"));
            Msg.Info("Click on  all the  'Non T8 First Nations and Enter 'Consultation level will be determined upon review by Commission staff.:Description:' ");
            for (WebElement count : Non_FirstNation) {
                count.click();
                Browser.Sleep(500);
                  Crd_Conditions_Advisory.Click.Scrolldown();
        }
           Browser.Sleep(Browser.Mill_Sec());

            List<WebElement> Description = table.findElements(By.xpath("//textarea[contains(@id,'consultationDescInTxtId')]"));
            for (WebElement count : Description) {
                count.sendKeys(Enter);
                Browser.Sleep(500);
            }
        }

        public static void Consultation_Category_First_Nations(String  number ) {
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
              WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:"+number+":categoryTypeCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:"+number+":categoryTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:"+number+":criteriaReferenceCodeSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:t8FnConsultationAcdPnlId:"+number+":criteriaReferenceCodeSlctId_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());

            }
        }

    }

