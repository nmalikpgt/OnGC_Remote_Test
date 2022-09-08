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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Short_Term_Water_Use_POD_Overview {


    public static void Year_One_Volume_lake(String Year_OneVolume ) {
        Msg.Info("Enter the  message For 'Year One Volume'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:yearOneVolumeInTxtId"))).sendKeys(Year_OneVolume);
        Msg.Done();
    }

    public static void Year_One_Volume_Stream(String Year_OneVolume ) {
        Msg.Info("Enter the  message For 'Year One Volume'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:srYearOneVolumeInTxtId"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:srYearOneVolumeInTxtId"))).sendKeys(Year_OneVolume);
        Msg.Done();
    }

    public static void Year_Two_Volume_Stream(String Year_twoVolume ) {
        Msg.Info("Enter the  message For 'Year Two Volume'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:srYearTwoVolumeInTxtId"))).sendKeys(Year_twoVolume);
        Msg.Done();
    }

    public static void Year_Two_Volume_Water(String Year_twoVolume ) {
        Msg.Info("Enter the  message For 'Year Two Volume'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wYearTwoVolumeInTxtId"))).sendKeys(Year_twoVolume);
        Msg.Done();
    }


    public static void Year_Two_Volume_lake(String Year_twoVolume ) {
        Msg.Info("Enter the  message For 'Year Two Volume'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:yearTwoVolumeInTxtId"))).sendKeys(Year_twoVolume);
        Msg.Done();
    }
    public static void Proposed_Volume_Day_lake(String ProposedVolume_Day) {
        Msg.Info("Enter the  message For 'Proposed Volume/Day'");
       Browser.Sleep(Browser.Mill_Sec());
          Crd_Conditions_Advisory.Click.Scrolldown();
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
       Crd_Conditions_Advisory.Java_script_executor( wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:proposedVolDayInTxtId_input"))));
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proposedVolDayInTxtId_input"))).clear();
        new Actions(Browser.driver).moveToElement( wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:proposedVolDayInTxtId_input")))).sendKeys(ProposedVolume_Day).build().perform();
        try {  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proposedVolDayInTxtId_input"))).clear();

        Crd_Conditions_Advisory.Java_script_executor_Send_Keys(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proposedVolDayInTxtId_input"))),ProposedVolume_Day);
    } catch (Exception e) {
        e.printStackTrace();
    }
        Msg.Done();
    }


    public static void Proposed_Volume_Day_Stream(String ProposedVolume_Day) {
        Msg.Info("Enter the  message For 'Proposed Volume/Day'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
          Crd_Conditions_Advisory.Click.Scrolldown();
        Crd_Conditions_Advisory.Java_script_executor( wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='appFrmId:strmProposedVolDayInTxtId_input']"))));
       Browser.Sleep(Browser.Mill_Sec());


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='appFrmId:strmProposedVolDayInTxtId_input']"))).clear();
            Crd_Conditions_Advisory.Java_script_executor_Send_Keys(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='appFrmId:strmProposedVolDayInTxtId_input']"))),ProposedVolume_Day);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='appFrmId:strmProposedVolDayInTxtId_input']"))).clear();
        Crd_Conditions_Advisory.Java_script_executor_Send_Keys(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='appFrmId:strmProposedVolDayInTxtId_input']"))),ProposedVolume_Day);



        Msg.Done();
    }







    public static void Proposed_Completion_Date_Custmoize(int Number_of_Days) {
        Msg.Info("Enter the Date 'Proposed Completion Date More than 12 Months to Generate year volume 2'");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, Number_of_Days);
        Date today1 = calendar.getTime();
        DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
        String todayA = dateFormat1.format(today1);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:costructionCmpltnDateId_input"))).sendKeys(todayA);
        Msg.Done();
    }



      public static void Proposed_Completion_Date() {
          Msg.Info("Enter the Date 'Proposed Completion Date'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();

          Calendar calendar = Calendar.getInstance();
          calendar.add(Calendar.DAY_OF_YEAR, 2);
          Date today1 = calendar.getTime();
          DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
          String todayA = dateFormat1.format(today1);
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:costructionCmpltnDateId_input"))).sendKeys(todayA);
          Msg.Done();
      }
      public static void Proposed_Start_Date() {
          Msg.Info("Enter the Date 'Proposed Start Date'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();


          Calendar calendar = Calendar.getInstance();
          calendar.add(Calendar.DAY_OF_YEAR, 1);
          Date today1 = calendar.getTime();
          DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
          String todayA = dateFormat1.format(today1);

          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:costructionStartDateId_input"))).sendKeys(todayA);
          Msg.Done();
      }
        public static void Activity_Description() {
            Msg.Info("Enter the  message For 'Activity Description'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescInTxtId"))).sendKeys("Activity Description here ...");
            Msg.Done();
        }
    public static void Please_provide_a_rationale() {
        Msg.Info("Enter the  message For 'Please provide a rationale'");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:podVerificationRationaleInTxtId"))).sendKeys("Please provide a rationale here ...");
        Msg.Done();
    }

    public static class POD_001 {
        public static class Stream_River_POD_001 {
            public static void Purpose() {
                Msg.Info("Click on  the  'Purpose'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:srPurposeWaterCodeSlctId_label\"]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:srPurposeWaterCodeSlctId_panel\"]/div/ul/li[3]"))).click();
                Msg.Done();
            }

            public static void Activity_Description() {
                Msg.Info("Enter the  message For 'Activity Description'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescriptionInTxtId"))).sendKeys("Activity Description here ...");
                Msg.Done();
            }


            public static void Proposed_Start_Date() {
                Msg.Info("Enter the Date 'Proposed Start Date'");
               Browser.Sleep(Browser.Mill_Sec());
                  WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:costructionStartDateId_input"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("2"))).click();
                Msg.Done();
            }
        }
    }


  public static class Upload_Document{

      public static void Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection() {
          Msg.Info(" Upload the  Attachment 'Proposed Volume >200m³/day or >10,000m³/year per diversion point or the purpose is for Oil Field Injection:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();

          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:strmRvrWtrSupplyDmndAnlyDocUploadBtnId")));
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:strmRvrWtrSupplyDmndAnlyDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:strmRvrUploadWtrSupplyDmndAnlyDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          UpLoad_File();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();
      }

      public static void Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection2() {
          Msg.Info(" Upload the  Attachment 'Proposed Volume >200m³/day or >10,000m³/year per diversion point or the purpose is for Oil Field Injection:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:strmRvrWtrSupplyDmndAnlyDocUploadBtnId")));
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:strmRvrWtrSupplyDmndAnlyDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:strmRvrUploadWtrSupplyDmndAnlyDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:strmRvrUploadWtrSupplyDmndAnlyDocIdFileUploadId\"]/div[1]/button[1]/span[2]"))).click();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();
      }



           public static void Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection_WaterSupply() {
          Msg.Info(" Upload the  Attachment 'Proposed Volume >200m³/day or >10,000m³/year per diversion point or the purpose is for Oil Field Injection:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();

          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:lkPndWtrSupplyDmndAnlyDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:lkPndUploadWtrSupplyDmndAnlyDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          UpLoad_File();
            Crd_Conditions_Advisory.Click.Scrolldown();
               EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();
      }

      public static void Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection_WaterSupply2() {
          Msg.Info(" Upload the  Attachment 'Proposed Volume >200m³/day or >10,000m³/year per diversion point or the purpose is for Oil Field Injection:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:lkPndWtrSupplyDmndAnlyDocUploadBtnId")));
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:lkPndWtrSupplyDmndAnlyDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:lkPndUploadWtrSupplyDmndAnlyDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:lkPndUploadWtrSupplyDmndAnlyDocIdFileUploadId\"]/div[1]/button[1]/span[2]"))).click();
            Crd_Conditions_Advisory.Click.Scrolldown();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();
      }


      public static void Lake_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land() {
          Msg.Info(" Upload the  Attachment 'Lake Are temporary works required for distribution of fresh water on Crown land?:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:lkPndWtrTempWorksDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:lkPndWtrTempWorksDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          UpLoad_File();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();
      }
      public static void Stream_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land() {
          Msg.Info(" Upload the  Attachment 'Stream Are temporary works required for distribution of fresh water on Crown land?:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:srWaterSrcTempWorksDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:srWaterSrcTempWorksDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          UpLoad_File();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();
      }

      public static void Water_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land() {
          Msg.Info(" Upload the  Attachment 'Water Are temporary works required for distribution of fresh water on Crown land?:'");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:wdWaterSrcTempWorksDocUploadBtnId"))).click();
       EPM.Verify.Upload_pagedispaly();
          WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:swdWaterSrcTempWorksDocIdFileUploadId_input")));
          browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
          System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
         Browser.Sleep(Browser.Mill_Sec());
          UpLoad_File();
          EPM.Verify.Upload_page_display_Hidden();
          Msg.Done();
      }
  }


    public static class Click {
          public static void Point_of_Diversion_Details(){
            Msg.Info("Click on the Link 'Point of Diversion Details'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:podDtlTabId"))).click();
              Msg.Done();
        }
        public static void POD_002(){
            Msg.Info("Click on the Link 'POD_002'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 002\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void POD_003(){
            Msg.Info("Click on the Link 'POD_003'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 003\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void POD_004(){
            Msg.Info("Click on the Link 'POD_004'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 004\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void POD_005(){
            Msg.Info("Click on the Link 'POD_005'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 005\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void POD_006(){
            Msg.Info("Click on the Link 'POD_006'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-icon ui-icon-seek-next']"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void POD_007(){
            Msg.Info("Click on the Link 'POD_007' and Enter Name and Proposed Total Volume (m³):");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 007\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dugoutNameInTxtId"))).sendKeys("PGTS");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wYearOneVolumeInTxtId"))).sendKeys("12345");
            Msg.Done();
        }
        public static void POD_008(){
            Msg.Info("Click on the Link 'POD_008'and Enter Name and Proposed Total Volume (m³):");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 008\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dugoutNameInTxtId"))).sendKeys("PGTS");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wYearOneVolumeInTxtId"))).sendKeys("12345");
            Msg.Done();
        }
        public static void POD_009(){
            Msg.Info("Click on the Link 'POD_009'and Enter Name and Proposed Total Volume (m³):");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 009\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dugoutNameInTxtId"))).sendKeys("PGTS");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wYearOneVolumeInTxtId"))).sendKeys("12345");
            Msg.Done();
        }
        public static void POD_0010(){
            Msg.Info("Click on the Link 'POD_0010'and Enter Name and Proposed Total Volume (m³):");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"POD 010\")]//parent::a"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dugoutNameInTxtId"))).sendKeys("PGTS");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wYearOneVolumeInTxtId"))).sendKeys("12345");
            Msg.Done();
        }
        public static void Has_previous_approval_been_issued_for_the_water_withdrawal(){
            Msg.Info("CLICK ON THE Has previous approval been issued for the water withdrawal?'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:previousApprovalBtnId"))).click();
            Msg.Done();
        }
        public static void Has_previous_approval_been_issued_for_the_water_withdrawal(String enternumber){
            Msg.Info("CLICK ON THE Has previous approval been issued for the water withdrawal?'");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:previousOgcFileNumberInTxtId"))).sendKeys(enternumber);
            Msg.Done();
        }
        public static void Remove_Segment() {
            Msg.Info("Click on the 'Remove Segment' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:removeWaterSrcBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
            Msg.Done();
        }
        public static void Primary_Activity_Type_And_Fil_XREF_Numbe(String number) {
            Msg.Info("Click on the 'Primary Activity Type:And File XREF Numbe' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:prActivityTypeCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:prActivityTypeCodeSlctId_panel\"]/div/ul/li[3]"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fielXrefInTxtId"))).sendKeys(number);
            Msg.Done();
        }
    }





}



