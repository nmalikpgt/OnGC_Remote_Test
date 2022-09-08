package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.DataBase_Connection;
import com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.*;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class EPMFA103001_Amendment_Facility_Technical_Land {


    @Test

    public static void EPMFA103001Amendment_Facility_Technical_Land() throws SQLException, ClassNotFoundException {

        DataBase_Connection.updateStatus_100006745();

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.Amendment();
        Create_Application.Click.Next();
        Create_Application.Amendment.Enter.Amendment_Activity_ID_FACID("00018790");
        Create_Application.Click.FACID_00018790();
        Create_Application.Click.Amendment_Next_Page1();
        Create_Application.Click.Technical();
        Create_Application.Click.Amendment_Land();
        Create_Application.Click.Amendment_Next_Page2();
        Create_Application.Application_Description();
        Create_Application.Click.I_agree();
        Create_Application.Click.Next();

        //----------------------
        // ----  Spatial_Data_Submission
        //----------------------

        Spatial_Data_Submission.Shapefile_Projection.Nad_83_BC_Albers();
        Spatial_Data_Submission.Upload_Shapefiles_For_fa101024();
        Spatial_Data_Submission.Validate_and_Save_Shapefiles_to_Application();
        Spatial_Data_Submission.Verify_Status_Successful();
        EPM.Verify.Progress_Message();
        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();

        //----------------------
        // ---- Facility Overview
        //----------------------------
        Amendment.Click.Facility_Land_Area();
        EPM.Verify.Verify_Status__BCGS_Map();
        Facility.Enter.Activity_Description();
        Facility.Area_Details.All_Information("5", "6", "7", "8");
        Facility.Amendment.Is_the_activity_within_a_previously_assessed_construction_corridor();
        Facility.Amendment.Does_this_project_require_BCEAO_Approval();
        Facility.Amendment.Does_this_project_require_CEA_Approval();
        Facility.Facility_overview_Upload_Files.All_Attachments_of_this_Page();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Facility.Click.Facility_Details();
        Facility.Facility_DETAILS_Specifications.FAC("0.1", "0.2", "3", "4", "5", "6", "", "Compressor");
        Facility.Amendment.Will_the_proposed_application_include_routine_combustion_of_sour_gas_and_or_combustion_of_gas_containing_1_mole_percent_H2S_for_a_duration_of_15_minutes_or_that_results_in_1_tonne_rolling_24_hrs_of_sulphur_emissions();
        Facility.Emissions_Air_Details.All_Information("237", "23789", "237", "Yes");
        Facility.Click.Facility_Equipment_Details();
        Facility.Facility_DETAILS_Specifications.Facility_Equipment_DETAILS("12", "237", "12", "No");
        Facility.Click.Technical_Specification_Details();
        Facility.Facility_DETAILS_Specifications.Technical_Specification_Details();
        Facility.Amendment.Has_a_sand_fracture_been_completed_at_one_or_more_of_the_wells();
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
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Archaeologist("john");
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Drilling_Engineer("john");
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Facility_Engineer("john");
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Pipeline_Engineer("john");
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Land
        //----------------------
        EPM.Application_Management.Land();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Forestry
        //----------------------
        EPM.Application_Management.Forestry();
        Forestry.Forestry_Details.Click.New_Cut_Required();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Stewardship
        //----------------------
        EPM.Application_Management.Stewardship();
        Stewardship.Stewardship_Details.Upload_Requried_Attachment.Mitigation_Stragegy();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Agriculture
        //----------------------
        EPM.Application_Management.Agriculture();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Archaeology
        //----------------------
        EPM.Application_Management.Archaeology();
        Archaeology.Upload_File.Archaeology_Report_Attached();
        Archaeology.Click.Administrative_Change_Only();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Borden_Number();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Type_of_Field_Work_Completed();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Borden_Number_and_Distance();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Other_Type_of_Assessment();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Brief_Site_Mitigation_Description();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Sources_to_identify_archaeological_potential();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Specify_factors_used_to_assess_potential();
        Archaeology.Upload_File.Mitigation_Approval_letter();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Consultation_Notification
        //----------------------
        EPM.Application_Management.Consultation_Notification();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Line_List_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Map_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Ownership_Map_Doc();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Package_of_Replies_and_Responses_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Enter.Amrndment_Consultation_Notification_Details();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----First_Nations
        //----------------------
        EPM.Application_Management.First_Nations();
        First_Nations.First_Nations_Details.Click.Gitxsan_Hereditary_Chiefs_GDC();
        First_Nations.First_Nations_Details.Upload_File.First_Nations_Project_Description_Form();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
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
        //----------------------

        Browser.Goto.CRDLoginPage();

        //------------------------------------------------------------------------

        //-----------     Composite Application Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Click.Group_Advanced_Filtering();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Composit");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Click.MyTask_Advanced_Filtering();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Composit");
        GroupTask.Actions.Select.Execute_Task();
        Composite_Application_Review.Click.Task_Comment("");
        Composite_Application_Review.Click.Composite_Application_Checklist();
        Composite_Application_Review.Review_Summary();
        Composite_Application_Review.Click.Complete_Task();
        Composite_Application_Review.Click.Continue();

        //------------------------------------------------------------------------

        //-----------    Land & Habitat Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Land");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Land");
        GroupTask.Actions.Select.Execute_Task();
        Land_Habitat_Review.Click.Task_Comment("");
        Land_Habitat_Review.Click.Land_And_Habitat_Checklist();
        Land_Habitat_Review.Review_Summary();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Land_Habitat_Review.Click.Complete_Task();
        Land_Habitat_Review.Click.Continue();


//------------------------------------------------------------------------

        //-----------    	Community Relations Review

        //------------------------------------------------------------------------
        try {
            Crd_HomePage.Click.Group_Tasks();
            GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Community");
            GroupTask.Actions.Select.Assign_Task_to_Me();
            Crd_HomePage.Click.My_Task();
            GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Community");
            GroupTask.Actions.Select.Execute_Task();
            Community_Relations_Review.Click.Task_Comment("");
            Community_Relations_Review.Click.Community_Relations__Checklist();
            Community_Relations_Review.Review_Summary();
            Community_Relations_Review.Click.Complete_Task();
            Community_Relations_Review.Click.Continue();
        } catch (Exception e) {
            e.printStackTrace();
        }
//------------------------------------------------------------------------

        //-----------    Archaeology Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Archaeology");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Archaeology");
        GroupTask.Actions.Select.Execute_Task();
        Archaeology_Review.Click.Task_Comment("");
        Archaeology_Review.Click.Archaeology_Check_List();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.Work_Requried();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.OGC_Alteration();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.APTS_Alteration_Permit();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.Field_Work_Requirement_Type();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.Report_Received_Date();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.Assessment_Result();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.Requirement_Met();
        Archaeology_Review.Archaeology_Review_Details.Non_Geophysical.Mitigation_Approved();
        Archaeology_Review.Review_Summary();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Custom_Borden_numbers_Edit_Highlited();
        Archaeology_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Archaeology_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Archaeology_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Archaeology_Review.Click.Complete_Task();
        Archaeology_Review.Click.Continue();
        //------------------------------------------------------------------------

        //-----------     Facility_Engineering_Review

        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Facility");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Facility");
        GroupTask.Actions.Select.Execute_Task();
        Facility_Engineering_Review.Click.Task_Comment("");
        Facility_Engineering_Review.Click.Facility__Engineering_Checklist();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Facility();
        Facility_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Facility_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Facility_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Facility_Engineering_Review.Click.Complete_Task();
        Facility_Engineering_Review.Click.Continue();


        //------------------------------------------------------------------------

        //-----------     	Environmental Management Review

        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Environmental");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Environmental");
        GroupTask.Actions.Select.Execute_Task();
        Environmental_Management_Engineering_Review.Click.Task_Comment("");
        Environmental_Management_Engineering_Review.Click.Enviranmental_Management_Engineering_Checklist();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();

        Environmental_Management_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Environmental_Management_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Environmental_Management_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Environmental_Management_Engineering_Review.Click.Complete_Task();
        Environmental_Management_Engineering_Review.Click.Continue();


        //------------------------------------------------------------------------

        //-----------     Consultation_Notification_Engineering_Review

        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Consultation & Notification Review");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Consultation & Notification Review");
        GroupTask.Actions.Select.Execute_Task();
        Consultation_Notification_Engineering_Review.Click.Task_Comment("");
        Consultation_Notification_Engineering_Review.Click.Consultation_Notification_Engineering_Checklist();
        Consultation_Notification_Engineering_Review.Review_Summary();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();

        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Consultation_Notification_Engineering_Review.Click.Complete_Task();
        Consultation_Notification_Engineering_Review.Click.Continue();

