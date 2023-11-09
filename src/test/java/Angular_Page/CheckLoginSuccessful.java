package Angular_Page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckLoginSuccessful {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//div[@class=\"form-group\"] //input[@name=\"name\"]")).sendKeys("Sushanta Mandal");
        driver.findElement(By.xpath("//div[@class=\"form-group\"] //input[@name=\"email\"]")).sendKeys("sushanta@123.com");
        driver.findElement(By.xpath("//input[@id=\"exampleInputPassword1\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id=\"exampleCheck1\"]")).click();

        Thread.sleep(3000);
        WebElement ele1 =driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect1\"]"));
        Select select = new Select(ele1);
        select.selectByIndex(1);

        driver.findElement(By.xpath("//input[@id=\"inlineRadio1\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("22-11-1993");
        driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
    }
}
