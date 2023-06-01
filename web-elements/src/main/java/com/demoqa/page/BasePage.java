package com.demoqa.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.demoqa.configuration.ConfigProvider.BASE_URL;

public abstract class BasePage {

    protected WebDriver driver;
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected void open(String path){
        driver.get(BASE_URL + path);
    }
    public abstract void open();
    public  void scrollToElement(Point point){
        ((JavascriptExecutor)driver).executeScript("window.scrollTo" + point.toString());
    }
}
