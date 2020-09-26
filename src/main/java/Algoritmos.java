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
    // Atributos/propiedades.
    private int n;
    
    // Método constructor.
    public Algoritmos(int n) {
        this.n = n;
    }
    
    // Métodos.
    
    // Calcular números primos.
    public int[] calcularNumPrimos(int n) {
        int[] numPrimos = new int[n];
        int cantidad = 0, numero = 1, cantDivisores = 0, indice = 0;
        
        // Algoritmo.
        // La cantidad debe ser igual a n.
        while(cantidad < n) {
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
    
    // Calcular serie Fibonacci.
    public int[] calcularFibonacci(int n) {
        int[] numFibonacci = new int[n];
        int num1 = 0, num2 = 1, fibonacci;
        /*
        La serie Fibonacci empieza con 0 y 1.
        entonces declaramos dos variables con 
        esos valores y los asignamos al arreglo
        de la sucesión de Fibonacci.
        */
        numFibonacci[0] = num1;
        numFibonacci[1] = num2;
        
        // Algoritmo.
        for(int i=2; i<n; i++) {
            fibonacci = num1 + num2; // Se calcula número Fibonacci.
            numFibonacci[i] = fibonacci; // Lo agregamos al arreglo.
            // Volvemos a inicializar las variables con los nuevos valores.
            num1 = num2;
            num2 = fibonacci;
        }
        
        return numFibonacci;
    }
    
    // Método para imprimir un arreglo de tipo int.
    public void imprimirArreglo(int[] arreglo) {
        for(int i=0; i<arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
    }
    
}
