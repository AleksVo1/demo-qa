package com.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement userEmail;

    @FindBy(id = "gender-radio-1")
    private WebElement radioButtonGenderMale;

    @FindBy(id = "gender-radio-2")
    private WebElement radioButtonGenderFemale;

    @FindBy(id = "gender-radio-3")
    private WebElement radioButtonGenderOther;

    @FindBy(id = "userNumber")
    private WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthInput;

    @FindBy(id = "subjectsContainer")
    private WebElement subjectsContainer;

    @FindBy(id = "hobbies-checkbox-1")
    private WebElement hobbiesCheckboxSports;

    @FindBy(id = "hobbies-checkbox-2")
    private WebElement hobbiesCheckboxReading;

    @FindBy(id = "hobbies-checkbox-3")
    private WebElement hobbiesCheckboxMusic;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "stateCity-wrapper")
    private WebElement dropDownStateCity;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public FormPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        open("automation-practice-form");
    }
}
