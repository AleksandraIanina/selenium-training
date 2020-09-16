package hw_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class hw_2 {
    private WebDriver driver;
    private WebDriverWait wait;


    @Before
    public void start(){
        //System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void MyHwTest(){
        driver.get("http://localhost/litecart/litecart-2.2.3.6/public_html/admin/login.php");

        driver.findElement(By.name("username")).sendKeys("admin");                  // username
        driver.findElement(By.name("password")).sendKeys("admin");                  // password
        driver.findElement(By.name("remember_me")).click();                                     // checkbox
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();                      //click login button

        driver.findElement(By.xpath("//*[@class='fa fa-sign-out']")).click();                   //click Sing out
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
