package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.*;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.Test;


public class Full_CRD {
    @Test

    public static void CRD() {

        //

        String appNumScreen = "100109110";


        Msg.Line();
        System.out.println(" ");
        Browser.Goto.CRDLoginPage();


        //------------------------------------------------------------------------

        //-----------     Composite Application Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Click.Group_Advanced_Filtering();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Composite");
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
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        FN_Consultation_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        FN_Consultation_Review.Referral_Package_Summary.Consultation_Type();
        FN_Consultation_Review.Verify_Status__Completed();
        FN_Consultation_Review.Referral_Package_Summary.FN_Review_Status("Sum");
        FN_Consultation_Review.Click.Save();
        FN_Consultation_Review.Click.Complete_Task();
        FN_Consultation_Review.Click.Continue();


        for (int i = 1; i <= 3; i++) testFN(appNumScreen);


        //------------------------------------------------------------------------

        //-----------     Historical Facility Review

        //------------------------------------------------------------------------
        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Historical");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Historical");
        GroupTask.Actions.Select.Execute_Task();
        Historical_Review.Click.Task_Comment("");
        Historical_Review.Click.bHistorical_Facility_Checklist();
        Historical_Review.Review_Summary();
        Historical_Review.Application_Activity();
        Historical_Review.Click.Complete_Task();
        Historical_Review.Click.Continue();


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
        SDM_Review_And_Determination.Click.Cancel();
        SDM_Review_And_Determination.Click.Withdraw_Application();


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
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Consultation_Notification_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Consultation_Notification_Engineering_Review.Click.Complete_Task();
        Consultation_Notification_Engineering_Review.Click.Continue();


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
        Facility_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Facility_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Facility_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Facility_Engineering_Review.Click.Complete_Task();
        Facility_Engineering_Review.Click.Continue();


        //------------------------------------------------------------------------

        //-----------     Forestry_Engineering_Review

        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Forestry");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Forestry");
        GroupTask.Actions.Select.Execute_Task();
        Forestry_Engineering_Review.Click.Task_Comment("");
        Forestry_Engineering_Review.Click.Forestry_Engineering_Checklist();
        Forestry_Engineering_Review.Review_Summary();
        Forestry_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Forestry_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Forestry_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Forestry_Engineering_Review.Click.Complete_Task();
        Forestry_Engineering_Review.Click.Continue();


        //------------------------------------------------------------------------

        //-----------     	Environmental Management Review

        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Environmental Management");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Environmental Management");
        GroupTask.Actions.Select.Execute_Task();
        Environmental_Management_Engineering_Review.Click.Task_Comment("");
        Environmental_Management_Engineering_Review.Click.Enviranmental_Management_Engineering_Checklist();
        Environmental_Management_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Environmental_Management_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Environmental_Management_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Environmental_Management_Engineering_Review.Click.Complete_Task();
        Environmental_Management_Engineering_Review.Click.Continue();
        //------------------------------------------------------------------------

        //-----------     	Pipeline Engineering Review

        //------------------------------------------------------------------------

        Crd_HomePage.Click.Group_Tasks();
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "Pipeline");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "Pipeline");
        GroupTask.Actions.Select.Execute_Task();
        Pipeline_Engineering_Review.Click.Task_Comment("");
        Pipeline_Engineering_Review.Click.Pipeline_Engineering_Checklist();
        Pipeline_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Recommend();
        Pipeline_Engineering_Review.Application_Activities.Set_Activity_Recommendation.Apply_to_All();
        Pipeline_Engineering_Review.Application_Activities.Set_Activity_Recommendation.All_Activities();
        Pipeline_Engineering_Review.Click.Complete_Task();
        Pipeline_Engineering_Review.Click.Continue();


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
        SDM_Review_And_Determination.Click.Determination();
        SDM_Review_And_Determination.Click.Task_Comment("");
        SDM_Review_And_Determination.Decision_Maker_Notes();
        SDM_Review_And_Determination.Amendment_Fee_Type();
        SDM_Review_And_Determination.High_Risk("No");
        SDM_Review_And_Determination.Click.Pipeline_Right_of_Way();
        SDM_Review_And_Determination.Click.Road_Right_of_Way();
        SDM_Review_And_Determination.Click.Ancillary();
        SDM_Review_And_Determination.Click.Short_Term_Water_Use();
        SDM_Review_And_Determination.Click.Changes_In_and_About_a_Stream();
        SDM_Review_And_Determination.Click.Complete_Task();
        SDM_Review_And_Determination.Click.Cancel();
        SDM_Review_And_Determination.Click.Withdraw_Application();


        //------------------------------------------------------------------------

        //-----------   SDM Review And Determination  New Ogaa

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
        SDM_Review_And_Determination.Click.Cancel();
        SDM_Review_And_Determination.Click.Withdraw_Application();


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


}






















