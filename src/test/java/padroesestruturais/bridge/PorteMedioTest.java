package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PorteMedioTest {

    @Test
    void deveRetornarIRPJ() {
        Imposto imposto = new IRPJ();
        PorteMedio porteMedio = new PorteMedio(50000);
        porteMedio.setImposto(imposto);
        assertEquals(60000, porteMedio.calculaImposto(), 0.01);
    }

    @Test
    void deveRetornarICMS() {
        Imposto imposto = new ICMS();
        PorteMedio porteMedio = new PorteMedio(50000);
        porteMedio.setImposto(imposto);
        assertEquals(57500, porteMedio.calculaImposto(), 0.01);
    }

    @Test
    void deveRetornarCSLL() {
        Imposto imposto = new CSLL();
        PorteMedio porteMedio = new PorteMedio(50000);
        porteMedio.setImposto(imposto);
        assertEquals(55000, porteMedio.calculaImposto(), 0.01);
    }
}