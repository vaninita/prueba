package Test;

import Pages.*;
import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class SegundoTest extends BaseTest {
   HomePage homePage;
   DynamicControlsPage dynamicControlsPage;

  public SegundoTest(){

    }

     @Test
    public void removerCheckBox(){
         WebDriver driver = getDriver();
         homePage = new HomePage(driver);
         dynamicControlsPage = new DynamicControlsPage(driver);

         homePage.irAOpcion("Dynamic Controls");
         dynamicControlsPage.clickRemove();
         String mensaje = dynamicControlsPage.getTextMessage();
         assertEquals("No se encontro texto It's gone!","It's gone!",mensaje);

 }

 @Test
    public void uploadFile(){
             WebDriver driver = getDriver();
             homePage = new HomePage(driver);
             FileUploadPage fileUploadPage  = new FileUploadPage(driver);
              homePage.irAOpcion("File Upload");

              fileUploadPage.upLoadFile("C:\\Users\\Vanina\\Desktop\\prueba\\src\\test\\resources\\dd\\cute.jpg");
              fileUploadPage.clickButtonUpload();
              String text = fileUploadPage.messageText();
               assertEquals("El archivo no se cargo correctamente","File Uploaded!",text);

  }


  @Test
    public void CheckText(){
      WebDriver driver = getDriver();
      homePage = new HomePage(driver);

      homePage.irAOpcion("Dynamic Loading");
       new DynamicLoadingPage(driver).clickExample1();
       Example1Page example1Page = new Example1Page(driver);
       example1Page.clickButton();
       example1Page.waitForLoading();
       assertEquals("Mensaje no encontrado","Hello World!",example1Page.message());

  }
}
