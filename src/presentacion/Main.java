package presentacion;


import Utilitarios.UtilitarioVentana;

import Utilitarios.UtilitarioVentana;

public class Main {
    public static void main(String[] args) {
        //Crear la instancia del JFrame del Menú Principal
        jFrmMenuPrincipal oMenuPrincipal = new jFrmMenuPrincipal();
        
        UtilitarioVentana.getInstance().aplicarEstiloVentas(2);
        UtilitarioVentana.getInstance().centrarVentana(oMenuPrincipal);
    }
}
