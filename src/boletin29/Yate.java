package boletin29;


public class Yate extends Barco {
    
    private int numeroCamarotes;
    private int potencia;
    
    public Yate() {
        
    }

    public Yate(int numeroDias, int numeroCamarotes, int potencia, int eslora, String matricula) {
        super(numeroDias, eslora, matricula);
        this.numeroCamarotes = numeroCamarotes;
        this.potencia = potencia;
    }

    @Override
    public void calcular() {
        System.out.println("Matricula : "+super.getMatricula()+" | Eslora : "+super.getEslora()+" | Precio : "+super.getnumeroDias()*(super.getEslora()*10+numeroCamarotes+potencia));
    }
    
}


    

