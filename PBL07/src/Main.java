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
        j.saltar(4);
        Vilao v = new Vilao(true,0,3,0,8);
        v.correr(9,7);
        Ladrao l = new Ladrao(true,0,0,0,5);
        l.saltar(3);
        Coringa c = new Coringa(true,0,0,0,12);
        c.atirar();
        Penguim pe = new Penguim(true,0,0,0,3);
        pe.atirar();
        pe.correr(0,3);
        Terrorista t = new Terrorista(true,0,0,0,7);
        t.atirar();
        Goldfinger g = new Goldfinger(true,0,0,0,1, j);
        g.saltar(2);
        g.camuflar(19);
        g.personificar(b);
        DrNo d = new DrNo(true,0,0,0,13);
        d.saltar(9);
        d.atirar();
        d.correr(8,6.5f);
    }
}
