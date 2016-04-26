package boletin29;

/**
 *
 * @author ylagorebollar
 */
public class EmbarcacionDeportiva extends Barco{
    private int potencia;

    public EmbarcacionDeportiva() {
        super();
    }

    public EmbarcacionDeportiva(int potencia, int diasAluger, int eslora) {
        super(diasAluger, eslora);
        this.potencia = potencia;
    }

    @Override
    public void precioAluguer() {
        calcularModulo();
        float prezoAluguer = getDiasAluger()*
    }

    @Override
    public float calcularModulo() {
        float modulo = (10 * getEslora())+potencia;
        return modulo;
    }
    
}
