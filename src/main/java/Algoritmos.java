/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Algoritmos {
    int n;
    
    public Algoritmos(int n) {
        this.n = n;
    }
    
    public int[] calcularNumPrimos(int n) {
        int[] numPrimos = new int[n];
        int cantidad = 0;
        int numero = 1;
        int cantDivisores = 0;
        int indice = 0;
        
        // Algoritmo.
        while(cantidad < 5) {
           for(int j=1; j<=numero; j++) {
               if(numero % j == 0) {
                  cantDivisores++; 
               }
           }
           
           if(cantDivisores == 2) {
               numPrimos[indice] = numero;
               cantidad++;
               indice++;
           }
           
           cantDivisores = 0;
           numero++;
        }
        
        return numPrimos;
    }
    
    public void imprimirArreglo(int[] arreglo) {
        for(int i=0; i<arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
    }
    
}
