package com.HealthTrack;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

import org.junit.jupiter.api.Tag;

@Tag("functional")
public class TestRegistroCamposVacios {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testNombreVacio() {
        driver.get("http://localhost:8080/registro");
        driver.findElement(By.id("nombre")).clear();
        driver.findElement(By.id("email")).sendKeys("juan@example.com");
        driver.findElement(By.id("password")).sendKeys("secreta123");
        driver.findElement(By.id("botonRegistro")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mensajeError")));
        String texto = mensaje.getText();
        Assertions.assertTrue(texto.contains("Error"));
    }

    @Test
    public void testEmailVacio() {
        driver.get("http://localhost:8080/registro");
        driver.findElement(By.id("nombre")).sendKeys("Juan");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("password")).sendKeys("secreta123");
        driver.findElement(By.id("botonRegistro")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mensajeError")));
        String texto = mensaje.getText();
        Assertions.assertTrue(texto.contains("Error"));
    }

    @Test
    public void testPasswordVacio() {
        driver.get("http://localhost:8080/registro");
        driver.findElement(By.id("nombre")).sendKeys("Juan");
        driver.findElement(By.id("email")).sendKeys("juan@example.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("botonRegistro")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mensajeError")));
        String texto = mensaje.getText();
        Assertions.assertTrue(texto.contains("Error"));
    }

    @Test
    public void testRegistroExitoso() {
        driver.get("http://localhost:8080/registro");
        driver.findElement(By.id("nombre")).sendKeys("Juan");
        driver.findElement(By.id("email")).sendKeys("juan@example.com");
        driver.findElement(By.id("password")).sendKeys("secreta123");
        driver.findElement(By.id("botonRegistro")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mensajeExito")));
        String texto = mensaje.getText();
        Assertions.assertTrue(texto.contains("registrado correctamente"));

    }
}
