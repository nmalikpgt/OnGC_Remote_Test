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

public class EPMPL104001_Amendment_Pipeline_project {



    @Test

    public static void  EPMPL104001Amendment_Pipeline_project() throws SQLException, ClassNotFoundException {

        DataBase_Connection.updateStatus_100007456();

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.Amendment();
        Create_Application.Click.Next();
        Create_Application.Amendment.Enter.Amendment_Activity_ID_PipelineProject("000003108");
        Create_Application.Click.Amendment_Next_Page1();
        Create_Application.Click.Technical();
        Create_Application.Click.Amendment_Next_Page2();
        Create_Application.Application_Description();
        Create_Application.Click.I_agree();
        Create_Application.Click.Next();

        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();
        //----------------------
        // ---- Pipeline
        //----------------------------
        Amendment.Click.Pipeline();
        Pipeline.Enter.Activity_Description();
        Pipeline.Enter.Engineer_Project_File_Name();
        Facility.Amendment.Does_this_project_require_BCEAO_Approval();
        Facility.Amendment.Does_this_project_require_CEA_Approval();
        Pipeline.Pipeline_overview_Upload_Files.HistoricalSubmission_All_Attachments_of_this_Page("");
        Pipeline.Pipeline_Specifications.All_Information("Geotechnical");
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Pipeline.Click.Pipeline_Details();
        Pipeline.Segment_Details.All_Information("");
        Pipeline.Click.Line_Type();
        Pipeline.Click.Internal_Coating();
        Pipeline.Click.External_Coating();
        Pipeline.Click.Segment_Linkage_Details();
        Pipeline.Segment_Linkage_Details.All_Information();
        Pipeline.Click.Pipeline_Installation_Details();
        Pipeline.Click.AmendmnetExemption();
        Spatial_Data_Submission.Upload_Shapefiles_For_Historical_pipeline2();
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
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Pipeline_Engineer("john");
        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Land_Agent("john");
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
        Consultation_Notification.Consultation_Notification_Details.Click.Unresolved_Concerns_by_persons_not_engaged();
        Consultation_Notification.Consultation_Notification_Details.Click.Unresolved_Concerns_by_persons_not_engaged_Case_File_Number();
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
        //---------------------- ,


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

        //-----------     	Pipeline Engineering Review

        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Pipeline ");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Pipeline");
        GroupTask.Actions.Select.Execute_Task();
        Pipeline_Engineering_Review.Click.Task_Comment("");
        Pipeline_Engineering_Review.Click.Pipeline_Engineering_Checklist();
        Crd_Conditions_Advisory.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Custom_Pipeline_Edit_Highlited();
        Pipeline_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Pipeline_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Pipeline_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();

        Pipeline_Engineering_Review.Click.Complete_Task();
        Pipeline_Engineering_Review.Click.Continue();
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


   @BeforeMethod(alwaysRun = true)
    public void SETUP() {
        Browser.UserAccess();
    }
        @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
            Browser.CleanUp();
    }



   }
