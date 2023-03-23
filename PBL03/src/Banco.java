/*
    x. Depositar R$1.000,00 na conta de Luciana Teixeira
    xi. Imprimir os dados da cliente Luciana Teixeira
 */
public class Banco {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jandria Silva", 2500); //instanciação de um objeto do tipo cliente com nome e saldo
        Cliente cliente2 = new Cliente("Sandra Rodrigues", 1800);
        Cliente cliente3 = new Cliente("Luciana Texeira", 5000);

        System.out.println(cliente1.imprimir()); // Chamando o metodo imprimir para retornar na tela o estado do objeto cliente1
        System.out.println(cliente2.imprimir()); // Chamando o metodo imprimir para retornar na tela o estado do objeto cliente2
        System.out.println(cliente3.imprimir()); // Chamando o metodo imprimir para retornar na tela o estado do objeto cliente3

        cliente1.retirar(1000); // Chamando o metodo retirar alterar e reduzir o estado do atributo saldo do objeto
        System.out.println(cliente1.imprimir());

        cliente2.retirar(2000);
        cliente2.depositar(500); // Chamando o metodo depoisitar alterar e incrementar o estado do atributo saldo do objeto
        System.out.println(cliente2.imprimir());

        cliente2.retirar(2000);
        System.out.println(cliente2.imprimir());

        cliente3.depositar(1000);
        System.out.println(cliente3.imprimir());
    }

}
