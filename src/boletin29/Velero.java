package boletin29;

/**
 *
 * @author ylagorebollar
 */
public class Velero extends Barco {
    private int numMastiles;
    
    public Velero(){
        super();
    } 
    
    @Override
    public void precioAluguer() {
        
    }

    @Override
    public float calcularModulo() {
        float modulo = (10 * getEslora())+numMastiles;
        return modulo;
    }
    
}
