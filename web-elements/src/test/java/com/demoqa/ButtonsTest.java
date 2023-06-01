package com.demoqa;

import com.demoqa.page.ButtonsPage;
import org.junit.jupiter.api.Test;
import static com.demoqa.configuration.ConfigProvider.BASE_URL;
import static org.junit.jupiter.api.Assertions.*;

public class ButtonsTest extends BaseTest {
    @Test
    public void testPageIsOpenTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        String currentURL = driver.getCurrentUrl();
        String expectedURL = BASE_URL+"buttons";
        assertEquals(currentURL, expectedURL);
    }
    @Test
    public void doubleLeftClickByDoubleClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.doubleClickLeft(buttonsPage.doubleClickButton);
        String expectedResult = "You have done a double click";
        String actualResult = buttonsPage.getSuccessMessage(buttonsPage.doubleClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oneLeftClickByDoubleClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.oneClickLeft(buttonsPage.doubleClickButton);
        assertFalse(buttonsPage.doubleClickMessageIsAvailable());
    }
    @Test
    public void oneRightClickByDoubleClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.oneClickRight(buttonsPage.doubleClickButton);
        assertFalse(buttonsPage.doubleClickMessageIsAvailable());
    }
    @Test
    public void doubleRightClickByDoubleClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.doubleClickRight(buttonsPage.doubleClickButton);
        assertFalse(buttonsPage.doubleClickMessageIsAvailable());
    }
    @Test
    public void doubleLeftClickByRightClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.doubleClickLeft(buttonsPage.rightClickButton);
        assertFalse(buttonsPage.rightClickMessageIsAvailable());
    }
    @Test
    public void oneLeftClickByRightClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.oneClickLeft(buttonsPage.rightClickButton);
        assertFalse(buttonsPage.rightClickMessageIsAvailable());
    }
    @Test
    public void oneRightClickByRightClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.oneClickRight(buttonsPage.rightClickButton);
        String expectedResult = "You have done a right click";
        String actualResult = buttonsPage.getSuccessMessage(buttonsPage.rightClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doubleRightClickByRightClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.doubleClickRight(buttonsPage.rightClickButton);
        String expectedResult = "You have done a right click";
        String actualResult = buttonsPage.getSuccessMessage(buttonsPage.rightClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doubleLeftClickByClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.doubleClickLeft(buttonsPage.clickButton);
        String expectedResult = "You have done a dynamic click";
        String actualResult = buttonsPage.getSuccessMessage(buttonsPage.dynamicClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oneLeftClickByClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.oneClickLeft(buttonsPage.clickButton);
        String expectedResult = "You have done a dynamic click";
        String actualResult = buttonsPage.getSuccessMessage(buttonsPage.dynamicClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oneRightClickByClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.oneClickRight(buttonsPage.clickButton);
        assertFalse(buttonsPage.dynamicClickMessageIsAvailable());
    }
    @Test
    public void doubleRightClickByClickButtonTest() {
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.open();
        MouseAction.doubleClickRight(buttonsPage.clickButton);
        assertFalse(buttonsPage.dynamicClickMessageIsAvailable());
    }
}
