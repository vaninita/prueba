package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    private final By EXAMPLE_1 = By.linkText("Example 1: Element on page that is hidden");


    public void clickExample1(){
        driver.findElement(EXAMPLE_1).click();

    }
}
