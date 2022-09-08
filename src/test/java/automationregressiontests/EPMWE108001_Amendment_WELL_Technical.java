package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.DataBase_Connection;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.*;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class EPMWE108001_Amendment_WELL_Technical {


    @Test

    public static void EPMWE108001Amendment_WELL_Technical() throws SQLException, ClassNotFoundException {

        DataBase_Connection.updateStatus_100032195();

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.Amendment();
        Create_Application.Click.Next();
        Create_Application.Amendment.Enter.Amendment_Activity_ID_WA("14780");
        Create_Application.Click.Amendment_Next_Page1();
        Create_Application.Click.Technical();
        Create_Application.Click.Amendment_Next_Page2();
        Create_Application.Application_Description();
        Create_Application.Click.I_agree();
        Create_Application.Click.Next();

        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();

        //----------------------
        // ---- WELL Overview
        //----------------------------
        Amendment.Click.Well_Land_Area();
        EPM.Verify.Progress_Message();
        Well.Enter.Activity_Description();
        Well.Click.Is_the_activity_within_a_previously_assessed_construction_corridor();
        Well.Click.Does_the_proposed_application_adhere_to_the_conditions_of_the_PNG_tenure();
        Well.Click.Does_the_proponent_hold_PNG_rights_to_all_PNG_tenures();
        Well.Click.Does_the_PNG_tenure_include_caveats();
        Well.Area_Details.All_Information("10", "5", "35", "15");
        Well.PNG_Tenure_Rights_ID();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Well.Click.Well_Details();
        Well.Click.Well_Type();
        Well.Click.Based_on_the_well_classification_selected_the_applicant_concurs_that_the_BC_Oil_Gas_Commission_may_release_any_well_reports_an_well_data_for_the_well_from_confidential_status_in_accordance_with_the_timelines_prescribed_in_Section_17_1_of_the_OGAA_General_Regulation();
        Well.Click.Water_Characteristics();
        Well.Click.Ground_Water_Assessment_Attached();
        Well.Click.Is_this_a_reviewable_project_by_the_Environmental_Assessment_office();
        Well.Click.Well_Hazard_Planning();
        Well.Click.YesCritical_Features_within_EPZ_Details();
        Well.Well_DETAILS_Specifications.Well_Hazard_Planning_DETAILS("2", "10", "5", "10", "5");
        Well.Click.Flaring();
        Well.Well_DETAILS_Specifications.Flaring();
        Well.Click.Fracturing_Details();
        Well.Amendments_Well_Details.Additional_information();
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
        // ----Consultation_Notification
        //----------------------
        EPM.Application_Management.Consultation_Notification();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Line_List_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Map_Attached();
     //   Consultation_Notification.Consultation_Notification_Details.Upload_File.Exemption_Approval();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Package_of_Replies_and_Responses_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Ownership_Map_Doc();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Enter.Amrndment_Consultation_Notification_Details();
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
            //------------------------------------------------------------------------
        } catch (Exception e) {
            e.printStackTrace();
        }

        //-----------     	DP_Engineering_Review


        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "D&P");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "D&P");
        GroupTask.Actions.Select.Execute_Task();
        DP_Engineering_Review.Click.Task_Comment("");
        DP_Engineering_Review.Click.DP_Engineering_Checklist();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Custom_DP_Engineering_Edit_Highlited();

        DP_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        DP_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        DP_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        DP_Engineering_Review.Click.Complete_Task();
        DP_Engineering_Review.Click.Continue();
        //------------------------------------------------------------------------

        //-----------     	Hydrogeology


        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Hydrogeology");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Hydrogeology");
        GroupTask.Actions.Select.Execute_Task();
        Hydrogeology.Click.Task_Comment("");
        Hydrogeology.Click.Hydrology_Checklist();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Hydrogeology.Application_Activities.Set_Activity_Recommendation.Recommend();
        Hydrogeology.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Hydrogeology.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Hydrogeology.Click.Complete_Task();
        Hydrogeology.Click.Continue();

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
        Crd_Conditions_Advisory.Click.SDMCustom_Pipeline_Edit_Highlited();

        SDM_Review_And_Determination.Click.Determination();
        SDM_Review_And_Determination.Click.Task_Comment("");
        SDM_Review_And_Determination.Decision_Maker_Notes();
        SDM_Review_And_Determination.Amendment_Fee_Type();
        SDM_Review_And_Determination.High_Risk("No");
        SDM_Review_And_Determination.Click.Approve_Desicion();
        SDM_Review_And_Determination.Click.Complete_Task();
        SDM_Review_And_Determination.Click.Continue();
        //   SDM_Review_And_Determination.Click.Withdraw_Application();
        DataBase_Connection.updateStatus_Application(appNumScreen);

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