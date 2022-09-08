package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.*;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompleteNEBtoCRD_OGCTEST {
    @Test(groups = "Separate")
    public static void NEBtoCRD_OGCTEST() {

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.New_NEB_Related();
        Create_Application.New_NEB_Related.Activites.All_Activies();
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
        Spatial_Data_Submission.Upload_Shapefiles_For_NEBOGC();
        Spatial_Data_Submission.Validate_and_Save_Shapefiles_to_Application();
        Spatial_Data_Submission.Verify_Status_Successful();
        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();
        NEW_NEB_RELATED.Activity_information.Activites.Pipeline_Right_of_Way();
        //----------------------
        // ----Pipeline_Right_of_Way
        //----------------------
        EPM.Verify.Verify_Status__BCGS_Map();
        Pipeline_Right_of_Way.Enter.Activity_Description();
        Pipeline_Right_of_Way.Upload_Requried_Attachment.Project_Description_Attached();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Pipeline_Right_of_Way.Click.Segment_ID_001();
        Pipeline_Right_of_Way.Segment_ID_001.Physical_Pipe_Length();
        Pipeline_Right_of_Way.Segment_ID_001.Pipe_Outer_Diameter();
        Pipeline_Right_of_Way.Click.Save();
        EPM.Verify.Progress_Message();
        Pipeline_Right_of_Way.Click.Segment_ID_002();
        Pipeline_Right_of_Way.Click.Remove_Segment();
        Pipeline_Right_of_Way.Click.Remove_Segment();
        Pipeline_Right_of_Way.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Road_Right_of_Way
        //----------------------
        NEW_NEB_RELATED.Activity_information.Activites.Road_Right_of_Way();
        Road_Right_of_Way.Enter.Activity_Description();
        Road_Right_of_Way.Enter.Maximum_Right_of_Way_Width();
        Road_Right_of_Way.Enter.Right_Of_Way__Rationale();
        Road_Right_of_Way.Road_Type.Long_Term_All_Weather();
        Road_Right_of_Way.Click.Save();
        EPM.Verify.Progress_Message();
        Road_Right_of_Way.Click.Road_Details();
        Road_Right_of_Way.Segment_ID_001.Road_Width();
        Road_Right_of_Way.Click.Segment_ID_002();
        Road_Right_of_Way.Click.Remove_Segment();
        EPM.Verify.Progress_Message();
        Road_Right_of_Way.Click.Remove_Segment();
        EPM.Verify.Progress_Message();
        Road_Right_of_Way.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----NEB_Related_Ancillary
        //----------------------
        NEW_NEB_RELATED.Activity_information.Activites.NEB_Related_Ancillary();
        NEB_Related_Ancillary_Activity_Details.Enter.Activity_Description();
        NEB_Related_Ancillary_Activity_Details.NEB_Related_Ancillary_Activity_Summary.Click.Application_Material();
        NEB_Related_Ancillary_Activity_Details.NEB_Related_Ancillary_Activity_Summary.Click.Description_of_Work();
        NEB_Related_Ancillary_Activity_Details.NEB_Related_Ancillary_Activity_Summary.Click.Intended_Purpose();
        NEB_Related_Ancillary_Activity_Details.Aggregate_Operations_Summary_Details.Proposed_Start_Date();
        NEB_Related_Ancillary_Activity_Details.Aggregate_Operations_Summary_Details.Proposed_Completion_Date();
        NEB_Related_Ancillary_Activity_Details.Aggregate_Operations_Summary_Details.Proposed_Timing_of_Activities();
        NEB_Related_Ancillary_Activity_Details.Aggregate_Operations_Summary_Details.Estimated_Total_Reserves_of_Life();
        NEB_Related_Ancillary_Activity_Details.Aggregate_Operations_Summary_Details.Estimated_Annual_Extraction();
        NEB_Related_Ancillary_Activity_Details.Upload_Document.Development_Reclamation_Plan();
        NEB_Related_Ancillary_Activity_Details.Upload_Document.Emergency_Response_Plan();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Short_Term_Water_Use_POD
        //----------------------
        NEW_NEB_RELATED.Activity_information.Activites.Short_Term_Water_Use_POD();
        Short_Term_Water_Use_POD_Overview.Activity_Description();
        Short_Term_Water_Use_POD_Overview.Please_provide_a_rationale();
        Short_Term_Water_Use_POD_Overview.Proposed_Start_Date();
        Short_Term_Water_Use_POD_Overview.Proposed_Completion_Date();
        Short_Term_Water_Use_POD_Overview.Click.Has_previous_approval_been_issued_for_the_water_withdrawal();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Short_Term_Water_Use_POD_Overview.Click.Point_of_Diversion_Details();
        Short_Term_Water_Use_POD_Overview.Year_One_Volume_Stream("123456");
        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_Stream("205");
        Short_Term_Water_Use_POD_Overview.Upload_Document.Stream_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();
        Short_Term_Water_Use_POD_Overview.Upload_Document.Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection2();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Short_Term_Water_Use_POD_Overview.Click.POD_002();
        Short_Term_Water_Use_POD_Overview.Click.Remove_Segment();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Changes_In_and_About_a_Stream
        //----------------------
        NEW_NEB_RELATED.Activity_information.Activites.Changes_In_and_About_a_Stream();
        Changes_In_and_About_a_Stream_Overview.Activity_Description();
        Changes_In_and_About_a_Stream_Overview.Proposed_Start_Date();
        Changes_In_and_About_a_Stream_Overview.Proposed_Completion_Date();
        Changes_In_and_About_a_Stream_Overview.Upload_Document.Upload_Fisheries_Habitat_Assessment();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Changes_In_and_About_a_Stream_Overview.Click.Changes_In_and_About_a_Stream_Details();
        Changes_In_and_About_a_Stream_Overview.Stream_Impact.If_no_File_XRef_Number_available_please_provide_a_rationale();
        Changes_In_and_About_a_Stream_Overview.Stream_Impact.Bank_Full_Stream_Width();
        Changes_In_and_About_a_Stream_Overview.Stream_Impact.Stream_Gradient();
        Changes_In_and_About_a_Stream_Overview.Stream_Impact.Exemption();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Changes_In_and_About_a_Stream_Overview.Click.Stream_Impact_2();
        Changes_In_and_About_a_Stream_Overview.Click.Remove_Stream();
        EPM.Verify.Progress_Message();
        Changes_In_and_About_a_Stream_Overview.Click.Remove_Stream();
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
        // ----Rights_Holder_Engagement
        //----------------------
        EPM.Application_Management.Rights_Holder_Engagement();
        Rights_Holder_Engagement.Rights_Holder_Engagement_Details.Click.Written_Submission_Received_by_Non_engaged_Persons();
        Rights_Holder_Engagement.Rights_Holder_Engagement_Details.Click.Case_File_Numbe();
        Rights_Holder_Engagement.Rights_Holder_Engagement_Details.Upload_File.Line_List_Attached();
        Rights_Holder_Engagement.Rights_Holder_Engagement_Details.Verify_Sucess_mesage_Line_ListDoc();
        Rights_Holder_Engagement.Rights_Holder_Engagement_Details.Upload_File.Engagement_Map_Attached();
        Rights_Holder_Engagement.Rights_Holder_Engagement_Details.Upload_File.Package_of_Replies_and_Responses_Attached();
        Rights_Holder_Engagement.Rights_Holder_Engagement_Details.Upload_File.Letters_of_Non_Objection_Attached();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----First_Nations
        //----------------------
        EPM.Application_Management.First_Nations();
        First_Nations.First_Nations_Details.Click.Fort_Nelson_First_Nation();
        First_Nations.First_Nations_Details.Click.Daylu_Dena_Council();
        First_Nations.First_Nations_Details.Click.Kaska_Dena_Council();
        First_Nations.First_Nations_Details.Click.Liard_First_Nation();
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
        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Diversion_Map_Attached();
        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Upload_1_20000_BCGS_Map();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Attachments
        //----------------------
        EPM.Application_Management.Attachments();
        Attachments.Attachments_Details.Verify.Verify_Upload_Attachment();
        Attachments.Attachments_Details.Upload_Attachment();
        Attachments.Attachments_Details.Upload_Requried_Attachment.Mitigation_Stragegy();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----OVERVIEW
        //----------------------
        EPM.Click.Overview();
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

        try {
            EPM.EPMPAY.EPMpay();
        } catch (Exception e) {
        }

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
        Crd_Conditions_Advisory.Click.Custom_NEB_Land_Edit_Highlited();
        Land_Habitat_Review.Review_Summary();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Land_Habitat_Review.Click.Complete_Task();
        Land_Habitat_Review.Click.Continue();


//------------------------------------------------------------------------

        //-----------    Rights Holder Engagement Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Rights");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Rights");
        GroupTask.Actions.Select.Execute_Task();
        Rights_Holder_Engagement_Review.Click.Task_Comment("");
        Rights_Holder_Engagement_Review.Click.Rights_Holder_Engagement_Checklist();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Rights_Holder_Engagement_Review.Review_Summary();
        Rights_Holder_Engagement_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Rights_Holder_Engagement_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Rights_Holder_Engagement_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Rights_Holder_Engagement_Review.Click.Complete_Task();
        Rights_Holder_Engagement_Review.Click.Continue();
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


        int fnCount= FN_Consultation_Review.FN_Count(appNumScreen);

        for (int i = 1; i <= fnCount; i++) testFN(appNumScreen);



        //------------------------------------------------------------------------

        //-----------   SDM Review And Determination  New NEB OGC Test

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
        Crd_Conditions_Advisory.Click.Advisory_SDM_Edit_Highlited();
        SDM_Review_And_Determination.Click.Determination();
        SDM_Review_And_Determination.Click.Task_Comment("");
        SDM_Review_And_Determination.Decision_Maker_Notes();
        SDM_Review_And_Determination.High_Risk("No");
        SDM_Review_And_Determination.Click.Pipeline_Right_of_Way();
        SDM_Review_And_Determination.Click.Road_Right_of_Way();
        SDM_Review_And_Determination.Click.Ancillary();
        SDM_Review_And_Determination.Click.Short_Term_Water_Use();
        SDM_Review_And_Determination.Click.Changes_In_and_About_a_Stream();
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


    private static void testFN(String appNumScreen) {

//------------------------------------------------------------------------
        //-----------    FN Consultation

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
        FN_Consultation_Review.Referral_Package_Summary.Response_Due_Date();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Log();
        FN_Consultation_Review.Referral_Package_Summary.Weekly_Status_Report_Comment();
        FN_Consultation_Review.Review_Summary();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        FN_Consultation_Review.Referral_Package_Summary.Consultation_Type();
        FN_Consultation_Review.Verify_Status__Completed();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Status("Sum");
        FN_Consultation_Review.Click.Save();
        FN_Consultation_Review.Click.Complete_Task();
        FN_Consultation_Review.Click.Continue();

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
