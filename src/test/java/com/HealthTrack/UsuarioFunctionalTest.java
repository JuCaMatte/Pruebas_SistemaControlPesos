package com.HealthTrack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UsuarioFunctionalTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Configura la ruta al chromedriver que descargaste
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");

        // Inicializa el navegador (Chrome)
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        // Cierra el navegador después de cada prueba
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testRegistrarUsuario() {
        // Abre la página de registro (reemplaza con tu URL real)
        //driver.get("http://localhost:8080/registro-usuario");
        driver.get("http://localhost:8080/registro");

        // Encuentra y completa los campos (ajusta los selectores según tu HTML real)
        WebElement campoNombre = driver.findElement(By.id("nombre"));
        campoNombre.sendKeys("Juan");

        WebElement campoCorreo = driver.findElement(By.id("email"));
        campoCorreo.sendKeys("juan@example.com");

        WebElement campoContrasena = driver.findElement(By.id("password"));
        campoContrasena.sendKeys("secreta123");

        WebElement botonRegistrar = driver.findElement(By.xpath("//button[@type='submit']"));
        botonRegistrar.click();

        // Aquí podrías verificar el mensaje de éxito o la URL
        //WebElement mensajeElemento = driver.findElement(By.tagName("p"));
        WebElement mensajeElemento = driver.findElement(By.id("mensajeExito"));
        //String mensaje = driver.findElement(By.id("mensajeExito")).getText();
        String mensaje = mensajeElemento.getText();

        // assertEquals("Usuario registrado correctamente", mensaje);
        assertTrue(mensaje.contains("¡Usuario Juan registrado correctamente!"));
    }
}
