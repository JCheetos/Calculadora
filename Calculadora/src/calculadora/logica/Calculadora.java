/*
 * Cronometro.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package calculadora.logica;

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
    private BasesNumericas binario;
    private BasesNumericas decimal;
    private BasesNumericas octal;
    private BasesNumericas hexagesimal;

    public Calculadora() {
        numeroVisualizado = "0";
        numeroGuardado = 0;
        binario = new BasesNumericas(2);
        decimal = new BasesNumericas(10);
        octal = new BasesNumericas(8);
        hexagesimal = new BasesNumericas(16);
    }

    /**
     * La funcion se encarga de retornar el valor de binario del objeto tipo
     * Calculadora del cual es llamada
     *
     * @return binario
     */
    public BasesNumericas getBinario() {
        return binario;
    }

    /**
     * La funcion se encarga de definir el valor del binario del objeto tipo
     * Calculadora del cual es llamado
     *
     * @param binario
     */
    public void setBinario(BasesNumericas binario) {
        this.binario = binario;
    }

    /**
     * La funcion se encarga de retornar el valor del decimal del objeto tipo
     * Calculadora del cual es llamada
     *
     * @return decimal
     */
    public BasesNumericas getDecimal() {
        return decimal;
    }

    /**
     * La funcion se encarga de definir el valor del decimal del objeto tipo
     * Calculadora del cual es llamado
     *
     * @param decimal
     */
    public void setDecimal(BasesNumericas decimal) {
        this.decimal = decimal;
    }

    /**
     * La funcion se encarga de retornar el valor del octal del objeto tipo
     * Calculadora del cual es llamada
     *
     * @return octal
     */
    public BasesNumericas getOctal() {
        return octal;
    }

    /**
     * La funcion se encarga de definir el valor del octal del objeto tipo
     * Calculadora del cual es llamado
     *
     * @param octal
     */
    public void setOctal(BasesNumericas octal) {
        this.octal = octal;
    }

    /**
     * La funcion se encarga de retornar el valor del hexagesimal del objeto
     * tipo Calculadora del cual es llamada
     *
     * @return hexagesimal
     */
    public BasesNumericas getHexagesimal() {
        return hexagesimal;
    }

    /**
     * La funcion se encarga de definir el valor del hexagesimal del objeto tipo
     * Calculadora del cual es llamado
     *
     * @param hexagesimal
     */
    public void setHexagesimal(BasesNumericas hexagesimal) {
        this.hexagesimal = hexagesimal;
    }

    public String actualizarNumero(String numeroVisualizado, int basea, int basen) {
        numeroGuardado = decimalizar(numeroVisualizado, basea);
        switch (basen) {
            case 1:
                numeroVisualizado = binario.obtenerValorFormateado(numeroVisualizado, basen);
                break;
            case 2:
                numeroVisualizado = decimal.obtenerValorFormateado(numeroVisualizado, basen);
                break;
            case 3:
                numeroVisualizado = octal.obtenerValorFormateado(numeroVisualizado, basen);
                break;
            default:
                numeroVisualizado = hexagesimal.obtenerValorFormateado(numeroVisualizado, basen);
                break;
        }
        return numeroVisualizado;
    }

    public void recibirNumero(String numeroVisualizado, int base, int numero) {
        char[] arrayChar = numeroVisualizado.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = arrayChar[i] - 1;
        }
        switch (base) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:

                break;
        }
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
        char[] arrayChar = numeroVisualizado.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            exponente = arrayChar.length - (i + 1);
            switch (base) {
                case 1:
                    numerodecimal = numerodecimal + (arrayChar[i] * (int) Math.pow(2, exponente));
                    break;
                case 2:
                    numerodecimal = numerodecimal + (arrayChar[i] * (int) Math.pow(10, exponente));
                    break;
                case 3:
                    numerodecimal = numerodecimal + (arrayChar[i] * (int) Math.pow(8, exponente));
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
