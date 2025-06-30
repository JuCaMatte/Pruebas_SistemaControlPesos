package com.HealthTrack;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.jupiter.api.Tag;

@Tag("functional")
public class RegistroUsuarioFunctionalTest {

    private WebDriver driver;

    @BeforeEach
    // Preparo el driver de Chrome antes de cada test.
    public void setUp() {
        // Configuro el path si no está en PATH
        //System.setProperty("webdriver.chrome.driver", "ruta/a/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    // Entro al formulario.
    // Completo datos.
    // Hago clic en enviar.
    // Verifico que la respuesta sea la esperada.
    public void testRegistroUsuarioExitoso() throws InterruptedException {
        driver.get("http://localhost:8080/registro"); // Cambio al endpoint real de registro

        // Debo encontrar campos y completar
        driver.findElement(By.id("nombre")).sendKeys("Test Usuario");
        driver.findElement(By.id("email")).sendKeys("testusuario@example.com");
        driver.findElement(By.id("password")).sendKeys("password123");

        // Envío formulario
        // intento 1 : driver.findElement(By.id("botonRegistro")).click();

        // A veces la página necesita tiempo para cargar, y Selenium lo busca demasiado rápido.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement botonRegistro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("botonRegistro")));


        botonRegistro.click();



        // Espero para observar la respuesta (en tests reales se usaría WebDriverWait)
        //Thread.sleep(2000);

        // Valido texto de éxito
        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mensajeExito")));
        Assertions.assertTrue(mensaje.isDisplayed());
    }

    @AfterEach
    //Cierro el navegador
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
