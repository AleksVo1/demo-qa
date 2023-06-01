package com.demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SortablePage extends BasePage {

    @FindBy(id = "demo-tab-list")
    private WebElement tabList;

    @FindBy(id = "demo-tab-grid")
    private WebElement tabGrid;

    @FindBy(id = "demo-tabpane-list")
    private List<WebElement> elementsList;

    @FindBy(id = "demo-tabpane-grid")
    private WebElement elementsGrid;

    public SortablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        open("sortable");
    }
}
