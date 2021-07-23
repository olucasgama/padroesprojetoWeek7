package padroesestruturais.adapter;

public class VelocidadeAdapter extends VelocidadeMph {

    private IVelocidade velocidadeInicial;

    public VelocidadeAdapter(IVelocidade velocidadeInicial) {
        this.velocidadeInicial = velocidadeInicial;
    }

    public double verificarVelocidade() {
        velocidadeInicial.setValor(this.getMph() * 1.6);
        return velocidadeInicial.getValor();
    }

    public void alterarVelocidade() {
        this.setMph(velocidadeInicial.getValor());
    }
}
