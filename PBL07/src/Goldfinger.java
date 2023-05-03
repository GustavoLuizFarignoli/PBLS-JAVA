public class Goldfinger extends Terrorista implements  Personificacao{
    private Heroi heroi;

    public Goldfinger(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor, Heroi heroi) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor); // chama a classe o construtor da classe super
        this.heroi = heroi; // atributo proprio da classe goldfinger
    }

    public void saltar(float z){
        this.posicao_z = z; //posição z recebe a nova posição z passada
        System.out.println("Goldfinger Saltando"); // Printando a ação
    }

    @Override //Sobreescrita do método da interface (que é abstrato por ser uma interface)
    public void camuflar(int cor) {
        this.cor = cor; //Atualizando informação da objeto da classe goldfinger
        System.out.println("Goldfinger Camuflado"); // Printando a ação
    }

    @Override //Sobreescrita do método da interface (que é abstrato por ser uma interface)
    public void personificar(Heroi heroi) {
        this.heroi = heroi; //Atualizando informação da objeto da classe goldfinger
        System.out.println("Personificando"); // Printando a ação
    }
}
