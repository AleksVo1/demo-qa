package com.demoqa.page;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

@Slf4j
public class ButtonsPage extends BasePage {

    @FindBy(id="doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id="rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")
    public WebElement clickButton;

    @FindBy(id="doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id="rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(id="dynamicClickMessage")
    public WebElement dynamicClickMessage;

    @Override
    public void open() {
        open("buttons");
    }
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }
    public boolean doubleClickMessageIsAvailable() {
        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(visibilityOfElementLocated(By.id("doubleClickMessage")));
        log.info("Double Click Message element found");
        return true;
        } catch (TimeoutException e) {
            log.info("Double Click Message element not found");
            return false;
        }
    }
    public boolean rightClickMessageIsAvailable() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(visibilityOfElementLocated(By.id("rightClickMessage")));
            log.info("Right Click Message element found");
            return true;
        } catch (TimeoutException e) {
            log.info("Right Click Message element not found");
            return false;
        }
    }
    public boolean dynamicClickMessageIsAvailable() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(visibilityOfElementLocated(By.id("dynamicClickMessage")));
            log.info("Dynamic Click Message element found");
            return true;
        } catch (TimeoutException e) {
            log.info("Dynamic Click Message element not found");
            return false;
        }
    }
    public String getSuccessMessage(WebElement message){
        String text=message.getText();
        log.info("Success message retrieved: {}", text);
        return text;
    }
}
