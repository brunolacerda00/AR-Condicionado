package ArCondicionado;
public class ArCondicionado {
    protected String modelo;
    protected String codigo;
    protected String marca;
    protected int btu;
    protected String defeito;

    public ArCondicionado(String modelo, String codigo, String marca, int btu, String defeito) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.defeito = defeito;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Marca: " + marca + ", Modelo: " + modelo + ", BTU: " + btu + ", Defeito: " + defeito;
    }
}
