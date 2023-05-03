public class Coringa extends Ladrao{
    public Coringa(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);/* como Coringa não tem nenhum atributo proprio
        seu construto é simplesmente chamar o construtors da classe pai*/
    }

    @Override
    public void atirar() {
        System.out.println("Coringa Atirando"); // Printando a ação
    }
}
