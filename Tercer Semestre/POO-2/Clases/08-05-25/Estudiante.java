public class Estudiante{
    private int codigo;
    private String nombre;
    private String apellido;
    private double promedio;

    public Estudiante(int codigo, String nombre, String apellido, double promedio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String mostrarInfo(){
        return " " + codigo + " "+ nombre +" "+ apellido+ " " + promedio;
    }
}
