package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Register_Page {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public Register_Page(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

 // Locators

    By registerMenu = By.id("register-link");

    // First text field  Name
    By name = By.xpath("(//input[@type='text'])[1]");

    // Second text field Login
    By loginName = By.xpath("(//input[@type='text'])[2]");

    // Email field
    By email = By.xpath("(//input[@type='text'])[3]");

    // Website
    By website = By.id("website");
    
    // Gender
    By femaleRadio = By.xpath("//label[contains(text(),'Female')]");

    // Next button
    By nextButton = By.xpath("//button[contains(.,'Next')]");
    
    // Password
    By password = By.xpath("(//input[@type='password'])[1]");

    By confirmPassword = By.xpath("(//input[@type='password'])[2]");
    
    // Click Register
    public void clickRegisterMenu() {

        wait.until(ExpectedConditions
                .elementToBeClickable(registerMenu))
                .click();
    }

    // Enter Name
    public void enterName(String uname) {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(name))
                .sendKeys(uname);
        }

    // Enter Login Name
    public void enterLoginName(String lname) {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(loginName))
                .sendKeys(lname);
    }

    // Enter Email
    public void enterEmail(String mail) {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(email))
                .sendKeys(mail);
    }

    // Enter Website
    public void enterWebsite(String site) {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(website))
                .sendKeys(site);
    }

    // Enter Gender
    public void selectFemale() {

        wait.until(ExpectedConditions
                .elementToBeClickable(femaleRadio))
                .click();
    }
    
    // Click Next
    public void clickNext() {

        wait.until(ExpectedConditions
                .elementToBeClickable(nextButton))
                .click();
    }

    public void enterPassword(String pwd) {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(password))
                .sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(confirmPassword))
                .sendKeys(cpwd);
    }
    public boolean isPasswordDisplayed() {

        try {

            return wait.until(ExpectedConditions
                    .visibilityOfElementLocated(password))
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

}

