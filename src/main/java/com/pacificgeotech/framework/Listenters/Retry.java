package com.pacificgeotech.framework.Listenters;

import com.pacificgeotech.framework.core.Msg;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer {
    private int count = 0;
    private static int maxTry = 1; //Run the failed test 2 times

    @Override
        public boolean retry(ITestResult iTestResult) {
            if (!iTestResult.isSuccess()) {                      //Check if test not succeed
                if (count < maxTry) {                            //Check if maxTry count is reached
                    count++;                                     //Increase the maxTry count by 1
                    iTestResult.setStatus(ITestResult.FAILURE);  //Mark test as failed and take base64Screenshot
                    onTestFailure(iTestResult);                   //ExtentReports fail operations
                    return true;                                 //Tells TestNG to re-run the test
                }
            }
            else {
                iTestResult.setStatus(ITestResult.SUCCESS);      //If test passes, TestNG marks it as passed
            }
            return false;
    }


    public void onTestFailure(ITestResult result) {
        Msg.Info("Sorry For The Issue I will Correct And Update the Test Case Again EPM-CRD Project Automation Testing :   "  + result.getName() );

        Reporter.log("Sorry For The Issue I will Correct And Update the Test Case Again EPM-CRD Project Automation Testing :   "  + result.getName() );


        Msg.Done();


    }



}
