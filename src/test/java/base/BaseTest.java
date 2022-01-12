package base;


import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecurePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.xml.datatype.Duration;

public class BaseTest {
        private WebDriver driver;
        protected HomePage homePage;

        @Before
        public void setUp() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","resosurces/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
       //   options.addArguments("--headless");
            options.addArguments("--incognito");

         //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver = new ChromeDriver(options);
            driver.get("http://the-internet.herokuapp.com/");

            homePage = new HomePage(driver);


            Thread.sleep(300);


        }


      @After
        public void close(){
            driver.quit();

        }
}


