import java.util.*;

public class Main {
    public static void main(String[] args) {

        double valorTotal = 0;
        List<Item> listaItens = new ArrayList<>();
        listaItens.add(new Item(1, "Café 1kg", 53.00));
        listaItens.add(new Item(2, "Sabão em pó", 36.00));
        listaItens.add(new Item(3, "Caixa de Leite", 82.00));
        listaItens.add(new Item(4, "Refrigerante", 8.50));


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o método de pagamento (debito, dinheiro ou credito): ");
        String metodoPagamento = scanner.nextLine();

        System.out.println("Informe o ID do item desejado (1,2,3 ou 4): ");
        Integer produto1 = scanner.nextInt();

        System.out.println("Informe a Quantidade de Itens: ");
        Integer qtdeItens1 = scanner.nextInt();

        System.out.println("Informe o ID do item desejado (1,2,3 ou 4): ");
        Integer produto2 = scanner.nextInt();

        System.out.println("Informe a Quantidade de Itens: ");
        Integer qtdeItens2 = scanner.nextInt();


        for( int listaId = 0; listaId > 0; listaId++){
            System.out.println(listaItens.get(listaId).getId());

        }

        valorTotal = (listaItens.get(0).getValor()) * qtdeItens1;
        valorTotal = (listaItens.get(1).getValor()) * qtdeItens2;


        // Dividir a entrada em linhas
        String[] linhas = metodoPagamento.split(",");


        // Criar um mapa para mapear os IDs dos itens à quantidade
        Map<Integer, Integer> quantidadeItens = new HashMap<>();

        // Calcular o valor total com base no método de pagamento e na quantidade de itens

        for (Map.Entry<Integer, Integer> entry : quantidadeItens.entrySet()) {
            int idItem = entry.getKey();
            int quantidade = entry.getValue();

            for (Item item : listaItens) {
                if (item.getId() == idItem) {
                    //valorTotal = qtdeItens * 8.50;

                    //valorTotal = (listaItens.get(1).getValor()) * qtdeItens;
                    System.out.println(listaItens.get(0).getValor());
                    break;
                }
            }
        }

        System.out.println("Método de pagamento: " + metodoPagamento);
        System.out.println("ID Item: " + produto1);
        System.out.println("Quantidade: " + qtdeItens1);
        System.out.println("Valor total Item 1: R$ " + valorTotal);
        System.out.println("--------------------------------------------");
        System.out.println("ID Item: " + produto2);
        System.out.println("Quantidade: " + qtdeItens2);
        System.out.println("Valor total Item 2: R$ " + valorTotal);


    }

}









