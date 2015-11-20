package Utilitarios;

import java.util.Stack;

public class Pila {
    private static Stack oPila = new Stack();

    /**
     * Retornar si la pila está vacía
     * @return True si la pila está vacía
     */
    public static boolean pilaVacia() {
        return oPila.isEmpty();
    }

    /**
     * Extraer el último elemento de la pila
     * Si la pila está vacía, retorna vacío
     * @return último elemento de la pila
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
