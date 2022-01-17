package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class FileUploadPage {
    private WebDriver driver;

     private final By INPUT_UPLOAD_FILE =  By.id("file-upload");
     private final By BUTTON_UPLOAD_FILE =  By.id("file-submit");
     private final By MESSAGE_TEXT = By.tagName("h3");
     public FileUploadPage(WebDriver driver){
         this.driver = driver;
     }

     public  void upLoadFile(String pathFile){
         driver.findElement(INPUT_UPLOAD_FILE).sendKeys(pathFile);
     }
     public void clickButtonUpload()
         {
             driver.findElement(BUTTON_UPLOAD_FILE).click();
         }
     public String messageText(){
       return   driver.findElement(MESSAGE_TEXT).getText();
     }
}
