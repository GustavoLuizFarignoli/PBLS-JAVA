public class Vilao extends Personagem{
    public Vilao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void correr(float x, float y) {
        this.posicao_x = x; //posição x recebe a nova posição x passada
        this.posicao_y = y;//posição y recebe a nova posição y passada
        System.out.println("Vilão Correndo"); // Printando a ação
    }
}
