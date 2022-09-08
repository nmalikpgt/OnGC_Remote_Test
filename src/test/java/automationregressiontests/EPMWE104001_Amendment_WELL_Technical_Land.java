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

public class EPMWE104001_Amendment_WELL_Technical_Land {


    @Test()

    public static void EPMWE104001Amendment_WELL_Technical_Land() throws SQLException, ClassNotFoundException {

        DataBase_Connection.updateStatus_100027991();

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.Amendment();
        Create_Application.Click.Next();
        Create_Application.Amendment.Enter.Amendment_Activity_ID_WA("13324");
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
        Spatial_Data_Submission.Upload_Shapefiles_For_we101031();
        Spatial_Data_Submission.Validate_and_Save_Shapefiles_to_Application();
        Spatial_Data_Submission.Verify_Status_Successful();
        EPM.Verify.Progress_Message();
        String appNumScreen = Create_Application.Application_Number();
      Msg.Done();
        //----------------------
        // ---- WELL Overview
        //----------------------------
        Amendment.Click.Well_Land_Area();
        EPM.Verify.Progress_Message();
        EPM.Verify.Verify_Status__BCGS_Map();
        Well.Enter.Activity_Description();
        Well.Click.Is_the_activity_within_a_previously_assessed_construction_corridor();
        Well.Click.Does_the_proposed_application_adhere_to_the_conditions_of_the_PNG_tenure();
        Well.Click.Does_the_proponent_hold_PNG_rights_to_all_PNG_tenures();
        Well.Click.Does_the_PNG_tenure_include_caveats();
        Well.Area_Details.All_Information("85", "15", "74", "21");
        Well.PNG_Tenure_Rights_ID();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Well.Click.Well_Details();
        Well.Click.Based_on_the_well_classification_selected_the_applicant_concurs_that_the_BC_Oil_Gas_Commission_may_release_any_well_reports_an_well_data_for_the_well_from_confidential_status_in_accordance_with_the_timelines_prescribed_in_Section_17_1_of_the_OGAA_General_Regulation();
        Well.Click.Well_Hazard_Planning();
        Well.Click.Well_Hazard_Planning_NO();
      Well.Click.Critical_Features_within_EPZ_Details();
        Well.Click.Flaring();
        Well.Well_DETAILS_Specifications.Flaring();
        Well.Click.Fracturing_Details();
      Well.Amendments_Well_Details.Fracture_Simulation_Model();

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
        Stewardship.Stewardship_Details.Click.Environmental_Protection_and_Management_Guideline();
        Stewardship.Stewardship_Details.Click.Is_an_exemption_requested_from_Part_3_of_the_Environmental_Protection_and_Management_Regulation();
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
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Exemption_Approval();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Package_of_Replies_and_Responses_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Ownership_Map_Doc();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Enter.Amrndment_Consultation_Notification_Details();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();

        //----------------------
        // ----First_Nations
        //----------------------
        EPM.Application_Management.First_Nations();
        First_Nations.First_Nations_Details.Click.Fort_Nelson_First_Nation();
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
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
      Crd_Conditions_Advisory.Click.Dam_NAme_Edit_Highlited();

        Crd_Conditions_Advisory.Click.Custom_NEB_Land_Edit_Highlited();

        Land_Habitat_Review.Review_Summary();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Land_Habitat_Review.Click.Complete_Task();
        Land_Habitat_Review.Click.Continue();

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

        //----------------------------------------------------
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
       // SDM_Review_And_Determination.Click.Withdraw_Application();


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
        DataBase_Connection.updateStatus_Application(appNumScreen);


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
