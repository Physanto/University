import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise2{
    
    static float[] temps = {45,12,10,23,53};
    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args){ 
        menu();
    }

    public static void menu(){

        byte option;
        do{
            System.out.println("\nMenu Principal\n");
            System.out.println("1. Llenar array - ordenado");
            System.out.println("2. Busqueda lineal");
            System.out.println("3. Busqueda Binaria");
            System.out.println("4. LLenar array con temperaturas aleatorias");
            System.out.print("Ingresa una opcion: ");
            option = stdin.nextByte();
            stdin.nextLine();

            switch(option){
                case 1:
                    System.out.println("Mostrando temperaturas por defecto\n");
                    sortArray();
                    showTemps();
                    break;

                case 2:
                    LinearSearch();
                    break;

                case 3:
                    sortArray();
                    BinarySearch();
                    break;

                case 4:
                    System.out.println("Mostrando las temperaturas generadas aleatoriamente");
                    tempRandoms();
                    showTemps();
                    break;
               
                case 5:
                    System.out.println("Incorrecto");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
        while(option < 5);
        
    }

    public static void sortArray(){
        Arrays.sort(temps);
    }

    public static void LinearSearch(){
        System.out.print("Ingresa la temperatura a buscar: ");
        float temp = stdin.nextFloat();

        for(int i = 0; i < temps.length; i++) {
            if(temp == temps[i]){
                System.out.println("Temperatura encontrada");
                return;
            }
        }
        System.out.println("Temperatura no encontrada");
    }
    
    public static void BinarySearch(){
        System.out.print("Ingresa la temperatura a buscar: ");
        float temp = stdin.nextFloat();

        int iLeft = 0;
        int iRight = temps.length - 1;

        while(iLeft <= iRight){
            int iMedium = (iRight + iLeft) / 2;

            if(temp == temps[iMedium]){
                System.out.println("Temperatura encontrada");
                return;
            } 
            
            else if(temp < temps[iMedium]){
                iRight = iMedium - 1;
            }
            else{
                iLeft = iMedium + 1;
            }
        }
        System.out.println("Temperatura no encontrada");
    }

    public static void tempRandoms(){
        Random tempRandom = new Random();
        for(int i = 0; i < 5; i++) {
            temps[i] = tempRandom.nextFloat(0,100);
        }
    }

    public static void showTemps(){
        for(Float temp : temps){
            System.out.print(temp + " ");
        }
    }
}
