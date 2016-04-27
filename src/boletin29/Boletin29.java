package boletin29;

import java.util.ArrayList;

/**
 *
 * @author Yasmín
 */
public class Boletin29 {

    public static void main(String[] args) {
        ArrayList <Barco> listaBarcos = new ArrayList();
        Barco velero = new Velero(2,5,32,"Velero1");
        Barco embarcacionDeporte = new EmbarcacionDeportiva(300.5f,4,35,"Embarcación1");
        Barco yate = new Yate(6,350.2f,2,80,"Yate1");
        listaBarcos.add(velero);
        listaBarcos.add(embarcacionDeporte);
        listaBarcos.add(yate);
        System.out.println("Facturas:");
        for(Barco b:listaBarcos)
            System.out.println(b.toString());
        
        
    }
}
