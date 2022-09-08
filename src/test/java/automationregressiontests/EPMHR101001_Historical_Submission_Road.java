package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Environments.DataBase_Connection;
import com.pacificgeotech.framework.PO.Environments.Spatial_Data_Submission;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.GroupTask;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Historical_Review;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class EPMHR101001_Historical_Submission_Road {
    @Test

    public static void EPMHP101001Historical_Submission_Pipeline() throws SQLException, ClassNotFoundException {


        DataBase_Connection.updateStatus_100082131();

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();

        //----------------------
        // ----Create_Application
        //----------------------
        Create_Application.Click.Create_Application();
        Create_Application.Link.Historical_Submission();
        Create_Application.Historical_Submission.Activites.Road();
        Create_Application.Click.Next();
        Create_Application.Historical_Submission.Activites.Activity_ID("03255");
        Create_Application.Click.Road_Project_03255();
        Create_Application.Click.Amendment_Next_Page1();
        Create_Application.Click.Road_Next_Page1();
        Create_Application.Application_Description();
        Create_Application.Click.I_agree();
        Create_Application.Click.Next();


        //----------------------
        // ----  Spatial_Data_Submission
        //----------------------

        Spatial_Data_Submission.Shapefile_Projection.Nad_83_BC_Albers();
        Spatial_Data_Submission.Upload_Shapefiles_For_hsr102002();
        Spatial_Data_Submission.Validate_and_Save_Shapefiles_to_Application();
        Spatial_Data_Submission.Verify_Status_Successful();
        EPM.Verify.Progress_Message();
        String appNumScreen = Create_Application.Application_Number();
        Msg.Done();



        //----------------------
        // ----  Road
        //----------------------
        Amendment.Click.Road();
        EPM.Verify.Verify_Status__BCGS_Map();
        NEW_OGAA.Activity_information.Activites.Road();
        Road.Road_Overview_Details.Historical_Road_Overview_Details();
        EPM.Click.Save();
        EPM.Verify.Progress_Message();
        Road.Click.Road_Details();
        Road.Road_width();
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
        Historical_Review.Click.Complete_Task();
        Historical_Review.Click.Continue();
     //   Historical_Review.Click.Withdraw_Application();
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