//------------------------------------------------------------------------

        //-----------   FN Consultation

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "FN Consultation");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "FN Consultation");
        GroupTask.Actions.Select.Execute_Task();
        FN_Consultation_Review.Click.Task_Comment("");
        FN_Consultation_Review.Click.FN_Consultation_Check_List();
        FN_Consultation_Review.Referral_Package_Summary.Circulation_Method.Email("Email");
//FN_Consultation_Review.Referral_Package_Summary.Circulation_Method.Online();

        FN_Consultation_Review.Referral_Package_Summary.Response_Due_Date();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Log();
        FN_Consultation_Review.Referral_Package_Summary.Weekly_Status_Report_Comment();
        FN_Consultation_Review.Review_Summary();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.FN_Edit_Highlited();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        FN_Consultation_Review.Referral_Package_Summary.Consultation_Type();
        FN_Consultation_Review.Verify_Status__Completed();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Status("Sum");
        FN_Consultation_Review.Click.Save();
        FN_Consultation_Review.Click.Complete_Task();
        FN_Consultation_Review.Click.Continue();


        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "FN Consultation");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "FN Consultation");
        GroupTask.Actions.Select.Execute_Task();
        FN_Consultation_Review.Click.FN_Consultation_Check_List();
        FN_Consultation_Review.Referral_Package_Summary.Circulation_Method.Email("Email");
        FN_Consultation_Review.Referral_Package_Summary.Response_Due_Date();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Log();
        FN_Consultation_Review.Referral_Package_Summary.Weekly_Status_Report_Comment();
        FN_Consultation_Review.Review_Summary();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.FN_Edit_Highlited();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        FN_Consultation_Review.Referral_Package_Summary.Consultation_Type();
        FN_Consultation_Review.Verify_Status__Completed();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Status("Sum");
        FN_Consultation_Review.Click.Save();
        FN_Consultation_Review.Click.Complete_Task();
        FN_Consultation_Review.Click.Continue();


        //------------------------------------------------------------------------

        //-----------   SDM Review And Determination  Amendment

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "SDM Review And Determination");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "SDM Review And Determination");
        GroupTask.Actions.Select.Execute_Task();
        SDM_Review_And_Determination.Click.Decision_Maker_Checklist();
        SDM_Review_And_Determination.Decision_Maker_Checklist.Complete();
        SDM_Review_And_Determination.Decision_Maker_Checklist.Enter_Text();
        SDM_Review_And_Determination.Click.Permit_Generation();
        Crd_Conditions_Advisory.Click.Conditions.SDM_Add_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.SDM_Add_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        SDM_Review_And_Determination.Click.Determination();
        SDM_Review_And_Determination.Click.Task_Comment("");
        SDM_Review_And_Determination.Decision_Maker_Notes();
        SDM_Review_And_Determination.Amendment_Fee_Type();
        SDM_Review_And_Determination.High_Risk("No");
        SDM_Review_And_Determination.Click.Approve_Desicion();
        SDM_Review_And_Determination.Click.Complete_Task();
        SDM_Review_And_Determination.Click.Continue();


        //------------------------------------------------------------------------

        //-----------  Post_Decision_Tasks

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Post Decision Tasks");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Post Decision Tasks");
        GroupTask.Actions.Select.Execute_Task();
        Post_Decision_Tasks.Click.Task_Comment("");
        Post_Decision_Tasks.Click.Post_Decision_Checklist();
        Post_Decision_Tasks.Review_Summary();
        Post_Decision_Tasks.Click.Complete_Task();
        Post_Decision_Tasks.Click.Continue();


        DataBase_Connection.updateStatus_Application(appNumScreen);
        //SDM_Review_And_Determination.Click.Withdraw_Application();


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
