package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class TaskFivePage extends BasePage{
    public TaskFivePage(WebDriver driver) {
        super(driver);
    }

    public TaskFivePage uploadFile(String marker, String filePath){
        File file = new File(filePath);
        upload(By.xpath(marker), file.getAbsolutePath());
        return this;
    }
}