package br.edu.cafeteria.servico;

import br.edu.cafeteria.modelo.Bebida;
import br.edu.cafeteria.modelo.ItemPedido;
import br.edu.cafeteria.modelo.Pedido;

public class PromocaoEventoGeek implements Promocional {

    @Override
    public double aplicarDesconto(Pedido pedido) {

        double desconto = 0;

        for (ItemPedido item : pedido.getItens()) {

            if (item.getProduto() instanceof Bebida) {
                desconto += item.subtotal() * 0.10;
            }
        }

        return desconto;
    }
}