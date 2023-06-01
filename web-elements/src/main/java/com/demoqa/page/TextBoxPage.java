package com.demoqa.page;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Slf4j
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

   @Override
   public void open() {
      open("text-box");
   }
   public void fillFullName(String name){
       log.info("Entering full name: {}", name);
       fullName.sendKeys(name);
    }
    public String getTextFullName() {
       String value = fullName.getAttribute("value");
       log.info("Retrieved full name: {}", value);
       return value;
    }
    public void fillUserEmail(String email){
       log.info("Entering user email: {}", email);
       userEmail.sendKeys(email);
    }
    public String getTextUserEmail() {
       String value = userEmail.getAttribute("value");
       log.info("Retrieved user email: {}", value);
       return value;
    }
    public void fillCurrentAddress(String address){
       log.info("Entering current address: {}", address);
       currentAddress.sendKeys(address);
    }
    public String getTextCurrentAddress() {
       String value = currentAddress.getAttribute("value");
       log.info("Retrieved current address: {}", value);
       return value;
    }
    public void fillPermanentAddress(String address){
       log.info("Entering permanent address: {}", address);
       permanentAddress.sendKeys(address);
    }
    public String getTextPermanentAddress() {
       String value = permanentAddress.getAttribute("value");
       log.info("Retrieved permanent address: {}", value);
       return value;
    }
    public void clickSubmit(){
       log.info("Clicking submit button");
       submitButton.click();
    }
    public String getTextResult() {
       String value = textResult.getText();
       log.info("Retrieved text result: {}", value);
       return value;
    }
    public String getValidationMessageEmail(){
       String value = userEmail.getAttribute("validationMessage");
       log.info("Retrieved validation message for email: {}", value);
       return value;
    }
}

