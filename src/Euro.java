// conversor de moeda euro


public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor, "Euro");
    }

    @Override
    public double converter() {
        return valor * 6; // Supondo uma taxa de conversão de 1 EUR = 6 BRL
    }
}
