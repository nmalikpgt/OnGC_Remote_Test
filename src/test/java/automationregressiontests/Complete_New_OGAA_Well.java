package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.*;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Listerner;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLException;

@Listeners(Listerner.class)
public class Complete_New_OGAA_Well {


    @Test(groups = "Separate")

    public static void New_OGAA_WELL() throws SQLException, ClassNotFoundException {

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ---- Create_Application
        //----------------------

        Create_Application.Click.Create_Application();
        Create_Application.Link.New_OGAA();
        Create_Application.NewOGAA.Activites.Well();
        Create_Application.Click.Next();
        Create_Application.Select_Proponent.Who_is_the_Project_Proponent();
        Create_Application.Click.Next();
        Create_Application.Application_Description();
        Create_Application.Click.I_agree();
        Create_Application.Click.Next();

        //----------------------
        // ----  Spatial_Data_Submission
        //----------------------

        Spatial_Data_Submission.Shapefile_Projection.Nad_83_BC_Albers();
        Spatial_Data_Submission.Upload_Shapefiles_For_OGAA_WELL();
        Spatial_Data_Submission.Validate_and_Save_Shapefiles_to_Application();
        Spatial_Data_Submission.Verify_Status_Successful();
        EPM.Verify.Progress_Message();
        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();

        //----------------------
        // ----  Well_Land_Area_1
        //----------------------

        NEW_OGAA.Activity_information.Activites.Well_Land_Area_1();
        EPM.Verify.Progress_Message();
        EPM.Verify.Verify_Status__BCGS_Map();
        Well.Enter.Activity_Description();
        Well.Enter.ALPL_Working_Interest_Partner();
        Well.Oil_Gas_Field_Name();
        Well.Enter.Please_list_all_caveats();
        Well.Area_Details.All_Information("10", "10", "10", "10");
        Well.PNG_Tenure_Rights_ID();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Well.Click.Well_Details();
        Well.Well_DETAILS_Specifications.WA_Number("00036");
        Well.Well_DETAILS_Specifications.COR_RE_ENTRY_DETAILS("10", "11", "12", "18", "11", "19", "20");
        Well.Click.Add_Bottom_Hole();
        Well.Well_DETAILS_Specifications.Bottom_Hole_Details("13", "14", "98", "99");
        Well.Click.Well_Hazard_Planning();
        Well.Well_DETAILS_Specifications.Well_Hazard_Planning_DETAILS("15", "13", "14", "16", "17");
        Well.Click.Flaring();
        Well.Well_DETAILS_Specifications.Flaring();
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
        Agriculture.Agriculture_Details.Enter.Appendix_II_Rationale();
        Agriculture.Agriculture_Details.Upload_Requried_Attachment.Schedule_A_required();
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
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Exemption_Approval();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Package_of_Replies_and_Responses_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Ownership_Map_Doc();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
        Consultation_Notification.Consultation_Notification_Details.Click.Written_Submission_Received_by_Non_engaged_Persons();
        Consultation_Notification.Consultation_Notification_Details.Click.Case_File_Numbe();
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

        EPM.EPMPAY.EPMpay();


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
      //  Composite_Application_Review.Click.Admin_Review_Details_Forest();
        Composite_Application_Review.Review_Summary();
        Composite_Application_Review.Click.Complete_Task();
        Composite_Application_Review.Click.Continue();





        //------------------------------------------------------------------------

        //-----------     Agriculture Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Agriculture");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Agriculture");
        GroupTask.Actions.Select.Execute_Task();
        Agriculture_Review.Click.Task_Comment("");
        Agriculture_Review.Agriculture_Review_deTAILS("Alc");
        Agriculture_Review.Agriculture_Check_List_Review.Complete();
        Agriculture_Review.Agriculture_Check_List_Review.Enter_Text();
        Agriculture_Review.Review_Summary();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Custom_Agriculture_Edit_Highlited();
        Agriculture_Review.Agriculture_Activities.Set_Activity_Recommendation.Recommend();
        Agriculture_Review.Agriculture_Activities.Set_Activity_Recommendation.Apply_to_All();
        Agriculture_Review.Agriculture_Activities.Set_Activity_Recommendation.All_Activities();
        Agriculture_Review.Click.Complete_Task();
        Agriculture_Review.Click.Continue();





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

        //----------------------------------------------------

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

        //-----------    	Community Relations Review

        //------------------------------------------------------------------------
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
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Consultation_Notification_Engineering_Review.Review_Summary();
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Consultation_Notification_Engineering_Review.Click.Complete_Task();
        Consultation_Notification_Engineering_Review.Click.Continue();

        //------------------------------------------------------------------------

        //-----------   SDM Review And Determination  New OGAA Test

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
       // Crd_Conditions_Advisory.Click.Advisory_SDM_Edit_Highlited();
        SDM_Review_And_Determination.Click.Determination();
        SDM_Review_And_Determination.Click.Task_Comment("");
        SDM_Review_And_Determination.Decision_Maker_Notes();
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
