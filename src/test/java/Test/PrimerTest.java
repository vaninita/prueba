package Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecurePage;
import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class PrimerTest  extends BaseTest {

      @Test
        public void LoginConCredencialesErroneas(){
         WebDriver driver = getDriver();

         HomePage homePage = new HomePage(driver);
         LoginPage loginPage = new LoginPage(driver);

              // homePage.irALogin();
               homePage.irAOpcion("Form Authentication");
               loginPage.ingresarUsername("vsu");
               loginPage.ingresarPassword("ddfs");

               SecurePage securePage = loginPage.presionarBotonLogin();
               String mensaje = securePage.traerMensajeDeIngreso();

               assertNotNull("Mensajo no es nulo",mensaje);
               assertEquals("No se encontro mensaje error de login","Your username is invalid!\n×",mensaje);

}
    @Test
    public void LoginConCredencialesCorrectas(){
        WebDriver driver = getDriver();

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.irALogin();
        loginPage.ingresarUsername("tomsmith");
        loginPage.ingresarPassword("SuperSecretPassword!");

        SecurePage securePage = loginPage.presionarBotonLogin();
        String mensaje = securePage.traerMensajeDeIngreso();

        assertNotNull("Mensajo no es nulo",mensaje);
        assertEquals("No se encontro mensaje de login ok","You logged into a secure area!\n×",mensaje);

    }
}
