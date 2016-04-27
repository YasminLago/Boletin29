package boletin29;

/**
 *
 * @author Yasmín
 */
public abstract class Barco {
    private int diasAluger;
    private int eslora;
    private String matricula; 
    
    public Barco() {
    }
    
    public Barco(int diasAluger, int eslora, String matricula) {
        this.diasAluger = diasAluger;
        this.eslora = eslora;
        this.matricula=matricula;
    }

    public int getDiasAluger() {
        return diasAluger;
    }

    public int getEslora() {
        return eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract float precioAluguer();
    
    public abstract float calcularModulo();

}