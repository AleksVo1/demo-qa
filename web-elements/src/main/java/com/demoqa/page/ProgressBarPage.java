package com.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBarPage  extends BasePage {

    @FindBy(id = "startStopButton")
    private WebElement startStopButton;

    @FindBy(id = "progressBar")
    private WebElement progressBar;

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        open("progress-bar");
    }
}
