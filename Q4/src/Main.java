public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new CartaoCredito();
        pagamentos[1] = new Boleto();
        pagamentos[2] = new Pix();

        double valor = 100.00;

        for (Pagamento p : pagamentos) {
            p.processar(valor);
            System.out.println();
        }
    }
}
