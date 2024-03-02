import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Fourth {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mithunnn/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

       driver.get("https://bstackdemo.com/");
       WebElement e=driver.findElement(By.id("2")).findElement(By.className("shelf-item__buy-btn"));
       System.out.println(e.getText());
       e.click();
       driver.findElement(By.xpath("//*[text()='Checkout']")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys("demouser");
       driver.findElement(By.cssSelector("#username input")).sendKeys("demouser"+ Keys.ENTER);
       driver.findElement(By.cssSelector("#password input")).sendKeys("testingisfun99"+ Keys.ENTER);
       driver.findElement(By.id("login-btn")).click();

       driver.findElement(By.id("firstNameInput")).sendKeys("Mithun");
       driver.findElement(By.id("lastNameInput")).sendKeys("NN");
       driver.findElement(By.id("addressLine1Input")).sendKeys("add");
       driver.findElement(By.id("provinceInput")).sendKeys("kar");
       driver.findElement(By.id("postCodeInput")).sendKeys("123");

        Actions actions= new Actions(driver);


        driver.findElement(By.id("checkout-shipping-continue")).click();


        WebDriverWait webDriverWait= new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("downloadpdf")));


        driver.findElement(By.id("downloadpdf")).click();


        driver.quit();
    }

}
