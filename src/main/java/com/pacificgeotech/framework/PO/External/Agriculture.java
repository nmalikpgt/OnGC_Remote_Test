package com.pacificgeotech.framework.PO.External;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.FileUpload;

import static com.pacificgeotech.framework.PO.Environments.Document_path.Uploadfilepath;

import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Agriculture {
    public static class Agriculture_Details {
            public static class Enter {

                public static void Appendix_II_Rationale() {

                    Msg.Info("Enter Message for   'Appendix_II_Rationale'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:appendix2rationaleInTxtId"))).sendKeys("Testing 1223");
                    Msg.Done();
                }
            }

            public static class Upload_Requried_Attachment {
                public static void 	Schedule_A_required() {
                    Msg.Info(" Upload the  Attachment 'Schedule A required:'");
                   Browser.Sleep(Browser.Mill_Sec());
                      WebDriverWait wait = new WebDriverWait(Browser.driver, 50);
          Crd_Conditions_Advisory.Click.Scrolldown();
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("appFrmId:scheduleADocUploadBtnId"))).click();
                 EPM.Verify.Upload_pagedispaly();
                    WebElement browseButton =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("appFrmId:uploadScheduleADocIdFileUploadId_input")));
                    browseButton.sendKeys(FileUpload.ShapeFile(Uploadfilepath).getAbsolutePath());
                    System.out.println("INFO: Clicked on the Choose button and selected the file Flaring.pdf");
                   Browser.Sleep(Browser.Mill_Sec());
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'ui-fileupload-upload')]"))).click();
                    EPM.Verify.Upload_page_display_Hidden();

                    Msg.Done();

                }

            }





        }

    }



