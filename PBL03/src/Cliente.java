public class Cliente {
    private String nome; //Atributo Nome do tipo String
    private double saldo; //Atributo Saldo do tipo double

    public Cliente(String nome, double saldo) { //Construtor da classe que atribui os valores passadas aos atributos nome e saldo do objeto a ser instanciado
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
        //Função Depositar que recebe um valor do tipo double e acrescenta ao valor do atributo saldo do objeto
    }
    public void retirar(double saldo) {
        this.saldo -= saldo;
        //Função Retirar que recebe um valor do tipo double e desconta do valor do atributo saldo do objeto
    }

    public String imprimir() { //Metodo Imprimir que retorna uma String formatada que apresenta o estado do objeto
        return "Nome do cliente= "+ nome + ',' +
                "Saldo na conta= " + saldo;
    }
}
