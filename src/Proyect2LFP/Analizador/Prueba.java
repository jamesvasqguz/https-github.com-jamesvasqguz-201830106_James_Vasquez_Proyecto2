/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyect2LFP.Analizador;

/**
 *
 * @author jara
 */
public class Prueba {
    
    int posicion;

    public static void main(String[] args) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] simbolosT = {"==", ">=", "<=", "+", "-", "*", "/", "%", "=", "<", ">", "(", ")", "{", "}", "'", ";"};
        String prueba = "for (int i = 0; i < palabras.length; i++)";
        String palabras[] = prueba.split(" ");
        int posicion[][] = new int[6][4];

        //Declaramos el array de 6*4
        int nuevoArray[][] = new int[6][4];

        //Metemos un dato en cada posición
        nuevoArray[0][0] = 4;
        nuevoArray[0][1] = 0;
        nuevoArray[0][2] = 1;
        nuevoArray[0][3] = 5;

        nuevoArray[1][0] = 0;
        nuevoArray[1][1] = 2;
        nuevoArray[1][2] = 1;
        nuevoArray[1][3] = 0;

        nuevoArray[2][0] = 0;
        nuevoArray[2][1] = 0;
        nuevoArray[2][2] = 3;
        nuevoArray[2][3] = 0;

        nuevoArray[3][0] = 0;
        nuevoArray[3][1] = 0;
        nuevoArray[3][2] = 0;
        nuevoArray[3][3] = 0;

        nuevoArray[4][0] = 4;
        nuevoArray[4][1] = 0;
        nuevoArray[4][2] = 4;
        nuevoArray[4][3] = 0;

        nuevoArray[5][0] = 0;
        nuevoArray[5][1] = 0;
        nuevoArray[5][2] = 0;
        nuevoArray[5][3] = 0;

        int valorFila = 0;
        int valorColumna;

        //Asignamos el valor de la fila a la posicion
        for (int i = 0; i < palabras.length; i++) {
            String letrasPalabras[] = palabras[i].split("");
            for (int j = 0; j < letrasPalabras.length; j++) {
                System.out.println("comparando " + letrasPalabras[j]);
                for (int k = 0; k < letras.length; k++) {
                    if (letrasPalabras[j].equals(letras[k])) {
                        valorFila = nuevoArray[0][0];
                    }
                }
                for (int k = 0; k < numeros.length; k++) {
                    if (letrasPalabras[j].equals(numeros[k])) {
                        valorFila = nuevoArray[0][2];
                    }
                }
                for (int k = 0; k < simbolosT.length; k++) {
                    if (letrasPalabras[j].equals(simbolosT[k])) {
                        valorFila = nuevoArray[0][3];
                    }
                }
                if (letrasPalabras[j].equals(".")) {
                    System.out.println("No puede iniciar con un punto");
                }
                System.out.println("El valor de la columna es: " + valorFila);
            }
        }
    }
    
}
