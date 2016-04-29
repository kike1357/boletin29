package boletin29;


public class Velero extends Barco {
    private int numeroMastil;
    
    public Velero() {
    }

    public Velero(int numeroMastil, int numeroDias, int eslora, String matricula) {
        super(numeroDias, eslora, matricula);
        this.numeroMastil = numeroMastil;
    }

    @Override
    public void calcular() {
        System.out.println("Matricula : "+super.getMatricula()+" | Eslora : "+super.getEslora()+" | Precio : "+super.getnumeroDias()*(super.getEslora()*10+numeroMastil));
                
    }
    
}

    
    


