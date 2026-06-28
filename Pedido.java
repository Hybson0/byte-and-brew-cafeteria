package br.edu.cafeteria.modelo;

import java.util.ArrayList;
import java.util.List;

import br.edu.cafeteria.servico.Promocional;

public class Pedido {

    private static int contador = 1;

    private int numero;
    private List<ItemPedido> itens;
    private Cliente cliente;
    private Atendente atendente;

    public Pedido(Cliente cliente, Atendente atendente) {
        this.numero = contador++;
        this.itens = new ArrayList<>();
        this.cliente = cliente;
        this.atendente = atendente;
    }

    // Sobrecarga
    public void adicionarItem(Produto p) {
        adicionarItem(p, 1);
    }

    public void adicionarItem(Produto p, int quantidade) {
        itens.add(new ItemPedido(p, quantidade));
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.subtotal();
        }

        return total;
    }

    public double calcularTotal(Promocional promocao) {
        double total = calcularTotal();
        return total - promocao.aplicarDesconto(this);
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Pedido #" + numero +
                "\nItens: " + itens +
                "\nTotal: R$ " + calcularTotal();
    }
}