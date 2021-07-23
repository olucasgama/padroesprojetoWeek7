package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PorteGrandeTest {

    @Test
    void deveRetornarIRPJ() {
        Imposto imposto = new IRPJ();
        PorteGrande porteGrande = new PorteGrande(110.000);
        porteGrande.setImposto(imposto);
        assertEquals(132.000, porteGrande.calculaImposto(), 0.01);
    }

    @Test
    void deveRetornarICMS() {
        Imposto imposto = new ICMS();
        PorteGrande porteGrande = new PorteGrande(110.000);
        porteGrande.setImposto(imposto);
        assertEquals(126.500, porteGrande.calculaImposto(), 0.01);
    }

    @Test
    void deveRetornarCSLL() {
        Imposto imposto = new CSLL();
        PorteGrande porteGrande = new PorteGrande(110.000);
        porteGrande.setImposto(imposto);
        assertEquals(121.000, porteGrande.calculaImposto(), 0.01);
    }
}