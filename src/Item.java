import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item extends CaixaDoAtacado{
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

    public double calcularDesconto(int quantidade, String metodoPagamento) {
        double valorTotal = valor * quantidade;
        double descontoOuAcrescimo = 0.0;

        // Aplicar desconto/acréscimo com base na quantidade
        if (quantidade > 5 && quantidade <= 15) {
            descontoOuAcrescimo -= valorTotal * 0.10; // 10% de desconto
        } else if (quantidade > 15 && quantidade <= 25) {
            descontoOuAcrescimo -= valorTotal * 0.20; // 20% de desconto
        } else if (quantidade > 25) {
            descontoOuAcrescimo -= valorTotal * 0.25; // 25% de desconto
        }
        return valorTotal;
    }

    public double getPreco() {

        return 0;
    }


}

