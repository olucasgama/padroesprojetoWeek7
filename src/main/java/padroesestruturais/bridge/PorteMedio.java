package padroesestruturais.bridge;

public class PorteMedio extends Empresa {

    public PorteMedio(double capital) {
        super(capital);
    }

    public double calculaImposto() {
        return this.capital * (1 + this.imposto.percentualImposto());
    }
}
