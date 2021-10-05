package ui;

import org.openqa.selenium.WebElement;

public class ProductCard {
    private WebElement product;

    public ProductCard(WebElement product) {
        this.product = product;
    }

    public String getProductName(){
        return product.getText();
    }

//    public WebElement getOrderButton(){
//        //return product.findElement()
//    }
}
