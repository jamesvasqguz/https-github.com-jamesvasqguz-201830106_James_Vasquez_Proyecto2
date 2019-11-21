/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyect2LFP.AnalizadorLexico;

/**
 *
 * @author jara
 */
public class AnalizadorLexico {
    
    CargarArchivo ca;

    String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] simbolosT = {"==", ">=", "<=", "+", "-", "*", "/", "%", "=", "<", ">", "(", ")", "{", "}", "'", ";"};
    String[] lineas = null;
    String[] palabras = null;

    public void separadorLineas(String archivo) {
        String valorFila = null;
        String valorColumna = null;
        String matrizLexica[][] = new String[6][4];
        String posicion[][] = new String[1][1];
        String posicionA[][] = new String[1][1];
        
        
        //Metemos un dato en cada posición
        matrizLexica[0][0] = "4";
        matrizLexica[0][1] = null;
        matrizLexica[0][2] = "1";
        matrizLexica[0][3] = "5";

        matrizLexica[1][0] = null;
        matrizLexica[1][1] = "2";
        matrizLexica[1][2] = "1";
        matrizLexica[1][3] = null;

        matrizLexica[2][0] = null;
        matrizLexica[2][1] = null;
        matrizLexica[2][2] = "3";
        matrizLexica[2][3] = null;

        matrizLexica[3][0] = null;
        matrizLexica[3][1] = null;
        matrizLexica[3][2] = "3";
        matrizLexica[3][3] = null;

        matrizLexica[4][0] = "4";
        matrizLexica[4][1] = null;
        matrizLexica[4][2] = "4";
        matrizLexica[4][3] = null;

        matrizLexica[5][0] = null;
        matrizLexica[5][1] = null;
        matrizLexica[5][2] = null;
        matrizLexica[5][3] = null;

        lineas = archivo.split("\n");
        for (int q = 0; q <= lineas.length - 1; q++) {
            System.out.println("\n+++++++++++++++++++++++++++++++++++ANALIZANDO LINEA++++++++++++++++++++++++++++++++\n"+q);
            palabras = lineas[q].split(" ");
            for (int i = 0; i < palabras.length; i++) {
            System.out.println("+++++++++++++ANALIZANDO COLUMNA+++++++++++"+i);    
            posicionA[0][0] = null;
            posicion[0][0] = null;

            System.out.println(palabras[i]);
            String letrasPalabras[] = palabras[i].split("");

            //Asignamos el valor de la fila a la posicion                
            for (int j = 0; j < 1; j++) {

                for (int k = 0; k < letras.length; k++) {
                    if (letrasPalabras[j].equals(letras[k])) {
                        valorFila = matrizLexica[0][0];
                    }
                }
                for (int k = 0; k < numeros.length; k++) {
                    if (letrasPalabras[j].equals(numeros[k])) {
                        valorFila = matrizLexica[0][2];
                    }
                }
                for (int k = 0; k < simbolosT.length; k++) {
                    if (letrasPalabras[j].equals(simbolosT[k])) {
                        valorFila = matrizLexica[0][3];
                    }
                }
                if (letrasPalabras[j].equals(".")) {
                    System.out.println("No puede iniciar con un punto, Error de sintaxis");
                    valorFila = null;
                }
            }

            if (valorFila != null) {

                //Obtenemos la posicion en la que estamos 
                for (int j = 0; j < letrasPalabras.length; j++) {
                    for (int k = 0; k < letras.length; k++) {
                        if (letrasPalabras[j].equals(letras[k])) {
                            posicion[0][0] = matrizLexica[Integer.parseInt(valorFila)][0];
                        }
                    }
                    for (int k = 0; k < numeros.length; k++) {
                        if (letrasPalabras[j].equals(numeros[k])) {
                            posicion[0][0] = matrizLexica[Integer.parseInt(valorFila)][2];
                        }
                    }
                    for (int k = 0; k < simbolosT.length; k++) {
                        if (letrasPalabras[j].equals(simbolosT[k])) {
                            posicion[0][0] = matrizLexica[Integer.parseInt(valorFila)][3];
                        }
                    }
                    if (letrasPalabras[j].equals(".")) {
                        posicion[0][0] = matrizLexica[Integer.parseInt(valorFila)][1];
                        valorFila = posicion[0][0];
                    }
                    if (posicion[0][0] == null) {
                        System.out.println("Error de sintaxis por " + letrasPalabras[j]);
                        j = letrasPalabras.length;
                        try{
                        switch (Integer.parseInt(posicionA[0][0])) {
                            case 4:
                                System.out.println("Es un identificador");
                                break;
                            case 1:
                                System.out.println("Es un numero");
                                break;
                            case 3:
                                System.out.println("Es un flotante");
                                break;
                            default:
                                break;
                        }
                        }catch(Exception e){
                            System.out.println("Error, valor nulo");
                        }
                    }
                    posicionA[0][0] = posicion[0][0];
                }
                try {
                    switch (Integer.parseInt(posicion[0][0])) {
                        case 4:
                            System.out.println("Es un identificador");
                            break;
                        case 1:
                            System.out.println("Es un numero");
                            break;
                        case 3:
                            System.out.println("Es un flotante");
                            break;
                        default:
                            break;
                    }
                } catch (NumberFormatException w) {
                }
                System.out.println("------------------FINALIZA LA PALABRA---------------------");
            }
        }
        }
    } 
}
