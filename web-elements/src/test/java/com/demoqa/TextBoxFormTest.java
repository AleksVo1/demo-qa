package com.demoqa;

import com.demoqa.page.TextBoxPage;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBoxFormTest extends BasePageTest{

    @Test
    public void testPageIsOpenTest(){
        TextBoxPage textBoxPage=new TextBoxPage(driver);
        textBoxPage.open("text-box");
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/text-box";
        assertEquals(currentURL,expectedURL);
    }
    @Test
    public void fullNameTest(){
        TextBoxPage textBoxPage=new TextBoxPage(driver);
        textBoxPage.open("text-box");
        textBoxPage.enterFullName("Aleksandra");
        String actualResult=textBoxPage.getTextFullName();
        String expectedResult="Aleksandra";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void userEmailTest(){
        TextBoxPage textBoxPage=new TextBoxPage(driver);
        textBoxPage.open("text-box");
        textBoxPage.enterUserEmail("aleksandra@gmail.com");
        String actualResult=textBoxPage.getTextUserEmail();
        String expectedResult="aleksandra@gmail.com";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void currentAddressTest(){
        TextBoxPage textBoxPage=new TextBoxPage(driver);
        textBoxPage.open("text-box");
        textBoxPage.enterCurrentAddress("Dnipro,prospect Svobody,3");
        String actualResult=textBoxPage.getTextCurrentAddress();
        String expectedResult="Dnipro,prospect Svobody,3";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void permanentAddressTest(){
        TextBoxPage textBoxPage=new TextBoxPage(driver);
        textBoxPage.open("text-box");
        textBoxPage.enterPermanentAddress("Dnipro,prospect Svobody,3");
        String actualResult=textBoxPage.getTextPermanentAddress();
        String expectedResult="Dnipro,prospect Svobody,3";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void formTextBoxTest(){
        TextBoxPage textBoxPage=new TextBoxPage(driver);
        textBoxPage.open("text-box");
        textBoxPage.enterFullName("Aleksandra");
        textBoxPage.enterUserEmail("aleksandra@gmail.com");
        textBoxPage.enterCurrentAddress("Dnipro,prospect Svobody,3");
        textBoxPage.enterPermanentAddress("Dnipro,prospect Svobody,3");
        textBoxPage.clickSubmit();

        assertEquals("Name:Aleksandra\n" +
                "Email:aleksandra@gmail.com\n" +
                "Current Address :Dnipro,prospect Svobody,3\n" +
                "Permananet Address :Dnipro,prospect Svobody,3",textBoxPage.getTextResult());
    }
    @Test
    public void userEmailWithoutAtTest() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open("text-box");
        textBoxPage.enterUserEmail("aleksandragmail.com");
        textBoxPage.clickSubmit();
        String actualResult = textBoxPage.getValidationMessageEmail();
        String expectedResult = "Please include an '@' in the email address. 'aleksandragmail.com' is missing an '@'.";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void userEmailWithoutDomainTest() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.open("text-box");
        textBoxPage.enterUserEmail("aleksandra@");
        textBoxPage.clickSubmit();
        String actualResult = textBoxPage.getValidationMessageEmail();
        String expectedResult = "Please enter a part following '@'. 'aleksandra@' is incomplete.";
        assertEquals(expectedResult, actualResult);
    }
}
