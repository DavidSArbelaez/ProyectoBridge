package informePre;
import java.util.ArrayList;

public abstract class Respuesta {
    public int tipo;
    public String contenido;
//Tipo de pregunta respuesta pa saber a cual pertenece, tipo 1 para numerica, tipo 2 para si o no, tipo 3 para respuesta unica
    public Respuesta(){
        this.tipo=tipo;
        this.contenido=contenido;
    }

    public int getTipo(){
        return tipo;
    }

    public void setTipo(int tipo){
        this.tipo=tipo;
    }

    public int getContenido(){
        return contenido;
    }

    public void setContenido(String content){
        this.contenido=content;
    }
}
