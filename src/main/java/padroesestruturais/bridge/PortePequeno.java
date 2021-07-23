package padroesestruturais.bridge;

public class PortePequeno extends Empresa {

    public PortePequeno(double capital) {
        super(capital);
    }

    public double calculaImposto() {
        return this.capital * (1 + this.imposto.percentualImposto());
    }
}
