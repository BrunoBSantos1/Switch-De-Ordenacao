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
public class Bubble extends Ordenar{
    
    //public void ordenarBubble(){
         //System.out.println("ordenado por Bubble");
    //}

    @Override
    public int[] executar(int[] numeros) {
       // String s = "\"\"\\\n\"";
        System.out.println("Ordenado por Bubble");
        return this.ordenarBubble(numeros);
        
    }
    
    private int[] ordenarBubble(int[] numeros){
        for(int i = 1; i < numeros.length; i++) { 
            int auxiliar = numeros[i];
            int corrente = i; 
            while ((corrente > 0)&& (numeros[corrente -1] > auxiliar)) {
		numeros[corrente] =  numeros[corrente -1]; 
		corrente = corrente - 1; 
		numeros[corrente] = auxiliar; 
    }
       
   
    
        }
        return numeros;
   
}
}
       
