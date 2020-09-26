/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Main {
    public static void main(String[] args) {
        
        // Declaración de variables.
        int n = 20;
        int[] numPrimos;
        int[] numFibonacci;
        
        // Haciendo dos instancias de la clase Algoritmos.
        Algoritmos obj1 = new Algoritmos(n);
        Algoritmos obj2 = new Algoritmos(n);
        
        numPrimos = obj1.calcularNumPrimos(n);
        numFibonacci = obj2.calcularFibonacci(n);
        
        System.out.println("Números primos:");
        obj1.imprimirArreglo(numPrimos);
        
        System.out.println("\nSucesión de Fibonacci:");
        obj2.imprimirArreglo(numFibonacci);
        
    }
}
