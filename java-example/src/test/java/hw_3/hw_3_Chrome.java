package hw_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class hw_3_Chrome {
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
        driver.get("http://localhost:8080/litecart/litecart-2.2.3.6/public_html/");
        System.out.println(driver.getTitle());
        String text = "My Store | Online Store";
        wait.until(titleIs(text));
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
