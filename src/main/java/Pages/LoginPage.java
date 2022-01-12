package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;

public class LoginPage {
    private WebDriver driver;

    private final By USERNAME = By.id("username");
    private final By PASSWORD = By.id("password");
    private  final By BOTON_LOGIN = By.tagName("button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void ingresarUsername(String user){
        driver.findElement(USERNAME).sendKeys(user);
    }
    public void ingresarPassword(String pass){
        driver.findElement(PASSWORD).sendKeys(pass);
    }

    public SecurePage presionarBotonLogin() {


        driver.findElement(BOTON_LOGIN).click();
        return new SecurePage(driver);
    }




}
