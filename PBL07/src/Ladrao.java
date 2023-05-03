public class Ladrao extends Vilao{
    public Ladrao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor); /* como ladrão não tem nenhum atributo proprio
        seu construto é simplesmente chamar o construtors da classe pai*/
    }

    @Override
    public void saltar(float z) {
        this.posicao_z = z; //posição z recebe a nova posição z passada
        System.out.println("Ladrão Saltando"); // Printando a ação
    }
}
