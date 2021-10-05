package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDrinkTab(){
        List<WebElement> t = driver.findElements(By.className("v-tab"));
        List<WebElement> t1 = driver.findElements(By.cssSelector("[aria-selected='false']"));
        return t1.get(1);
//        for (WebElement vtab:  driver.findElements(By.className("v-tab"))){
//            System.out.println(vtab.getText());
//            System.out.println(" ss ");
//            if (vtab.getText().equalsIgnoreCase("DRINKS"))
//                return vtab;
//        }
//        throw new NotFoundException("tab not found");
    }

    public WebElement getDrinkTile(){
        List<WebElement> drinks = driver.findElements(By.cssSelector("[class='v-card v-sheet theme--light flexcard px-2 menuItem drink']"));

//        System.out.println(drinks.size());
//        var d = drinks.get(0).findElement(By.cssSelector("[class='v-card__text grow text-center']"));
//        System.out.println(d.findElement(By.tagName("h3")).getText());
        for(WebElement drink : drinks){
            if(drink.findElement(By.cssSelector("[class='v-card__text grow text-center']"))
                    .findElement(By.tagName("h3")).getText().equalsIgnoreCase("Espresso Thickshake")){

                return drink;
            }

        }
        throw new NotFoundException("tab not found");
    }

    public WebElement getPizzaTab() {
        List<WebElement> t1 = driver.findElements(By.cssSelector("[aria-selected='false']"));

        List<WebElement> t = driver.findElements(By.cssSelector("[role='tab']"));
        return t1.get(0);
//        for (WebElement vtab:  driver.findElements(By.cssSelector("[role='tab']"))){
//            System.out.println(vtab.getText());
//            if (vtab.getText().equalsIgnoreCase("PIZZAS"))
//                return vtab;
//        }
//        throw new NotFoundException("tab not found");
    }
}
