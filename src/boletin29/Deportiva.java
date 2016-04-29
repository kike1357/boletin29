package boletin29;


public class Deportiva extends Barco {
    
    private int potencia;

    public Deportiva(int potencia, int numeroDias, int eslora, String matricula) {
        
        super(numeroDias, eslora, matricula);
        this.potencia = potencia;
    }

    @Override
    public void calcular() {
        System.out.println("Matricula : "+super.getMatricula()+" | Eslora : "+super.getEslora()+" | Precio : "+super.getnumeroDias()*(super.getEslora()*10+potencia));
    } 
}

    

   

    
   
    
  