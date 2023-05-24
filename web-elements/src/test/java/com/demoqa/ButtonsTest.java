package com.demoqa;

import com.demoqa.page.ButtonsPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ButtonsTest extends BasePageTest{
    @Test
    public void testPageIsOpenTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/buttons";
        assertEquals(currentURL,expectedURL);
    }

    @Test
    public void doubleLeftClickByDoubleClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.doubleClickLeft(buttonsPage.doubleClickButton);
        String expectedResult= "You have done a double click";
        String actualResult=buttonsPage.getSuccessMessage(buttonsPage.doubleClickMessage);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oneLeftClickByDoubleClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);

        buttonsPage.open("buttons");

        buttonsPage.oneClickLeft(buttonsPage.doubleClickButton);

        String expectedResult="Element not found";

        String actualResult;
        actualResult = buttonsPage.doubleClickMessageIsAvailable();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oneRightClickByDoubleClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.oneClickRight(buttonsPage.doubleClickButton);
        String expectedResult="Element not found";
        String actualResult;
        actualResult = buttonsPage.doubleClickMessageIsAvailable();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doubleRightClickByDoubleClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.doubleClickRight(buttonsPage.doubleClickButton);
        String expectedResult= "Element not found";
        String actualResult;
        actualResult = buttonsPage.doubleClickMessageIsAvailable();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doubleLeftClickByRightClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.doubleClickLeft(buttonsPage.rightClickButton);
        String expectedResult= "Element not found";
        String actualResult=buttonsPage.rightClickMessageIsAvailable();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oneLeftClickByRightClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.oneClickLeft(buttonsPage.rightClickButton);
        String expectedResult= "Element not found";
        String actualResult=buttonsPage.rightClickMessageIsAvailable();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oneRightClickByRightClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.oneClickRight(buttonsPage.rightClickButton);
       String expectedResult= "You have done a right click";
        String actualResult=buttonsPage.getSuccessMessage(buttonsPage.rightClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doubleRightClickByRightClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.doubleClickRight(buttonsPage.rightClickButton);
        String expectedResult= "You have done a right click";
        String actualResult=buttonsPage.getSuccessMessage(buttonsPage.rightClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doubleLeftClickByClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.doubleClickLeft(buttonsPage.clickButton);
        String expectedResult= "You have done a dynamic click";
        String actualResult=buttonsPage.getSuccessMessage(buttonsPage.dynamicClickMessage);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oneLeftClickByClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.oneClickLeft(buttonsPage.clickButton);
        String expectedResult= "You have done a dynamic click";
        String actualResult=buttonsPage.getSuccessMessage(buttonsPage.dynamicClickMessage);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oneRightClickByClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.oneClickRight(buttonsPage.clickButton);
        String expectedResult= "Element not found";
        String actualResult=buttonsPage.dynamicClickMessageIsAvailable();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void doubleRightClickByClickButtonTest(){
        ButtonsPage buttonsPage=new ButtonsPage(driver);
        buttonsPage.open("buttons");
        buttonsPage.doubleClickRight(buttonsPage.clickButton);
        String expectedResult= "Element not found";
        String actualResult;
        actualResult = buttonsPage.dynamicClickMessageIsAvailable();
        assertEquals(expectedResult, actualResult);
    }

}
