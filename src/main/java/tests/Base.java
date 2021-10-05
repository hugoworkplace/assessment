package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    WebDriver driver;

    @BeforeEach
    public void Setup() {
        driver = new ChromeDriver();
        driver.get("https://d3udduv23dv8b4.cloudfront.net/#/");
    }

    @AfterEach
    public void close() {
        //if(driver!=null)
         //   driver.quit();
    }
}
