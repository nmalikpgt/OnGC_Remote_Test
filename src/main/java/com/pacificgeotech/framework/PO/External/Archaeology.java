package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;
import static com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory.Java_script_executor;


import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Archaeology {
    public static class Archaeology_Details {
        public static class Administrative_Change_Only {

            public static void Administrative_Change_Brief_Desc_Rationale () {

                Msg.Info("Enter Message on  'Administrative Change Only'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:adminChangeBriefDescRationaleInTxtId"))).sendKeys("Administrative Change Brief Description:");
                Msg.Done(); }
            public static void Sources_to_identify_archaeological_potential () {

                Msg.Info("Enter Message on  'Sources to identify archaeological potential'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourcesToIdentifyPotentialInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
                Msg.Done();  }
            public static void Areas_containing_archaeological_potential () {

                Msg.Info("Enter Message on  'Areas_containing_archaeological_potential'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:specifyFactorsInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
                Msg.Done();  }
            public static void Other_Type_of_Assessment () {

                Msg.Info("Enter Message on  'Other Type of Assessment:'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:otherTypeOfAssessmentInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
                Msg.Done();  }
            public static void Brief_Site_Mitigation_Description () {

                Msg.Info("Enter Message on  'Brief Site Mitigation Description'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:siteMitigationDescInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
                Msg.Done();  }
            public static void Specify_factors_used_to_assess_potential () {

                Msg.Info("Enter Message on  'Specify factors used to assess potential:'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:specifyFactorsInTxtId"))).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a");
                Msg.Done(); }
            public static void Borden_Number_and_Distance () {

                Msg.Info("Enter Message on  'Borden Number and Distance:'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nonGeoArcBordenTOsDtaTblId:0:nonGeoBordenNumInTxtId"))).sendKeys("AaAa-1234");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nonGeoArcBordenTOsDtaTblId:0:nonGeoDistInTxtId_input"))).sendKeys("111.00");
                Msg.Done();
            }
            public static void Type_of_Field_Work_Completed() {
                Msg.Info("Click on the 'Type of Field Work Completed:' ");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();

                Java_script_executor(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:fieldWorkCompletedCodeId\"]/div[3]/span"))));

                Browser.Sleep(500);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:fieldWorkCompletedCodeId_panel\"]/div/ul/li[3]"))).click();
                Msg.Done();  }

            public static void Borden_Number () {

                Msg.Info("Enter Message on  'Borden Number'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:arcNonGeoBordenTOsDtaTblId:0:bordenNumberInTxtId"))).sendKeys("AaAa-1234");
                Msg.Done(); }
        }
    }

 public static class Upload_File {

     public static void Archaeology_Report_Attached() {
         Msg.Info(" Upload the  Attachment 'Archaeology Report Attached'");
        Browser.Sleep(Browser.Mill_Sec());
           WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
         wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:archReportDocUploadBtnId"))).click();
      EPM.Verify.Upload_pagedispaly();
         WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:archaeologyReportDocIdFileUploadId_input")));
         browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
         System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();


         Msg.Done();

     }

     public static void Mitigation_Approval_letter() {
         Msg.Info(" Upload the  Attachment 'Mitigation Approval letter'");
        Browser.Sleep(Browser.Mill_Sec());
           WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
         wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:aiaReportDocUploadBtnId"))).click();
      EPM.Verify.Upload_pagedispaly();
         WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:aiaReportDocIdFileUploadId_input")));
         browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
         System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

         Msg.Done();

     }
 }



    public static class Geophysical_Archaeology_Information {
        public static void All_Information() {
              Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("Enter all the Deatails for   'Geophysical Archaeology Information'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:geoFieldWorkCompletedCodeId\"]/div[3]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:geoFieldWorkCompletedCodeId_panel\"]/div/ul/li[2]"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:geoArcSiteTOsDtaTblId:0:geoArcBordenNumberInTxtId"))).sendKeys("AaAa-1234");
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:geoArcSiteTOsDtaTblId:0:geoArcFlaggingCompletedDateInTxtId_input"))).sendKeys("05-23-2019");
            Msg.Done();
        }
    }


 public static class Click {
     public static void Administrative_Change_Only() {
         Msg.Info("Click on  'Administrative Change Only'");
        Browser.Sleep(Browser.Mill_Sec());
         WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:adminChangeOnlyIndBtnId"))).click();
         Msg.Done(); }

     public static void Type_of_Field_Work_Completed_Click_Others() {
         Msg.Info("Click on  'Type of Field Work Completed: Select Others'");
        Browser.Sleep(Browser.Mill_Sec());
         WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fieldWorkCompletedCodeId_focus"))).click();
        Browser.Sleep(Browser.Mill_Sec());
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:fieldWorkCompletedCodeId_panel\"]/div/ul/li[3]"))).click();
         Msg.Done();
     }
 }




}
