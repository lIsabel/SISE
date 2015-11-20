package Utilitarios;

import java.util.Stack;

public class Pila {
    private static Stack oPila = new Stack();

    /**
     * Retornar si la pila est� vac�a
     * @return True si la pila est� vac�a
     */
    public static boolean pilaVacia() {
        return oPila.isEmpty();
    }

    /**
     * Extraer el �ltimo elemento de la pila
     * Si la pila est� vac�a, retorna vac�o
     * @return �ltimo elemento de la pila
     */
    public static String sacarUltimoElemento() {
        String vResultado = "";

        if (!oPila.isEmpty()) {
            vResultado = (String)oPila.pop();
        }
        return vResultado;
    }

    /**
     * Agregar un valor a la pila
     * @param pValor Valor a agregar
     */
    public static void agregarElemento(String pValor) {
        oPila.push(pValor);
    }
}
