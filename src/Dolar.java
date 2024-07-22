
// conversor de moeda dolar

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor, "Dolar");
    }

    @Override
    public double converter() {
        return valor * 5.5; // Supondo uma taxa de conversão de 1 USD = 5.5 BRL
    }
}
