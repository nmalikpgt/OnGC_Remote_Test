package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission.Shapefile_Projection.UpLoad_File;
import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;


public class Well {





    public static void Oil_Gas_Field_Name() {
        Msg.Info("Click on the 'Oil & Gas Field Name' ");
          Crd_Conditions_Advisory.Click.Scrolldown();
       Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:ueOilAndGasFieldNameOutTxtId"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:ueOilGasFieldCodeSlctId']/div[3]/span"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:ueOilGasFieldCodeSlctId_panel']/div/table/tbody/tr[221]/td[2]"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[3]"))).click();
        Msg.Done();
    }

    public static void PNG_Tenure_Rights_ID() {
        Msg.Info("Click on the 'PNG Tenure Rights ID' ");
       Browser.Sleep(Browser.Mill_Sec());
          Crd_Conditions_Advisory.Click.Scrolldown();
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:addPngTenureRightBtn2Id"))).click();
       Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:tenurePngRightTblId:0:tenureRightInTxtId"))).sendKeys("123");
        Msg.Done();
    }

    public static class Well_DETAILS_Specifications{
        public static void WA_Number( String WAnumber) {
            Msg.Info("Enter Details for the 'WA number' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:reentryWaNumberInTxtId"))).sendKeys(WAnumber);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:retrieveWaNumBtnId"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }

