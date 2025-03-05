package Exercise1;
import java.util.Scanner;

public class Main {

    Scanner stdin;
    int size = 5;
    Note note;

    public Main(){
        stdin = new Scanner(System.in);
        note = new Note();
    }

    public static void main(String[] args){
        Main main = new Main();
        main.menu();
    }

    public void menu(){

        byte option;
        do{
            System.out.println("\nMenu de Notas\n" +
                    "1._ Ingresar las notas.\n" +
                    "2._ Mostrar las notas.\n" +
                    "3._ Promedio de las notas.\n" +
                    "4._ Notas mayores a 3.0.\n" +
                    "5._ Salir.");
            System.out.print("Ingresa la opcion: ");
            option = stdin.nextByte();

            switch (option){

                case 1:
                    inputNotes();
                    break;

                case 2:
                    showNotes();
                    break;

                case 3:
                    promedyNotes();
                    break;

                case 4:
                    notesLargest();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error!");
                    break;
            }
        }
        while(option != 5);
    }

    public void inputNotes(){
        float[] notes = new float[size];
        byte i = 0;
        do{
            System.out.print("Ingresa la nota " + (i+1) + ": ");
            notes[i] = stdin.nextFloat();
            if(!(notes[i] >= 0 && notes[i] <= 5)){
                System.out.println("La nota ingresada no es valida (0.0 - 5.0)\n");
                continue;
            }
            i++;
        }
        while(i < size);
        note.setNotes(notes);
        System.out.println("Notas agregadas correctamente\n");
    }

    public void showNotes(){
        System.out.println(note.showNotes() + "\n");
    }

    public void promedyNotes(){
        System.out.println("El promedio es: " + note.promedyNotes() + "\n");
    }

    public void notesLargest(){
        System.out.println(note.notesLargest() + "\n");
    }

    public void clearScreen(){
        for(int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}
