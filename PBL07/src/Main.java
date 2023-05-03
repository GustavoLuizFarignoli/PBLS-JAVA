public class Main {
    public static void main(String[] args) {
        Personagem p = new Personagem(true,0,0,0,1);
        p.correr(2,3);
        p.saltar(4);
        p.atirar();
        p.morrer();
        Heroi h = new Heroi(true,0,0,0,2);
        h.correr(3,4);
        h.saltar(5);
        Batman b = new Batman(true,0,0,0,0);
        b.atirar();
        b.camuflar(10);
        JamesBond j = new JamesBond(true,0,0,0,5);
        j.atirar();
        j.saltar();

    }
}
