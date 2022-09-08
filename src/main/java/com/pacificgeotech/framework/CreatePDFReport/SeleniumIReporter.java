package com.pacificgeotech.framework.CreatePDFReport;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.*;

public class SeleniumIReporter extends AutomationPDFReport implements IReporter {


    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        for(ISuite ist : suites){
            try{
                //Calling open pdf method
                openPdfPath();
                //*************//

                Map<String, ISuiteResult> resultSuiteMap = ist.getResults();

                Set<String> key = resultSuiteMap.keySet();

                for(String k : key){

                    ITestContext cntx = resultSuiteMap.get(k).getTestContext();


                    IResultMap failedTest = cntx.getFailedTests();


                    Collection<ITestNGMethod> failedMethods = failedTest.getAllMethods();


                    for(ITestNGMethod imd : failedMethods){




                        //*********Printing failed details in pdf file*******//
                        addParagraph("Test Case Name- "+imd.getMethodName()
                                +"\n Description- "+imd.getDescription()
                                +"\n Priority- "+imd.getPriority()
                                + "\n Date- "+new Date(imd.getDate()));

                        //************************************************************//


                    }



                    IResultMap passedTest = cntx.getPassedTests();


                    Collection<ITestNGMethod> passedMethods = passedTest.getAllMethods();



                    for(ITestNGMethod imd1 : passedMethods){



                        //*********Printing passed details in pdf file*******//
                        addParagraph("Test Case Name- "+imd1.getMethodName()
                                +"\n Description- "+imd1.getDescription()
                                +"\n Priority- "+imd1.getPriority()
                                + "\n Date- "+new Date(imd1.getDate()));

                        //************************************************************//

                    }
                }

                //Closing PDF file
                closePdf();


            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