        public static void COR_RE_ENTRY_DETAILS(String existingOpenHoleSize, String existingTotalDepthInTxtId ,String plugbackDepthInTxtId ,String topWellPerforatedIntInTxtId,String baseWellPerforatedIntInTxtId, String topWellBarefootIntInTxtId ,String baseWellBarefootIntInTxtId ) {
            Msg.Info("Enter Details for the 'COR Re-Entry Details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:existingOpenHoleSizeInTxtId"))).sendKeys(existingOpenHoleSize);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:existingTotalDepthInTxtId"))).sendKeys(existingTotalDepthInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:plugbackDepthInTxtId"))).sendKeys(plugbackDepthInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:wellPerforatedIntervalDtaTblId:0:topWellPerforatedIntInTxtId"))).sendKeys(topWellPerforatedIntInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:wellPerforatedIntervalDtaTblId:0:baseWellPerforatedIntInTxtId"))).sendKeys(baseWellPerforatedIntInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:wellBarefootHoleIntervalDtaTblList:0:topWellBarefootIntInTxtId"))).sendKeys(topWellBarefootIntInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:wellBarefootHoleIntervalDtaTblList:0:baseWellBarefootIntInTxtId"))).sendKeys(baseWellBarefootIntInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:reentrySummaryInTxtId"))).sendKeys("Test");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:approvalNumberInTxt2Id"))).sendKeys("123");


            String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder salt = new StringBuilder();
            Random rnd = new Random();
            while (salt.length() < 2) { // length of the random string.
                int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                salt.append(SALTCHARS.charAt(index));
            }
            String first = salt.toString();
            System.out.print(first);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:existingOpenHoleSizeInTxtId"))).sendKeys(first);

            Add_Casing_Details();

            Msg.Done();
        }

        public static void Add_Casing_Details( ) {
            Msg.Info("Enter Details for the 'Add Casing Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailCmdBtnId"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:wellCasingCodeSlctId"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:wellCasingCodeSlctId_panel\"]/div/ul/li[3]"))).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:casingSizeInTxtId"))).sendKeys("237");
            Browser.Sleep(Browser.Mill_Sec());

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:casingWeightInTxtId"))).sendKeys("236");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:casingGradeInTxtId"))).sendKeys("S-236");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:topCasingCasedIntervalInTxtId"))).sendKeys("23-236");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:baseCasingCasedIntervalInTxtId"))).sendKeys("623-23");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:topCementedIntervalInTxtId"))).sendKeys("62-36");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:casingDetailDtaListId:0:baseCementedIntervalInTxtId"))).sendKeys("23-623");
            Browser.Sleep(Browser.Mill_Sec());


            Msg.Done();
        }

        public static void Bottom_Hole_Details(String expectedTotalDepthTvdInTxt2Id_input, String xpectedTotalDepthMdInTxt2Id_input ,String objectiveDepthTvdInTxt2Id_input ,String objectiveDepthMdInTxt2Id_input) {
            Msg.Info("Enter Details for the 'Bottom Hole Details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bhDlsLsd2Id"))).sendKeys("B");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bhDlsSection2Id"))).sendKeys("092");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bhDlsTownship2Id"))).sendKeys("C");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bhDlsRange2Id"))).sendKeys("094-O-14");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:expectedTotalDepthTvdInTxt2Id_input"))).sendKeys(expectedTotalDepthTvdInTxt2Id_input);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:xpectedTotalDepthMdInTxt2Id_input"))).sendKeys(xpectedTotalDepthMdInTxt2Id_input);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bottomHoleFormationDtaTbl2Id:0:objectiveDepthTvdInTxt2Id_input"))).sendKeys(objectiveDepthTvdInTxt2Id_input);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bottomHoleFormationDtaTbl2Id:0:objectiveDepthMdInTxt2Id_input"))).sendKeys(objectiveDepthMdInTxt2Id_input);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:formationAtTotalDepthInTxt2Id\"]/button/span[1]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:formationAtTotalDepthInTxt2Id_panel\"]/table/tbody/tr[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bopClassCodeSlct2Id\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bopClassCodeSlct2Id_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bottomHoleFormationDtaTbl2Id:0:objectiveFormationCodeInTxt2Id\"]/button/span[1]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bottomHoleFormationDtaTbl2Id:0:objectiveFormationCodeInTxt2Id_panel\"]/table/tbody/tr[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bottomHoleFormationDtaTbl2Id:0:objectiveFluidCodeInTxt2Id\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bottomHoleFormationDtaTbl2Id:0:objectiveFluidCodeInTxt2Id_panel\"]/div/ul/li[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bhWellProfileInTxt2Id\"]/div[3]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnl2Id:0:bhWellProfileInTxt2Id_panel\"]/div/ul/li[4]"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void Well_Hazard_Planning_DETAILS(String maxH2sContentInTxtId, String maxDrillingH2sReleaseRateInTxtId ,String maxCompletionH2sRelRateInTxtId ,String calculatedDrillingEpzInTxtId,String calculatedCompletionEpzInTxtId) {
            Msg.Info("Enter Details for the 'Well_Hazard_Planning Details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:wellSourH2sDtaTblId:0:maxH2sContentInTxtId"))).sendKeys(maxH2sContentInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxDrillingH2sReleaseRateInTxtId"))).sendKeys(maxDrillingH2sReleaseRateInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxCompletionH2sRelRateInTxtId"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxCompletionH2sRelRateInTxtId"))).sendKeys(maxCompletionH2sRelRateInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:calculatedDrillingEpzInTxtId"))).sendKeys(calculatedDrillingEpzInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:calculatedCompletionEpzInTxtId"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='appFrmId:sourWellAcdPnlId:calculatedCompletionEpzInTxtId']"))).sendKeys(calculatedCompletionEpzInTxtId);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:sourWellAcdPnlId:wellSourH2sDtaTblId:0:formationNameInTxtId\"]/button/span[1]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:sourWellAcdPnlId:wellSourH2sDtaTblId:0:formationNameInTxtId_panel\"]/table/tbody/tr[3]"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxCompletionH2sRelRateInTxtId"))).sendKeys(maxCompletionH2sRelRateInTxtId);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:calculatedCompletionEpzInTxtId"))).sendKeys(calculatedCompletionEpzInTxtId);
            Msg.Done();
            Msg.Info(" Upload the  Attachment 'H2S Rationale Document::'");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:sourWellAcdPnlId:h2sReleaseRateDetailBtnId"))).click();
         EPM.Verify.Upload_pagedispaly();
            WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadSourWellDocIdFileUploadId_input")));
            browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
            Msg.Info(" Upload the  Attachment 'Upload EPZ Map:'");
           Browser.Sleep(Browser.Mill_Sec());
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:sourWellAcdPnlId:epzMapBtnId"))).click();
            } catch (Exception e) {
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:sourWellAcdPnlId:epzMapBtnId"))).click();
            }
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton1 =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadEpzDocIdFileUploadId_input")));
            browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
           Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            //   retry by saving
            try {

                if (wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow fileUploadDialog ui-draggable ui-overlay-visible']"))).isDisplayed()) {


                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:uploadEpzDocIdDialogId\"]/div[1]/a/span"))).click();
                                  EPM.Click.Attachment_Save();
                    Click.Well_Hazard_Planning();
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:sourWellAcdPnlId:epzMapBtnId"))).click();
                    EPM.Verify.Upload_pagedispaly();
                    WebElement browseButton12 =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadEpzDocIdFileUploadId_input")));
                    browseButton12.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                    System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                    Browser.Sleep(Browser.Mill_Sec());
                    UpLoad_File();
                    EPM.Verify.Upload_page_display_Hidden();
                }
            } catch (Exception e) {

            }
            try {  WebDriverWait wait1 = new WebDriverWait(Browser.driver, 2);
                wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:criticalFeatureDtaTblId:0:criticalFeatureCodeInTxtId_label"))).click();
                wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:sourWellAcdPnlId:criticalFeatureDtaTblId:0:criticalFeatureCodeInTxtId_panel\"]/div/ul/li[2]"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:criticalFeatureDtaTblId:0:numberWithinCompletionCaseInTxtId"))).sendKeys("17");
            } catch (Exception e) {

            }


            Msg.Done();
        }
        public static void Flaring() {
            Msg.Info("Enter Details for the 'Flaring' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:maxH2sContentInTxtId"))).sendKeys("90");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:requestedVolumeInTxtId"))).sendKeys("99");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:specialExplanationInTxtId"))).sendKeys("Test");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:formationNameInTxtId\"]/button/span[1]"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:formationNameInTxtId_panel\"]/table/tbody/tr[2]"))).click();
           Browser.Sleep(Browser.Mill_Sec());

            try {
                WebDriverWait wait1 = new WebDriverWait(Browser.driver, 5);
                Msg.Info(" Upload the  Attachment 'Flaring Description Attached::'");
                Browser.Sleep(Browser.Mill_Sec());
                wait1.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:flaringAcdPnlId:flaringDescriptionDocUploadBtnId"))).click();
                EPM.Verify.Upload_pagedispaly();
                WebElement browseButton1 =  wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadFlaringDocIdFileUploadId_input")));
                browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
                UpLoad_File();
                EPM.Verify.Upload_page_display_Hidden();

            } catch (Exception e) {
                try {
                    WebDriverWait wait1 = new WebDriverWait(Browser.driver, 5);
                    wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:flaringDescriptionAttIndBtnId"))).click();
                    Msg.Done();
                    Msg.Info(" Upload the  Attachment 'Flaring Description Attached::'");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:flaringAcdPnlId:flaringDescriptionDocUploadBtnId"))).click();
                    EPM.Verify.Upload_pagedispaly();
                    WebElement browseButton1 =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadFlaringDocIdFileUploadId_input")));
                    browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                    System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                    Browser.Sleep(Browser.Mill_Sec());
                    UpLoad_File();
                    EPM.Verify.Upload_page_display_Hidden();

                } catch (Exception ex) {

                }
            }

            Msg.Done();
        }
    }
    public static class Amendments_Well_Details {


        public static void Additional_information(){
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
        //    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:exploratoryVolumeRationaleInTxtId"))).sendKeys("test test ");
            Msg.Done();
            Msg.Info(" Upload the  Attachment 'Fracture Simulation Model::'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:wellDetailAcdPnlId:uploadSpreadsheetBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadFracturingDocIdFileUploadId_input")));
            browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
            Msg.Info(" Upload the  Attachment 'Upload Ground Water Assessment:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:wellDetailAcdPnlId:uploadGroundWaterAssessmentBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadGroundWaterAssessmentDocIdFileUploadId_input")));
            browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();



        }
        public static void Fracture_Simulation_Model(){
            try {
                WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
                //    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:exploratoryVolumeRationaleInTxtId"))).sendKeys("test test ");
                Msg.Done();
                Msg.Info(" Upload the  Attachment 'Fracture Simulation Model::'");
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:wellDetailAcdPnlId:uploadSpreadsheetBtnId"))).click();
                EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadFracturingDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
                UpLoad_File();
                EPM.Verify.Upload_page_display_Hidden();
            } catch (Exception e) {
            }
        }
    }
    public static class WA_ {
        public static class Well_Details {
            public static void Primary_WA_Number_WA_Exception_Code() {
                Msg.Info("Click on the 'Primary_WA_Number_WA_Exception_Code' ");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:primaryWellAuthorizationNumberInTxtId"))).sendKeys("999999");
               Browser.Sleep(Browser.Mill_Sec());
                String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                StringBuilder salt = new StringBuilder();
                Random rnd = new Random();
                while (salt.length() < 2) { // length of the random string.
                    int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                    salt.append(SALTCHARS.charAt(index));
                }
                String first = salt.toString();
                System.out.print(first);
               wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@onkeydown=\"return isAlphaChar(event);\"]"))).sendKeys(first);
                Msg.Done();
            }

            public static void Surface_Hole_Details_DETAILS() {
                Msg.Info("Enter Details for the 'Surface Hole Details Details' ");
               Browser.Sleep(Browser.Mill_Sec());
                ((JavascriptExecutor) Browser.driver).executeScript("window.scrollTo(0, 9300)");
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:wellClassificationIndBtnId"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:groundElevationInTxtId_input"))).sendKeys("999");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:proposedSurfaceCasingSetDepthInTxtId"))).sendKeys("999999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:approvalNumberInTxtId"))).sendKeys("999999");
               Browser.Sleep(Browser.Mill_Sec());
                Msg.Done();
            }

            public static void Bottom_Hole_Details1() {
                Msg.Info("Enter Details for the 'Bottom Hole Details' ");
               Browser.Sleep(Browser.Mill_Sec());
                  Crd_Conditions_Advisory.Click.Scrolldown();
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:expectedTotalDepthTvdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:xpectedTotalDepthMdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bottomHoleFormationDtaTblId:0:objectiveDepthTvdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bottomHoleFormationDtaTblId:0:objectiveDepthMdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bhWellProfileInTxtId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bhWellProfileInTxtId_panel\"]/div/ul/li[4]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:formationAtTotalDepthInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:formationAtTotalDepthInTxtId_panel\"]/table/tbody/tr[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bopClassCodeSlctId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bopClassCodeSlctId_panel\"]/div/ul/li[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bottomHoleFormationDtaTblId:0:objectiveFormationCodeInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bottomHoleFormationDtaTblId:0:objectiveFormationCodeInTxtId_panel\"]/table/tbody/tr[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bottomHoleFormationDtaTblId:0:objectiveFluidCodeInTxtId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:0:bottomHoleFormationDtaTblId:0:objectiveFluidCodeInTxtId_panel\"]/div/ul/li[2]"))).click();
                Msg.Done();
            }
            public static void Bottom_Hole_Details2() {
                Msg.Info("Enter Details for the 'Bottom Hole Details' ");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:expectedTotalDepthTvdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:xpectedTotalDepthMdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bottomHoleFormationDtaTblId:0:objectiveDepthTvdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bottomHoleFormationDtaTblId:0:objectiveDepthMdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bhWellProfileInTxtId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bhWellProfileInTxtId_panel\"]/div/ul/li[4]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:formationAtTotalDepthInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:formationAtTotalDepthInTxtId_panel\"]/table/tbody/tr[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bopClassCodeSlctId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bopClassCodeSlctId_panel\"]/div/ul/li[4]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bottomHoleFormationDtaTblId:0:objectiveFormationCodeInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bottomHoleFormationDtaTblId:0:objectiveFormationCodeInTxtId_panel\"]/table/tbody/tr[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bottomHoleFormationDtaTblId:0:objectiveFluidCodeInTxtId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:1:bottomHoleFormationDtaTblId:0:objectiveFluidCodeInTxtId_panel\"]/div/ul/li[4]"))).click();
                Msg.Done();
            }
            public static void Bottom_Hole_Details3() {
                Msg.Info("Enter Details for the 'Bottom Hole Details' ");
               Browser.Sleep(Browser.Mill_Sec());
                  Crd_Conditions_Advisory.Click.Scrolldown();
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:expectedTotalDepthTvdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:xpectedTotalDepthMdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bottomHoleFormationDtaTblId:0:objectiveDepthTvdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bottomHoleFormationDtaTblId:0:objectiveDepthMdInTxtId_input"))).sendKeys("999");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bhWellProfileInTxtId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bhWellProfileInTxtId_panel\"]/div/ul/li[4]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:formationAtTotalDepthInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:formationAtTotalDepthInTxtId_panel\"]/table/tbody/tr[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bopClassCodeSlctId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bopClassCodeSlctId_panel\"]/div/ul/li[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bottomHoleFormationDtaTblId:0:objectiveFormationCodeInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bottomHoleFormationDtaTblId:0:objectiveFormationCodeInTxtId_panel\"]/table/tbody/tr[3]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bottomHoleFormationDtaTblId:0:objectiveFluidCodeInTxtId\"]/div[3]/span"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:bottomHolesPnlId:2:bottomHoleFormationDtaTblId:0:objectiveFluidCodeInTxtId_panel\"]/div/ul/li[2]"))).click();
                Msg.Done();
            }
            public static void Well_Hazard_Planning_DETAILS() {
                Msg.Info("Enter Details for the 'Well_Hazard_Planning Details' ");
               Browser.Sleep(Browser.Mill_Sec());
                  Crd_Conditions_Advisory.Click.Scrolldown();
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:wellSourH2sDtaTblId:0:maxH2sContentInTxtId"))).sendKeys("15");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxDrillingH2sReleaseRateInTxtId"))).sendKeys("13");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxCompletionH2sRelRateInTxtId"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxCompletionH2sRelRateInTxtId"))).sendKeys("14");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:calculatedDrillingEpzInTxtId"))).sendKeys("16");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:calculatedCompletionEpzInTxtId"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='appFrmId:sourWellAcdPnlId:calculatedCompletionEpzInTxtId']"))).sendKeys("17");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:sourWellAcdPnlId:wellSourH2sDtaTblId:0:formationNameInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:sourWellAcdPnlId:wellSourH2sDtaTblId:0:formationNameInTxtId_panel\"]/table/tbody/tr[3]"))).click();
                Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:maxCompletionH2sRelRateInTxtId"))).sendKeys("14");
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:calculatedCompletionEpzInTxtId"))).sendKeys("17");
                Msg.Done();
                Msg.Info(" Upload the  Attachment 'H2S Rationale Document::'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:sourWellAcdPnlId:h2sReleaseRateDetailBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadSourWellDocIdFileUploadId_input")));
                browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
                Msg.Info(" Upload the  Attachment 'Upload EPZ Map:'");
               Browser.Sleep(Browser.Mill_Sec());
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:sourWellAcdPnlId:epzMapBtnId"))).click();
                } catch (Exception e) {
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:sourWellAcdPnlId:epzMapBtnId"))).click();
                }
                EPM.Verify.Upload_pagedispaly();
                WebElement browseButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadEpzDocIdFileUploadId_input")));
                browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:criticalFeatureDtaTblId:0:criticalFeatureCodeInTxtId_label"))).click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:sourWellAcdPnlId:criticalFeatureDtaTblId:0:criticalFeatureCodeInTxtId_panel\"]/div/ul/li[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:criticalFeatureDtaTblId:0:numberWithinCompletionCaseInTxtId"))).sendKeys("17");




                Msg.Done();
            }

            public static void Flaring() {
                Msg.Info("Enter Details for the 'Flaring' ");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:maxH2sContentInTxtId"))).sendKeys("90");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:requestedVolumeInTxtId"))).sendKeys("99");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:flaringAcdPnlId:specialExplanationInTxtId"))).sendKeys("Test");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:formationNameInTxtId\"]/button/span[1]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:flaringAcdPnlId:flaringFormationTOsDtaTblId:0:formationNameInTxtId_panel\"]/table/tbody/tr[2]"))).click();
               Browser.Sleep(Browser.Mill_Sec());
               // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:flaringAcdPnlId:flaringDescriptionAttIndBtnId\"]/div[2]/span"))).click();
                Msg.Done();
                Msg.Info(" Upload the  Attachment 'Flaring DocIdFile:'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:flaringAcdPnlId:flaringDescriptionDocUploadBtnId"))).click();
             EPM.Verify.Upload_pagedispaly();
                WebElement browseButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadFlaringDocIdFileUploadId_input")));
                browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appFrmId:uploadFlaringDocIdFileUploadId\"]/div[1]/button[1]"))).click();
                EPM.Verify.Upload_page_display_Hidden();
                Msg.Done();
            }
        }

    }


    public static class Verify {
      public static void Verify_Status__BCGS_Map() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sdValueOutLblId")));
          Msg.Done();
      }
      public static void Progress_Message() {
          Msg.Info("Verify that the  message '_Status Successful' is displayed");
         Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
          Crd_Conditions_Advisory.Click.Scrolldown();
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("progressDialogId")));
          Msg.Done();
      }
  }

    public static class Area_Details {
        public static void All_Information(String OccupiedDwelling, String UrbanCentre ,String nearestSchool ,String nearestPopulatedArea) {
            Msg.Info("Enter the Details for 'Area Details' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nearestOccupiedDwellingInTxtId"))).sendKeys(OccupiedDwelling);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nearestUrbanCentreInTxtId"))).sendKeys(UrbanCentre);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nearestSchoolInTxtId"))).sendKeys(nearestSchool);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nearestPopulatedAreaInTxtId"))).sendKeys(nearestPopulatedArea);
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:nearestPopulatedAreaNameInTxtId"))).sendKeys("Test");
            Msg.Done();
        }
    }


    public static class Enter {
        public static void Activity_Description() {
            Msg.Info("Enter the  message For 'Activity Description'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:activityDescriptionInTxtId"))).sendKeys("Activity Description here ...");
            Msg.Done();
        }
        public static void ALPL_Working_Interest_Partner() {
            Msg.Info("Enter the  message For 'Working Interest Partner'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:workingInterestPartnerId_input"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:workingInterestPartnerId_input"))).sendKeys("ALPL");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[@data-item-label=\"ALPL\"]"))).click();
            Msg.Done();
        }

        public static void ABT_Working_Interest_Partner() {
            Msg.Info("Enter the  message For 'Working Interest Partner'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:workingInterestPartnerId_input"))).clear();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:workingInterestPartnerId_input"))).sendKeys("ABT");
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[@data-item-label=\"ABT\"]"))).click();
            Msg.Done();
        }
        public static void File_XREF_Number() {
            Msg.Info("Enter the  message For 'File XREF Number:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:fileXrefNumberId"))).sendKeys("123.");
        }
        public static void Please_list_all_caveats() {
            Msg.Info("Enter the  message For 'Please list all caveats:'");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pngSpecialConditionsDescriptionInTxtId"))).sendKeys("Test.");
            Msg.Done();
        }
    }
    public static class Click {
        public static void Well_Overview() {
            Msg.Info("Click on the 'Well Overview' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellAreaOverviewTabId"))).click();
            Msg.Done();
        }
        public static void Well_Details() {
            Msg.Info("Click on the 'Well Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailTabId"))).click();
            Msg.Done();
        }
        public static void Well_Land_Details() {
            Msg.Info("Click on the 'Well Land Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellLandDetailTabId"))).click();
            Msg.Done();
        }
        public static void Add_Bottom_Hole() {
            Msg.Info("Click on the 'Add Bottom Hole' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:addBottomHoleBtn2Id"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void Add_Bottom_HoleD() {
            Msg.Info("Click on the 'Add Bottom Hole' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:addBottomHoleBtnId"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
        public static void Well_Hazard_Planning() {
            Msg.Info("Click on the 'Well Hazard Plannings' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            EPM.Click.Save();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId"))).click();
            Msg.Done();
        }
        public static void Based_on_the_well_classification_selected_the_applicant_concurs_that_the_BC_Oil_Gas_Commission_may_release_any_well_reports_an_well_data_for_the_well_from_confidential_status_in_accordance_with_the_timelines_prescribed_in_Section_17_1_of_the_OGAA_General_Regulation() {
            Msg.Info("Click on the 'Based on the well classification selected, the applicant concurs that the BC Oil & Gas Commission may release any well reports and well data for the well from confidential status in accordance with the timelines prescribed in Section 17(1) of the OGAA General Regulation' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:wellClassificationIndBtnId\"]/div[2]"))).click();
            Msg.Done();
        }
        public static void Well_Hazard_Planning_NO() {
            Msg.Info("Click on the 'Well Hazard Plannings = NO' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:formationsContainingH2sIndBtnId"))).click();
            Browser.Sleep(500);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:epzRadiusInTxtId"))).sendKeys("12");
            Msg.Done();
        }


        public static void Critical_Features_within_EPZ_Details() {
            Msg.Info("Click on the 'Critical Features within EPZ Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:criticalFeaturesIndBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:criticalFeaturesIndBtnId"))).click();
            Msg.Done();
        }

        public static void YesCritical_Features_within_EPZ_Details() {
            Msg.Info("Click on the 'Critical Features within EPZ Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:sourWellAcdPnlId:criticalFeaturesIndBtnId"))).click();

            Msg.Done();
        }



        public static void Fracturing_Details() {
            Msg.Info("Click on the 'Fracturing Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
          //  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:fracturingUnd60IndBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:wellDetailAcdPnlId:fracturingUnd60IndBtnId"))).click();
            Msg.Done();
        }
        public static void Well_Type() {
            Msg.Info("Click on the 'Well Type' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:wellTypeCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-label=\"Water Source\"]"))).click();
            Msg.Done();
        }
        public static void Ground_Water_Assessment_Attached() {
            Msg.Info("Click on the 'Ground Water Assessment Attached?' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
        //    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:groundWaterAssBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:groundWaterAssBtnId\"]/div[2]/span"))).click();
            Msg.Done();
        }
        public static void Is_this_a_reviewable_project_by_the_Environmental_Assessment_office() {
            Msg.Info("Click on the 'Is this a reviewable project by the Environmental Assessment office?' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:eaOfficeRevBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(500);
            Msg.Done();
        }
        public static void Flaring() {
            Msg.Info("Click on the 'Flaring' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-widget='wellDetailFlaring']"))).click();
            Msg.Done();
        }
        public static void Exemption() {
            Msg.Info("Click on the 'Exemption' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-widget='wellDetailExemptions']"))).click();
            Msg.Done();
        }
        public static void Save() {
            Msg.Info("Click on the 'Save' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topsaveBtnId"))).click();
            Msg.Done();
        }
        public static void Validate_Page() {
            Msg.Info("Click on the 'Validate Page' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:topvalidateSaveBtnId"))).click();
            Msg.Done();
        }
        public static void WA_2() {
            Msg.Info("Click on the 'WA ' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.not-current"))).click();
            Msg.Done();
        }
        public static void Water_Characteristics() {
            Msg.Info("Click on the 'Water Characteristics ' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:waterCharacteristicsSlctId\"]/div[3]/span"))).click();
           Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:wellDetailAcdPnlId:waterCharacteristicsSlctId_panel\"]/div/ul/li[2]"))).click();
            Msg.Done();
        }
        public static void Remove_Segment() {
            Msg.Info("Click on the 'Remove Segment' ");
           Browser.Sleep(Browser.Mill_Sec());
              Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:removeWellBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }

        public static void Is_the_activity_within_a_previously_assessed_construction_corridor() {
            Msg.Info("Click on the 'Is the activity within a previously assessed construction corridor' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:constructionCcBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:constructionCcBtnId"))).click();
            Msg.Done();
        }
        public static void Does_the_proponent_hold_PNG_rights_to_all_PNG_tenures() {
            Msg.Info("Click on the 'Does the proponent hold PNG rights to all PNG tenures?' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:proponentPngRightBtnId"))).click();
            Msg.Done();
        }
        public static void Does_the_proposed_application_adhere_to_the_conditions_of_the_PNG_tenure() {
            Msg.Info("Click on the 'Does the proposed application adhere to the conditions of the PNG tenure?' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:consistPngTenureBtnId"))).click();
            Msg.Done();
        }
        public static void Does_the_PNG_tenure_include_caveats() {
            Msg.Info("Click on the 'Does the PNG tenure include caveats?' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pngSpeCondBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pngSpeCondBtnId"))).click();
            Msg.Done();
        }
    }

}



