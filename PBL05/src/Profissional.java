public class Profissional extends Jogador{
    private double capital;

    public Profissional(String name, int score, double capital) { //Metodo construtor
        super(name, score); //Para instanciar um Professional, primeiro é preciso instanciar um jogador
        this.capital = capital;
    }

    public void Imprimir() { // Metodo para imprimir todos os dados
        super.Imprimir(); //Chamada metodo da classe pai para poder imprimir o nome do jogador que é um atributo privado
        System.out.print("Capital: " + capital);
    }

    public void ganhar(int p){
        this.score += p; //Acrescenta o valor de p no score
        this.capital += p*4; //Acrescente p*4 no capital
    }

    public void perder(int p){
        this.score -= p; //Subtrai o valor de p no score
        this.capital -= p*4; //Subtrai p*4 no capital
    }
}
