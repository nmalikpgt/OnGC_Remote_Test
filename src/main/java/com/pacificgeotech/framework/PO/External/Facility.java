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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Facility {

    public static void Oil_Gas_Field_Name() {
        Msg.Info("Click on the 'Oil & Gas Field Name' ");
        Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
        Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"spatiallyDerivedValue\"]"))).click();
        Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:facilitySpecificAcdPnlId:ueOilGasFieldCodeSlctId']/div[3]/span"))).click();
        Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:facilitySpecificAcdPnlId:ueOilGasFieldCodeSlctId_panel']/div/table/tbody/tr[2]/td[2]"))).click();
        Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]"))).click();
        Msg.Done();
    }


    public static void Facility_Type() {
        Msg.Info("Click on the 'Facility Type:' ");
        Browser.Sleep(Browser.Mill_Sec());
        WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
        Crd_Conditions_Advisory.Click.Scrolldown();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:facilityTypeCodeSlctId"))).click();
        Browser.Sleep(Browser.Mill_Sec());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Pump Station')]"))).click();
        Msg.Done();

    }

    public static class Amendment {

        public static void Has_a_sand_fracture_been_completed_at_one_or_more_of_the_wells() {
            Msg.Info("Click on the 'Has a sand fracture been completed at one or more of the wells?' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon naIcon']"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:technicalSpecificAcdPnlId:q7SandFractureIndBtnId']"))).click();
            Msg.Done();

        }

        public static void Is_the_activity_within_a_previously_assessed_construction_corridor() {
            Msg.Info("Click on the 'Is the activity within a previously assessed construction corridor?:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='appFrmId:withinExistingCcIndBtnId']"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:existCcXrefFileNumInTxtId"))).sendKeys("12345");
            Msg.Done();

        }

        public static void Does_this_project_require_BCEAO_Approval() {
            Msg.Info("Click on the 'Does this project require BCEAO Approval?:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:bceaoApprovalIndBtnId"))).click();
            Msg.Done();

        }

        public static void Does_this_project_require_CEA_Approval() {
            Msg.Info("Click on the 'Does this project require CEA Approval?:' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:ceaApprovalIndBtnId"))).click();
            Msg.Done();

        }

        public static void Will_the_proposed_application_include_routine_combustion_of_sour_gas_and_or_combustion_of_gas_containing_1_mole_percent_H2S_for_a_duration_of_15_minutes_or_that_results_in_1_tonne_rolling_24_hrs_of_sulphur_emissions() {
            Msg.Info("Click on the 'Will the proposed application include routine combustion of sour gas and/or combustion of gas containing >= 1 mole percent H2S for a duration of >= 15 minutes or that results in 1 tonne/rolling 24 hrs of sulphur emissions?:' ");
            Browser.Sleep(Browser.Mill_Sec());
            ((JavascriptExecutor) Browser.driver).executeScript("window.scrollBy(0,1000)");

            WebDriverWait wait = new WebDriverWait(Browser.driver, 23);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:inletGas1h2sDispModelIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:inletGas1h2sDispModelIndBtnId\"]/div[2]/span"))).click();

            try {
                if (!wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:facilitySpecificAcdPnlId:dispersionModelUploadBtnId"))).isDisplayed()) {

                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:inletGas1h2sDispModelIndBtnId\"]/div[2]/span"))).click();
                }
            } catch (Exception e) {

            }

            Msg.Done();
        }
    }


    public static class Facility_overview_Upload_Files {

        public static void All_Attachments_of_this_Page() {
            Msg.Info("uploading on the 'All the Attachments of Facility_overview page' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Done();
// ----------Project Description Attachment:
            Msg.Info(" Upload the  Attachment 'Project Description Attachment::'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:projectDescriptionUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadProjectDocIdFileUploadId_input")));
            browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
            // ----------Process Flow Diagram Attachment
            Msg.Info(" Upload the  Attachment 'Process Flow Diagram Attachment:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:processFlowUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadProcessDocIdFileUploadId_input")));
            browseButton1.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();
