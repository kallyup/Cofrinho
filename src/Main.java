import java.util.Scanner;
// registra  as escolhas do usuário
public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao, tipo;
        double valor;
        String escolhaMoeda= """
                
                Escolha o tipo de moeda:
                1. Real
                2. Dolar
                3. Euro""";

        System.out.println("""
                Bem vindo ao Mult Milionrio Bank ou para os intimos como você MM Bank
                O único banco onde você pode depositar em 3 moedas diferentes
                SEM TAXA 0%""");
        // MM Bank significa Mult Milhonario Bank
        do {
            System.out.println("""

                    Como podemos lhe ajudar?
                    1. Adicionar Moeda
                    2. Remover Moeda
                    3. Listar Moedas
                    4. Calcular Total em Reais
                    5. Sair

                    Escolha uma das opções acima:""");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // adicionar moeda ao cofre
                    System.out.println(escolhaMoeda);
                    tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    valor = scanner.nextDouble();
                    switch (tipo) {
                        case 1:
                            cofrinho.adicionarMoeda(new Real(valor));
                            break;
                        case 2:
                            cofrinho.adicionarMoeda(new Dolar(valor));
                            break;
                        case 3:
                            cofrinho.adicionarMoeda(new Euro(valor));
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                    }
                    break;
                case 2: // Remover moeda do cofre
                    System.out.println(escolhaMoeda);
                    tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    valor = scanner.nextDouble();
                    switch (tipo) {
                        case 1:
                            cofrinho.removerMoeda(new Real(valor));
                            break;
                        case 2:
                            cofrinho.removerMoeda(new Dolar(valor));
                            break;
                        case 3:
                            cofrinho.removerMoeda(new Euro(valor));
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                    }
                    break;
                case 3: // Listar Moedas
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    double total = cofrinho.calcularTotal();
                    System.out.println("Total em Reais: " + total);
                    break;
                case 5:
                    System.out.println("""
                            Obrigado por usar o MM Bank
                            É sempre um prazer lhe ajudar
                            Volte sempre!!!""");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}
