import java.util.Scanner;
public class PBL1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro termo da PA");
        float pritermo = teclado.nextFloat();
        System.out.println("Digite a razão da PA");
        float razao = teclado.nextFloat();
        System.out.println("Digite o termo a ser calculado");
        int n = teclado.nextInt();

        float ntermo = pritermo + ((n-1)*razao);
        float somatermo = ((pritermo + ntermo) * n)/ 2;

        System.out.println("O a"+ n +" é igual a: " + ntermo);
        System.out.println("A soma dos primeiros " + n + " termos da PA é " + somatermo);

    }
}