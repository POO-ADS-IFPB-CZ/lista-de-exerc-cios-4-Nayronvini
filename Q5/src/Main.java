public class Main {
    public static void main(String[] args) {
        Personagem[] grupo = new Personagem[3];

        grupo[0] = new Guerreiro("Roghar");
        grupo[1] = new Mago("Eleanor");
        grupo[2] = new Arqueiro("Robinho D.");

        System.out.println("=== Início do turno de combate ===");

        for (Personagem p : grupo) {
            p.atacar();
        }

        System.out.println("=== Fim do turno ===");
    }
}
