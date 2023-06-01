package com.demoqa;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

@Slf4j
public class MouseAction {
    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        MouseAction.driver = driver;
    }
    public static void oneClickLeft(WebElement button){
        button.click();
        log.info("Performed one-click left button mouse on element");
    }
    public static void doubleClickLeft(WebElement button){
        Actions actions=new Actions(driver);
        actions.doubleClick(button).perform();
        log.info("Performed double-click left button mouse on element");
    }
    public static void oneClickRight(WebElement button){
        Actions actions=new Actions(driver);
        actions.contextClick(button).perform();
        log.info("Performed one-click right button mouse on element");
    }
    public static void doubleClickRight(WebElement button){
        Actions actions=new Actions(driver);
        actions.contextClick(button).pause(Duration.ofMillis(100)).contextClick().perform();
        log.info("Performed double-click right button mouse on element");
    }

}
