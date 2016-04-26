package boletin29;

/**
 *
 * @author ylagorebollar
 */
public abstract class Barco {
    private int diasAluger;
    private int eslora;

    public Barco() {
    }

    public Barco(int diasAluger, int eslora) {
        this.diasAluger = diasAluger;
        this.eslora = eslora;
    }

    public int getDiasAluger() {
        return diasAluger;
    }

    public int getEslora() {
        return eslora;
    }

    public abstract void precioAluguer();
    
    public abstract float calcularModulo();
        
    
}
