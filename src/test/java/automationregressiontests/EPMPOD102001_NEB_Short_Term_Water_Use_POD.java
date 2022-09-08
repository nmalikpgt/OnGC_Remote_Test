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

public class EPMPOD102001_NEB_Short_Term_Water_Use_POD {
    @Test

    public static void EPMPOD102001_NEB_ShortTerm_WaterUse_POD() throws SQLException, ClassNotFoundException {

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.New_NEB_Related();
        Create_Application.New_NEB_Related.Activites.Short_Term_Water_Use_POD();
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
        Spatial_Data_Submission.Upload_Shapefiles_For_wu101001();
        Spatial_Data_Submission.Validate_and_Save_Shapefiles_to_Application();
        Spatial_Data_Submission.Verify_Status_Successful();
        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();

        //----------------------
        // ----Short_Term_Water_Use_POD
        //----------------------
        NEW_NEB_RELATED.Activity_information.Activites.Short_Term_Water_Use_POD();
        EPM.Verify.Verify_Status__BCGS_Map();
        Short_Term_Water_Use_POD_Overview.Click.Primary_Activity_Type_And_Fil_XREF_Numbe("123");
        Short_Term_Water_Use_POD_Overview.Activity_Description();
        Short_Term_Water_Use_POD_Overview.Please_provide_a_rationale();
        Short_Term_Water_Use_POD_Overview.Proposed_Start_Date();
        Short_Term_Water_Use_POD_Overview.Proposed_Completion_Date();
        Short_Term_Water_Use_POD_Overview.Click.Has_previous_approval_been_issued_for_the_water_withdrawal("123");
        EPM.Click.Save();
        EPM.Verify.Progress_Message();

        //----------------------
        // ----POD 1
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.Point_of_Diversion_Details();
        Short_Term_Water_Use_POD_Overview.Year_One_Volume_lake("123456");
        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_lake("205");
        Short_Term_Water_Use_POD_Overview.Upload_Document.Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection_WaterSupply();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();

        //----------------------
        // ----POD 2
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_002();
        Short_Term_Water_Use_POD_Overview.Year_One_Volume_lake("1234");
        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_lake("198");
        Short_Term_Water_Use_POD_Overview.Upload_Document.Lake_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();


        //----------------------
        // ----POD 3
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_003();
        Short_Term_Water_Use_POD_Overview.Year_One_Volume_lake("123456");
        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_lake("198");
        Short_Term_Water_Use_POD_Overview.Upload_Document.Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection_WaterSupply2();
        Short_Term_Water_Use_POD_Overview.Upload_Document.Lake_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----POD 4
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_004();
        Short_Term_Water_Use_POD_Overview.Year_One_Volume_Stream("123456");
        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_Stream("235");
        Short_Term_Water_Use_POD_Overview.Upload_Document.Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----POD 5
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_005();
        Short_Term_Water_Use_POD_Overview.Year_One_Volume_Stream("1234");
        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_Stream("198");
        Short_Term_Water_Use_POD_Overview.Upload_Document.Stream_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----POD 6
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_006();
        Short_Term_Water_Use_POD_Overview.Year_One_Volume_Stream("1234");
        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_Stream("29");
        Short_Term_Water_Use_POD_Overview.Upload_Document.Stream_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----POD 7
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_007();
        Short_Term_Water_Use_POD_Overview.Upload_Document.Water_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();

        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----POD 8
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_008();
        Short_Term_Water_Use_POD_Overview.Upload_Document.Water_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----POD 9
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_009();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----POD 10
        //----------------------
        Short_Term_Water_Use_POD_Overview.Click.POD_0010();
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
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Land_Agent("john");
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
        First_Nations.First_Nations_Details.Upload_File.First_Nations_Project_Description_Form();
        First_Nations.First_Nations_Details.Non_T8_First_Nations("Test....");
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Maps_Plans
        //----------------------
        EPM.Application_Management.Maps_Plans();
        Maps_Plans.Maps_Plans_Details.Enter.Survey_Company();
        Maps_Plans.Maps_Plans_Details.Enter.Job_Number();
        Maps_Plans.Maps_Plans_Details.Enter.Sheet_Number();
        Maps_Plans.Maps_Plans_Details.Enter.Original_Plan_Date();
        Maps_Plans.Maps_Plans_Details.Enter.Revised_Plan_Date();
        Maps_Plans.Maps_Plans_Details.Enter.Revised_Number();
        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Diversion_Map_Attached();
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
        Land_Habitat_Review.Review_Summary();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Dam_NAme_Edit_Highlited();
        Crd_Conditions_Advisory.Click.Custom_NEB_Land_Edit_Highlited();

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
        Rights_Holder_Engagement_Review.Review_Summary();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
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
        SDM_Review_And_Determination.Click.Determination();
        SDM_Review_And_Determination.Click.Task_Comment("");
        SDM_Review_And_Determination.Decision_Maker_Notes();
        SDM_Review_And_Determination.High_Risk("No");
        SDM_Review_And_Determination.Click.NEB_Short_Term_Water_Use();
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
        FN_Consultation_Review.Click.FN_Consultation_Check_List();
        FN_Consultation_Review.Referral_Package_Summary.Circulation_Method.Email("Email");
        FN_Consultation_Review.Referral_Package_Summary.Response_Due_Date();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Log();
        FN_Consultation_Review.Referral_Package_Summary.Weekly_Status_Report_Comment();
        FN_Consultation_Review.Review_Summary();
      //  Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
       // Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
      //  Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
      //  Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
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


