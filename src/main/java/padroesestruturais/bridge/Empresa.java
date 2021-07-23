package padroesestruturais.bridge;

public abstract class Empresa {

    protected Imposto imposto;
    protected double capital;

    public Empresa(double capital) {
        this.capital = capital;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public abstract double calculaImposto();
}
