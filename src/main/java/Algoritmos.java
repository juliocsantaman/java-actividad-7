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
        int cantidad = 0, numero = 1, cantDivisores = 0, indice = 0;
        
        // Algoritmo.
        // La cantidad debe ser igual a n.
        while(cantidad < 5) {
            /*
            Estamos calculando la cantidad de divisores
            que tiene la variable numero.
            */
           for(int i=1; i<=numero; i++) {
               if(numero % i == 0) {
                  cantDivisores++; 
               }
           }
           
           /*
           Sabemos que un número primo tiene 
           dos divisores, el 1 y él mismo. Entonces
           comprobamos si el valor de la variable numero
           es un número primo con ayuda de la variable
           cantDivisores.
           */
           if(cantDivisores == 2) {
               numPrimos[indice] = numero; // Asignamos el número primo al arreglo.
               cantidad++;
               indice++;
           }
           
           // Reiniciamos cantDivisores para volver a comprobar.
           cantDivisores = 0;
           // Aumentamos en uno para seguir comparando los demás números.
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
