import java.util.ArrayList;

public class Rol{
    private String codigo;
    private String nombre;
    private String descripcion;

    private ArrayList<Empleado> empleados;

    public Rol(String codigo, String nombre, String descripcion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        empleados = new ArrayList<>();
    }

    public String getCodigo(){ return codigo; }
    public void serCodigo(String codigo){ this.codigo = codigo; }

    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }

    public String getDescripcion(){ return descripcion; }
    public void setDescripcion(String descripcion){ this.descripcion = descripcion; }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public ArrayList<Empleado> listaEmpleados(){
        return empleados;
    }

    public boolean eliminarEmpleado(Empleado empleado){
        return empleados.remove(empleado);
    }

    public int cantidadEmpleados(){
        return empleados.size();
    }
}
