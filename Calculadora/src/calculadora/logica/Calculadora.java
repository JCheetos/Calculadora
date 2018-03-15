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
    private BasesNumericas binario;
    private BasesNumericas decimal;
    private BasesNumericas octal;
    private BasesNumericas hexagesimal;
    
    public Calculadora() {
        numeroVisualizado = "0";
        binario = new BasesNumericas(2);
        decimal = new BasesNumericas(10);
        octal = new BasesNumericas(8);
        hexagesimal = new BasesNumericas(16);
    }
     /**
     * La funcion se encarga de retornar el valor de binario del objeto tipo
     * Calculadora del cual es llamada
     * @return binario
     */
    public BasesNumericas getBinario() {
        return binario;
    }
    /**
     * La funcion se encarga de definir el valor del binario del objeto tipo
     * Calculadora del cual es llamado
     * @param binario
     */
    public void setBinario(BasesNumericas binario) {
        this.binario = binario;
    }

    /**
     * La funcion se encarga de retornar el valor del decimal del objeto
     * tipo Calculadora del cual es llamada
     * @return decimal
     */
    public BasesNumericas getDecimal() {
        return decimal;
    }

    /**
     * La funcion se encarga de definir el valor del decimal del objeto tipo
     * Calculadora del cual es llamado
     * @param decimal
     */
    public void setDecimal(BasesNumericas decimal) {
        this.decimal = decimal;
    }

    /**
     * La funcion se encarga de retornar el valor del octal del objeto
     * tipo Calculadora del cual es llamada
     * @return octal
     */
    public BasesNumericas getOctal() {
        return octal;
    }

    /**
     * La funcion se encarga de definir el valor del octal del objeto tipo
     * Calculadora del cual es llamado
     * @param octal
     */
    public void setOctal(BasesNumericas octal) {
        this.octal = octal;
    }

    /**
     * La funcion se encarga de retornar el valor del hexagesimal del objeto
     * tipo Calculadora del cual es llamada
     * @return hexagesimal
     */
    public BasesNumericas getHexagesimal() {
        return hexagesimal;
    }

    /**
     * La funcion se encarga de definir el valor del hexagesimal del objeto tipo
     * Calculadora del cual es llamado
     * @param hexagesimal
     */
    public void setHexagesimal(BasesNumericas hexagesimal) {
        this.hexagesimal = hexagesimal;
    }
    public String actualizarNumero(String numeroVisualizado, int base) {
        switch (base) {
            case 1:
                numeroVisualizado = binario.obtenerValorFormateado(numeroVisualizado, base);
                break;
            case 2:
                numeroVisualizado = decimal.obtenerValorFormateado(numeroVisualizado, base);
                break;
            case 3:
                numeroVisualizado = octal.obtenerValorFormateado(numeroVisualizado, base);
                break;
            default:
                numeroVisualizado = hexagesimal.obtenerValorFormateado(numeroVisualizado, base);
                break;
        }
        return numeroVisualizado;
    }
    public int recibirNumero(String numeroVisualizado, int base,int numero) {
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
        return numeroVisualizado;
    }
    public String NumeroEnPantalla(String numeroVisualizado, int base,int numero) {
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
        return numeroVisualizado;
    }
}

