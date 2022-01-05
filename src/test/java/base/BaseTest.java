package base;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
        private WebDriver driver;

        public void setUp() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","resosurces/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
       //   options.addArguments("--headless");
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
            driver.get("https://www.google.com/");


            Thread.sleep(30000);


        }

        @Test
        public void Open() throws InterruptedException{

            setUp();




            close();
        }

        public void close(){
            driver.quit();

        }
}


