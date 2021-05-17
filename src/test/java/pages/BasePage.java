package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    // Wait wrapper method
    public void waitVisibility(By element) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    // Click method
    public void click(By element) {
        waitVisibility(element);
        driver.findElement(element).click();
    }

    // Upload file
    public void upload(By element, String filePath){
        driver.findElement(element).sendKeys(filePath);
    }
}
