package Informe1;
public class InformeAdapter implements InformeInterface {
    private Informe informe1;
    //private OtroInforme informe2;

    public InformeAdapter(Informe informe1){ 
        //,OtroInforme informe2) {
        this.informe1 = informe1;
        //this.informe2 = informe2;
    }

    public void PromedioTipo() {
        //informe1.;
        //informe2.PromedioTipo();
    }

    public int cantidadRespuestas() {
        return informe1.cantidadRespuestas(); //+ informe2.cantidadRespuestas();
    }

    public void cantidadRespuestasTipo() {
        informe1.cantidadRespuestasTipo();
        //informe2.cantidadRespuestasTipo();
    }

    public void definirPregunta() {
        //informe1.definirPregunta();
        //informe2.definirPregunta();
    }

    public void definirPregunta(int tipoP) {
        //informe1.definirPregunta(tipoP);
        //informe2.definirPregunta(tipoP);
    }
}
