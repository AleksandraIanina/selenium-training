package hw_1;

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

public class hw_1 {
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
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("wiki");                  // search for "wiki"
        driver.findElement(By.name("btnK")).click();
        System.out.println(driver.getTitle());
//        String text = "wiki - Поиск в Google";
//        wait.until(titleIs(text));


        driver.navigate().to("https://en.wikipedia.org/wiki/Wiki");                // go to wikipedia.rg
        String text2 = "Wiki - Wikipedia";
//        wait.until(titleIs(text2));
//        System.out.println(driver.getTitle());

        driver.navigate().back();                                                      // go back

        driver.findElement(By.name("q")).clear();

        driver.findElement(By.name("q")).sendKeys("oracle");               // search for "oracle"
        driver.findElement(By.className("Tg7LZd")).click();
        System.out.println(driver.getTitle());
//        String text3 = "oracle - Поиск в Google";
//        wait.until(titleIs(text3));

        driver.navigate().to("https://www.oracle.com/ru/index.html");             // go to oracle.com
        System.out.println(driver.getTitle());
//        String text4 = "Oracle Россия и СНГ | Integrated Cloud Applications and Platform Services";
//        wait.until(titleIs(text4));

        driver.navigate().back();                                                     // go back

        driver.findElement(By.name("q")).clear();

        driver.findElement(By.name("q")).sendKeys("maps");                // search for "maps"
        driver.findElement(By.className("Tg7LZd")).click();
        System.out.println(driver.getTitle());
//        String text5 = "maps - Поиск в Google";
//        wait.until(titleIs(text5));

        driver.navigate().to("https://maps.google.ru/");                         // go to maps.google
        System.out.println(driver.getTitle());
//        String text6 = "Google Карты";
//        wait.until(titleIs(text6));

        driver.navigate().back();

        driver.findElement(By.name("q")).clear();                                    // go back
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
