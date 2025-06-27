public class Boleto extends Pagamento {
    public Boleto() {
        super("Boleto Bancário");
    }

    @Override
    public void processar(double valor) {
        double desconto = valor * 0.02;
        double total = valor - desconto;
        System.out.println(descricao + ": Valor original R$" + valor + ", desconto R$" + desconto + ", total R$" + total);
    }
}
