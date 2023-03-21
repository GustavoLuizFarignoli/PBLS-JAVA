import java.util.Scanner;
public class PBL1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Criamos um objeto do tipo scanner para poder pegar de maneira dinâmica o termo da Pa, a razão e o termo a ser calculado

        System.out.println("Digite o primeiro termo da PA");
        double pritermo = teclado.nextFloat();
        // Variavel pritermo do tipo double pois o termo da pa pode ser um número real

        System.out.println("Digite a razão da PA");
        double razao = teclado.nextFloat();
        // Variavel razao do tipo double pois a razão também pode ser um número real

        System.out.println("Digite o termo a ser calculado");
        int n = teclado.nextInt();
        // variavel n do tipo inteiro pois não existe o termo 1.5 da pa por exemplo

        double ntermo = pritermo + ((n-1)*razao);
        /* Aqui fazemos o calculo do An (sendo n definido dinâmicamente acima) e guardamos em uma variavel do tipo double pois mesmo n sendo inteiro
        pritermo e razão são do tipo double e quando fazemos calculos com um número real o resultado pode ser um número real*/

        double somatermo = ((pritermo + ntermo) * n)/ 2;
        //Aqui é feito o calculo da somados n primeiros termo, novamento resultado double pois estão sendo usadas variaveis do tipo para efetuar o cálculo

        System.out.println("O a"+ n +" é igual a: " + ntermo);
        // Aqui retornamos o valor do ntermo na tela para que o usuário possa visualizar

        System.out.println("A soma dos primeiros " + n + " termos da PA é " + somatermo);
        // Aqui retornamos o valor da soma dos ntermos na tela para que o usuário possa visualizar
    }
}