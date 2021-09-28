/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USUARIOO
 */
public class Insertion extends Ordenar {

    @Override
    public int[] executar(int[] numeros) {
        System.out.println("ordenado por insertion");
          
        
        return this.ordenarInsertion(numeros);
       
    }
    private int[] ordenarInsertion(int[]numeros){
   
        for(int i = 1; i < numeros.length; i++) { 
			//int auxiliar = numeros[i]; 
			int corrente = i; 
                        int auxiliar = numeros[i];
			while ((corrente > 0)&& (numeros[corrente -1] > auxiliar)) {
				numeros [corrente] =  numeros[corrente -1]; 
				corrente--; 
			}
			numeros[corrente] = auxiliar;
    }
        return numeros;

    
    
    }     
}
