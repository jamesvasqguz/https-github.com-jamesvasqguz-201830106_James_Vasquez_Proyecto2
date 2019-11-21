/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyect2LFP.AnalizadorSintactico;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author jara
 */
public class AnalizadorSintactico {
    
    public void analizis(String archivo) {
      String MatrizEstados[][] = new String[11][19];

        MatrizEstados[0][0] = null;
        MatrizEstados[0][1] = "funcion principal";
        MatrizEstados[0][2] = "id";
        MatrizEstados[0][3] = "variable";
        MatrizEstados[0][4] = "imprimir";
        MatrizEstados[0][5] = "mientras";
        MatrizEstados[0][6] = "si";
        MatrizEstados[0][7] = "para";
        MatrizEstados[0][8] = "entero";
        MatrizEstados[0][9] = "decimal";
        MatrizEstados[0][10] = "booleano";
        MatrizEstados[0][11] = "caracter";
        MatrizEstados[0][12] = "cadena";
        MatrizEstados[0][13] = "true";
        MatrizEstados[0][14] = "false";
        MatrizEstados[0][15] = "1 2 3 4 5 6 7 8 9";
        MatrizEstados[0][16] = "+ - * / % = == < > >= <=";
        MatrizEstados[0][17] = ";";
        MatrizEstados[0][18] = "$";

        MatrizEstados[1][0] = "E";
        MatrizEstados[1][1] = "funcionPrincipal { C }";
        MatrizEstados[1][2] = "funcion ID ( PARAMETRO ) { C }";
        MatrizEstados[1][3] = null;
        MatrizEstados[1][4] = null;
        MatrizEstados[1][5] = null;
        MatrizEstados[1][6] = null;
        MatrizEstados[1][7] = null;
        MatrizEstados[1][8] = null;
        MatrizEstados[1][9] = null;
        MatrizEstados[1][10] = null;
        MatrizEstados[1][11] = null;
        MatrizEstados[1][12] = null;
        MatrizEstados[1][13] = null;
        MatrizEstados[1][14] = null;
        MatrizEstados[1][15] = null;
        MatrizEstados[1][16] = null;
        MatrizEstados[1][17] = null;
        MatrizEstados[1][18] = null;

        MatrizEstados[2][0] = "C";
        MatrizEstados[2][1] = null;
        MatrizEstados[2][2] = "for ( V = NUM ; ID < NUM ; ID++ ) { C }";
        MatrizEstados[2][3] = "V ;";
        MatrizEstados[2][4] = "V = T L ;";
        MatrizEstados[2][5] = "imprimir ( ) ;";
        MatrizEstados[2][6] = "while( ){ C }";
        MatrizEstados[2][7] = "if ( ) { C }";
        MatrizEstados[2][8] = null;
        MatrizEstados[2][9] = null;
        MatrizEstados[2][10] = null;
        MatrizEstados[2][11] = null;
        MatrizEstados[2][12] = null;
        MatrizEstados[2][13] = null;
        MatrizEstados[2][14] = null;
        MatrizEstados[2][15] = null;
        MatrizEstados[2][16] = null;
        MatrizEstados[2][17] = null;
        MatrizEstados[2][18] = null;

        MatrizEstados[3][0] = "V";
        MatrizEstados[3][1] = null;
        MatrizEstados[3][2] = null;
        MatrizEstados[3][3] = "variable D ID";
        MatrizEstados[3][4] = null;
        MatrizEstados[3][5] = null;
        MatrizEstados[3][6] = null;
        MatrizEstados[3][7] = null;
        MatrizEstados[3][8] = null;
        MatrizEstados[3][9] = null;
        MatrizEstados[3][10] = null;
        MatrizEstados[3][11] = null;
        MatrizEstados[3][12] = null;
        MatrizEstados[3][13] = null;
        MatrizEstados[3][14] = null;
        MatrizEstados[3][15] = null;
        MatrizEstados[3][16] = null;
        MatrizEstados[3][17] = null;
        MatrizEstados[3][18] = null;

        MatrizEstados[4][0] = "D";
        MatrizEstados[4][1] = null;
        MatrizEstados[4][2] = null;
        MatrizEstados[4][3] = null;
        MatrizEstados[4][4] = null;
        MatrizEstados[4][5] = null;
        MatrizEstados[4][6] = null;
        MatrizEstados[4][7] = null;
        MatrizEstados[4][8] = "entero";
        MatrizEstados[4][9] = "decimal";
        MatrizEstados[4][10] = "booleano";
        MatrizEstados[4][11] = "carácter";
        MatrizEstados[4][12] = "cadena";
        MatrizEstados[4][13] = null;
        MatrizEstados[4][14] = null;
        MatrizEstados[4][15] = null;
        MatrizEstados[4][16] = null;
        MatrizEstados[4][17] = null;
        MatrizEstados[4][18] = null;

        MatrizEstados[5][0] = "T";
        MatrizEstados[5][1] = null;
        MatrizEstados[5][2] = null;
        MatrizEstados[5][3] = null;
        MatrizEstados[5][4] = null;
        MatrizEstados[5][5] = null;
        MatrizEstados[5][6] = null;
        MatrizEstados[5][7] = null;
        MatrizEstados[5][8] = null;
        MatrizEstados[5][9] = null;
        MatrizEstados[5][10] = null;
        MatrizEstados[5][11] = null;
        MatrizEstados[5][12] = "false";
        MatrizEstados[5][13] = "NUM . NUM";
        MatrizEstados[5][14] = "true";
        MatrizEstados[5][15] = "NUM";
        MatrizEstados[5][16] = null;
        MatrizEstados[5][17] = null;
        MatrizEstados[5][18] = null;

        MatrizEstados[6][0] = "L";
        MatrizEstados[6][1] = null;
        MatrizEstados[6][2] = "ID OPERADOR ID";
        MatrizEstados[6][3] = null;
        MatrizEstados[6][4] = null;
        MatrizEstados[6][5] = null;
        MatrizEstados[6][6] = null;
        MatrizEstados[6][7] = null;
        MatrizEstados[6][8] = null;
        MatrizEstados[6][9] = null;
        MatrizEstados[6][10] = null;
        MatrizEstados[6][11] = null;
        MatrizEstados[6][12] = null;
        MatrizEstados[6][13] = null;
        MatrizEstados[6][14] = null;
        MatrizEstados[6][15] = null;
        MatrizEstados[6][16] = null;
        MatrizEstados[6][17] = null;
        MatrizEstados[6][18] = null;

        MatrizEstados[7][0] = "parametro";
        MatrizEstados[7][1] = null;
        MatrizEstados[7][2] = null;
        MatrizEstados[7][3] = null;
        MatrizEstados[7][4] = null;
        MatrizEstados[7][5] = null;
        MatrizEstados[7][6] = null;
        MatrizEstados[7][7] = null;
        MatrizEstados[7][8] = "D ID";
        MatrizEstados[7][9] = null;
        MatrizEstados[7][10] = null;
        MatrizEstados[7][11] = null;
        MatrizEstados[7][12] = null;
        MatrizEstados[7][13] = null;
        MatrizEstados[7][14] = null;
        MatrizEstados[7][15] = null;
        MatrizEstados[7][16] = null;
        MatrizEstados[7][17] = null;
        MatrizEstados[7][18] = null;

        MatrizEstados[8][0] = "num";
        MatrizEstados[8][1] = null;
        MatrizEstados[8][2] = null;
        MatrizEstados[8][3] = null;
        MatrizEstados[8][4] = null;
        MatrizEstados[8][5] = null;
        MatrizEstados[8][6] = null;
        MatrizEstados[8][7] = null;
        MatrizEstados[8][8] = null;
        MatrizEstados[8][9] = null;
        MatrizEstados[8][10] = null;
        MatrizEstados[8][11] = null;
        MatrizEstados[8][12] = null;
        MatrizEstados[8][13] = null;
        MatrizEstados[8][14] = null;
        MatrizEstados[8][15] = "DIGITO DIGITO";
        MatrizEstados[8][16] = null;
        MatrizEstados[8][17] = null;
        MatrizEstados[8][18] = null;

        MatrizEstados[9][0] = "dig";
        MatrizEstados[9][1] = null;
        MatrizEstados[9][2] = null;
        MatrizEstados[9][3] = null;
        MatrizEstados[9][4] = null;
        MatrizEstados[9][5] = null;
        MatrizEstados[9][6] = null;
        MatrizEstados[9][7] = null;
        MatrizEstados[9][8] = null;
        MatrizEstados[9][9] = null;
        MatrizEstados[9][10] = null;
        MatrizEstados[9][11] = null;
        MatrizEstados[9][12] = null;
        MatrizEstados[9][13] = null;
        MatrizEstados[9][14] = null;
        MatrizEstados[9][15] = "0 1 2 3 4 5 6 7 8 9";
        MatrizEstados[9][16] = null;
        MatrizEstados[9][17] = null;
        MatrizEstados[9][18] = null;

        MatrizEstados[10][0] = "ope";
        MatrizEstados[10][1] = null;
        MatrizEstados[10][2] = null;
        MatrizEstados[10][3] = null;
        MatrizEstados[10][4] = null;
        MatrizEstados[10][5] = null;
        MatrizEstados[10][6] = null;
        MatrizEstados[10][7] = null;
        MatrizEstados[10][8] = null;
        MatrizEstados[10][9] = null;
        MatrizEstados[10][10] = null;
        MatrizEstados[10][11] = null;
        MatrizEstados[10][12] = null;
        MatrizEstados[10][13] = null;
        MatrizEstados[10][14] = null;
        MatrizEstados[10][15] = null;
        MatrizEstados[10][16] = "+ - * / % = == < > >= <=";
        MatrizEstados[10][17] = null;
        MatrizEstados[10][18] = null;

        Stack pila = new Stack();
        LinkedList cola = new LinkedList();

        String[] palabras = archivo.split(" ");
        String[] palabrasMatriz = MatrizEstados[1][1].split(" ");

        for (int i = 0; i < palabras.length; i++) {
            cola.offer(palabras[i]);
        }

        if ("funcionPrincipal".equals(palabras[0])) {
            for (int i = palabrasMatriz.length; i > 0; i--) {
                pila.push(palabrasMatriz[i - 1]);
            }
        } else {
            System.out.println("No tiene Funcion Principal");
        }
        for (int z = 0; z < 4; z++) {
            
        
        while (pila.peek().equals(cola.peek())) {
            pila.pop();
            cola.poll();
        }
        for (int i = 0; i < 10; i++) {

            if (pila.peek().equals(MatrizEstados[i][0])) {
                for (int j = 0; j < 10; j++) {
                    if (cola.peek().equals(MatrizEstados[0][j])) {
                        pila.pop();
                        palabrasMatriz = MatrizEstados[i][j].split(" ");
                        for (int k = palabrasMatriz.length; k > 0; k--) {
                            pila.push(palabrasMatriz[k-1]);
                        }
                    }
                }
            }
        }
        }
        while(pila.empty()==false){
            System.out.println(pila.pop());
        }
      
    }
    
}
