package padroesestruturais.adapter;

public class Carro {

    IVelocidade velocidade;
    VelocidadeAdapter persistencia;

    public Carro() {
        velocidade = new VelocidadeKmh();
        persistencia = new VelocidadeAdapter(velocidade);
    }

    public void setVelocidade(double kmh) {
        velocidade.setValor(kmh);
        persistencia.alterarVelocidade();
    }

    public double getVelocidade() {
        return persistencia.verificarVelocidade();
    }

    public double getPersistencia() {
        return persistencia.getMph();
    }
}
