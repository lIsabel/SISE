package logicaNegocio;

import DAL.ProductoDAL;

import dominio.Producto;

import java.util.ArrayList;


public class ProductoBlIMPL implements ProductoBl{
    //Objeto DAL para la persistencia de datos
    private ProductoDAL oProductoDAL;
    
    /**
     * Constructor de la clase
     */
    public ProductoBlIMPL() {
        this.oProductoDAL = new ProductoDAL();
    }
    private ArrayList arrayAsegurados;
    @Override
    public void registrarProducto(Producto oProducto) {
    }

    @Override
    public Producto buscarProducto(int pCodigoProducto) {
        return null;
    }

    @Override
    public void actualizarProducto(Producto pProducto) {
    }

    @Override
    public void borrarProducto(Producto pProducto) {
    }
    
   //Obtener la lista completa de los productos
 public ArrayList getListaProductos(){
       ArrayList vListaArreglo;
        
        //Invocar el método del DAL para obtener la lista
      vListaArreglo = this.oProductoDAL.getListaProductos();
      //ActualizarError(this.oProductoDAL);
        
        //Retornar el objeto ArrayList
        return vListaArreglo;
    }
}
