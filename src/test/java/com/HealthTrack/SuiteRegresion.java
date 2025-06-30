package com.HealthTrack;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        RegistroUsuarioFunctionalTest.class,
        TestRegistroCamposVacios.class,
        UsuarioFunctionalTest.class,
        UsuarioTest.class
})
public class SuiteRegresion {
    // No necesitas escribir nada más aquí.
}
