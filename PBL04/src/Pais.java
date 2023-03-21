import java.util.ArrayList;

public class Pais {
    ArrayList<Estado> estados;

    public Pais(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    int populacao()
    {
        int poptotal = 0;

        for (int i = 0; i < estados.size(); i++){
            poptotal += estados.get(i).populacao();

        }
        return poptotal ;
    }
    double area()
    {
        int areatotal = 0;

        for (int i = 0; i < estados.size(); i++){
            areatotal += estados.get(i).area();

        }
        return areatotal;
    }
    double densidade()
    {
        return populacao() / area();
    }
}
