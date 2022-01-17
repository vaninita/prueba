package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

        private WebDriver driver;

        public HomePage(WebDriver driver){
            this.driver = driver;
        }
        private  final By FORM_AUTHENTICATION_LINK = By.linkText("Form Authentication");

        public LoginPage irALogin(){
            driver.findElement(FORM_AUTHENTICATION_LINK).click();
            return new LoginPage(driver);
        }

        private By linkTextBy(String text){
         return By.linkText(text);
        }

        public void irAOpcion(String text){
            driver.findElement(linkTextBy(text)).click();
        }



}
