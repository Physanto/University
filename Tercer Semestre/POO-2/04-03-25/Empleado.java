import java.util.Date;

public class Empleado{
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;
    private Date fechaNacimiento;
    private int horasTrabajadas = 0;
    Rol rol;

    public Empleado(){}

    public Empleado(int id, String nombre, String telefono, String direccion, String correo, Date fechaNacimiento, Rol rol){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }

    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }

    public String getTelefono(){ return telefono; }
    public void setTelefono(String telefono){ this.telefono = telefono; }
    
    public String getDireccion(){ return direccion; }
    public void setDireccion(String direccion){ this.direccion = direccion; }

    public String getCorreo(){ return correo; }
    public void setCorreo(String correo){ this.correo = correo; }

    public void trabajar(){
        horasTrabajadas += 8;
    }

    public void descansar(){
        horasTrabajadas -= 1;
    }

    public double cobrar(){
        return horasTrabajadas * 25000;
    }
}
