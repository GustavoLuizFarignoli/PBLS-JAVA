public class Jogador {
    private String name;
    protected int score;

    public Jogador(String name, int score) { //Construtor para criar objetos do tipo Jogador
        this.name = name;
        this.score = score;
    }

    public void Imprimir() { // Metodo para imprimir todos os dados
        System.out.print("Jogador:" + name + '\'' + ", Pontuação=" + score);
    }
}
