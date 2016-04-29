package boletin29;

import java.util.ArrayList;


public class Boletin29 {

    
    public static void main(String[] args) {
        
        ArrayList <Barco> barcos = new ArrayList();
        Barco velero = new Velero(10,20,30,"ABCD");
        Barco deportivo = new Deportiva(50,10,30,"EFGH");
        Barco yate = new Yate(200,5,8,9,"MTYO");
        barcos.add(velero);
        barcos.add(deportivo);
        barcos.add(yate);
        for(Barco b:barcos)
            b.calcular();
     
    }
}