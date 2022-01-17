package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1Page {

    WebDriver driver;

    public Example1Page(WebDriver driver){
        this.driver = driver;
    }

    private final By BUTTON = By.tagName("button");
    private final By LOADING = By.id("loading");
    private final By MESSAGE = By.xpath("//div[@id='finish']/h4");

    public void clickButton()
    {
        driver.findElement(BUTTON).click();
    }
    public boolean waitForLoading(){
      return   new WebDriverWait(driver, 10)
                .until(ExpectedConditions.invisibilityOf(driver.findElement(LOADING)));

    }

    public String message(){

        return driver.findElement(MESSAGE).getText();
    }
}
