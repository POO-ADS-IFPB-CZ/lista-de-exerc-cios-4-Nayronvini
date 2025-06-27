public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " dispara uma flecha certeira!");
    }
}
