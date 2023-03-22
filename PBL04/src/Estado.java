import java.util.ArrayList;

public class Estado {
    private ArrayList<Municipio> municipios;
    // o único atributo da classe estado agora é uma arraylist que permite apenas objetos do tipo Municipio, pois a arraylist possui tamanho variado

    public Estado(ArrayList<Municipio> municipios)
    {
        this.municipios = municipios; // o construtor foi alterado para receper uma arraylist de Municipios
    }

    public int populacao()
    {
        int poptotal = 0;
        //Uma variavel temporária poptotal (inteira pois não existe meia pessoa) para guardar a soma da população de todos os municipios do estado

        for (int i = 0; i < municipios.size(); i++){ // Um for que percorre o tamanho da arraylist municipios, para poder acessar todos seus elementos
            poptotal += municipios.get(i).populacao();
            /* Acessa o municipio de index i da arraylist municipios, executa o metodo população desse objeto municipio (que é o getter do atributo populaçao)
            e agrega esse valor ao valor armazenado na variavel poptotal */

        }
        return poptotal ; // Retorna a variavel poptotal que contém a soma da população de todos os municipios do estado


    }

    public double area()
    {
        double areatotal = 0;
        //Uma variavel temporária area total (double pois existe 1.5m² por exemplo) para guardar a soma das areas de todos os municipios do estado

        for (int i = 0; i < municipios.size(); i++){ // Um for que percorre o tamanho da arraylist municipios, para poder acessar todos seus elementos
            areatotal += municipios.get(i).area();

            /* Acessa o municipio de index i da arraylist municipios, executa o metodo area desse objeto municipio (que é o getter do atributo area)
            e agrega esse valor ao valor armazenado na variavel areatotal */
        }
        return areatotal; // Retorna a variavel areatotal que contém a soma da area de todos os municipios do estado
    }
    double densidade()
    {
        return populacao() / area(); // executa os metodos anteriores e divide o retorno da função população pela função area
    }
}
