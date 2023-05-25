package com.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public  class TextBoxPage extends BasePage {
    @FindBy(id = "userName")
    private WebElement fullName;
    @FindBy(id = "userEmail")
    private WebElement userEmail;
    @FindBy(id = "currentAddress")
    private WebElement currentAddress;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(css= "div#output > div")
    private WebElement textResult;
    public TextBoxPage(WebDriver driver) {
       super(driver);
    }


    public void enterFullName(String name){
       logger.info("Entering full name: {}", name);
       fullName.sendKeys(name);
    }
    public String getTextFullName() {
       String value = fullName.getAttribute("value");
       logger.info("Retrieved full name: {}", value);
       return value;
    }
    public void enterUserEmail(String email){
       logger.info("Entering user email: {}", email);
       userEmail.sendKeys(email);
    }
    public String getTextUserEmail() {

       String value = userEmail.getAttribute("value");
       logger.info("Retrieved user email: {}", value);
       return value;
    }

    public void enterCurrentAddress(String address){
       logger.info("Entering current address: {}", address);
       currentAddress.sendKeys(address);
    }
    public String getTextCurrentAddress() {

       String value = currentAddress.getAttribute("value");
       logger.info("Retrieved current address: {}", value);
       return value;
    }
    public void enterPermanentAddress(String address){
       logger.info("Entering permanent address: {}", address);
       permanentAddress.sendKeys(address);
    }
    public String getTextPermanentAddress() {

       String value = permanentAddress.getAttribute("value");
       logger.info("Retrieved permanent address: {}", value);
       return value;
    }
    public void clickSubmit(){
       logger.info("Clicking submit button");
       submitButton.click();

    }
    public String getTextResult() {
       String value = textResult.getText();
       logger.info("Retrieved text result: {}", value);
       return value;
    }
    public String getValidationMessageEmail(){
       String value = userEmail.getAttribute("validationMessage");
       logger.info("Retrieved validation message for email: {}", value);
       return value;
    }
}

