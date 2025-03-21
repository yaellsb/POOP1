/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop1.ant;

/**
 *
 * @author yaelb
 */
public class POOP1Ant {

    /**
     * Método principal que inicializa la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo desde POO");
        //EJERCICIO 3: Suma de dos números
        int num1 = 3;
        int num2 = 4;
        int res = num1 * num2;
        System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es igual a " + res);
        //EJERCICIO 4: Verificar si un número es mayor o menor que 10
        int alt = 12;
        if (alt > 10) {
            System.out.println("El numero " + alt + " es mayor que 10");
        } else {
            System.out.println("El numero " + alt + " es menor que 10");
        }
    }
    
}
