public class Senior extends Profissional{
    private double premio;

    public Senior(String name, int score, double capital, double premio) { //Metodo construtor
        super(name, score, capital); //Para instanciar um Senior, primeiro é preciso instanciar um Jogador
        this.premio = premio;
    }

    public void Imprimir() { // Metodo para imprimir todos os dados
        super.Imprimir(); //Chamada metodo da classe pai para poder imprimir o nome do jogador e o capital do Profissional que são privados
        System.out.println("Prêmio: " + premio);
    }

    public void ganhar(int p) { // Sobrescreve o método ganhar da classe Pai Profissional
        super.ganhar(p); //Chama o método com mesmo nome da classe pai
        premio *= 2; //Dobra o valor do prêmio
    }

    public void perder(int p) { // Sobrescreve o método perder da classe Pai Profissional
        super.perder(p); //Chama o método com mesmo nome da classe pai
        premio /= 2; //Reduz o valor do prêmio pela metade
    }
}
