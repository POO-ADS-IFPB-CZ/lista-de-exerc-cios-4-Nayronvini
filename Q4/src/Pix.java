public class Pix extends Pagamento {
    public Pix() {
        super("Pagamento via Pix");
    }

    @Override
    public void processar(double valor) {
        System.out.println(descricao + ": Valor total R$" + valor + " (sem taxas)");
    }
}
