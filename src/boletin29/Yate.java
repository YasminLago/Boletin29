package boletin29;

/**
 *
 * @author Yasmín
 */
public class Yate extends Barco{
    private int numCamarotes;
    private float potencia;

    public Yate() {
        super();
    }

    public Yate(int numCamarotes, float potencia, int diasAluger, int eslora, String matricula) {
        super(diasAluger, eslora, matricula);
        this.numCamarotes = numCamarotes;
        this.potencia = potencia;
    }
    
    /**
     * Calcula o prezo que ten o aluguer da emabarcación
     * @return O custo final do aluguer
     */
    @Override
    public float precioAluguer() {
        float prezoAluguer = getDiasAluger()*calcularModulo();
        return prezoAluguer;
    }
    
    /**
    * Calcula o tamaño da embarcación tendo en conta as suas especificacións tecnicas
    * @return O tamaño do barco
    */
    @Override
    public float calcularModulo() {
        float modulo = (10 * getEslora())+potencia+numCamarotes;
        return modulo;
    }

    @Override
    public String toString() {
        return "Yate:" +"\n" + "Matricula:" + getMatricula() + ", Eslora:"+getEslora()+", Prezo aluguer:"+precioAluguer();
    }
}

   


