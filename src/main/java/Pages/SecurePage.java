package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    WebDriver driver;

   public SecurePage(WebDriver driver){
        this.driver = driver;
    }
    private By TEXTO_INGRESO = By.id("flash");

    public String traerTextoErrorIngreso(){
      return driver.findElement(TEXTO_INGRESO).getText();
    }
}
