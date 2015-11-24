package DAL;

import dominio.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class ProductoDAL {
    
    public ArrayList getListaProductos() {
        //Crear la variable del Departamento
        Producto oProd = null;
        
        //Definir objeto ArrayList para cargar los objetos
        ArrayList oArrayListProducto = new ArrayList();

        //Variables locales para leer cada registro
        String vRegistro = "";
        long vTotalRegistros;

        //Iniciarlizar ResulSet para leer el departamento
        ResultSet resultado = null;
        
        return oArrayListProducto;
    }
}
