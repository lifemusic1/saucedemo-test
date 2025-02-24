package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class CartTest extends BaseTest {

    @Test
    public void testAddItemToCart() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        WebElement cartItem = driver.findElement(By.className("cart_item"));
        Assert.assertTrue(cartItem.isDisplayed(), "L'oggetto non è stato aggiunto al carrello!");
    }
}
