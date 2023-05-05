package informePre;

import java.util.ArrayList;

public class Informe {
    public Encuesta encuesta;
    private ArrayList<Respuesta> Respuestas;

    public ArrayList<Double> promedioTipo() {
        ArrayList<Double> respuestasprom;
        double prom = 0;
        int cont1 = 0;
        int promsi = 0;
        int contsi = 0;
        int contno = 0;
        for (i = 0; i < Respuestas.size(); i++) {
            if (Respuestas.get(i).getTipo() == 1) {
                prom = Respuestas.get(i) + prom;
                cont1 = cont1 + 1;
            } else if (Respuestas.get(i).getTipo() == 2) {
                if (respuesta.equals("si")) {
                    // hacer algo si la respuesta es "si"
                    promsi += 1;
                    contsi += 1;
                } else {
                    promno += 1;
                    contno += 1;
                }
            }
        }
        prom = prom / cont1;
        int promfsi = promsi / contsi;
        int promfno = promno / contno;
        respuestasprom.add(prom);
        respuestasprom.add(promfsi);
        respuestasprom.add(promfno);
        return respuestasprom;
    }

    public int cantidadRespuestas() {
        int contador;
        contador = Respuestas.size();
        return contador;
    }

    // Tipo de pregunta respuesta pa saber a cual pertenece, tipo 1 para numerica,
    // tipo 2 para si o no, tipo 3 para respuesta unica
    public void cantidadRespuestasTipo() {
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (i = 0; i < Respuestas.size(); i++) {
            if (Respuestas.get(i).getTipo() == 1) {
                cont1 += 1;
            } else if (Respuestas.get(i).getTipo() == 2) {
                cont2 += 1;
            } else {
                cont3 += 1;
            }
        }
        /*
         * ArrayList<Integer> Respuestas;
         * Respuestas.add(cont1);
         * Respuestas.add(cont2);
         * Respuestas.add(cont3);
         */

        System.out.println("La cantidad de respuestas de tipo 1 es de:" + cont1);
        System.out.println("La cantidad de respuestas de tipo 2 es de:" + cont2);
        System.out.println("La cantidad de respuestas de tipo 3 es de:" + cont3);
    }

    public void definirPregunta() {
        Random r = new Random();
        int selector = r.nextInt(preguntas.size() - 1);
        this.pregunta = preguntas.get(selector);
        this.tipo = tiposPreguntas.get(selector);
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