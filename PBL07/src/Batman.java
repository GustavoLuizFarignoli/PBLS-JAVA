public class Batman extends Heroi implements Camuflagem{
    public Batman(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);/* como Coringa não tem nenhum atributo proprio
        seu construto é simplesmente chamar o construtors da classe pai*/
    }

    public void atirar(){
        System.out.println("Batman Atirando"); // Printando a ação
    }

    @Override
    public void camuflar(int cor) {
        this.cor = cor; //Atualizando informação da objeto da classe goldfinger
        System.out.println("Batman Camuflado"); // Printando a ação
    }
}
