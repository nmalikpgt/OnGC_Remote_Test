package com.pacificgeotech.framework.PO.Environments;


import com.pacificgeotech.framework.PO.External.EPM;
import com.pacificgeotech.framework.core.FileUpload;

import static com.pacificgeotech.framework.PO.Environments.Document_path.Shapefile;
import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;

import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Spatial_Data_Submission {









    public static class Shapefile_Projection{
        public static void UpLoad_File(){
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);

            Browser.Sleep(Browser.Mill_Sec());

            try {
                WebElement element=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class=\"ui-fileupload-upload ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left\" and @type=\"button\"]")));
                JavascriptExecutor executor = (JavascriptExecutor) Browser.driver;
                executor.executeScript("arguments[0].click();", element);
            } catch (Exception e) {

                new Actions(Browser.driver).moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-fileupload-upload\" and @type=\"button\"]")))).click().build().perform();

            }


        }
        public static void Nad_83_Utm_Zone_9 (){

            Msg.Info("Click 'Nad 83 Utm Zone 9' on the Shapefile_Projection Menu");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesProjectionSomId"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Nad 83 Utm Zone 9')]"))).click();
            Msg.Done();
        }
        public static void Nad_83_Utm_Zone_10 (){

            Msg.Info("Click 'Nad 83 Utm Zone 10' on the Shapefile_Projection Menu");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesProjectionSomId"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Nad 83 Utm Zone 10')]"))).click();
            Msg.Done();
        }
        public static void Nad_83_Utm_Zone_11 (){

            Msg.Info("Click 'Nad_83_Utm_Zone_11' on the Shapefile_Projection Menu");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesProjectionSomId"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Nad 83 Utm Zone 11')]"))).click();
            Msg.Done();
        }
        public static void Nad_83_BC_Albers (){

            Msg.Info("Click 'Nad 83 BC Albers' on the Shapefile_Projection Menu");
           Browser.Sleep(Browser.Mill_Sec());
              WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesProjectionSomId"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Nad 83 BC Albers')]"))).click();
            Msg.Done();
        }
    }


    public static void Upload_Shapefiles_For_Historical_pipeline (String Shape){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:segmentDetailAcdPnlId:uploadAmendmentShapefileBtnId"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:uploadShapefileBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:FileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\pl101027.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file pl101027.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-fileupload-upload"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:shapefilesProjectionSlctId_label"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:segmentDetailAcdPnlId:shapefilesProjectionSlctId_panel']/div/ul/li[5]"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:saveShapefileBtnId"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));

        if(Shape.equals("391")) {
           Browser.Sleep(Browser.Mill_Sec());
            try {          WebDriverWait wait1 = new WebDriverWait(Browser.driver, 80);

                wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Spatially Derived NTS:')]"))).getText();
            } catch (Exception e) {
            }
        }
        else{

            try {          WebDriverWait wait1 = new WebDriverWait(Browser.driver, 80);

                wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Spatially Derived NTS:')]"))).getText();
            } catch (Exception e) {
            }
        }
        Msg.Done();
    }

    public static void Upload_Shapefiles_For_Historical_pipeline2 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:segmentDetailAcdPnlId:uploadAmendmentShapefileBtnId"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:uploadShapefileBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:FileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\pl101027b.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file pl101027b.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-fileupload-upload"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:shapefilesProjectionSlctId_label"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:segmentDetailAcdPnlId:shapefilesProjectionSlctId_panel']/div/ul/li[5]"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:saveShapefileBtnId"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Spatially Derived NTS:')]"))).getText();

        Msg.Done();
    }



    public static void Upload_Shapefiles_For_wu101001 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\wu101001.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file wu101001.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }


    public static void Upload_Shapefiles_For_NEBOGC (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\EPM0041022.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file EPM0041022.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        EPM.Verify.Upload_page_display_Hidden();
        Msg.Done();
    }
    public static void Upload_Shapefiles_For_EPM0041022 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\EPM0041022.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file EPM0041022.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }

    public static void Upload_Shapefiles_For_fa101024 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\fa101024.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file fa101024.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }
    public static void Upload_Shapefiles_For_fa107043 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\fa107043.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file fa107043.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }



    public static void Upload_Shapefiles_For_hsr102002 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\hsr102002.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file hsr102002.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }




    public static void Upload_Shapefiles_For_we101031 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\we101031.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file we101031.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }
    public static void Upload_Shapefiles_For_ge101001 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\ge101001.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file ge101001.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }

    public static void Upload_Shapefiles_For_OGAA (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\EPM0041021.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file EPM0041021.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }

    public static void Upload_Shapefiles_For_OGAA_WELL (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\ag1001.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file ag1001.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }



    public static void Upload_Shapefiles_For_EPM0041021 (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\EPM0041021.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file EPM0041021.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }

    public static void Upload_Shapefiles_For_motiForestDistrict (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:uploadForestryShapefileBtnId"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadShapefileBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:FileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\motiForestDistrict.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file motiForestDistrict.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:shapefilesProjectionSlctId_label"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Nad 83 BC Albers')]"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:saveShapefileBtnId"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sdueTotalAreaMotRoadAllowanceInTxtId"))).getText();
        Msg.Done();
    }


    public static void Upload_Shapefiles_For_ALR_Assessment (){

        Msg.Info("Click 'Upload Shapefiles' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:usdUploadShapefilesBtnId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadedShapefilesIdFileUploadId_input")));
        browseButton.sendKeys(FileUpload.ShapeFile(Shapefile+"\\sp111001.zip").getAbsolutePath());
        System.out.println("INFO: Clicked on the Choose button and selected the file sp111001.zip");
       Browser.Sleep(Browser.Mill_Sec());
        // Click upload
        UpLoad_File();
        Msg.Done();
    }

    public static void Validate_and_Save_Shapefiles_to_Application() {
        Msg.Info("Click 'Validate and Save Shapefiles to Application' on the Main Menu");
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:saveAndValidateBtnId"))).click();
        Msg.Done();
    }


    public static void Verify_Status_Successful() {
        Msg.Info("Verify that the  message '_Status Successful' is displayed");
       Browser.Sleep(Browser.Mill_Sec());
          WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        String VerifyText =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:spatialDataUploadHistoryDtaTblId:0:uploadHistStsId"))).getText();

        Assert.assertEquals("Successful", VerifyText);

        Msg.Done();
        System.out.println("      Expecter Result: " + "Successful");
        System.out.println("      Actual Result  : " + VerifyText);
    }


}
