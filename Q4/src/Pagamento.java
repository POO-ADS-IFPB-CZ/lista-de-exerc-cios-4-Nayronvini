public abstract class Pagamento {
    protected String descricao;

    public Pagamento(String descricao) {
        this.descricao = descricao;
    }

    public abstract void processar(double valor);
}

