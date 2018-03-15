/*
 * Cronometro.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package calculadora.logica;

/**
 * La clase BasesNumericas define y maneja los topes de las sistemas numericos
 * para hacer funcionar correctamente la calculadora con los mismos
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class BasesNumericas {

    private int tope;
    private int valor;

    /**
     * Constructor de la clase
     *
     * @param tope int
     */
    public BasesNumericas(int tope) {
        this.tope = tope;
        this.valor = 0;
    }

    /**
     * La funcion se encarga de retornar el valor del Tope de alguna
     * BaseNumerica del objeto tipo Calculadora del cual es llamada
     *
     * @return tope
     */
    public int getTope() {
        return tope;
    }

    /**
     * La funcion se encarga de definir el valor del Tope de alguna BaseNumerica
     * del objeto tipo Calculadora del cual es llamada
     *
     * @param tope int
     */
    public void setTope(int tope) {
        this.tope = tope;
    }

    /**
     * La funcion se encarga de retornar el valor 0 de alguna BaseNumerica
     * del objeto tipo Calculadora del cual es llamada
     *
     * @return valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * La funcion se encarga de definir el valor 0 de alguna BaseNumerica
     * del objeto tipo Calculadora del cual es llamada
     *
     * @param valor int
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * La funcion se encarga tomar el valor de las horas, de convertir a string
     * los valores de tiempo recibidos ajustandolos a un formato logico para la
     * visualizacion del ususario
     *
     * @param numeroGuardado
     * @param base
     * @return ValorFormateado
     */
    public String obtenerValorFormateado(int numeroGuardado, int base) {
        String numeroVisualizado;
        numeroVisualizado = "";
        switch (base) {
            case 1:
                for(int a=tope; a>-1;a--){
                numeroVisualizado = ;
                }
                break;
            case 2:
                for(int a=tope; a>-1;a--){
                numeroVisualizado = ;
                }
                break;
            case 3:
                for(int a=tope; a>-1;a--){
                numeroVisualizado = ;
                }
                break;
            default:
                for(int a=tope; a>-1;a--){
                numeroVisualizado = ;
                }
                break;
        }
        return numeroVisualizado;
        //if (this.valor < 10 && this.tope > 10) {
        //    return "0" + this.valor;
        //} else {
        //    return String.valueOf(this.valor);
        //}
    }

    /**
     * La funcion se encarga de sumar a cada unidad de tiempo +1 hasta que
     * llegue a su tope, y lo retorna a valor 0
     */
    public void avanzar() {
        valor++;
        if (valor == tope) {
            valor = 0;
        }
    }

    /**
     * La funcion se encarga de restar a cada unidad de tiempo -1 hasta que
     * llegue a 0, y lo retorna al valor Tope
     */
    public void retroceder() {
        valor--;
        if (valor < 0) {
            valor = tope - 1;
        }
    }
    
}
