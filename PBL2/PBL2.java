import java.util.Scanner;

public class PBL2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ponto A");
        double a = teclado.nextFloat();
        System.out.println("Digite o ponto B");
        double b = teclado.nextFloat();
        System.out.println("Digite o número de repetições");
        int n = teclado.nextInt();

        if (a <= b){
            if(n > 0){
                double area_total = 0;
                double x = a;
                double h = (b - a)/ n;
                double y1 = f(x);
                int i = 0;
                while (i < n){
                    x += h;
                    double y2 = f(x);
                    double area_trapezio = ((y1 + y2) / 2) * h;
                    area_total += area_trapezio;
                    y1 = y2;
                    i++;
                }
                System.out.println(area_total);
            } else{
                System.out.println("Erro: o valor de n deve ser maior que 0");
            }
        } else{
            System.out.println("Erro: valor de a deve ser menor ou igual ao valor de b");
        }

    }

    public static double f(double x){
        return (2 * Math.sin(x)) + (Math.cos(x)/3);
    }
}