import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    String baseUrl = "https://stellarburgers.nomoreparties.site";
    public void baseSetUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/anastasiia/webDriver/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

