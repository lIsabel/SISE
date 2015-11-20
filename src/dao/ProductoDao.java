package dao;

import dominio.Producto;

public interface ProductoDao {
    public void registrarProducto (Producto oProducto);

    public Producto buscarProducto (int pCodigoProducto);
    public void actualizarProducto (Producto pProducto);

    public void borrarProducto (Producto pProducto);
}
