package ArCondicionado;

public class Portatil extends ArCondicionado {
    private int voltagem;
    private String cor;

    public Portatil(String modelo, String codigo, String marca, int btu, String defeito, int voltagem, String cor) {
        super(modelo, codigo, marca, btu, defeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Voltagem: " + voltagem + ", Cor: " + cor;
    }
}
