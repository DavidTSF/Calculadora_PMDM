package dev.davveg.calculadora;

public class Calculator {

    /**
     *   Este metodo devuelve el resultado de todas las operaciones aritmeticas que se encuentran en la cadena.
     *   @param cadena se pasara una cadena que deberia de contener SOLO numeros y operadores aritmeticos
     *   @author David Vega Trillo
     *   @return int
     */
    public static int calcular(String cadena) {

        if ( cadena.contains("+") ) {
            String[] cadenas = cadena.split("\\+",2);
            int num1 = calcular(cadenas[0]);
            int num2 = calcular(cadenas[1]);
            return num1+num2;
        }else if ( cadena.contains("*") ) {
            String[] cadenas = cadena.split("\\*",2);
            int num1 = calcular(cadenas[0]);
            int num2 = calcular(cadenas[1]);
            return num1*num2;
        }  else {
            return Integer.parseInt(cadena.trim());
        }
    }

    public static int oldCalcular(String cadena) {
        if ( cadena.contains("+") ) {
            String[] cadenas = cadena.split("\\+",2);
            int num1 = calcular(cadenas[0]);
            int num2 = calcular(cadenas[1]);
            return num1+num2;
        } else {
            return Integer.parseInt(cadena.trim());
        }
    }

}
