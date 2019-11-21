package Proyect2LFP.Analizador;

/**
 *
 * @author jara
 */
public class Analizador {
       CargarArchivo ca;
    public String[] partes = null;

    public void separadorLineas(String archivo) {
        ca = new CargarArchivo();
        String separar = archivo;
        partes = separar.split(" ");
        for (int i = 0; i <= partes.length-1; i++) {
            System.out.println(partes[i]);
        }
    }
}
