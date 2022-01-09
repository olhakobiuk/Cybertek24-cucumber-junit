package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomaPage {

    public EtsyHomaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "search_query")
    public WebElement searchField;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchButton;

    public void searchFor(String item){
        searchField.clear();
        searchField.sendKeys(item);
        searchButton.click();
    }


}