public class CartaoCredito extends Pagamento {
    public CartaoCredito() {
        super("Cartão de Crédito");
    }

    @Override
    public void processar(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;
        System.out.println(descricao + ": Valor original R$" + valor + ", taxa R$" + taxa + ", total R$" + total);
    }
}

