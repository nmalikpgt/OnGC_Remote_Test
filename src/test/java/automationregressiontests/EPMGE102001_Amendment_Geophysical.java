package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.DataBase_Connection;
import com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.*;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.*;

import java.sql.SQLException;

public class EPMGE102001_Amendment_Geophysical {



    @Test

    public  void EPMGE102001Amendment_Geophysical() throws SQLException, ClassNotFoundException {

        DataBase_Connection.updateStatus_100012288();

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.Amendment();
        Create_Application.Click.Next();
        Create_Application.Amendment.Enter.Amendment_Activity_ID_Geophysical_Program("1991-012");
        Create_Application.Click.Amendment_Next_Page1();
        Create_Application.Click.Amendment_Land();
        Create_Application.Click.Amendment_Next_Page2();
        Create_Application.Application_Description();
        Create_Application.Click.I_agree();
        Create_Application.Click.Next();
        //----------------------
        // ----  Spatial_Data_Submission
        //----------------------
        Spatial_Data_Submission.Shapefile_Projection.Nad_83_BC_Albers();
        Spatial_Data_Submission.Upload_Shapefiles_For_ge101001();
        Spatial_Data_Submission.Validate_and_Save_Shapefiles_to_Application();
        Spatial_Data_Submission.Verify_Status_Successful();
        EPM.Verify.Progress_Message();
       String  appNumScreen = Create_Application.Application_Number();
        Msg.Done();
        //----------------------
        // ----  Geophysical
        //----------------------
        Amendment.Click.Geophysical();
        EPM.Verify.Verify_Status__BCGS_Map();
        Geophysical.Amendment_Geophysical_Activity_Details.All_Information();
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
        // ----Land
        //----------------------
        EPM.Application_Management.Land();
//        Land.Land_Details.Click.Crown_Land_Type();
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
        Archaeology.Archaeology_Details.Administrative_Change_Only.Sources_to_identify_archaeological_potential();
        Archaeology.Archaeology_Details.Administrative_Change_Only.Specify_factors_used_to_assess_potential();
        Archaeology.Geophysical_Archaeology_Information.All_Information();
        Archaeology.Upload_File.Archaeology_Report_Attached();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        //----------------------
        // ----Consultation_Notification
        //----------------------
        EPM.Application_Management.Consultation_Notification();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Line_List_Attached();
        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Map_Attached();
      //  Consultation_Notification.Consultation_Notification_Details.Upload_File.Exemption_Approval();
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
        First_Nations.First_Nations_Details.Non_T8_First_Nations("Test123....");
        First_Nations.First_Nations_Details.Consultation_Category_First_Nations("0");
        First_Nations.First_Nations_Details.Consultation_Category_First_Nations("1");
        First_Nations.First_Nations_Details.Consultation_Category_First_Nations("2");
        First_Nations.First_Nations_Details.Consultation_Category_First_Nations("3");
        First_Nations.First_Nations_Details.Consultation_Category_First_Nations("4");
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
        //----------------------,
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
        Crd_Conditions_Advisory.Click.Custom_Land_Edit_Highlited();
        Crd_Conditions_Advisory.Click.Custom_NEB_Land_Edit_Highlited();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Land_Habitat_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Land_Habitat_Review.Click.Complete_Task();
        Land_Habitat_Review.Click.Continue();



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
        Archaeology_Review.Archaeology_Review_Details.Geophysical.OGC_Alteration();
        Archaeology_Review.Archaeology_Review_Details.Geophysical.APTS_Alteration_Permit();
        Archaeology_Review.Archaeology_Review_Details.Geophysical.Report_Received_Date();
        Archaeology_Review.Archaeology_Review_Details.Geophysical.Assessment_Result();
        Archaeology_Review.Archaeology_Review_Details.Geophysical.Requirement_Met();
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
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "FN Consultation (KLKS)");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "FN Consultation (KLKS)");
        GroupTask.Actions.Select.Execute_Task();
        FN_Consultation_Review.Click.Geophysical_Check_List1();
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
        FN_Consultation_Review.Referral_Package_Summary.FNConsultation_Type();
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
        SDM_Review_And_Determination.Amendment_Fee_Type();
        SDM_Review_And_Determination.High_Risk("No");
        SDM_Review_And_Determination.Click.Approve_Desicion();
        SDM_Review_And_Determination.Click.Complete_Task();
        SDM_Review_And_Determination.Click.Continue();
      //  SDM_Review_And_Determination.Click.Withdraw_Application();

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

        EPM.Click.CRD_Logout();

    }


    private  void testFN(String appNumScreen) {

//------------------------------------------------------------------------
        //-----------    FN Consultation

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "FN Consultation");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "FN Consultation");
        GroupTask.Actions.Select.Execute_Task();
        FN_Consultation_Review.Click.Geophysical_Check_List1();
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
        FN_Consultation_Review.Click.Geophysical_Check_List2();
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
