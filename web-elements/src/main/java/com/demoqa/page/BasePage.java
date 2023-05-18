package com.demoqa.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BasePage {

    protected WebDriver driver;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage(){

    }

    public abstract <T extends BasePage> T open();

    public  void scrollToElement(Point point){
        ((JavascriptExecutor)driver).executeScript("window.scrollTo" + point.toString());
    }
}
