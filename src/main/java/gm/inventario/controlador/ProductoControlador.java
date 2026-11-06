package gm.inventario.controlador;

import gm.inventario.model.Producto;
import gm.inventario.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventario.app") //http://localhost:8081/inventario.app
@CrossOrigin(value = "http://localhost:4200") // puerto de acceso para las peticiones desde angular autorisado
public class ProductoControlador {
    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos") // http://localhost:8081/inventario-app/productos
    public List<Producto> obtenerProductos(){
        List<Producto> productos = this.productoServicio.ListarProductos();
        logger.info("Productos obtenidos: ");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }
}
