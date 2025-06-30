package com.HealthTrack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testActualizarPesoCorrectamente() {
        Usuario user = new Usuario("Ana", 60.0);
        user.actualizarPeso(58.5);
        assertEquals(58.5, user.getPeso(), 0.01, "El peso no se actualizó correctamente");
    }

    @Test
    public void testActualizarPesoMismoValor() {
        Usuario user = new Usuario("Luis", 70.0);
        user.actualizarPeso(70.0);
        assertEquals(70.0, user.getPeso(), 0.01, "El peso no debería cambiar al ingresar el mismo valor");
    }

    @Test
    public void testActualizarPesoLimiteCero() {
        Usuario user = new Usuario("Clara", 55.0);
        user.actualizarPeso(0.0);
        assertEquals(0.0, user.getPeso(), 0.01, "El peso no se actualizó correctamente a 0 kg");
    }
}
