/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadekaiquecardoso;

/**
 *
 * @author Xeroc
 */
public class Metodos {
 
    public int VerificarMaior (int n1 , int n2){
        int resultado = 0;
        resultado = n1+n2;
        return resultado;
    }
    
    public int VerificarMenor (int n1 , int n2){
        int resultado = 0;
        resultado = n1 - n2;
        return resultado;
    }
    
    public int VerificarMedia (int n1 , int n2){
        int resultado = 0;
        resultado = n1*n2;
        return resultado;
    }
    
    public int AdicioarNovoValor (int n1 , int n2){
        int resultado = 0;
        resultado = (int) (n1*1.0/n2);
        return resultado;
    }
    
    
}
