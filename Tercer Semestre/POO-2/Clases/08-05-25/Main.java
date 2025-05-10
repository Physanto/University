public class Main{
    
    public static void main(String[] args){

        Curso programacion = new Curso(1, "Programacion", 3);

        Estudiante estudiante1 = new Estudiante(1, "n", "m", 4.5);
        Estudiante estudiante2 = new Estudiante(2, "e", "h", 4.0);
        Estudiante estudiante3 = new Estudiante(3, "r", "l", 4.6);

        programacion.agregarEstudiante(estudiante3);
        programacion.agregarEstudiante(estudiante1);
        programacion.mostrarLista();
    
    }
}
