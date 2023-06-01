package com.demoqa;

import com.demoqa.page.TextBoxPage;
import org.junit.jupiter.api.*;
import static com.demoqa.configuration.ConfigProvider.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBoxFormTest extends BaseTest {

    private String fullName = "Aleksandra";

    private String email = "aleksandra@gmail.com";

    private String emailWithoutAt = "aleksandragmail.com";

    private String emailWithoutDomain = "aleksandra@";

    private String currentAddress = "Dnipro, prospect Svobody, 3";

    private String permanentAddress = "Dnipro, prospect Svobody, 3";

    @Test
    public void testPageIsOpenTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        String currentURL = driver.getCurrentUrl();
        String expectedURL = BASE_URL+"text-box" ;
        assertEquals(currentURL,expectedURL);
    }
    @Test
    public void fullNameTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        textBoxPage.fillFullName(fullName);
        String actualResult=textBoxPage.getTextFullName();
        assertEquals(fullName,actualResult);
    }
    @Test
    public void userEmailTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        textBoxPage.fillUserEmail(email);
        String actualResult=textBoxPage.getTextUserEmail();
        assertEquals(email,actualResult);
    }
    @Test
    public void currentAddressTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        textBoxPage.fillCurrentAddress(currentAddress);
        String actualResult=textBoxPage.getTextCurrentAddress();
        assertEquals(currentAddress,actualResult);
    }
    @Test
    public void permanentAddressTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        textBoxPage.fillPermanentAddress(permanentAddress);
        String actualResult=textBoxPage.getTextPermanentAddress();
        assertEquals(permanentAddress,actualResult);
    }
    @Test
    public void formTextBoxTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        textBoxPage.fillFullName(fullName);
        textBoxPage.fillUserEmail(email);
        textBoxPage.fillCurrentAddress(currentAddress);
        textBoxPage.fillPermanentAddress(permanentAddress);
        textBoxPage.clickSubmit();
        assertEquals("Name:"+fullName+"\n" +
                "Email:"+email+"\n" +
                "Current Address :"+currentAddress+"\n" +
                "Permananet Address :"+permanentAddress,textBoxPage.getTextResult());
    }
    @Test
    public void userEmailWithoutAtTest() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        textBoxPage.fillUserEmail(emailWithoutAt);
        textBoxPage.clickSubmit();
        String actualResult = textBoxPage.getValidationMessageEmail();
        String expectedResult = "Please include an '@' in the email address. '"+emailWithoutAt+"' is missing an '@'.";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void userEmailWithoutDomainTest() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open();
        textBoxPage.fillUserEmail(emailWithoutDomain);
        textBoxPage.clickSubmit();
        String actualResult = textBoxPage.getValidationMessageEmail();
        String expectedResult = "Please enter a part following '@'. '"+emailWithoutDomain+"' is incomplete.";
        assertEquals(expectedResult, actualResult);
    }
}
