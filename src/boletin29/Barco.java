/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author pastoriza57
 */
public abstract class Barco {
    int numeroDias;
    private int eslora;
    String matricula; 
    
    public Barco() {
    }
    
    public Barco(int numeroDias, int eslora, String matricula) {
        this.numeroDias = numeroDias;
        this.eslora = eslora;
        this.matricula=matricula;
    }

    public int getnumeroDias() {
        return numeroDias;
    }

    public int getEslora() {
        return eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract void calcular();

}
    

