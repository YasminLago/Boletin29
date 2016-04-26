package boletin29;

/**
 *
 * @author ylagorebollar
 */
public class Yate extends Barco{
    private int numCamarotes;
    private int potencia;
    @Override
    public void precioAluguer() {
        
    }

    @Override
    public float calcularModulo() {
        float modulo = (10 * getEslora())+potencia+numCamarotes;
        return modulo;
    }
    
}
