import java.util.ArrayList;
import java.util.Arrays;

public class IBGE {
    public static void main(String args[])
    {
        Municipio curitiba = new Municipio(2400, 400);
        Municipio guarapuava = new Municipio( 200, 100);
        Municipio londrina = new Municipio( 800, 300);
        Municipio maringa = new Municipio( 600, 200);
        ArrayList<Municipio> mun_parana = new ArrayList<>(Arrays.asList(curitiba, guarapuava, londrina, maringa));
        Estado parana = new Estado(mun_parana);
        /*Como a classe Estado foi alterada para ter como atributo uma arraylist precisamos criar uma arraylist e adicionar todos os municipios
        nela antes de instaciar um objeto da classe estado */

        Municipio salvador = new Municipio(3000, 400);
        Municipio juazeiro = new Municipio( 400, 100);
        Municipio ilheus = new Municipio(280, 200);
        Municipio itabuna = new Municipio( 320, 300);
        ArrayList<Municipio> mun_bahia = new ArrayList<>(Arrays.asList(salvador,juazeiro,ilheus,itabuna));
        Estado bahia = new Estado(mun_bahia);

        ArrayList<Estado> est_brasil = new ArrayList<>(Arrays.asList(bahia,parana));
        Pais brasil = new Pais(est_brasil);
        /*Como a classe Pais foi alterada para ter como atributo uma arraylist precisamos criar uma arraylist e adicionar todos os estados
        nela antes de instaciar um objeto da classe estado */

        System.out.println( curitiba.densidade() ); // quadro 1
        System.out.println( parana.densidade() ); // quadro 3
        System.out.println( bahia.area() ); // quadro 2
        System.out.println( brasil.populacao() ); // quadro 4
        System.out.println( brasil.densidade() ); // quadro 5*/
    }
}
