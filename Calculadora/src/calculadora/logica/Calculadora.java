/*
 * Cronometro.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package calculadora.logica;

import java.lang.Integer;

/**
 * La clase Calculadora define y maneja las variables necesarias para el
 * funcionamiento completo de la calculadora
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class Calculadora {

    private String numeroVisualizado;
    private int numeroGuardado;

    public Calculadora() {
        numeroVisualizado = "0";
        numeroGuardado = 0;

    }

    public String actualizarNumero(String numeroVisualizado, int basea, int basen) {
        numeroGuardado = decimalizar(numeroVisualizado, basea);
        switch (basen) {
            case 1:
                numeroVisualizado = Integer.toBinaryString(numeroGuardado);
                break;
            case 2:
                numeroVisualizado = String.valueOf(numeroGuardado);
                break;
            case 3:
                numeroVisualizado = Integer.toOctalString(numeroGuardado);
                break;
            default:
                numeroVisualizado = Integer.toHexString(numeroGuardado);
                break;
        }
        return numeroVisualizado;
    }

    public String NumeroEnPantalla(String numeroVisualizado, int numero) {

        if (numeroVisualizado == "0") {
            numeroVisualizado = "";
        }
        char[] arrayChar = numeroVisualizado.toCharArray();
        if (arrayChar.length == 10) {
            return numeroVisualizado;
        }
        if ((numero > -1) & (numero < 10)) {
            return numeroVisualizado + numero;
        } else if (numero == 10) {
            return numeroVisualizado + "A";
        } else if (numero == 11) {
            return numeroVisualizado + "B";
        } else if (numero == 12) {
            return numeroVisualizado + "C";
        } else if (numero == 13) {
            return numeroVisualizado + "D";
        } else if (numero == 14) {
            return numeroVisualizado + "E";
        } else {
            return numeroVisualizado + "F";
        }
    }

    public int decimalizar(String numeroVisualizado, int base) {
        int numerodecimal;
        int exponente;
        numerodecimal = 0;
        char[] arrayChar;
        arrayChar = numeroVisualizado.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            exponente = arrayChar.length - (i + 1);
            switch (base) {
                case 1:
                    switch (arrayChar[i]) {
                        case '1':
                            numerodecimal = numerodecimal + (1 * (int) Math.pow(2, exponente));
                            break;
                        case '0':
                            break;
                    }
                    break;
                case 2:
                    switch (arrayChar[i]) {
                        case '1':
                            numerodecimal = numerodecimal + (1 * (int) Math.pow(10, exponente));
                            break;
                        case '2':
                            numerodecimal = numerodecimal + (2 * (int) Math.pow(10, exponente));
                            break;
                        case '3':
                            numerodecimal = numerodecimal + (3 * (int) Math.pow(10, exponente));
                            break;
                        case '4':
                            numerodecimal = numerodecimal + (4 * (int) Math.pow(10, exponente));
                            break;
                        case '5':
                            numerodecimal = numerodecimal + (5 * (int) Math.pow(10, exponente));
                            break;
                        case '6':
                            numerodecimal = numerodecimal + (6 * (int) Math.pow(10, exponente));
                            break;
                        case '7':
                            numerodecimal = numerodecimal + (7 * (int) Math.pow(10, exponente));
                            break;
                        case '8':
                            numerodecimal = numerodecimal + (8 * (int) Math.pow(10, exponente));
                            break;
                        case '9':
                            numerodecimal = numerodecimal + (9 * (int) Math.pow(10, exponente));
                            break;
                        case '0':
                            break;
                    }
                    break;
                case 3:
                    switch (arrayChar[i]) {
                        case '1':
                            numerodecimal = numerodecimal + (1 * (int) Math.pow(8, exponente));
                            break;
                        case '2':
                            numerodecimal = numerodecimal + (2 * (int) Math.pow(8, exponente));
                            break;
                        case '3':
                            numerodecimal = numerodecimal + (3 * (int) Math.pow(8, exponente));
                            break;
                        case '4':
                            numerodecimal = numerodecimal + (4 * (int) Math.pow(8, exponente));
                            break;
                        case '5':
                            numerodecimal = numerodecimal + (5 * (int) Math.pow(8, exponente));
                            break;
                        case '6':
                            numerodecimal = numerodecimal + (6 * (int) Math.pow(8, exponente));
                            break;
                        case '7':
                            numerodecimal = numerodecimal + (7 * (int) Math.pow(8, exponente));
                            break;
                        case '0':
                            break;
                    }
                    break;
                case 4:
                    switch (arrayChar[i]) {
                        case 'A':
                            numerodecimal = numerodecimal + (10 * (int) Math.pow(16, exponente));
                            break;
                        case 'B':
                            numerodecimal = numerodecimal + (11 * (int) Math.pow(16, exponente));
                            break;
                        case 'C':
                            numerodecimal = numerodecimal + (12 * (int) Math.pow(16, exponente));
                            break;
                        case 'D':
                            numerodecimal = numerodecimal + (13 * (int) Math.pow(16, exponente));
                            break;
                        case 'E':
                            numerodecimal = numerodecimal + (14 * (int) Math.pow(16, exponente));
                            break;
                        case 'F':
                            numerodecimal = numerodecimal + (15 * (int) Math.pow(16, exponente));
                            break;
                        case '1':
                            numerodecimal = numerodecimal + (1 * (int) Math.pow(16, exponente));
                            break;
                        case '2':
                            numerodecimal = numerodecimal + (2 * (int) Math.pow(16, exponente));
                            break;
                        case '3':
                            numerodecimal = numerodecimal + (3 * (int) Math.pow(16, exponente));
                            break;
                        case '4':
                            numerodecimal = numerodecimal + (4 * (int) Math.pow(16, exponente));
                            break;
                        case '5':
                            numerodecimal = numerodecimal + (5 * (int) Math.pow(16, exponente));
                            break;
                        case '6':
                            numerodecimal = numerodecimal + (6 * (int) Math.pow(16, exponente));
                            break;
                        case '7':
                            numerodecimal = numerodecimal + (7 * (int) Math.pow(16, exponente));
                            break;
                        case '8':
                            numerodecimal = numerodecimal + (8 * (int) Math.pow(16, exponente));
                            break;
                        case '9':
                            numerodecimal = numerodecimal + (9 * (int) Math.pow(16, exponente));
                            break;
                        case '0':
                            break;
                    }
                    break;
            }
        }
        return numerodecimal;
    }

    public int obtenerValorFormateado(int numeroGuardado, int basen) {
        int numerodecimal;
        int exponente;
        numerodecimal = 0;
        char[] arrayChar = numeroVisualizado.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            exponente = arrayChar.length - (i + 1);
            switch (basen) {
                case 1:
                    numerodecimal = numerodecimal + (arrayChar[i] * (int) Math.pow(2, exponente));
                    break;
                case 2:
                    numerodecimal = numerodecimal + (arrayChar[i] * (int) Math.pow(10, exponente));
                    break;
                case 3:
                    switch (arrayChar[i]) {
                        case '1':
                            numerodecimal = numerodecimal + (1 * (int) Math.pow(8, exponente));
                            break;
                        case '2':
                            numerodecimal = numerodecimal + (2 * (int) Math.pow(8, exponente));
                            break;
                        case '3':
                            numerodecimal = numerodecimal + (3 * (int) Math.pow(8, exponente));
                            break;
                        case '4':
                            numerodecimal = numerodecimal + (4 * (int) Math.pow(8, exponente));
                            break;
                        case '5':
                            numerodecimal = numerodecimal + (5 * (int) Math.pow(8, exponente));
                            break;
                        case '6':
                            numerodecimal = numerodecimal + (6 * (int) Math.pow(8, exponente));
                            break;
                        case '7':
                            numerodecimal = numerodecimal + (7 * (int) Math.pow(8, exponente));
                            break;
                        case '0':
                            break;
                    }
                    break;
                case 4:
                    switch (arrayChar[i]) {
                        case 'A':
                            numerodecimal = numerodecimal + (10 * (int) Math.pow(16, exponente));
                            break;
                        case 'B':
                            numerodecimal = numerodecimal + (11 * (int) Math.pow(16, exponente));
                            break;
                        case 'C':
                            numerodecimal = numerodecimal + (12 * (int) Math.pow(16, exponente));
                            break;
                        case 'D':
                            numerodecimal = numerodecimal + (13 * (int) Math.pow(16, exponente));
                            break;
                        case 'E':
                            numerodecimal = numerodecimal + (14 * (int) Math.pow(16, exponente));
                            break;
                        case 'F':
                            numerodecimal = numerodecimal + (15 * (int) Math.pow(16, exponente));
                            break;
                        case '1':
                            numerodecimal = numerodecimal + (1 * (int) Math.pow(16, exponente));
                            break;
                        case '2':
                            numerodecimal = numerodecimal + (2 * (int) Math.pow(16, exponente));
                            break;
                        case '3':
                            numerodecimal = numerodecimal + (3 * (int) Math.pow(16, exponente));
                            break;
                        case '4':
                            numerodecimal = numerodecimal + (4 * (int) Math.pow(16, exponente));
                            break;
                        case '5':
                            numerodecimal = numerodecimal + (5 * (int) Math.pow(16, exponente));
                            break;
                        case '6':
                            numerodecimal = numerodecimal + (6 * (int) Math.pow(16, exponente));
                            break;
                        case '7':
                            numerodecimal = numerodecimal + (7 * (int) Math.pow(16, exponente));
                            break;
                        case '8':
                            numerodecimal = numerodecimal + (8 * (int) Math.pow(16, exponente));
                            break;
                        case '9':
                            numerodecimal = numerodecimal + (9 * (int) Math.pow(16, exponente));
                            break;
                        case '0':
                            break;
                    }
                    break;
            }
        }
        System.out.println(numerodecimal);
        return numerodecimal;
    }
}
