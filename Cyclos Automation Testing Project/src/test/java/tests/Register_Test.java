package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Register_Page;
import org.testng.Assert;

public class Register_Test extends BaseClass 

{

    @Test
    public void verifyRegistrationForm() throws Exception 
    
    {

        System.out.println("Test Started");

        Register_Page rp = new Register_Page(driver);

        System.out.println("Clicking Register");
        rp.clickRegisterMenu();

        System.out.println("Entering Name");
        rp.enterName("Ramya User");

        System.out.println("Entering Login Name");
        rp.enterLoginName("ramyauser01");

        System.out.println("Entering Email");
        rp.enterEmail("ramyauser01@gmail.com");

        System.out.println("Entering Website");
        rp.enterWebsite("www.test.com");

        System.out.println("Clicking Next");
        rp.clickNext();
        
        System.out.println("Selecting Female");
        
        rp.selectFemale();
        
        System.out.println("Current URL is: " 
                + driver.getCurrentUrl());
        
        System.out.println("Validating Password Page");

        Assert.assertTrue(
                rp.isPasswordDisplayed(),
                "Password field not displayed!"
        );
        
        System.out.println("Entering Password");

        rp.enterPassword("Test@123");

        System.out.println("Confirming Password");

        rp.enterConfirmPassword("Test@123");
        

        Thread.sleep(3000);

        System.out.println("Test Completed");
    }
}