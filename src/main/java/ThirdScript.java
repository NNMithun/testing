import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Instant;

public class ThirdScript {

    public static void mains(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mithunnn/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.findElement(By.id("my-text-id")).sendKeys("Mithun");

        driver.findElement(By.name("my-password")).sendKeys("password");

        driver.findElement(By.name("my-textarea")).sendKeys("text1 " +
                "\n" +"text2");





        driver.quit();





    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mithunnn/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/");

        WebElement e=driver.findElement(By.xpath("//a[@id=\"signupModalProductButton\"]"));
        System.out.println(e.getText());
        System.out.println(e.getLocation());
        System.out.println(e.getTagName());
        System.out.println(e.isDisplayed());
        System.out.println(e.isEnabled());
        System.out.println(e.getTagName());

        Actions actions= new Actions(driver);



        driver.quit();





    }
}
