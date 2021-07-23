package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarVelocidadeKmh() {
        Carro carro = new Carro();
        carro.setVelocidade(10);
        assertEquals(16.0, carro.getVelocidade());
    }

    @Test
    void deveRetornarVelocidadeMph() {
        Carro carro = new Carro();
        carro.setVelocidade(10);
        assertEquals(10, carro.getPersistencia());
    }
}