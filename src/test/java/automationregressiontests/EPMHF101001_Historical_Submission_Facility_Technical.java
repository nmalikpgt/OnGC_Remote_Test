package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.DataBase_Connection;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.GroupTask;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Historical_Review;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class EPMHF101001_Historical_Submission_Facility_Technical {
    @Test

    public static void  EPMHF101001Historical_Submission_Facility_Technical() throws SQLException, ClassNotFoundException {


        DataBase_Connection.updateStatus_100023613();

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.Historical_Submission();
        Create_Application.Historical_Submission.Activites.Facility();
        Create_Application.Click.Next();
        Create_Application.Historical_Submission.Activites.Activity_ID("00019456");
        Create_Application.Click.FACID_00019456();
        Create_Application.Click.Amendment_Next_Page1();
        Create_Application.Click.Technical();
        Create_Application.Click.Amendment_Next_Page2();
        Create_Application.Application_Description();
        Create_Application.Click.I_agree();
        Create_Application.Click.Next();
        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();


        //----------------------
        // ---- Facility Overview
        //----------------------------
        Amendment.Click.Facility_Land_Area();
        Facility.Enter.Activity_Description();
        Facility.Amendment.Does_this_project_require_BCEAO_Approval();
        Facility.Amendment.Does_this_project_require_CEA_Approval();
        Facility.Area_Details.All_Information("5", "6", "7", "8");
        Facility.Facility_overview_Upload_Files.All_Attachments_of_this_Page();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Facility.Click.Facility_Details();
        Facility.Amendment.Will_the_proposed_application_include_routine_combustion_of_sour_gas_and_or_combustion_of_gas_containing_1_mole_percent_H2S_for_a_duration_of_15_minutes_or_that_results_in_1_tonne_rolling_24_hrs_of_sulphur_emissions();
        Facility.Facility_DETAILS_Specifications.FAC("1", "2", "3", "4", "5", "6", "","Compressor");
        Facility.Facility_DETAILS_Specifications.Notice_of_Construction_Start_Date("Yes");
        Facility.Facility_DETAILS_Specifications.Notice_of_Pressure_Testing_Date("Yes");
        Facility.Facility_DETAILS_Specifications.Leave_to_Open_Date("Yes");
       Facility.Emissions_Air_Details.All_Information("237", "23789", "2378", "Yes");
        Facility.Click.Facility_Equipment_Details();
        Facility.Facility_DETAILS_Specifications.Facility_Equipment_DETAILS("12", "237", "12", "No");
        Facility.Click.Technical_Specification_Details();
        Facility.Facility_DETAILS_Specifications.GeoPhysicalTechnical_Specification_Details();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();


        //--------------------------------
        // ----Application_information
        //----------------------------------

        EPM.Click.Application_information();

        //----------------------
        // ----Administrative
        //----------------------

        EPM.Application_Management.Administrative();
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Facility_Engineer("john");
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Pipeline_Engineer("john");
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Land_Agent("john");
        EPM.Click.Save();
        EPM.Verify.Progress_Message();

        //----------------------
        // ----Consultation_Notification
//        //----------------------
//        EPM.Application_Management.Consultation_Notification();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Line_List_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Map_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Exemption_Approval();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Package_of_Replies_and_Responses_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Ownership_Map_Doc();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Click.Unresolved_Concerns_by_persons_not_engaged();
//        Consultation_Notification.Consultation_Notification_Details.Click.Unresolved_Concerns_by_persons_not_engaged_Case_File_Number();
//        Consultation_Notification.Consultation_Notification_Details.Enter.Amrndment_Consultation_Notification_Details();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();

        //----------------------
        // ----Maps_Plans
        //----------------------
        EPM.Application_Management.Maps_Plans();
        Maps_Plans.Maps_Plans_Details.Enter.Survey_Company();
        Maps_Plans.Maps_Plans_Details.Enter.Job_Number();
        Maps_Plans.Maps_Plans_Details.Enter.Original_Plan_Date();
        Maps_Plans.Maps_Plans_Details.Enter.Sheet_Number();
        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Construction_Plan_Attached();
        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.BCGS_Map_Attached();
        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Upload_1_20000_BCGS_Map();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();

        //----------------------
        // ----OVERVIEW
        //----------------------
        EPM.Click.Overview();
        EPM.Verify.Progress_Message();
        Overview.Application_Overview.Enter.Contact_Name();
        Overview.Application_Overview.Enter.Permit_Distribution_Contact_Name();
        Overview.Application_Overview.OGC_Operational_Zones();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Overview.Application_Overview.Application();
        Overview.Application_Overview.Validate();
        Overview.Application_Overview.Application_Validation();
        Overview.Application_Overview.Verify.Validation_has_been_completed_successfully_and_the_application_is_complete_with_no_errors_Would_you_like_to_validate_the_application_again();
        Overview.Application_Overview.Application();
        EPM.Verify.Progress_Message();
        Overview.Application_Overview.Submit();
        EPM.Verify.Progress_Message();
        EPM.Click.Logout();
        //----------------------
        // ----CRD Login
        //----------------------= ,=

        Browser.Goto.CRDLoginPage();

        //------------------------------------------------------------------------

        //-----------     Historical Facility Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Click.Group_Advanced_Filtering();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Historical");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Click.MyTask_Advanced_Filtering();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Historical");
        GroupTask.Actions.Select.Execute_Task();
        Historical_Review.Click.Task_Comment("");
        Historical_Review.Click.bHistorical_Facility_Checklist();
        Historical_Review.Review_Summary();
        Historical_Review.Application_Activity();
        Historical_Review.Click.Complete_Task();
        Historical_Review.Click.Cancel();
        Historical_Review.Click.Withdraw_Application();

        EPM.Click.CRD_Logout();

    }

   @BeforeMethod(alwaysRun = true)
    public void SETUP() {
        Browser.UserAccess();
    }
        @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
            Browser.CleanUp();
    }


   }
