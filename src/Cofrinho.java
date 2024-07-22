import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {
    private ArrayList<Moeda> moedas;
    private double totalReal, totalDolar, totalEuro;

    public Cofrinho() {
        moedas = new ArrayList<>();
        moedas.add(new Real(0));
        moedas.add(new Dolar(0));
        moedas.add(new Euro(0));
    }
// função para adicionar moedas
    public void adicionarMoeda(Moeda m) {
        for (Moeda moeda : moedas) {
            if (Objects.equals(moeda.pais, m.pais)) {
                moeda.valor += m.valor;
                System.out.println("Valor em "+ moeda.pais +" na conta: "+moeda.valor);
            }
        }
    }
//função para remover moedas
    public void removerMoeda(Moeda m) {
        for (Moeda moeda : moedas) {
            if (Objects.equals(moeda.pais, m.pais))
                if(moeda.valor>0 && moeda.valor>m.valor) {
                    moeda.valor -= m.valor;
                    System.out.println("Valor em " + moeda.pais + " na conta: " + moeda.valor);
                }else
                    System.out.println("Saldo insuficiente\n" +
                            "Você tem em "+moeda.pais+": "+moeda.valor);
        }
        moedas.remove(m);
    }
//função para listar as moedas
    public void listarMoedas() {
        for (Moeda m : moedas) {
            System.out.println(m.listar());
        }
    }
//função para calcular o total que tem no cofre
    public double calcularTotal() {
        double total = 0;
        for (Moeda m : moedas) {
            total += m.converter();
        }
        return total;
    }
}