// ----------'Piping & Instrumentation Diagram Attachment:
            Msg.Info(" Upload the  Attachment 'Piping & Instrumentation Diagram Attachment:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:pipingUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:pipingInstrumentationDocIdFileUploadId_input")));
            browseButton3.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();

            // ----------Plot Plan Attachment:
            Msg.Info(" Upload the  Attachment 'Plot Plan Attachment:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:plotPlanUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton12 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:plotPlanDocIdFileUploadId_input")));
            browseButton12.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();


            // ----------Gathering System Schematic Attachmen:
            Msg.Info(" Upload the  Attachment 'Gathering System Schematic Attachment:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:gatheringUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton13 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='appFrmId:uploadGatheringDocIdFileUploadId_input']")));
            browseButton13.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();

// ----------DispersionModelDoc:
//            Msg.Info(" Upload the  Attachment 'DispersionModelDoc:'");
//           Browser.Sleep(Browser.Mill_Sec());
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:dispersionModelUploadBtnId"))).click();
//           Browser.Sleep(2300);
//            EPM.Verify.Upload_pagedispaly();
//            WebElement browseButton123 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:dispersionModelDocIdFileUploadId_input")));
//            browseButton123.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
//            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
//           Browser.Sleep(2300);
//            UpLoad_File();
//            EPM.Verify.Upload_page_display_Hidden();
//            Msg.Done();
        }


    }


    public static class Facility_DETAILS_Specifications {


        public static void Notice_of_Construction_Start_Date(String Update) {


            if (Update.equals("Yes")) {
                Msg.Info("Click on the 'Notice of Construction Start Date:' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date today1 = calendar.getTime();
                DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
                String todayA = dateFormat1.format(today1);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:nscDateClrId_input"))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:nscDateClrId_input"))).sendKeys(todayA);
                Msg.Done();

            }

        }

        public static void Notice_of_Pressure_Testing_Date(String Update) {

            if (Update.equals("Yes")) {

                Msg.Info("Click on the 'Notice of Pressure Testing Date:' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date today1 = calendar.getTime();
                DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
                String todayA = dateFormat1.format(today1);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:nptDateClrId_input"))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:nptDateClrId_input"))).sendKeys(todayA);
                Msg.Done();
            }
        }

        public static void Leave_to_Open_Date(String Update) {

            if (Update.equals("Yes")) {

                Msg.Info("Click on the 'Leave to Open Date:' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, -2);
                Date today1 = calendar.getTime();
                DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
                String todayA = dateFormat1.format(today1);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:ltoDateClrId_input"))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:ltoDateClrId_input"))).sendKeys(todayA);
                Msg.Done();
            }
        }

        public static void As_Built_Date(String Update) {

            if (Update.equals("Yes")) {

                Msg.Info("Click on the 'As Built Date' ");
                Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date today1 = calendar.getTime();
                DateFormat dateFormat1 = new SimpleDateFormat("MM-dd-yyyy");
                String todayA = dateFormat1.format(today1);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:asBuildDateClrId_input"))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:segmentDetailAcdPnlId:asBuildDateClrId_input"))).sendKeys(todayA);
                Msg.Done();
            }
        }


        public static void FAC(String maxInletH2sContentPctInTxtId, String maxDesignH2sContentPpmInTxtId, String capacityInTxtId, String rawGasCapacityInTxtId, String salesGasCapacityInTxtId, String sulphurEmissionGasCapacityInTxtId, String facilityLossesInTxtId, String Equipment_Type) {
            Msg.Info("Enter Details for  the 'Facility_DETAILS_Specifications' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:maxInletH2sUnitMeasureSlctOneMnuId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:maxInletH2sUnitMeasureSlctOneMnuId_panel\"]/div/ul/li[2]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:maxDesignH2sUnitMeasureSlctOneMnuId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:maxDesignH2sUnitMeasureSlctOneMnuId_panel\"]/div/ul/li[2]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:designInletCapacityMeasureSlctOneMnuId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:designInletCapacityMeasureSlctOneMnuId_panel\"]/div/ul/li[3]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:maxInletH2sContentPctInTxtId"))).sendKeys(maxInletH2sContentPctInTxtId);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:maxDesignH2sContentPctInTxtId"))).sendKeys(maxDesignH2sContentPpmInTxtId);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:capacityInTxtId"))).sendKeys(capacityInTxtId);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:rawGasCapacityInTxtId"))).sendKeys(rawGasCapacityInTxtId);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:salesGasCapacityInTxtId"))).sendKeys(salesGasCapacityInTxtId);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:sulphurEmissionGasCapacityInTxtId"))).sendKeys(sulphurEmissionGasCapacityInTxtId);
            Browser.Sleep(Browser.Mill_Sec());
            if (facilityLossesInTxtId.equals("999999")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:facilityLossesInTxtId"))).sendKeys(facilityLossesInTxtId);
            }
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:leakDetectionCodesSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            if (Equipment_Type.equals("Compressor")) {
                List<WebElement> Documentsfiles = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[starts-with(@name,'appFrmId:facilitySpecificAcdPnlId:equipmentTypeCodesSltMnyLstId')  and @type='checkbox' ]/following::span[1]")));
                Msg.Info("Adding all Equipment Type");
                for (WebElement count : Documentsfiles) {
                    Actions actions = new Actions(Browser.driver);
                    actions.moveToElement(count).click().build().perform();
                    Browser.Sleep(300);
                }
            } else {
                List<WebElement> Documentsfiles = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[starts-with(@name,'appFrmId:facilitySpecificAcdPnlId:equipmentTypeCodesSltMnyLstId')  and @type='checkbox' ]/following::span[1]")));
                Msg.Info("Adding all Equipment Type");
                for (WebElement count : Documentsfiles) {
                    Actions actions = new Actions(Browser.driver);
                    actions.moveToElement(count).click().build().perform();
                    Browser.Sleep(300);
                }
            }
            Msg.Done();
        }

        public static void A105001Facility_Equipment_DETAILS(String ElectricPrime, String ElectricPower, String GasPrime, String Y_N) {


            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilityEquipmentAcdPnlId:facilityEquipmentDtaLstId:1:changesEffectExistDehyIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilityEquipmentAcdPnlId:facilityEquipmentDtaLstId:1:changesEffectExistDehyIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilityEquipmentAcdPnlId:facilityEquipmentDtaLstId:1:moleculaSieveDehydratationIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilityEquipmentAcdPnlId:facilityEquipmentDtaLstId:1:moleculaSieveDehydratationIndBtnId\"]/div[2]/span"))).click();

            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilityEquipmentAcdPnlId:facilityEquipmentDtaLstId:5:incineratorMeasuProposedIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilityEquipmentAcdPnlId:facilityEquipmentDtaLstId:5:incineratorMeasuProposedIndBtnId\"]/div[2]/span"))).click();

            Facility_Equipment_DETAILS_Facility_Storage(ElectricPower, GasPrime, Y_N);

        }

        public static void Facility_Equipment_DETAILS(String ElectricPrime, String ElectricPower, String GasPrime, String Y_N) {

            Facility_Equipment_DETAILS_Compressor(ElectricPrime, GasPrime);
            Facility_Equipment_DETAILS_PUMP(ElectricPower, GasPrime);
            Facility_Equipment_DETAILS_Generator(ElectricPower, GasPrime);
            Facility_Equipment_DETAILS_Flare_Stack(ElectricPower, GasPrime);
            Facility_Equipment_DETAILS_Incinerator(ElectricPower, GasPrime, ElectricPrime);
            Facility_Equipment_DETAILS_Facility_Storage(ElectricPower, GasPrime, Y_N);
            Facility_Equipment_DETAILS_Dehydrator(ElectricPower);
            Facility_Equipment_DETAILS_Vent_Stack(ElectricPower);
        }

        public static void Facility_Equipment_DETAILS_Compressor(String ElectricPrime, String ElectricPower) {

            Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS Compressor' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            ((JavascriptExecutor) Browser.driver).executeScript("window.scrollBy(0,document.body.scrollHeight || document.documentElement.scrollHeight)", "");

            List<WebElement> Input1 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'compressorNumOfPrimeMoversProposedInTxtId')]")));

            for (WebElement count : Input1) {
                count.sendKeys(ElectricPrime);
            }

            List<WebElement> Input2 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'compressorPowerInTxtId')]")));

            for (WebElement count : Input2) {
                count.sendKeys(ElectricPower);
            }

            Msg.Done();

        }

        public static void Facility_Equipment_DETAILS_PUMP(String GasPrime, String GasPower) {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 8);
            try {
                Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS PUMP'");

                Browser.Sleep(Browser.Mill_Sec());

                Crd_Conditions_Advisory.Click.Scrolldown();


                if (wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'pumpNumOfPrimeMoversProposedInTxtId')]"))).isDisplayed()) {

                    List<WebElement> PUMp1 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'pumpNumOfPrimeMoversProposedInTxtId')]")));

                    for (WebElement count : PUMp1) {
                        count.sendKeys(GasPrime);
                    }

                    List<WebElement> PUMp2 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'pumpPowerInTxtId')]")));

                    for (WebElement count : PUMp2) {
                        count.sendKeys(GasPower);
                    }
                }
            } catch (Exception e) {

            }

            Msg.Done();

        }


        public static void Facility_Equipment_DETAILS_Generator(String ElectricPrime, String ElectricPower) {
            Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS Generator' ");
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Click.Scrolldown();
            List<WebElement> Input1 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'generatorNumOfPrimeMoversProposedInTxtId')]")));
            for (WebElement count : Input1) {
                count.sendKeys(ElectricPrime);
            }
            List<WebElement> Input2 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'generatorPowerInTxtId')]")));
            for (WebElement count : Input2) {
                count.sendKeys(ElectricPower);
            }
            Msg.Done();
        }

        public static void Facility_Equipment_DETAILS_Flare_Stack(String ElectricPrime, String ElectricPower) {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS  Flare Stack' ");

            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Click.Scrolldown();
            List<WebElement> Input1 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'totalNumberOfFlaresProposedInTxtId')]")));
            for (WebElement count : Input1) {
                count.sendKeys(ElectricPower);
            }
            List<WebElement> Input2 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'totalEstimatedFlareRateProposedInTxtId')]")));
            for (WebElement count : Input2) {
                count.sendKeys(ElectricPrime);
            }
            Browser.Sleep(Browser.Mill_Sec());

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //*[contains(@id, 'flareSafetyControlCodesSltMnyLstId')]//li[contains(text(),'Auto Ignition')]"))).click();

            Msg.Done();
        }


        public static void Facility_Equipment_DETAILS_Incinerator(String ElectricPrime, String ElectricPower, String GasPrime) {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();

            Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS  Incinerator' ");
            Browser.Sleep(Browser.Mill_Sec());

            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'proposedNumberOfIncineratorsInTxtId')]"))).sendKeys(ElectricPrime);
            Browser.Sleep(Browser.Mill_Sec());//*[contains(@id,'incineratorSafetyControlCodesSltMnyLstId')]
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'estimatedProcStreamIncRateInTxtId')]"))).sendKeys(ElectricPower);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'estimatedGasStreamIncRateInTxtId')]"))).sendKeys(GasPrime);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@id, 'incineratorMeasurementCodesSltMnyLstId')]//li[contains(text(),'Gas Stream')]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@id, 'incineratorSafetyControlCodesSltMnyLstId')]//li[contains(text(),'Auto Ignition')]"))).click();
            Msg.Done();

        }


        public static void Facility_Equipment_DETAILS_Facility_Storage(String ElectricPrime, String ElectricPower, String Y_N) {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();


            Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS  Facility Storage' ");
            Browser.Sleep(Browser.Mill_Sec());

            Crd_Conditions_Advisory.Click.Scrolldown();

            List<WebElement> Input1 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'proposedNumberOfFacilityStoragesInTxtId')]")));
            for (WebElement count : Input1) {
                count.sendKeys(ElectricPrime);
            }
            List<WebElement> Input2 = Browser.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[contains(@id,'proposedCapacityOfFacilityStoragesInTxtId')]")));
            for (WebElement count : Input2) {
                count.sendKeys(ElectricPower);
            }

            // ----------Global Stability Analysis or Rationale is required
            if (Y_N.equals("Yes")) {

                Msg.Info(" Upload the  Attachment 'Global Stability Analysis or Rationale is required:");
                try {
                    WebDriverWait wait1 = new WebDriverWait(Browser.driver, 23);
                    Browser.Sleep(Browser.Mill_Sec());
                    wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@id,'globalStabilityAnalysisUploadBtnId')]"))).click();
                    EPM.Verify.Upload_pagedispaly();
                    WebElement browseButton1236 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'globalStabilityAnalysisDocIdFileUploadId_input')]")));
                    browseButton1236.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                    System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                    Browser.Sleep(Browser.Mill_Sec());
                    UpLoad_File();
                    EPM.Verify.Upload_page_display_Hidden();
                } catch (Exception e) {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[contains(@id,'globalStabilityAnalysisRationaleInTxtId')]"))).sendKeys("Rock the world");
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[contains(@id,'globalStabilityAnalysisRationaleInTxtId')]"))).sendKeys("     ,  it's your life");

                }


            }
            Msg.Done();
        }

        public static void Facility_Equipment_DETAILS_Dehydrator(String ElectricPrime) {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 8);
            try {
                Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS Dehydrator' ");
                if (wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@id,'proposedNumberOfDehydratorsInTxtId')]"))).isDisplayed()) {

                    Browser.Sleep(Browser.Mill_Sec());
                    //*[contains(@id,'deosDocIdFileUploadId_input')]
                    Crd_Conditions_Advisory.Click.Scrolldown();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@id,'proposedNumberOfDehydratorsInTxtId')]"))).sendKeys(ElectricPrime);
                    // ----------Gas Processing Plan Proliferation Review:
                    Msg.Info(" Upload the  Attachment 'Changes Effect Existing Dehydration Processes:");
                    Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[contains(@id,'deosUploadBtnId')]"))).click();
                    EPM.Verify.Upload_pagedispaly();
                    WebElement browseButton123 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //*[contains(@id,'deosDocIdFileUploadId_input')]")));
                    browseButton123.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                    System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                    Browser.Sleep(Browser.Mill_Sec());
                    UpLoad_File();
                    EPM.Verify.Upload_page_display_Hidden();

                }
            } catch (Exception e) {

            }

            Msg.Done();
        }

        public static void Facility_Equipment_DETAILS_Vent_Stack(String ElectricPrime) {
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            Msg.Info("Enter Details for the 'Facility_Equipment_DETAILS Vent Stack' ");
            Browser.Sleep(Browser.Mill_Sec()); //*[contains(@id,'proposedNumberOfVentStacksInTxtId')]
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@id,'proposedNumberOfVentStacksInTxtId')]"))).sendKeys(ElectricPrime);
            Msg.Done();
        }

        public static void Technical_Specification_Details() {
            Msg.Info("Enter Details for  the 'Technical Specification Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:constructionStartDateClrId_input"))).sendKeys("07-10-2019");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:cumulativeVentingRateInTxtId"))).sendKeys("99999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingActivityRateInTxtId"))).sendKeys("99999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:methodInTxtId"))).sendKeys("Test");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingTypeCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityPowerSourceCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityQ8SecurityCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityQ6DesignCodesSltMnyLstId\"]/div[2]/ul/li[1]"))).click();


            Msg.Done();
        }

        public static void GeoPhysicalTechnical_Specification_Details() {
            Msg.Info("Enter Details for  the 'Technical Specification Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:cumulativeVentingRateInTxtId"))).sendKeys("99999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingActivityRateInTxtId"))).sendKeys("99999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:methodInTxtId"))).sendKeys("Test");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingTypeCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityPowerSourceCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityQ8SecurityCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityQ6DesignCodesSltMnyLstId\"]/div[2]/ul/li[1]"))).click();


            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:q7SandFractureIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:q7SandFractureIndBtnId\"]/div[2]/span"))).click();

            Msg.Done();
        }


        public static void Technical_Specification_Details_OGAA() {
            Msg.Info("Enter Details for  the 'Technical Specification Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:q1AirContaminantsIndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:q4Section_6_IndBtnId\"]/div[2]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:q2Section_2_1_IndBtnId\"]/div[2]/span"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:constructionStartDateClrId_input"))).sendKeys("07-10-2019");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:cumulativeVentingRateInTxtId"))).sendKeys("99999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingActivityRateInTxtId"))).sendKeys("99999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId:methodInTxtId"))).sendKeys("Test");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingTypeCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityVentingActivityTOsDtaTblId:0:ventingTypeCodeSlctId_panel\"]/div/ul/li[2]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityPowerSourceCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityQ8SecurityCodeSltMnyLstId\"]/div[2]/ul/li[1]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:technicalSpecificAcdPnlId:facilityQ6DesignCodesSltMnyLstId\"]/div[2]/ul/li[1]"))).click();


            Msg.Done();
        }
    }


    public static class Gas_Processing_Plant_Details {
        public static void All_Information() {
            Msg.Info("Enter the Details for 'Gas Processing Plant Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:facilityGasTypeTOsDtaTblId:0:gasTypeCapacityInTxtId"))).sendKeys("9999999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:facilityGasTypeTOsDtaTblId:0:recoveryEfficiencyInTxtId"))).sendKeys("999");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:facilityGasTypeTOsDtaTblId:0:gasTypeCapacityRecoveryCodeSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:facilityGasTypeTOsDtaTblId:0:gasTypeCapacityRecoveryCodeSlctId_panel\"]/div/ul/li[2]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:facilityAgsH2SCodesSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:facilityAgsH2SCodesSlctId_panel\"]/div/ul/li[3]"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:facilityAgsCO2CodesSlctId\"]/div[3]/span"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:facilityAgsCO2CodesSlctId_panel\"]/div/ul/li[3]"))).click();
            Msg.Done();
            // ----------Gas Processing Plan Proliferation Review:
            Msg.Info(" Upload the  Attachment 'Gas Processing Plan Proliferation Review:\n:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:facilitySpecificAcdPnlId:proliferationUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            WebElement browseButton123 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:proliferationDocIdFileUploadId_input")));
            browseButton123.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();

            // ----------Gas Processing Plan Proliferation Review:
            Msg.Info(" Upload the  Attachment 'Gas Processing Plan Proliferation Review:\n:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:facilitySpecificAcdPnlId:proliferationUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:proliferationDocIdFileUploadId_input"))).sendKeys(Uploadfilepath);
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();


        }


        public static void A105001All_Information() {
            Msg.Info("Enter the Details for 'Gas Processing Plant Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            Crd_Conditions_Advisory.Click.Scrolldown();
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:sulphurEmissionGasCapacityInTxtId"))).sendKeys("23");


            // ----------Gas Processing Plan Proliferation Review:
            Msg.Info(" Upload the  Attachment 'Gas Processing Plan Proliferation Review:\n:'");
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:facilitySpecificAcdPnlId:proliferationUploadBtnId"))).click();
            EPM.Verify.Upload_pagedispaly();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:proliferationDocIdFileUploadId_input"))).sendKeys(Uploadfilepath);
            System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
            Browser.Sleep(Browser.Mill_Sec());
            UpLoad_File();
            EPM.Verify.Upload_page_display_Hidden();

            Msg.Done();


        }


    }


    public static class Area_Details {
        public static void All_Information(String OccupiedDwelling, String UrbanCentre, String nearestSchool, String nearestPopulatedArea) {
            Msg.Info("Enter the Details for 'Area Details' ");
            Browser.Sleep(Browser.Mill_Sec());
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

    public static class Emissions_Air_Details {
        public static void All_Information(String dehydrBenzAnnualEmissionsInTxtId, String totalFlaredVolumeInTxtId, String distanceDehydrator, String Y_N) {
            Msg.Info("Enter the Details for 'Area Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:benzeneEmissionsPerYearInTxtId"))).sendKeys(dehydrBenzAnnualEmissionsInTxtId);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"Benzene Emissions per Calendar Year (Tonnes):\")]"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:distanceDehydratorNearestDevelopmentInTxtId")));
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:totalFlaredVolumeInTxtId"))).sendKeys(totalFlaredVolumeInTxtId);
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:distanceDehydratorNearestDevelopmentInTxtId"))).sendKeys(distanceDehydrator);
            Msg.Done();
            // ----------:
            if (Y_N.equals("Yes")) {
                Msg.Info(" Upload the  Attachment 'Dispersion Model:'");
                Browser.Sleep(Browser.Mill_Sec());

                boolean upload = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@id,'dispersionModelUploadBtnId')]"))).isDisplayed();
                if (upload == true) {
//                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilitySpecificAcdPnlId:inletGas1h2sDispModelIndBtnId\"]/div[2]/span"))).click();


                    Java_script_executor(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@id,'dispersionModelUploadBtnId')]"))));
                    EPM.Verify.Upload_pagedispaly();
                    Browser.Sleep(Browser.Mill_Sec());
                    try {
                        WebDriverWait wait1 = new WebDriverWait(Browser.driver, 23);
                        WebElement browseButton123 = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:dispersionModelDocIdFileUploadId_input")));
                        browseButton123.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                    } catch (Exception e) {
                        WebDriverWait wait1 = new WebDriverWait(Browser.driver, 5);
                        WebElement browseButton123 = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:facilitySpecificAcdPnlId:dispersionModelDocIdFileUploadId_input")));
                        browseButton123.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                    }

                    System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                    Browser.Sleep(2000);
                    UpLoad_File();


                    EPM.Verify.Upload_page_display_Hidden();

                }

            }
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


    }

    public static class Click {
        public static void Facility_Overview() {
            Msg.Info("Click on the 'Facility Overview' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:efdAreaOverviewTabId"))).click();
            Msg.Done();
        }

        public static void Facility_Details() {
            Msg.Info("Click on the 'Facility Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:efdDetailTabId"))).click();
            Msg.Done();
        }

        public static void Facility_Land_Details() {
            Msg.Info("Click on the 'Facility Land Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:efdLandDetailTabId"))).click();
            Msg.Done();
        }

        public static void Technical_Specification_Details() {
            Msg.Info("Click on the 'Technical Specification Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:technicalSpecificAcdPnlId"))).click();
            Msg.Done();
        }

        public static void Facility_Equipment_Details() {
            Msg.Info("Click on the 'Facility Equipment Details' ");
           Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"appFrmId:facilityEquipmentAcdPnlId:facilityEquipmentTabId_header\"]//*[contains(text(),'Facility Equipment Details')]"))).click();
            Msg.Done();
        }

        public static void AmendFacility_Equipment_Details() {
            Msg.Info("Click on the 'Facility Equipment Details' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"appFrmId:facilityEquipmentAcdPnlId\"]/h3/a/table/tbody/tr/td"))).click();
            Msg.Done();
        }

        public static void Exemption() {
            Msg.Info("Click on the 'Exemption' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:exemptionsAcdPnlId"))).click();
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

        public static void Remove_Segment() {
            Msg.Info("Click on the 'Remove Segment' ");
            Browser.Sleep(Browser.Mill_Sec());
            WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
            Crd_Conditions_Advisory.Click.Scrolldown();
            Crd_Conditions_Advisory.Click.Scrolldown();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.not-current"))).click();
            Browser.Sleep(Browser.Mill_Sec());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:removeFacilityIdBtnId"))).click();
            Browser.Sleep(500);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesBtnId"))).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progressDialogId")));
            Msg.Done();
        }
    }

}



