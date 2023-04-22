public class Principiante extends Jogador{

    private double bonus;

    public Principiante(String name, int score, double bonus) {
        super(name, score);
        this.bonus = bonus;
    }

    public void Imprimir() { // Metodo To String, para imprimir todos
        super.Imprimir();
        System.out.println("Bônus: " + bonus);
    }

    public void ganhar(int p){
        this.score += p;
        this.bonus += p*0.1;
    }

    public void perder(int p){
        this.score -= p;
        this.bonus -= p*0.1;
    }
}
