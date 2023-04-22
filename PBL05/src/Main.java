import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner teclado = new Scanner(System.in); //Criando um Scanner como variavél global para que todos os métodos possam o acessar
    public static void main(String[] args) {

        Jogador jogador1 = new Principiante("Kunigame",0,0); //Instanciação de um objeto do tipo principiante
        Jogador jogador2 = new Principiante("Isagi",0,0); //Instanciação de um objeto do tipo principiante
        Jogador jogador3 = new Principiante("Chigiri",0,0); //Instanciação de um objeto do tipo principiante
        Jogador jogador4 = new Profissional("Bachira",0,0); //Instanciação de um objeto do tipo profissional
        Jogador jogador5 = new Profissional("Barou",0,0); //Instanciação de um objeto do tipo profissional
        Jogador jogador6 = new Profissional("Reo",0,0); //Instanciação de um objeto do tipo profissional
        Jogador jogador7 = new Senior("Rin",0,0,0); //Instanciação de um objeto do tipo senior
        Jogador jogador8 = new Senior("Nagi",0,0,0); //Instanciação de um objeto do tipo senior
        Jogador jogador9 = new Senior("Shidou",0,0,0); //Instanciação de um objeto do tipo senior
        //Criação da coleção com os objetos criados anteirormente
        ArrayList<Jogador> jogadores = new ArrayList<>(Arrays.asList(jogador1,jogador2,jogador3,jogador4,jogador5,jogador6,jogador7,jogador8,jogador9));
    }

    public ArrayList<Jogador> addprin(ArrayList<Jogador> jogadores){
        System.out.println("Diga o nome deste Jogador");
        String nome = teclado.nextLine();
        System.out.println("Diga a pontuação inicial do jogador");
        int score = teclado.nextInt();
        System.out.println("Diga o bônus incial do jogador");
        double bônus = teclado.nextDouble();
        Jogador principiante = new Principiante(nome,score,bônus);
        jogadores.add(principiante);
        return jogadores;
    }
}