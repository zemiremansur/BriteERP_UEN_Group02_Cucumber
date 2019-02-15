package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }


     public @FindBy(xpath = "//div[@class='oe_secondary_menu_section active']//span[@class='oe_menu_text'][contains(text(),'Dashboard')]")
    WebElement dashBoardElement;

     public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[8]")
    WebElement ordersOrdersElement;

     public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[9]")
    WebElement ordersSessionsElement;

     public @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[2]/li[1]/a/span")
    WebElement catalogProductsElement;

     public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[11]")
    WebElement catalogPriceListElement;

     public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[12]")
    WebElement reportingOrdersElement;

     public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[13]")
    WebElement reportingSalesDetailsElement;

     public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]")
    WebElement configPosElement;

     public @FindBy(xpath = "//span[contains(text(),'PoS Categories')]")
    WebElement POSCategoriesElement;

     public String currentTitle = "Point of Sale - Odoo";



}
