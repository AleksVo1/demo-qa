package com.demoqa;

import com.demoqa.configuration.ConfigProvider;
import com.demoqa.configuration.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BasePageTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver=WebDriverProvider.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(ConfigProvider.TIMEOUT));
    }
    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
