import java.util.Objects;
//transformando em reais
public abstract class Moeda {
    protected double valor;
    protected String pais;
    protected double totalReal;

    public Moeda(double valor, String pais) {
        this.valor = valor;
        this.pais = pais;
    }

    public abstract double converter(); // Converter para Real

    public String listar() {
        return "Moeda: " + pais + ", Valor: " + valor;
    }
}
