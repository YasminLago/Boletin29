package boletin29;

/**
 *
 * @author Yasmín
 */
public class Velero extends Barco {
    private int numMastiles;
    
    public Velero(){
        super();
    } 

    public Velero(int numMastiles, int diasAluger, int eslora, String matricula) {
        super(diasAluger, eslora, matricula);
        this.numMastiles = numMastiles;
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
        float modulo = (10 * getEslora())+numMastiles;
        return modulo;
    }

    @Override
    public String toString() {
        return "Velero:"+"\n" + "Matricula:" + getMatricula() + ", Eslora:"+getEslora()+", Prezo aluguer:"+precioAluguer();
    }
}