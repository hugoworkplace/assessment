package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.OrderPage;

public class OrderPageTests extends Base {

    @Test
    public void orderTest() {
        driver.findElement(By.cssSelector("[aria-label='menu']")).click();
        OrderPage orderPage = new OrderPage(driver);
        var drinkTab = orderPage.getDrinkTab();
        drinkTab.click();

        var drink = orderPage.getDrinkTile();

        drink.findElement(By.cssSelector("[aria-label='Add to order']")).click();

        //var pizzaTab = orderPage.getPizzaTab();
        //pizzaTab.click();
        //var pizzaTab = driver.findElement(By.cssSelector("[aria-selected='false']"));
        //pizzaTab.click();

        var count = driver.findElement(By.className("order-count"));
        Assertions.assertEquals(1, Integer.parseInt(count.getText()));

        driver.findElement(By.cssSelector("[aria-label='your order']")).click();
        double subtotal = Double.parseDouble(driver.findElement(By.cssSelector("td[class='text-right']")).getText());
        Assertions.assertEquals(4.99, subtotal);
    }
}
