package Test;

import Pages.DynamicControlsPage;
import Pages.HomePage;
import Pages.SecurePage;
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


}
