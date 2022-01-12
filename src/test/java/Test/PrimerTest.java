package Test;

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
        public void PruebaTest(){
               //HomePage homePage = new HomePage(driver);


               LoginPage loginPage = homePage.irALogin();
               loginPage.ingresarUsername("vsu");
               loginPage.ingresarPassword("ddfs");

               SecurePage securePage = loginPage.presionarBotonLogin();
               String mensaje = securePage.traerTextoErrorIngreso();

           //    assertEquals("No se encontro mensaje error de login","Your username is invalid!\n×",mensaje);
               assertNotNull("Mensajo no es nulo",mensaje);


}

}
