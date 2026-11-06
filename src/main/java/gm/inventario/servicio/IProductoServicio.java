package gm.inventario.servicio;

import gm.inventario.model.Producto;

import java.util.List;

public interface IProductoServicio {
    List<Producto> ListarProductos();
    Producto buscarProductoPorId(Integer idProducto);
    void guardarProducto(Producto producto);
    void eliminarProductoId(Integer idProducto);
}
