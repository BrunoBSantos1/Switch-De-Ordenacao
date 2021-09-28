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
public class Selection extends Ordenar {

    @Override
    public int[] executar(int[] numeros) {
        System.out.println("ordenado por selection");
        return this.ordenarSelection(numeros);
       
    }
    
    private int[] ordenarSelection(int[]numeros){
        int posicaoMenor, auxiliar;
        for(int i=0; i < numeros.length; i++){
            posicaoMenor =i;
           for(int j= i+1; j < numeros.length; j++){
               if(numeros[j] < numeros[posicaoMenor]){
                   posicaoMenor = j;
                   
               }
           } 
           auxiliar = numeros[posicaoMenor];
           numeros[posicaoMenor] = numeros[i];
           numeros[i] = auxiliar;
            
        }
        return numeros;
        
    }

   //public void ordenarSelection(){
      // System.out.println("ordenado por selection");
   //}
   
    
}
