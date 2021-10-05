package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ContactPageTests extends Base{

    @Test
    public void errMesgAndClearBtn(){
        driver.findElement(By.cssSelector("[aria-label='contact']")).click();
        var email = driver.findElement(By.name("email"));
        email.sendKeys("xxx");
        var telephone = driver.findElement(By.name("telephone"));
        telephone.sendKeys("xxx");

        var submit = driver.findElement(By.cssSelector("[aria-label='submit']"));
        submit.click();

        var errEmail = driver.findElement(By.id("email-err"));
        var errTelephone = driver.findElement(By.id("telephone-err"));

        //Assert
        Assertions.assertEquals("Email is invalid", errEmail.getText());
        Assertions.assertEquals("Telephone is invalid", errTelephone.getText());

        var clear = driver.findElement(By.cssSelector("[aria-label='clear']"));
        clear.click();

       // Assertions.assertEquals("", errEmail.getText());
        //Assertions.assertEquals("false", errEmail.isEnabled());
       // Assertions.assertEquals("", errTelephone.getText());
       // Assertions.assertEquals("false", errTelephone.isDisplayed());


    }



}
