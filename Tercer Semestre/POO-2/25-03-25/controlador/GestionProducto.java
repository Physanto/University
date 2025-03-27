import java.util.ArrayList;

public class GestionProducto{
    private ArrayList<Producto> productos;

    public GestionProducto(){
        productos = new ArrayList<>();
    }

    public boolean agregarProducto(Producto producto){
        return productos.add(producto);
    }
    
    public boolean eliminarProducto(String id){

        Producto producto = buscarProducto(id);

        if(producto != null){
            return productos.remove(producto);
        }
        return false;
    }

    public Producto buscarProducto(String id){

        for(Producto producto : productos){
            if(producto.getId().equals(id)){
                return producto;
            }
        }
        return null;
    }

    public ArrayList<Producto> mostrarProductos(){
        return productos;
    }

    public boolean actualizarProducto(Producto producto, String idProducto){

        for(int i = 0; i < productos.size(); i++){
            if(productos.get(i).getId().equals(idProducto)){
                productos.set(i, producto);
                return true;
            }
        }
        return false;
    }
}
