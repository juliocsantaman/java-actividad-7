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
        
        int n = 5;
        int[] numPrimos;
        
        Algoritmos obj1 = new Algoritmos(n);
        
        numPrimos = obj1.calcularNumPrimos(n);
        
        System.out.println("Números primos:");
        obj1.imprimirArreglo(numPrimos);
        
    }
}
