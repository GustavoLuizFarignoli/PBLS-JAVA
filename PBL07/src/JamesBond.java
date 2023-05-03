public class JamesBond extends Heroi{
    public JamesBond(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor); /* como ladrão não tem nenhum atributo proprio
        seu construto é simplesmente chamar o construtors da classe pai*/
    }

    public void saltar(float z){
        this.posicao_z = z; //posição z recebe a nova posição z passada
        System.out.println("James Bond Saltando"); // Printando a ação
    }
    public void atirar(){
        System.out.println("James Bond Atirando"); // Printando a ação
    }
}
