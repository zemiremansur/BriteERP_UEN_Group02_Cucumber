package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public  WebElement email;

    @FindBy(id = "password")
    public  WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public  WebElement loginbutton;


    public  void login(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginbutton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.urlContains("inbox"));

    }
}
