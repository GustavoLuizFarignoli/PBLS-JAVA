import java.util.Scanner;

public class PBL2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Criamos um objeto do tipo scanner para poder pegar de maneira dinâmica os ponto A, B e o número de repetições
        System.out.println("Digite o ponto A");
        double a = teclado.nextFloat(); // Variavel do tipo double pois os pontos podem ser números reais
        System.out.println("Digite o ponto B");
        double b = teclado.nextFloat();
        System.out.println("Digite o número de repetições");
        int n = teclado.nextInt(); // Variavel do tipo inteiro pois não permitimos

        if (a <= b){ // Aqui checamos se o ponto b é maior que o ponto a
            if(n > 0){ // aqui checamos se o valor de repitções é maior que 0 pois não é possível fazer o calculo com 0 ou um número negativo de reptições
                double area_total = 0; // variavel para guardar a área total e que sera retornada depois double pois trabalhamos com calculo de número real
                double h = (b - a)/ n; // calcula da altura do trapezio
                double y1 = f(a); //calcula da base menor do trapezio
                int i = 0; // criação da variavel auxilar do loop while
                while (i < n){
                    a += h;
                    double y2 = f(a); // calculo da base maior do trapezio
                    double area_trapezio = ((y1 + y2) / 2) * h; // calculo area do trapezio
                    area_total += area_trapezio;
                    //como a regra do trapezio consiste em calcular área do trapezio em cada ponto do gráfico vamos agregando a área dos trapezios em uma variavel só
                    y1 = y2;
                    i++;
                }
                System.out.println(area_total); //Retorno na tela do valor calculado da integral
            } else{
                System.out.println("Erro: o valor de n deve ser maior que 0");
            }
        } else{
            System.out.println("Erro: valor de a deve ser menor ou igual ao valor de b");
        }

    }

    public static double f(double a)
    {
        return (2 * Math.sin(a)) + (Math.cos(a)/3); // Função que faz o calculo da integral aproximada do ponto
    }
}