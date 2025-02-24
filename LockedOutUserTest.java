package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class LockedOutUserTest extends BaseTest {

    @Test
    public void testLockedOutUserCannotLogin() {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".error-message-container"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Il messaggio di errore non è visibile!");
        Assert.assertEquals(errorMessage.getText(), 
            "Epic sadface: Sorry, this user has been locked out.", 
            "Il messaggio di errore non è corretto!");
    }
}
