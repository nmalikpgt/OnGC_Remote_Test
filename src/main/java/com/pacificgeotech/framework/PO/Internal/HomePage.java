package com.pacificgeotech.framework.PO.Internal;

import com.pacificgeotech.framework.PO.Environments.Browser;
import com.pacificgeotech.framework.core.Msg;
import com.pacificgeotech.framework.PO.Internal.Crd_All_Task.Crd_Conditions_Advisory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Random;

public class HomePage {
    public static class MainMenu {
        public static class Click {
            public static void Client() {
                Msg.Info("Click 'Client' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CLIENT_MENU))).click();
                Msg.Done();
            }

            public static void EditProfileInformation() {
                Msg.Info("Click 'Edit Profile Information' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EDIT_PROFILE_INFORMATION_MENU))).click();
                Msg.Done();
            }
            public static void RegistrationActivation() {
                Msg.Info("Click 'External Activation' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'User External Activation')]"))).click();
                Msg.Done();
            }


            public static void RecordDeathofClient() {
                Msg.Info("Click 'Record Death of Client' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Record Death of a Title Holder')]"))).click();
                Msg.Done();
            }
            public static void ManageAgent() {
                Msg.Info("Click 'Manage Agent' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Manage_Agent_click))).click();
                Msg.Done();
            }
            public static void ManageProfessional() {
                Msg.Info("Click 'Manage Professional' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Manage_Professional))).click();
                Msg.Done();
            }
            public static void RequestChange() {
                Msg.Info("Click 'Request Change' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RequestChange))).click();
                Msg.Done();
            }
            public static void ChangePassword() {
                Msg.Info("Click 'Change Password' on the Main Menu");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Change_Password))).click();
                Msg.Done();
            }
        }
    }

    public static class EditProfile {

        public static class Enter {
            public static void DateOfBirth(String dateOfBirth) {
                Msg.Info("Clear the 'Date Of Birth' field");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_OF_BIRTH_FIELD))).clear();
                Msg.Done();

                Msg.Info("Enter 'Date Of Birth'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_OF_BIRTH_FIELD))).sendKeys(dateOfBirth);
                Msg.Done();
                System.out.println("      Date Of Birth: " + dateOfBirth);
            }

            public static void Sex(String sex) {
                Msg.Info("Enter 'Sex'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SEX_FIELD))).sendKeys(sex);
                Msg.Done();
                System.out.println("      Sex: " + sex);
            }
            public static void State(String state) {
                Msg.Info("Enter 'Sex'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("stateId"))).sendKeys(state);
                Msg.Done();
                System.out.println("      Sex: " + state);
            }
            public static void City(String city) {
                Msg.Info("Enter 'Sex'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("otherCityId"))).sendKeys(city);
                Msg.Done();
                System.out.println("      Sex: " + city);
            }


            public static void CellPhoneNumber(String code, String number) {
                Msg.Info("Enter 'Cell Phone Number'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CELL_PHONE_NUMBER_CODE_FIELD))).clear();
  //              wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CELL_PHONE_NUMBER_CODE_FIELD))).sendKeys(code);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CELL_PHONE_NUMBER_FIELD))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CELL_PHONE_NUMBER_FIELD))).sendKeys(number);
                Msg.Done();
                System.out.println("      Cell Phone Number: " + code + " " + number);
            }

            public static void Telephone(String code, String number) {
                Msg.Info("Enter 'Telephone Number'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
               // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TELEPHONE_CODE_FIELD))).clear();
               // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TELEPHONE_CODE_FIELD))).sendKeys(code);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TELEPHONE_FIELD))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TELEPHONE_FIELD))).sendKeys(number);
                Msg.Done();
                System.out.println("      Telephone Number: " + code + " " + number);
            }
public static void Telenum(String number){

    Msg.Info("Enter 'Telephone Number'");
   Browser.Sleep(Browser.Mill_Sec());
    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TELEPHONE_FIELD))).sendKeys(number);
    Msg.Done();
    System.out.println("      Telephone Number: " +   " " + number);

}
            public static void EmainAddress() {

                int min = 10000;
                int max = 99999;
                Random random = new Random();
                int number = random.nextInt(max - min + 1) + min;
                String suffix = String.valueOf(number);
                final String email = "user" + suffix + "@pacificgeotech.com";

                Msg.Info("Enter 'Email Address'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EMAIL_FIELD))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EMAIL_FIELD))).sendKeys(email);
                Msg.Done();
                System.out.println("      Email Address: " + email);

            }

            public static void AddressLine1(String addressLine1) {
                Msg.Info("Enter 'Address Line 1'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ADDRESS_LINE_1_FIELD))).clear();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ADDRESS_LINE_1_FIELD))).sendKeys(addressLine1);
                Msg.Done();
                System.out.println("      Address Line 1: " + addressLine1);

            }
        }

        public static class Select {
            public static void ActivityProfile(String activityProfile) {

                Msg.Info("Select 'Activity Profile'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()='" + activityProfile + "']"))).click();
                Msg.Done();
                System.out.println("      Activity Profile: " + activityProfile);
            }

            public static void Country(String country) {
                Msg.Info("Enter 'Country'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(COUNTRY_FIELD))).sendKeys(country);
                Msg.Done();
                System.out.println("      Country: " + country);
            }

            public static void Department(String department) {
                Msg.Info("Enter 'Department'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DEPARTMENT_FIELD))).sendKeys(department);
                Msg.Done();
                System.out.println("      Department: " + department);
            }

            public static void Municipality(String municipality) {
                Msg.Info("Enter 'Municipality'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(MUNICIPALITY_FIELD))).sendKeys(municipality);
                Msg.Done();
                System.out.println("      Municipality: " + municipality);
            }


            public static void EthnicYesNo(String ethnicYesNo, String ethnicGroup) {
                if (ethnicYesNo.contains("Yes")) {
                    Msg.Info("Select 'Do you belong to any Ethnic Admin?':" + ethnicYesNo);
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ETHNIC_GROUP_RADIO_YES))).click();
                    Msg.Done();

                    Msg.Info("Select 'Ethnic Admin?':" + ethnicGroup);
                    Browser.Sleep(500);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ETHNIC_GROUP_DROPDOWN))).click();
                    Browser.Sleep(500);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()='" + ethnicGroup + "']"))).click();
                    Msg.Done();

                    System.out.println("      Do you belong to any Ethnic Admin?: " + ethnicYesNo);
                }
                if (ethnicYesNo.contains("No")) {
                    Msg.Info("Select 'Do you belong to any Ethnic Admin?':" + ethnicYesNo);
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ETHNIC_GROUP_RADIO_NO))).click();
                    Msg.Done();

                }

            }

            public static void DisclaimerForElectronicNotification(String choice) {
                if (choice.contains("Electronic")) {
                    Msg.Info("Select 'Electronic'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ELECTRONIC_RADIO_BUTTON))).click();
                    Msg.Done();
                }
                if (choice.contains("Manual")) {
                    Msg.Info("Select 'Manual'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(MANUAL_RADIO_BUTTON))).click();
                    Msg.Done();
                }
            }

            public static void AgreeCheckbox() {
                Msg.Info("Select 'Agree Checkbox'");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(AGREE_CHECKBOX))).click();
                Msg.Done();
            }
        }

        public static class Click {
            public static void AddAddressLine1() {
                Msg.Info("Click the 'Add' Address Line 1 button");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ADDRESS_LINE_1_ADD_BUTTON))).click();
                Msg.Done();
            }

            public static void Next() {
                Msg.Info("Click the 'Next' button");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NEXT_BUTTON))).click();
                Msg.Done();
            }
        }

        public static class AddressFormatter {
            public static class Enter {
                public static void EthnicAdressChange(String NewAdress) {
                    Msg.Info("Enter 'Quadrant Sur'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"addressLine1Id\"]"))).sendKeys(NewAdress);
                    Msg.Done();
                    System.out.println("      Changed Address: " + NewAdress);
                }
                public static void EthnicAdressChange_Clear() {
                    Msg.Info("Enter 'Quadrant Sur'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"addressLine1Id\"]"))).clear();
                    Msg.Done();

                }

                public static void TypeOfRoad(String typeOfRoad) {
                    Msg.Info("Enter 'Type Of Road'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_OF_ROAD_FIELD))).sendKeys(typeOfRoad);
                    Msg.Done();
                    System.out.println("      Type Of Road: " + typeOfRoad);
                }

                public static void NumberOrCommonNameOfTheMainRoad(String numberOrCommonNameOfTheMainRoad) {
                    Msg.Info("Enter 'Number Or Common Name Of The Main Road'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NUMBER_OR_COMMON_NAME_OF_THE_MAIN_ROAD_FIELD))).sendKeys(numberOrCommonNameOfTheMainRoad);
                    Msg.Done();
                    System.out.println("      Number Or Common Name Of The Main Road: " + numberOrCommonNameOfTheMainRoad);
                }

                public static void LetterAssociatedToTheMainNomenclature(String letterAssociatedToTheMainNomenclature) {
                    Msg.Info("Enter 'Letter Associated To The Main Nomenclature'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LETTER_ASSOCIATED_TO_THE_MAIN_NOMENCLATURE_FIELD))).sendKeys(letterAssociatedToTheMainNomenclature);
                    Msg.Done();
                    System.out.println("      Letter Associated To The Main Nomenclature: " + letterAssociatedToTheMainNomenclature);
                }

                public static void PrefixBIS(String prefixBIS) {
                    Msg.Info("Enter 'Prefix BIS'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PREFIX_BIS_FIELD))).sendKeys(prefixBIS);
                    Msg.Done();
                    System.out.println("      Prefix BIS: " + prefixBIS);
                }

                public static void LetterAssociatedToThePrefixBIS(String letterAssociatedToThePrefixBIS) {
                    Msg.Info("Enter 'Letter Associated To The Prefix BIS'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LETTER_ASSOCIATED_TO_THE_PREFIX_BIS_FIELD))).sendKeys(letterAssociatedToThePrefixBIS);
                    Msg.Done();
                    System.out.println("      Letter Associated To The Prefix BIS: " + letterAssociatedToThePrefixBIS);
                }

                public static void QuadrantSur(String quadrantSur) {
                    Msg.Info("Enter 'Quadrant Sur'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(QUADRANT_SUR_FIELD))).sendKeys(quadrantSur);
                    Msg.Done();
                    System.out.println("      Quadrant Sur: " + quadrantSur);
                }

                public static void NumberOfTheGeneratingRoad(String numberOfTheGeneratingRoad) {
                    Msg.Info("Enter 'Number Of The Generating Road'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NUMBER_OF_THE_GENERATING_ROAD_FIELD))).sendKeys(numberOfTheGeneratingRoad);
                    Msg.Done();
                    System.out.println("      Number Of The Generating Road: " + numberOfTheGeneratingRoad);
                }

                public static void LetterAssociatedToTheGeneratingRoad(String letterAssociatedToTheGeneratingRoad) {
                    Msg.Info("Enter 'Letter Associated To The Generating Road'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LETTER_ASSOCIATED_TO_THE_GENERATING_ROAD_FIELD))).sendKeys(letterAssociatedToTheGeneratingRoad);
                    Msg.Done();
                    System.out.println("      Letter Associated To The Generating Road: " + letterAssociatedToTheGeneratingRoad);
                }

                public static void PlateNumber(String plateNumber) {
                    Msg.Info("Enter 'Plate Number'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PLATE_NUMBER_FIELD))).sendKeys(plateNumber);
                    Msg.Done();
                    System.out.println("      Plate Number: " + plateNumber);
                }

                public static void QuadrantEste(String quadrantEste) {
                    Msg.Info("Enter 'Quadrant Este'");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(QUADRANT_ESTE_FIELD))).sendKeys(quadrantEste);
                    Msg.Done();
                    System.out.println("      Quadrant Este: " + quadrantEste);
                }
            }

            public static class Click {
                public static void Accept() {
                    Msg.Info("Click the 'Accept' button");
                   Browser.Sleep(Browser.Mill_Sec());
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ACCEPT_BUTTON))).click();
                    Msg.Done();

                }
            }
        }
        public static class Ethniccommunity{
            public static void AddClient(String Enterclientid){

                Msg.Info("Click the 'Add' button");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ethnicCommunityRepClientInputId\"]"))).sendKeys(Enterclientid);
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ethnicCommunityRepClientInputId\"]"))).sendKeys( Keys.ENTER);
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wid-id-0\"]/div/div/div[2]/div[2]/button"))).click();
                Msg.Done();
            }
            public static void RemoveClient(){

                Msg.Info("Click the 'Add' button");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'Test test')]/following-sibling::td[2]/button"))).click();

                Msg.Done();
            }
        }
        public static class Remove {
            public static void Profession(String toBeRemoved) {

                int numberOfProfessions = Browser.driver.findElements(By.xpath("//button[@data-ng-click='removeProfessionalInfo($index)']")).size();

                Msg.Info("Removing All Professions");
                for (int i = 1; i <= numberOfProfessions; i++) {
                    WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-ng-click='removeProfessionalInfo($index)'])[1]"))).click();
                   Browser.Sleep(Browser.Mill_Sec());
                }
                Msg.Done();
            }

            public static void Profession(int toBeRemoved) {

                int numberOfProfessions = Browser.driver.findElements(By.xpath("//button[@data-ng-click='removeProfessionalInfo($index)']")).size();

                Msg.Info("Removing " + toBeRemoved + " Professions");

                if ((numberOfProfessions - toBeRemoved) >= 1) {
                    for (int i = 1; i <= toBeRemoved; i++) {
                        WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-ng-click='removeProfessionalInfo($index)'])[1]"))).click();
                       Browser.Sleep(Browser.Mill_Sec());
                    }
                }
                int numberOfProfessionsAfterRemoval = Browser.driver.findElements(By.xpath("//button[@data-ng-click='removeProfessionalInfo($index)']")).size();

                Msg.Done();
                System.out.println("      Number of Professions Before: " + numberOfProfessions);
                System.out.println("      Number of Professions After: " + numberOfProfessionsAfterRemoval);
            }
        }


        public static class Add {
            public static void Profession(String professionalDesignation, String professionaldocumentNumber) {


                Msg.Info("Click the 'Add' button");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ADD_PROFESSION_BUTTON))).click();
                Msg.Done();

                Msg.Info("Select 'Professional Designation'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PROFESSIONAL_DESIGNATION_FIELD_1))).sendKeys(professionalDesignation);
                Msg.Done();

                Msg.Info("Enter 'Professional Document Number'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PROFESSIONAL_DOCUMENT_NUMBER_FIELD_1))).sendKeys(professionaldocumentNumber);
                Msg.Done();
            }
            public static void Profession1(int index, String professionalDesignation, String professionaldocumentNumber) {


               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);

                Msg.Info("Select 'Professional Designation'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='professionalDesId" + index + "']"))).sendKeys(professionalDesignation);
                Msg.Done();

                Msg.Info("Enter 'Professional Document Number'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='professionalDocNumId" + index + "']"))).sendKeys(professionaldocumentNumber);
                Msg.Done();
                System.out.println("      Professional Designation    :" + professionalDesignation);
                System.out.println("      Professional Document Number:" + professionaldocumentNumber);
            }

            public static void Profession(int index, String professionalDesignation, String professionaldocumentNumber) {


                Msg.Info("Click the 'Add' button");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ADD_PROFESSION_BUTTON))).click();
                Msg.Done();

                Msg.Info("Select 'Professional Designation'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='professionalDesId" + index + "']"))).sendKeys(professionalDesignation);
                Msg.Done();

                Msg.Info("Enter 'Professional Document Number'");
               Browser.Sleep(Browser.Mill_Sec());
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='professionalDocNumId" + index + "']"))).sendKeys(professionaldocumentNumber);
                Msg.Done();
                System.out.println("      Professional Designation    :" + professionalDesignation);
                System.out.println("      Professional Document Number:" + professionaldocumentNumber);
            }
        }

        public static class Verify {
            public static void MaximumProfessionError() {
                Msg.Info("Verify that the error 'The maximum number of Professional Information is 5.' is displayed" );
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                String errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='errorMsg ng-binding']"))).getText();

                Assert.assertEquals(errorMessage, "The maximum number of Professional Information is 5.");

                Msg.Done();
                System.out.println("      Error Message: " + errorMessage);
            }

            public static void IAgreeToReceiveNotificationsError() {
                Msg.Info("Verify that the error 'I agree to receive notifications from the ANM is required' is displayed" );
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                String errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'I agree to receive notifications from the ANM is required')]"))).getText();

                Assert.assertEquals(errorMessage, "I agree to receive notifications from the ANM is required");

                Msg.Done();
                System.out.println("      Error Message: " + errorMessage);
            }

            public static void AddressLine1RequiredErrorMessage() {
                Msg.Info("Verify that the Error message 'Address Line 1 is required' is displayed");
               Browser.Sleep(Browser.Mill_Sec());

                String errorText = Browser.driver.findElement(By.xpath("(//a[@class='errorMsg ng-binding'])[1]")).getText();

                Assert.assertEquals("Address Line 1 is required", errorText);

                Msg.Done();
                System.out.println("      Expecter Result: " + "Address Line 1 is required");
                System.out.println("      Actual Result  : " + errorText);
            }

            public static void DepartmentRequiredErrorMessage() {
                Msg.Info("Verify that the Error message 'Department is required' is displayed");
               Browser.Sleep(Browser.Mill_Sec());

                String errorText = Browser.driver.findElement(By.xpath("(//a[@class='errorMsg ng-binding'])[2]")).getText();

                Assert.assertEquals("Department is required", errorText);

                Msg.Done();
                System.out.println("      Expecter Result: " + "Department is required");
                System.out.println("      Actual Result  : " + errorText);
            }

            public static void MunicipalityRequiredErrorMessage() {
                Msg.Info("Verify that the Error message 'Municipality is required' is displayed");
               Browser.Sleep(Browser.Mill_Sec());

                String errorText = Browser.driver.findElement(By.xpath("(//a[@class='errorMsg ng-binding'])[3]")).getText();

                Assert.assertEquals("Municipality is required", errorText);

                Msg.Done();
                System.out.println("      Expecter Result: " + "Municipality is required");
                System.out.println("      Actual Result  : " + errorText);
            }
        }
    }

    public static class Summary {
        public static class Click {
            public static void Confirm() {

                Msg.Info("Click the 'Confirm' button");
               Browser.Sleep(Browser.Mill_Sec());
                WebDriverWait wait = new WebDriverWait(Browser.driver, 80);
                Crd_Conditions_Advisory.Click.Scrolldown();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CONFIRM_BUTTON))).click();
                Msg.Done();
            }
        }
    }

    public static class Calender{

        public static class Click{

            public static void Clear(){

                WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATE_OF_BIRTH_FIELD))).clear();



            }

        }

    }


    public static class Confirmation {
        public static class Verify {
            public static void SuccessMessage() {
                Msg.Info("Verify that the message 'Profile update has been completed successfully.' is displayed");
               Browser.Sleep(Browser.Mill_Sec());
                int msgCount = Browser.driver.findElements(By.xpath("//span[text()='Profile update has been completed successfully.']")).size();
                Assert.assertEquals(msgCount, 1);

                Msg.Done();
            }

            public static void Header() {
                Msg.Info("Verify that the Header 'Edit Profile Information.' is displayed");
               Browser.Sleep(Browser.Mill_Sec());
                //int msgCount = Browser.driver.findElements(By.xpath("//span[text()='Edit Profile Information > Confirmation']")).size();

                String titleText = Browser.driver.findElement(By.xpath("//*[@id='pageTitleId']")).getText();

                Assert.assertEquals("Edit Profile Information > Confirmation", titleText);

                Msg.Done();
                System.out.println("      Expecter Result:" + "Edit Profile Information > Confirmation");
                System.out.println("      Actual Result  :" + titleText);
            }


        }
    }

