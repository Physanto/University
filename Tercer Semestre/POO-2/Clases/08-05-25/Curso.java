import java.util.ArrayList;

public class Curso{
    
    private int codigo;
    private String nombre;
    private int semestre;
    private ArrayList<Estudiante> estudiantes;

    public Curso(int codigo, String nombre, int semestre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        estudiantes = new ArrayList<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante){
        return estudiantes.add(estudiante);
    }

    public void mostrarLista(){
        String n = "";
        for(Estudiante estudiante : estudiantes){
            System.out.println(" " + codigo + " "+ nombre + " " + semestre + estudiante.mostrarInfo() + " ");
        }
    }
}
