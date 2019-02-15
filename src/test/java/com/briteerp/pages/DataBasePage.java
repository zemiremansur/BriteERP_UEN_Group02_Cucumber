package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataBasePage {
    public DataBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //The environment we are working on (BriteErpDemo)
    @FindBy(xpath="/html/body/div[1]/div/div[2]/a[2]")
    public  WebElement BriteErpDemo;


    public  void selectEnvironment() {
        BriteErpDemo.click();
    }


}