//    public static final String CLIENT_MENU = "//*[@id='left-panel']/navigation-widget/div/nav/ul/li[4]/a[2]";
    public static final String CLIENT_MENU = "//a[@class='cata-collapse-click menu ng-scope']//i[@name='user']";

//    public static final String EDIT_PROFILE_INFORMATION_MENU = "//*[@id='left-panel']/navigation-widget/div/nav/ul/li[4]/ul/li[1]/a";
    public static final String EDIT_PROFILE_INFORMATION_MENU = "//a[contains(text(),'Edit Profile Information')]";
    public static final String MANAGE_AGENT_MENU = "//*[@id='left-panel']/navigation-widget/div/nav/ul/li[4]/ul/li[2]/a";
    public static final String MANAGE_PROFESSIONAL_MENU = "//*[@id='left-panel']/navigation-widget/div/nav/ul/li[4]/ul/li[3]/a";
    public static final String REQUEST_CHANGE_TO_PERSONAL_BUSINESS_INFORMATION_MENU = "//*[@id='left-panel']/navigation-widget/div/nav/ul/li[4]/ul/li[4]/a";

    public static final String DATE_OF_BIRTH_FIELD = "//*[@id='dateOfBirthId']";
    public static final String SEX_FIELD = "//*[@id='sexId']";

    private static final String COUNTRY_FIELD = "//*[@id='countryId']";
    private static final String DEPARTMENT_FIELD = "//*[@id='departmentId']";
    private static final String MUNICIPALITY_FIELD = "//*[@id='cityId']";
    private static final String ADDRESS_LINE_1_ADD_BUTTON = "//*[@id='addressLine1Id']/span/table/tbody/tr/td[2]/button";
    private static final String CELL_PHONE_NUMBER_CODE_FIELD = "//*[@id='cellPhoneNumCodeId']";
    private static final String CELL_PHONE_NUMBER_FIELD = "//*[@id='cellPhoneNumId']";
    private static final String TELEPHONE_CODE_FIELD = "//*[@id='telephoneCodeId']";
    private static final String TELEPHONE_FIELD = "//*[@id='telephoneNumId']";
    private static final String EMAIL_FIELD = "//*[@id='contactEmailId']";
    private static final String CONFIRM_EMAIL_FIELD = "//*[@id='confirmEmailId']";
    private static final String INPUT_VALID_CLIENT_ID_OR_NAME_FIELD = "//*[@id='ethnicCommunityRepClientInputId']";
    private static final String CLIENT_ADD_BUTTON = "//*[@id='wid-id-0']/div/div/div[2]/div[2]/button";
    private static final String ELECTRONIC_RADIO_BUTTON = "(//*[@id='notificationDisclaimerId'])[1]";
    private static final String MANUAL_RADIO_BUTTON = "(//*[@id='notificationDisclaimerId'])[2]";
    private static final String ETHNIC_COMMUNITY_TYPE_IS_REQUIRED = "//*[contains(text(),'Ethnic Community Type is required')]";
    private static final String ETHNIC_COMMUNITY_NAME_IS_REQUIRED = "//*[contains(text(),'Ethnic Community Name is required')]";
    private static final String REGISTRATION_NUMBER_FIELD_IS_REQUIRED = "//*[contains(text(),'External Number is required')]";
    private static final String REGISTRATION_NUMBER_FIELD_IS_NUMERIC = "//*[contains(text(),'External Number should be a number')]";
    private static final String DEPARTMENT_FIELD_IS_REQUIRED = "//*[contains(text(),'Department is required')]";
    private static final String MUNCIPALITY_FIELD_IS_REQUIRED = "//*[contains(text(),'Municipality is required')]";
    private static final String ADDRESS_LINE_1_REQUIRED = "//*[contains(text(),'Address Line 1 is required')]";
    private static final String ADDRESS_LINE_1_FIELD = "//*[@id='addressLine1Id']";
    private static final String ADDRESS_FORMATTER_POPUP = "//*[@class='modal-content']";
    private static final String ADDRESS_FORMATTER_CLOSE_BUTTON = "html/body/div[1]/div/div/div[3]/button[1]";
    private static final String TYPE_OF_ROAD_FIELD = "//*[@id='roadTypeSlctId']";
    private static final String NUMBER_OR_COMMON_NAME_OF_THE_MAIN_ROAD_FIELD = "//*[@id='mainRoadNumberOrNameId']";
    private static final String LETTER_ASSOCIATED_TO_THE_MAIN_NOMENCLATURE_FIELD = "//*[@id='mainRoadCompanionLetterSlctId']";
    private static final String PREFIX_BIS_FIELD = "//*[@id='bisPrefixSlctId']";
    private static final String LETTER_ASSOCIATED_TO_THE_PREFIX_BIS_FIELD = "//*[@id='bisPrefixCompanionLetterSlctId']";
    private static final String QUADRANT_SUR_FIELD = "//*[@id='mainRoadQuadrantSlctId']";
    private static final String NUMBER_OF_THE_GENERATING_ROAD_FIELD = "//*[@id='generatingRoadNumberId']";
    private static final String LETTER_ASSOCIATED_TO_THE_GENERATING_ROAD_FIELD = "//*[@id='generatingRoadCompanionLetterSlctId']";
    private static final String PLATE_NUMBER_FIELD = "//*[@id='plateNumberId']";
    private static final String QUADRANT_ESTE_FIELD = "//*[@id='plateNumberQuadrantSlctId']";
    private static final String ACCEPT_BUTTON = "//button[@data-ng-click='accept()']";
    private static final String ETHNIC_GROUP_RADIO_YES = "(//*[@id='communityMemIndId'])[1]";
    private static final String ETHNIC_GROUP_RADIO_NO = "(//*[@id='communityMemIndId'])[2]";
    private static final String ETHNIC_GROUP_DROPDOWN = "(//*[@id='communityMemIndId'])[1]";

    private static final String ADD_PROFESSION_BUTTON = "//button[@data-ng-click='addProfessionalInfo()']";
    private static final String PROFESSIONAL_DESIGNATION_FIELD_1 = "//*[@id='professionalDesId1']";
    private static final String PROFESSIONAL_DOCUMENT_NUMBER_FIELD_1 = "//*[@id='professionalDocNumId1']";
    private static final String AGREE_CHECKBOX = "//*[@id='agreeChkbxId']";
    private static final String NEXT_BUTTON = "//*[@id='content']/div/form/page-buttons/div/div[2]/div[3]/button";
    private static final String CONFIRM_BUTTON = "//*[@id='content']/div/page-buttons/div/div[2]/div[3]/button";
    private static final String ADDRESS_FORMATTER_ACCEPT_BUTTON = "html/body/div[1]/div/div/div[3]/button[3]";
    private static final String ADDRESS_FORMATTER_TYPE_OF_ROAD_REQUIRED = "//*[contains(text(),'Type of Road is required')]";
    private static final String NUMBER_OR_COMMON_NAME_OF_THE_MAIN_ROAD_REQUIRED = "//*[contains(text(),'Number or common name of the main road is required')]";
    private static final String LETTER_ASSOCIATED_TO_THE_PREFIX_FIELD = "//*[@id='bisPrefixCompanionLetterSlctId']";
    private static final String NUMBER_OF_THE_GENERATING_ROAD_REQUIRED = "//*[contains(text(),'Number of the generating road is required')]";
    private static final String NUMBER_OF_THE_GENERATING_ROAD_NUMERIC = "//*[contains(text(),'Number of the generating road must be numeric')]";
    private static final String PLATE_NUMBER_FIELD_REQUIRED = "//*[contains(text(),'Plate Number is required')]";
    private static final String PLATE_NUMBER_NUMERIC = "//*[contains(text(),'Plate Number must be numeric')]";
    private static final String RECAPTCHA_CHECKBOX = "//*[@id='recaptcha-anchor']";
    private static final String SELECT_PERSON_TYPE_NEXT_BUTTON = "//*[@id='content']/div/form/page-buttons/div/div[2]/div[3]/button";

    private static final String NATURAL_PERSON = "//*[@id='wid-id-0']/div/div/div[2]/div[2]";

    private static final String FIRST_NAME_FIELD = "//*[@id='firstNameId']";
    private static final String MIDDLE_NAME_FIELD = "//*[@id='middleNameId']";
    private static final String FIRST_SURNAME_FIELD = "//*[@id='firstSurnameId']";
    private static final String SECOND_SURNAME_FIELD = "//*[@id='secondSurnameId']";
    private static final String IDENTIFICATION_TYPE_FIELD = "//*[@id='identificationTypeId']";
    private static final String ID_NUMBER_FIELD = "//*[@id='idNumberId']";
    private static final String OPTION_CEDULA = "//*[@id='identificationTypeId']/option[2]";
    private static final String MINERAL_EXPLORATION_COMPANY = "//*[@id='activityProfileId']/option[9]";
    private static final String OPTION_MALE = "//*[@id='sexId']/option[2]";

    // For Manage_Agent_click
    private static final String Manage_Agent_click = "//a[contains(text(),'Manage Agent')]";
    //For Professional
    private static final String Manage_Professional = "//a[contains(text(),'Manage Professional')]";
    //For RequestChange
    private static final String RequestChange = "//a[contains(text(),'Request Change to Personal/Business Information')]";
    //For Change-possword
    private static final String Change_Password = "//a[contains(text(),'Change Password')]";
   // private static final String Calender_button = "//input[@id=\"dateOfBirthId\"]/following-sibling::div/following-sibling::span/button";
   // private static final String Date_Select = "//button[@ng-disabled=\"isDisabled('today')\"]";
}
