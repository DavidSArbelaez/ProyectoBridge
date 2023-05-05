package Informe1;
// Clase principal que lanza la encuesta

public class Launcher {
    public static void main(String[] args) {
        
        /*Informe inf1 = new Informe();
        OtroInforme informe2 = new OtroInforme();
        InformeInterface adapter = new InformeAdapter(informe1, informe2);
    
        adapter.PromedioTipo();    
        adapter.cantidadRespuestas();    
        adapter.cantidadRespuestasTipo();    
        adapter.definirPregunta();  
        adapter.definirPregunta(2);*/
        
        Informe inf = new Informe();
        inf.hacerPreguntaAleatoriaTipo(5, 3);
        inf.cantidadRespuestasTipo();
        inf.PromedioTipo();
    }
}
