package padroesestruturais.adapter;

public class VelocidadeKmh implements IVelocidade {

    private double kmh;

    @Override
    public double getValor() {
        return this.kmh;
    }

    @Override
    public void setValor(double valor) {
        this.kmh = valor;
    }
}
