import java.util.Scanner;

public class CaixaDoAtacado {
    private static double totalCompra = 0;
    private static double totalPagamento = 0;


    static {
        Scanner scanner = new Scanner(System.in);
        String metodoPagamento = scanner.nextLine();

        while (true) {
            System.out.println("Digite o ID do item e a quantidade (ou deixe em branco para finalizar):");
            String linha = scanner.nextLine();

            if (linha.isEmpty()) {
                break;
            }

            String[] elementos = linha.split(",");
            int idItem = Integer.parseInt(elementos[0]);
            int quantidade = Integer.parseInt(elementos[1]);


            //double precoItem = obterPrecoItem(idItem);
            //double subtotalItem = precoItem * quantidade;
            //totalCompra += subtotalItem;
        }

        System.out.println("Total da Compra: " + totalCompra);

        totalPagamento = calcularPagamento(totalCompra, metodoPagamento);
        double valorTotal = calcularValorTotal(totalCompra, totalPagamento);

        System.out.println("Tipo de Pagamento: " + metodoPagamento);
        System.out.println("Total do Pagamento: " + totalPagamento);
        System.out.println("Valor Total: " + valorTotal);
    }

    private static double calcularValorTotal(double totalCompra, double totalPagamento) {
        return totalCompra - totalPagamento;
    }

    private static double calcularPagamento(double totalCompra, String metodoPagamento) {
        if (metodoPagamento.equals("debito")) {
            return totalCompra * 0.0;
        } else if (metodoPagamento.equals("dinheiro")) {
            return totalCompra * 0.05;
        } else if (metodoPagamento.equals("credito")) {
            return totalCompra * 0.03;
        }
        return totalCompra;
    }


}
