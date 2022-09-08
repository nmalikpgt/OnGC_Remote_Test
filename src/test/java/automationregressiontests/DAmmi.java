package automationregressiontests;


import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.PO.External.*;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.*;
import com.pacificgeotech.framework.PO.Internal.Crd_HomePage;
import com.pacificgeotech.framework.core.Msg;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;


public class DAmmi {

    @BeforeMethod(alwaysRun = true)
    public void SETUP() {
        Browser.UserAccess();
    }

    @Test


    public static void Epermit() throws SQLException, ClassNotFoundException {

        //


        String appNumScreen = "100115677";


        //  Browser.Goto.LoginPage();
        //   Browser.Goto.CRDLoginPage();
        //----------------------
        // ----Create_Application
        //----------------------
        //----------------------

        Msg.Line();
        System.out.println(" ");
        Browser.Goto.LoginPage();


        EPM.Click.Application_number(appNumScreen);

        //----------------------
        // ---- Create_Application
        //----------------------
        //----------------------
        // ----  Facility_Land_Area_1

        //----------------------
        // ----  Pipeline
        //----------------------
//        NEW_OGAA.Activity_information.Activites.Well_Land_Area_1();
//        EPM.Verify.Progress_Message();
//        EPM.Verify.Verify_Status__BCGS_Map();
//        Well.Enter.Activity_Description();
//        Well.Enter.ALPL_Working_Interest_Partner();
//        Well.Oil_Gas_Field_Name();
//        Well.Enter.Please_list_all_caveats();
//        Well.Area_Details.All_Information("10", "10", "10", "10");
//        Well.PNG_Tenure_Rights_ID();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Well.Click.Well_Details();
//        Well.Well_DETAILS_Specifications.WA_Number("00036");
//        Well.Well_DETAILS_Specifications.COR_RE_ENTRY_DETAILS("10", "11", "12", "18", "11", "19", "20");
//        Well.Click.Add_Bottom_Hole();
//        Well.Well_DETAILS_Specifications.Bottom_Hole_Details("13", "14", "98", "99");
//        Well.Click.Well_Hazard_Planning();
//        Well.Well_DETAILS_Specifications.Well_Hazard_Planning_DETAILS("15", "13", "14", "16", "17");
//        Well.Click.Flaring();
//        Well.Well_DETAILS_Specifications.Flaring();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Well.Click.WA_2();
//        Well.Click.Remove_Segment();
//        Well.Click.Remove_Segment();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Well.WA_.Well_Details.Primary_WA_Number_WA_Exception_Code();
//        Well.WA_.Well_Details.Surface_Hole_Details_DETAILS();
//        Well.Click.Add_Bottom_HoleD();
//        Well.Click.Add_Bottom_HoleD();
//        Well.Click.Add_Bottom_HoleD();
//        Well.WA_.Well_Details.Bottom_Hole_Details1();
//        Well.WA_.Well_Details.Bottom_Hole_Details2();
//        Well.WA_.Well_Details.Bottom_Hole_Details3();
//        Well.Click.Well_Hazard_Planning();
//        Well.WA_.Well_Details.Well_Hazard_Planning_DETAILS();
//        Well.Click.Flaring();
//        Well.WA_.Well_Details.Flaring();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();

        //----------------------
        // ----  Well_Land_Area_2
        //----------------------
//        NEW_OGAA.Activity_information.Activites.Well_Land_Area_2();
//        EPM.Verify.Progress_Message();
//        Well.Enter.Activity_Description();
//        Well.Enter.ABT_Working_Interest_Partner();
//        Well.Oil_Gas_Field_Name();
//        Well.Enter.Please_list_all_caveats();
//        Well.Area_Details.All_Information("22", "23", "24", "25");
//        Well.PNG_Tenure_Rights_ID();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Well.Click.Well_Details();
//        Well.Well_DETAILS_Specifications.WA_Number("00039");
//        Well.Well_DETAILS_Specifications.COR_RE_ENTRY_DETAILS("26", "27", "28", "35", "11", "36", "20");
//        Well.Click.Add_Bottom_Hole();
//        Well.Well_DETAILS_Specifications.Bottom_Hole_Details("222222", "333333", "444444", "555555");
//        Well.Click.Well_Hazard_Planning();
//        Well.Well_DETAILS_Specifications.Well_Hazard_Planning_DETAILS("31", "29", "15", "32", "33");
//        Well.Click.Flaring();
//        Well.Well_DETAILS_Specifications.Flaring();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Well.Click.WA_2();
//        Well.Click.Remove_Segment();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//
//        //----------------------
//        // ----  Facility_Land_Area_1
//        //----------------------
//
//        NEW_OGAA.Activity_information.Activites.Facility_Land_Area_1();
//        Facility.Enter.Activity_Description();
//        Facility.Area_Details.All_Information("5", "6", "7", "8");
//        Facility.Facility_overview_Upload_Files.All_Attachments_of_this_Page();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Facility.Click.Facility_Details();
//        Facility.Facility_Type();
//        Facility.Oil_Gas_Field_Name();
//        Facility.Facility_DETAILS_Specifications.FAC("1", "3", "99", "99999", "9999999", "999", "999999", "Compressor");
//        Facility.Emissions_Air_Details.All_Information("237", "23789", "2378", "Yes");
//        Facility.Click.Facility_Equipment_Details();
//        Facility.Facility_DETAILS_Specifications.Facility_Equipment_DETAILS("12", "237", "12", "Yes");
//        Facility.Click.Technical_Specification_Details();
//        Facility.Facility_DETAILS_Specifications.Technical_Specification_Details_OGAA();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//
//        //----------------------
//        // ----  Facility_Land_Area_2
//        //----------------------
//        NEW_OGAA.Activity_information.Activites.Facility_Land_Area_2();
//        Facility.Enter.Activity_Description();
//
//        Facility.Area_Details.All_Information("6", "7", "8", "9");
//        Facility.Facility_overview_Upload_Files.All_Attachments_of_this_Page();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Facility.Click.Facility_Details();
//        Facility.Oil_Gas_Field_Name();
//        Facility.Facility_DETAILS_Specifications.FAC("0.1", "0.3", "99", "99999", "9999999", "999", "999999", "");
//        Facility.Emissions_Air_Details.All_Information("237", "23789", "237", "Yes");
//        Facility.Click.Facility_Equipment_Details();
//        Facility.Facility_DETAILS_Specifications.Facility_Equipment_DETAILS("12", "237", "12", "Yes");
//        Facility.Click.Technical_Specification_Details();
//        Facility.Facility_DETAILS_Specifications.Technical_Specification_Details_OGAA();
//        Facility.Gas_Processing_Plant_Details.All_Information();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Facility.Click.Remove_Segment();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//
//        //----------------------
//        // ----  Pipeline
//        //----------------------
//        NEW_OGAA.Activity_information.Activites.Pipeline();
//        Pipeline.Enter.Activity_Description();
//        Pipeline.Enter.Engineer_Project_File_Name();
//        Pipeline.Pipeline_overview_Upload_Files.All_Attachments_of_this_Page();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Pipeline.Click.Pipeline_Details();
//        Pipeline.Segment_Details.All_Information("5");
//        Pipeline.Click.Segment_Linkage_Details();
//        Pipeline.Segment_Linkage_Details.All_Information();
//        Pipeline.Click.Pipeline_Installation_Details();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Pipeline.Click.SEGMENT_ID2();
//        Pipeline.Click.Remove_Segment();
//        Pipeline.Click.Remove_Segment();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----  Road
//        //----------------------
//        NEW_OGAA.Activity_information.Activites.Road();
//        Road.Road_Overview_Details.All_Information();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Road.Click.Road_Details();
//        Road.Road_width();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Road.Click.SEGMENT_ID2();
//        Road.Click.Remove_Segment();
//        Road.Click.Remove_Segment();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----  Associated_Oil_and_Gas_Activity
//        //----------------------
//        NEW_OGAA.Activity_information.Activites.Associated_Oil_and_Gas_Activity();
//        Associated_Oil_Gas_Activity.Associated_Oil_Gas_Activity_Details.All_Information();
//        Associated_Oil_Gas_Activity.Associated_Oil_Gas_Activity_Upload_Files.All_Attachments_of_this_Page();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----  Short_Term_Water_Use_POD
//        //----------------------
//        NEW_OGAA.Activity_information.Activites.Short_Term_Water_Use_POD();
//        Short_Term_Water_Use_POD_Overview.Proposed_Start_Date();
//        Short_Term_Water_Use_POD_Overview.Proposed_Completion_Date();
//        Short_Term_Water_Use_POD_Overview.Activity_Description();
//        Short_Term_Water_Use_POD_Overview.Please_provide_a_rationale();
//        Short_Term_Water_Use_POD_Overview.Click.Has_previous_approval_been_issued_for_the_water_withdrawal();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Short_Term_Water_Use_POD_Overview.Click.Point_of_Diversion_Details();
//        Short_Term_Water_Use_POD_Overview.Year_One_Volume_lake("123456");
//        Short_Term_Water_Use_POD_Overview.Proposed_Volume_Day_lake("205");
//        Short_Term_Water_Use_POD_Overview.Upload_Document.Lake_Are_temporary_works_required_for_distribution_of_fresh_water_on_Crown_land();
//        Short_Term_Water_Use_POD_Overview.Upload_Document.Proposed_Volume_200m_day_or_10000myear_per_diversion_point_or_the_purpose_is_for_Oil_Field_Injection_WaterSupply();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Short_Term_Water_Use_POD_Overview.Click.POD_002();
//        Short_Term_Water_Use_POD_Overview.Click.Remove_Segment();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----  Geophysical
//        //----------------------
//        NEW_OGAA.Activity_information.Activites.Geophysical();
//        Geophysical.Geophysical_Activity_Details.All_Information();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----  Changes_In_and_About_a_Stream_Details
//        //----------------------
//        NEW_OGAA.Activity_information.Activites.Changes_In_and_About_a_Stream();
//        Changes_In_and_About_a_Stream_Overview.Proposed_Start_Date();
//        Changes_In_and_About_a_Stream_Overview.Proposed_Completion_Date();
//        Changes_In_and_About_a_Stream_Overview.Activity_Description();
//        Changes_In_and_About_a_Stream_Overview.Geophysical_Stream_Crossing_NO();
//        Changes_In_and_About_a_Stream_Overview.Upload_Document.Upload_Fisheries_Habitat_Assessment();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Changes_In_and_About_a_Stream_Overview.Click.Changes_In_and_About_a_Stream_Details();
//        Changes_In_and_About_a_Stream_Overview.Stream_Impact.If_no_File_XRef_Number_available_please_provide_a_rationale();
//        Changes_In_and_About_a_Stream_Overview.Stream_Impact.Stream_Gradient();
//        Changes_In_and_About_a_Stream_Overview.Stream_Impact.Bank_Full_Stream_Width();
//        Changes_In_and_About_a_Stream_Overview.Stream_Impact.Exemption();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Changes_In_and_About_a_Stream_Overview.Click.Stream_Impact_2();
//        Changes_In_and_About_a_Stream_Overview.Click.Remove_Stream();
//        Changes_In_and_About_a_Stream_Overview.Click.Remove_Stream();
//        Changes_In_and_About_a_Stream_Overview.Click.Remove_Stream();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
        //--------------------------------
        // ----Application_information
        //----------------------------------

//        EPM.Click.Application_information();

        //----------------------
        // ----Administrative
        //----------------------
//        EPM.Application_Management.Administrative();
//        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Archaeologist("john");
//        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Drilling_Engineer("john");
//        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Facility_Engineer("john");
//        Administrative.Administrative_Details.Who_are_the_representatives_for_this_project.Contact_Pipeline_Engineer("john");
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----Land
//        //----------------------
//        EPM.Application_Management.Land();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
        //----------------------
        // ----Forestry
        //----------------------
//        EPM.Application_Management.Forestry();
//        Forestry.Forestry_Details.Click.New_Cut_Required();
//        // Forestry.Forestry_Details.OGAA_Forestry_Detailst();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----Stewardship
//        //----------------------
//        EPM.Application_Management.Stewardship();
//        Stewardship.Stewardship_Details.Upload_Requried_Attachment.Mitigation_Stragegy();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----Agriculture
//        //----------------------
//        EPM.Application_Management.Agriculture();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----Archaeology
//        //----------------------
//        EPM.Application_Management.Archaeology();
//        Archaeology.Upload_File.Archaeology_Report_Attached();
//        Archaeology.Click.Administrative_Change_Only();
//        Archaeology.Archaeology_Details.Administrative_Change_Only.Borden_Number();
//        Archaeology.Archaeology_Details.Administrative_Change_Only.Type_of_Field_Work_Completed();
//        Archaeology.Archaeology_Details.Administrative_Change_Only.Borden_Number_and_Distance();
//        Archaeology.Archaeology_Details.Administrative_Change_Only.Other_Type_of_Assessment();
//        Archaeology.Archaeology_Details.Administrative_Change_Only.Brief_Site_Mitigation_Description();
//        Archaeology.Archaeology_Details.Administrative_Change_Only.Sources_to_identify_archaeological_potential();
//        Archaeology.Archaeology_Details.Administrative_Change_Only.Specify_factors_used_to_assess_potential();
//        Archaeology.Upload_File.Mitigation_Approval_letter();
//        Archaeology.Geophysical_Archaeology_Information.All_Information();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //---------------------------------
//        // ----Consultation_Notification
//        //---------------------------------
//        EPM.Application_Management.Consultation_Notification();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Line_List_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Map_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Exemption_Approval();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Package_of_Replies_and_Responses_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Upload_File.Consultation_Letters_of_Non_Objection_Attached();
//        Consultation_Notification.Consultation_Notification_Details.Click.Written_Submission_Received_by_Non_engaged_Persons();
//        Consultation_Notification.Consultation_Notification_Details.Click.Case_File_Numbe();
//        Consultation_Notification.Consultation_Notification_Details.Enter.Consultation_Notification_Details();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
        //----------------------
        // ----First_Nations
        //----------------------
//        EPM.Application_Management.First_Nations();
//        First_Nations.First_Nations_Details.Click.Fort_Nelson_First_Nation();
//        First_Nations.First_Nations_Details.Click.Acho_Dene_Koe_First_Nation();
//        First_Nations.First_Nations_Details.Upload_File.First_Nations_Project_Description_Form();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
        //----------------------
        // ----Maps_Plans
        //----------------------
//        EPM.Application_Management.Maps_Plans();
//        Maps_Plans.Maps_Plans_Details.Enter.Survey_Company();
//        Maps_Plans.Maps_Plans_Details.Enter.Job_Number();
//        Maps_Plans.Maps_Plans_Details.Enter.Original_Plan_Date();
//        Maps_Plans.Maps_Plans_Details.Enter.Sheet_Number();
//        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Construction_Plan_Attached();
//        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.BCGS_Map_Attached();
//        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Diversion_Map_Attached();
//        Maps_Plans.Maps_Plans_Details.Upload_Requried_Attachment.Upload_1_20000_BCGS_Map();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        //----------------------
//        // ----OVERVIEW
//        //----------------------
//        EPM.Click.Overview();
//        EPM.Verify.Progress_Message();
//        Overview.Application_Overview.Enter.Contact_Name();
//        Overview.Application_Overview.Enter.Permit_Distribution_Contact_Name();
//        EPM.Click.Save();
//        EPM.Verify.Progress_Message();
//        Overview.Application_Overview.Application();
//        Overview.Application_Overview.Validate();
//        Overview.Application_Overview.Application_Validation();
//        Overview.Application_Overview.FAC_ID();
//
//        Overview.Application_Overview.Verify.Validation_has_been_completed_successfully_and_the_application_is_complete_with_no_errors_Would_you_like_to_validate_the_application_again();
//        Overview.Application_Overview.Application();
//        EPM.Verify.Progress_Message();

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
        //  Composite_Application_Review.Click.Admin_Review_Details_Forest();
        Composite_Application_Review.Review_Summary();
        Composite_Application_Review.Click.Complete_Task();
        Composite_Application_Review.Click.Continue();


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
        Archaeology_Review.Archaeology_Review_Details.OGAAGeophysical.Requirement_Met();
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
        GroupTask.Enter.Input_Quick_Filtering(appNumScreen, "FN Consultation (ADKFN)");
        GroupTask.Actions.Select.Assign_Task_to_Me();
        Crd_HomePage.Click.My_Task();
        GroupTask.Enter.MyTask_Input_Quick_Filtering(appNumScreen, "FN Consultation (ADKFN)");
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
        FN_Consultation_Review.Referral_Package_Summary.Consultation_TypeOgaa();
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
        FN_Consultation_Review.Click.Task_Comment("");
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

        Crd_Conditions_Advisory.Click.Custom_Land_Edit_Highlited();
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
        Crd_Conditions_Advisory_OGAA.Click.Conditions.Add_Standard_Conditon();
        Crd_Conditions_Advisory_OGAA.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory_OGAA.Click.Advisory_Guidance.Add_Standard_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory_OGAA.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
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
        SDM_Review_And_Determination.Permit_Generation.Permit_Template.NEB_Amendment();
        SDM_Review_And_Determination.Permit_Generation.Permit_Template.OGAA_Amendment();
        SDM_Review_And_Determination.Permit_Generation.Permit_Template.Non_OGAA_Amendment();
        SDM_Review_And_Determination.Permit_Generation.Permit_Template.New_NEB();
        SDM_Review_And_Determination.Permit_Generation.Permit_Template.New_Non_OGAA();
        SDM_Review_And_Determination.Permit_Generation.Permit_Template.New_OGAA();
        Crd_Conditions_Advisory.Click.Conditions.SDM_Add_Conditon();
        Crd_Conditions_Advisory.Click.Conditions.Add_Custom_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.SDM_Add_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_Guidance.Add_Custom_Advisory_Guidance_Condition();
        Crd_Conditions_Advisory.Click.Advisory_SDM_Edit_Highlited();
        Crd_Conditions_Advisory.Click.OGAA_Water_Course_Edit_Highlited();


        SDM_Review_And_Determination.Click.Determination();
        SDM_Review_And_Determination.Click.Task_Comment("");
        SDM_Review_And_Determination.Decision_Maker_Notes();

        SDM_Review_And_Determination.High_Risk("No");
        SDM_Review_And_Determination.Click.WEll_Approve_Desicion();
        SDM_Review_And_Determination.Click.Pipeline_Approve_Desicion();
        SDM_Review_And_Determination.Click.Road_Approve_Desicion();
        SDM_Review_And_Determination.Click.Associated_Oil_Gas_Activity_Approve_Desicion();
        SDM_Review_And_Determination.Click.Geophysical_Approve_Desicion();
        SDM_Review_And_Determination.Click.Short_Term_Water_Use();
        SDM_Review_And_Determination.Click.Changes_In_and_About_a_Stream();
        SDM_Review_And_Determination.Click.Complete_Task();
        SDM_Review_And_Determination.Click.Continue();


        //------------------------------------------------------------------------

        //-----------  Post_Decision_Tasks

        //------------------------------------------------------------------------
        try {
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
        } catch (Exception e) {

        }


        EPM.Click.CRD_Logout();


    }










}