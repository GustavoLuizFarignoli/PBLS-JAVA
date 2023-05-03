public class Heroi extends Personagem{
    public Heroi(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);/* como Heroi não tem nenhum atributo proprio
        seu construto é simplesmente chamar o construtors da classe pai*/
    }

    public void correr(float x, float y){
        this.posicao_x = x; //posição x recebe a nova posição x passada
        this.posicao_y = y;//posição y recebe a nova posição y passada
        System.out.println("Heroi Correndo"); // Printando a ação
    }
    public void saltar(float z){
        this.posicao_z = z; //posição z recebe a nova posição z passada
        System.out.println("Heroi Saltando"); // Printando a ação
    }
}
