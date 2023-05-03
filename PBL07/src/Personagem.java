public class Personagem {
    private boolean vivo;
    protected float posicao_x;
    protected float posicao_y;
    protected float posicao_z;
    protected int cor;

    public Personagem(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) { //constutor padrão
        this.vivo = vivo;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.posicao_z = posicao_z;
        this.cor = cor;
    }

    public void correr(float x, float y){
        this.posicao_x = x; //posição x recebe a nova posição x passada
        this.posicao_y = y;//posição y recebe a nova posição y passada
        System.out.println("Personagem Correndo"); // Printando a ação
    }
    public void saltar(float z){
        this.posicao_z = z; //posição z recebe a nova posição z passada
        System.out.println("Personagem Saltando"); // Printando a ação
    }
    public void atirar(){
        System.out.println("Personagem Atirando"); // Printando a ação
    }
    public void morrer(){
        System.out.println("Morto"); // Printando a ação
    }
}
