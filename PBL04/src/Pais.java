import java.util.ArrayList;

public class Pais {
    private ArrayList<Estado> estados;
    // o único atributo da classe estado agora é uma arraylist que permite apenas objetos do tipo Municipio, pois a arraylist possui tamanho variado

    public Pais(ArrayList<Estado> estados)
    {
        this.estados = estados; // o construtor foi alterado para receper uma arraylist de Estados
    }

    int populacao()
    {
        int poptotal = 0;
        //Uma variavel temporária poptotal (inteira pois não existe meia pessoa) para guardar a soma da população de todos os estados do pais

        for (int i = 0; i < estados.size(); i++){ // Um for que percorre o tamanho da arraylist estados, para poder acessar todos seus elementos
            poptotal += estados.get(i).populacao();
            /* Acessa o estado de index i da arraylist estados, executa o metodo população desse objeto estado (que por consequência executa o metodo população
            de todos os municipios da arraylist municipios) e agrega esse valor ao valor armazenado na variavel poptotal */
        }
        return poptotal ; // Retorna a variavel poptotal que contém a soma da população de todos os estados do pais
    }
    double area()
    {
        double areatotal = 0;
        // Uma variavel temporária area total (double pois existe 1.5m² por exemplo) para guardar a soma das areas de todos os estados do pais

        for (int i = 0; i < estados.size(); i++){ // Um for que percorre o tamanho da arraylist estados, para poder acessar todos seus elementos
            areatotal += estados.get(i).area();
            /* Acessa o estado de index i da arraylist estados, executa o metodo area desse objeto estado (que por consequência executa o metodo area
            de todos os municipios da arraylist municipios) e agrega esse valor ao valor armazenado na variavel areatotal */

        }
        return areatotal; // Retorna a variavel areatotal que contém a soma da area de todos os estados do pais
    }
    double densidade()
    {
        return populacao() / area(); // executa os metodos anteriores e divide o retorno da função população pela função area
    }
}
