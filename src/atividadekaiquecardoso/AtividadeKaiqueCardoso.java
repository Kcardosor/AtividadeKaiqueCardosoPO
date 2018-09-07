/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadekaiquecardoso;

import java.util.Scanner;

/**
 *
 * @author Xeroc
 */
public class AtividadeKaiqueCardoso {


 
    public static void main(String[] args) {
        
        Metodos faz = new Metodos();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, resultado, opcao = 0, media;
        boolean op=true;
        
        while (op){
            System.out.println("***************************");
            System.out.println("Menu");
            System.out.println("1 Cadastrar Valor");
            System.out.println("2 Buscar Maior");
            System.out.println("3 Buscar Menor");
            System.out.println("4 Ler Medias");
            System.out.println("sair");
            
            if (opcao ==5){
                System.out.println("finaliró");
                break;
            }else{
                switch (opcao){
                    case 1:
                        System.out.println("**CADASTRAR VAORES**");
                        System.out.println("Cadastre Primeiro Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Cadastre Segundo Valor: ");
                        n2 = entrada.nextInt();
                        resultado = faz.AdicioarNovoValor(n1,n2);
                        System.out.println("Valores cadastrados é: " +resultado);
                        break;
                    case 2:
                        System.out.println("Buscar Maior Valor: ");
                        
                        if (n1 > n2){
                            System.out.println("N1 é maior");
                        }else{
                            System.out.println("n2 é maior");
                        }
                        System.out.println("a somo dos.... é" +resultado);
                        break;
                    
                    case 3:
                        System.out.println("Buscar Menor Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println(" Buscar Menor Valor: ");
                        n2 = entrada.nextInt();
                        resultado = faz.VerificarMenor(n1,n2);
                        System.out.println("Menor valor é" +resultado);
                        break;
                        
                    case 4:
                        System.out.println("Ler Medias: ");
                        media = (n1+n2)/2;
                        resultado = media;
                        System.out.println("a somo dos.... é" +resultado);
                    break;    
                    default:
                        System.out.println("Opcao invalida.....");
                }     
                
                
                  
        }
        
        
        
        
        
        
        
        
        
        
        
        }   
        
        
    }

    
    }
