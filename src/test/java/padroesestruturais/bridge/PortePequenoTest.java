package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortePequenoTest {

    @Test
    void deveRetornarIRPJ() {
        Imposto imposto = new IRPJ();
        PortePequeno portePequeno = new PortePequeno(15000);
        portePequeno.setImposto(imposto);
        assertEquals(18000, portePequeno.calculaImposto());
    }

    @Test
    void deveRetornarICMS() {
        Imposto imposto = new ICMS();
        PortePequeno portePequeno = new PortePequeno(15000);
        portePequeno.setImposto(imposto);
        assertEquals(17250, portePequeno.calculaImposto());
    }

    @Test
    void deveRetornarCSLL() {
        Imposto imposto = new CSLL();
        PortePequeno portePequeno = new PortePequeno(15000);
        portePequeno.setImposto(imposto);
        assertEquals(16500, portePequeno.calculaImposto());
    }
}