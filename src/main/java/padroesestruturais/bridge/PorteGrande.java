package padroesestruturais.bridge;

public class PorteGrande extends Empresa {

    public PorteGrande(double capital) {
        super(capital);
    }

    public double calculaImposto() {
        return this.capital * (1 + this.imposto.percentualImposto());
    }
}
