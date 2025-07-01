# Proyecto HealthTrack - Sistema Control de Pesos

## Descripción general

Este proyecto forma parte de la solución de la empresa **HealthTrack**, orientado a la gestión y control del peso corporal de usuarios. Incluye funcionalidades de registro de usuarios, control de acceso y manejo seguro de datos personales.

Se implementó una solución integral con enfoque DevOps para garantizar calidad, automatización y despliegues seguros.

---

## 🧑‍💻 Funcionalidades principales

- Registro de nuevos usuarios con validaciones de campos obligatorios.
- Gestión de formularios a través de Spring Boot y Thymeleaf.
- Pruebas funcionales automatizadas con Selenium y JUnit 5.
- Pruebas de regresión y pruebas de rendimiento utilizando Apache JMeter.
- Integración continua (CI) con GitHub Actions.

---

## 🧪 Pruebas implementadas

- **Pruebas unitarias**: Validación de fórmula para actualizar peso.
- **Pruebas funcionales**: Validación de formularios y flujos de registro exitoso y con errores.
- **Pruebas de regresión**: Verificación del correcto funcionamiento tras cambios.
- **Pruebas de rendimiento**: Simulación de múltiples usuarios concurrentes usando JMeter.

---

## ⚙️ Automatización DevOps

- **Pipeline CI/CD**: Configurado con GitHub Actions para ejecutar automáticamente las pruebas en cada push o pull request.
- **Ejecución automática de pruebas**: Se realizan pruebas funcionales y de regresión automáticamente.
- **Planes futuros**: Integrar pruebas de rendimiento en el pipeline y despliegue automático a entornos de prueba.

---

## ✅ Calidad y seguridad

- Uso de buenas prácticas en control de versiones (Git).
- Validaciones de entrada y manejo de errores en backend.
- Configuración futura para análisis estático de código con SonarQube.

---

## 📄 Requisitos

- Java 24 o superior.
- Maven.
- ChromeDriver y navegador Chrome actualizado.
- Apache JMeter para pruebas de rendimiento.

---

## 🚀 Ejecución local


## Proyecto HealthTrack

Este proyecto contiene pruebas funcionales, pruebas unitarias y configuración de CI/CD con GitHub Actions para la empresa HealthTrack.

### 🚀 Update

Forzando ejecución del pipeline para validar configuración de Jacoco y artefactos.




```bash
mvn clean test
