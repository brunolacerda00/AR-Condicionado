package ArCondicionado;

public class Splinter extends ArCondicionado {
    private String tamanho;

    public Splinter(String modelo, String codigo, String marca, int btu, String defeito, String tamanho) {
        super(modelo, codigo, marca, btu, defeito);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho: " + tamanho;
    }
}

