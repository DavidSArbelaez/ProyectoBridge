import java.util.ArrayList;

public class Informe{
    public Encuesta encuesta;
    private ArrayList<Respuesta> Respuestas;

    public double promedioTipo(){
        ArrayList<Double> respuestasprom;
        double prom=0;
        int cont1=0;
        int promsi=0;
        int prom=0;
        int contsi=0;
        int contno=0;
        for(i=0;i<Respuestas.size();i++){
            if(Respuesta.getTipo()==1){
                prom=Respuestas[i]+prom;
                cont1=cont1+1;
            }else if(Respuesta.getTipo()==2){
                if(respuesta.equals("si")) {
                    // hacer algo si la respuesta es "si"
                    promsi+=;
                    contsi+=;
                }else{
                    promno+=;
                    contno+=;
                }
        }
        prom=prom/cont1;
        int promfsi=promsi/contsi;
        int promfno=promno/contno;
        respuestasprom.add(prom);
        respuestasprom.add(promfsi);
        respuestasprom.add(promfno);
        return respuestasprom;
    }

    public int cantidadRespuestas(){
        int contador;
        contador=Respuestas.size();
        return contador;
    }
//Tipo de pregunta respuesta pa saber a cual pertenece, tipo 1 para numerica, tipo 2 para si o no, tipo 3 para respuesta unica
    public void cantidadRespuestasTipo(){
        int cont1=0;
        int cont2=0;
        int cont3=0;
        for(i=0;i<Respuestas.size();i++){
            if(Respuesta.getTipo()==1){
                cont1+=1;
            }else if(Respuesta.getTipo()==2){
                cont2+=1;
            }else{
                cont3+=1;
            }
        }
        ArrayList<int> Respuestas;
        Respuestas.add(cont1);
        Respuestas.add(cont2);
        Respuestas.add(cont3);
        return Respuestas;
    }

    public void definirPregunta() {
		Random r = new Random();
		int selector = r.nextInt(preguntas.size() - 1);
		this.pregunta = preguntas.get(selector);
		this.tipo = tiposPreguntas.get(selector);
		System.out.println("Hola Pregunta");
		System.out.println(this.pregunta);
		System.out.println(this.tipo);
	}

	public void definirPregunta(int tipoP) {
		ArrayList<String> preguntasT = new ArrayList<String>();
		ArrayList<Integer> tiposPreguntasT = new ArrayList<Integer>();
		for (int i = 0; i < preguntas.size(); i++) {
			if (tiposPreguntas.get(i) == tipoP) {
				preguntasT.add(preguntas.get(i));
				tiposPreguntasT.add(tipoP);
			}
		}
		
		Random r = new Random();
		int selector = r.nextInt(preguntasT.size() - 1);
		pregunta = preguntasT.get(selector);
		tipo = tiposPreguntasT.get(selector);
	}
}