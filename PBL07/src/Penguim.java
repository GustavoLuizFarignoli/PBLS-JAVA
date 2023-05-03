public class Penguim extends Ladrao{
    public Penguim(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);/* como Penguim não tem nenhum atributo proprio
        seu construto é simplesmente chamar o construtors da classe pai*/
    }

    public void atirar(){
        System.out.println("Penguim Atirando"); // Printando a ação
    }

    public void correr(float x, float y){
        this.posicao_x = x; //posição x recebe a nova posição x passada
        this.posicao_y = y; //posição y recebe a nova posição y passada
        System.out.println("Penguim Correndo"); // Printando a ação
    }
}
