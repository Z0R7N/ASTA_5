package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Main;
import pages.TaskFivePage;
import property.LastString;

import java.util.concurrent.TimeUnit;

public class BasePageTest {
    public WebDriver driver;
    public Main main;
    public TaskFivePage taskFivePage;
    public LastString lastString = new LastString();

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taskFivePage = PageFactory.initElements(driver, TaskFivePage.class);
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }
}
