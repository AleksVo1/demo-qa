package com.demoqa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

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


    public String doubleClickMessageIsAvailable() {
        try {
            driver.findElement(By.id("doubleClickMessage"));
            logger.info("Double Click Message element found");
            return "Element found";
        } catch (NoSuchElementException e) {
            logger.info("Double Click Message element not found");
            return "Element not found";
        }
    }

    public String rightClickMessageIsAvailable() {
        try {
            driver.findElement(By.id("rightClickMessage"));
            logger.info("Right Click Message element found");
            return "Element found";
        } catch (NoSuchElementException e) {
            logger.info("Right Click Message element not found");
            return "Element not found";
        }
    }

    public String dynamicClickMessageIsAvailable() {
        try {
            driver.findElement(By.id("dynamicClickMessage"));
            logger.info("Dynamic Click Message element found");
            return "Element found";
        } catch (NoSuchElementException e) {
            logger.info("Dynamic Click Message element not found");
            return "Element not found";
        }
    }
    public String getSuccessMessage(WebElement message){
        String text=message.getText();
        logger.info("Success message retrieved: {}", text);
        return text;
    }
    public void oneClickLeft(WebElement button){
        button.click();
        logger.info("Performed one-click left button mouse on element");
    }
    public void doubleClickLeft(WebElement button){
        Actions actions=new Actions(driver);
        actions.doubleClick(button).perform();
        logger.info("Performed double-click left button mouse on element");
    }
    public void oneClickRight(WebElement button){
        Actions actions=new Actions(driver);
        actions.contextClick(button).perform();
        logger.info("Performed one-click right button mouse on element");
    }
    public void doubleClickRight(WebElement button){
        Actions actions=new Actions(driver);
        actions.contextClick(button).pause(Duration.ofMillis(100)).contextClick().perform();
        logger.info("Performed double-click right button mouse on element");
    }
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

}
