public class Item {
    private int id;
    private String nome;
    private double valor;


    public Item(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularDescontoQuantidade(int quantidade) {
        double valorTotal = valor * quantidade;

        // Aplicar desconto com base na quantidade
        if (quantidade > 5 && quantidade <= 15) {
            valorTotal -= valorTotal * 0.10; // 10% de desconto
        } else if (quantidade > 15 && quantidade <= 25) {
            valorTotal -= valorTotal * 0.20; // 20% de desconto
        } else if (quantidade > 25) {
            valorTotal -= valorTotal * 0.25; // 25% de desconto
        }
        return valorTotal;
    }


    public double calcularDescontoPagamento(String metodoPagamento) {
        double valorDescPag = 0;

        if (metodoPagamento.equals("dinheiro")) {
            valorDescPag -= 0.05;
        } else if (metodoPagamento.equals("credito")) {
            valorDescPag += 0.03;

        }
        return valorDescPag;
    }



}







