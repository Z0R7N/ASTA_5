package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage{
    String URL = "https://buggy-testingcup.pgs-soft.com/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(URL);
        driver.manage().window().maximize();
        return this;
    }

    public Main chooseTask(String taskNum) {
        click(By.xpath("//h2[text()='Zadanie " + taskNum + "']"));
        return this;
    }
}
