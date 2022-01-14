package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.time.Duration;

public class DynamicControlsPage {
    WebDriver driver;
    public DynamicControlsPage(WebDriver driver){
        this.driver = driver;
    }

    private final By BUTTON_REMOVE = By.cssSelector("#checkbox-example button");
    private final By LOADING_BAR = By.id("loading");
    private final By TEXT = By.id("message");

    public void clickRemove(){
        driver.findElement(BUTTON_REMOVE).click();
    }
    public String getTextMessage(){

        WebElement textoEncontrado = new WebDriverWait(driver,30)
                .until(ExpectedConditions.presenceOfElementLocated(TEXT));
        return textoEncontrado.getText();

    }

}
