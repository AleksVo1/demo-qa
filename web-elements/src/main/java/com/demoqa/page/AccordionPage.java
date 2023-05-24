package com.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionPage extends BasePage{
    @FindBy(id = "section1Heading")
    private WebElement section1Heading;
    @FindBy(id = "section1Content")
    private WebElement section1Content;
    @FindBy(id = "section2Heading")
    private WebElement section2Heading;
    @FindBy(id = "section2Content")
    private WebElement section2Content;
    @FindBy(id = "section3Heading")
    private WebElement section3Heading;
    @FindBy(id = "section3Content")
    private WebElement section3Content;

    public AccordionPage(WebDriver driver) {
        super(driver);
    }

}
