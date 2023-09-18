import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static List<Item> listaItens;
    private static int produto1;
    private static int produto2;


    public static void main(String[] args) {

        double valorTotal = 0;
        double valorDescPag = 0;
        List<Item> listaItens = new ArrayList<>();
        listaItens.add(new Item(1, "Café 1kg", 53.00));
        listaItens.add(new Item(2, "Sabão em pó", 36.00));
        listaItens.add(new Item(3, "Caixa de Leite", 82.00));
        listaItens.add(new Item(4, "Refrigerante", 8.50));


        String cardapio = "ID  | Nome         | Preço\n" +
                "1 | Café 1kg       | 53,00\n" +
                "2 | Sabão em pó    | 36,00\n" +
                "3 | Caixa de Leite | 82,00\n" +
                "4 | Refrigerante   | 8,50";


        System.out.println("===== BEM VINDO AO ATACADÃO ======");
        System.out.println("Este é nosso catálogo de produtos:");
        System.out.println("==================================");
        System.out.println(cardapio);


        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("Escolha o produto desejado e");
        System.out.println("informe o método de pagamento (dinheiro, debito ou credito): ");

        String metodoPagamento = scanner.nextLine();


        System.out.println("Informe o ID do item desejado (1,2,3 ou 4): ");
        int produto1 = scanner.nextInt();

        System.out.println("Informe a Quantidade de Itens: ");
        int qtdeItens1 = scanner.nextInt();

        double valorItem1 = listaItens.get(produto1).getValor();
        double calculaDesconto1 = listaItens.get(produto1).calcularDescontoQuantidade(qtdeItens1);
        double valorFinalItem1 = valorItem1 * qtdeItens1;
        double calculaDescontoPagamento1 = listaItens.get(produto1).calcularDescontoPagamento(metodoPagamento);
        double valorDescontoPagamento1 = (calculaDesconto1 * calculaDescontoPagamento1) + calculaDesconto1;

        System.out.println("Informe o ID do item desejado (1,2,3 ou 4): ");
        int produto2 = scanner.nextInt();

        System.out.println("Informe a Quantidade de Itens: ");
        int qtdeItens2 = scanner.nextInt();

        double valorItem2 = listaItens.get(produto2).getValor();
        double valorFinalItem2 = valorItem2 * qtdeItens2;
        double calculaDesconto2 = listaItens.get(produto2).calcularDescontoQuantidade(qtdeItens2);
        double calculaDescontoPagamento2 = listaItens.get(produto2).calcularDescontoPagamento(metodoPagamento);
        double valorDescontoPagamento2 = (calculaDesconto2 * calculaDescontoPagamento2) + calculaDesconto2;

        valorTotal = valorDescontoPagamento1 + valorDescontoPagamento2;



        // Dividir a entrada em linhas
        //String[] linhas = metodoPagamento.split(",");


        // Criar um mapa para mapear os IDs dos itens à quantidade
        Map<Integer, Integer> quantidadeItens = new HashMap<>();

        // Calcula o valor total com base no método de pagamento e na quantidade de itens
        for (Map.Entry<Integer, Integer> entry : quantidadeItens.entrySet()) {
            int idItem = entry.getKey();
            int quantidade = entry.getValue();

            for (Item item : listaItens) {
                if (item.getId() == idItem) {
                    System.out.println(listaItens.get(item.getId()).getValor());
                    break;
                }
            }
        }


        System.out.println("Método de pagamento: " + metodoPagamento);
        System.out.println("ID Item: " + produto1);
        System.out.println("Quantidade: " + qtdeItens1);
        System.out.println("Valor bruto do Item 1: R$ " + valorFinalItem1);
        System.out.println("Valor com descontos ou acréscimos: " + valorDescontoPagamento1);


        System.out.println("--------------------------------------------");
        System.out.println("ID Item: " + produto2);
        System.out.println("Quantidade: " + qtdeItens2);
        System.out.println("Valor bruto do Item 2: R$ " + valorFinalItem2);
        System.out.println("Valor com descontos ou acréscimos: " + valorDescontoPagamento2);
        System.out.println("--------------------------------------------");
        System.out.printf("Valor Total: R$ %.2f " , valorTotal);


    }

}











