import java.util.ArrayList;

public class Estado {
    private ArrayList<Municipio> municipios;

    public Estado(ArrayList<Municipio> municipios)
    {
        this.municipios = municipios;
    }

    public int populacao()
    {
        int poptotal = 0;

        for (int i = 0; i < municipios.size(); i++){
            poptotal += municipios.get(i).populacao();

        }
        return poptotal ; 
    }

    public double area()
    {
        int areatotal = 0;

        for (int i = 0; i < municipios.size(); i++){
            areatotal += municipios.get(i).area();

        }
        return areatotal;
    }
    double densidade()
    {
        return populacao() / area();
    }
}
