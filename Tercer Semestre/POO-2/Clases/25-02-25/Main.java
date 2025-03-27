import java.util.Scanner;
public class Main{
    
    static Scanner stdin = new Scanner(System.in);
    static ArrayListt arrayList = new ArrayListt();

    public static void main(String[] args){
        menu();
    }

    public static void menu(){

        byte option;

        do{
            System.out.println("\nMenu Para Hacer Lo Que Quieras\n" +
                "1._ Agregar Numero.\n" + 
                "2._ Imprimir Sumatoria.\n" + 
                "3._ Promedio de Numeros.\n" +
                "4._ Lista Numeros\n" + 
                "5._ Salir.");
            System.out.print("Ingresa una opcion: ");
            option = stdin.nextByte();

            switch(option){
                
                case 1:
                    addNumber();
                    break;

                case 2:
                    showSum();
                    break;

                case 3:
                    promedyNumbers();
                    break;
                
                case 4:
                    listNumbers();
                    break;

                case 5:
                    System.out.println("Adios...");
                    break;

                default:
                    System.out.println("Error.");
                    break;
            }
        }
        while(option != 5); 
    }
    public void addNumber(){
        System.out.print("Ingresa el numero: ");
        int number = stdin.nextInt();

        if(arrayList.addNumber(number)) System.out.println("Numero agregado correctamente.");
        else System.out.println("No agregado");
    }

    public int showSum(){
    }

    public float promedyNumbers(){
        float promedy = 0;

        if(numbers.size() == 0) {
            return 0; 
        }

        for(int number : numbers){
            promedy += number;
        }
        return promedy /= numbers.size();
    }

    public String listNumbers(){
        String list = "";

        for(int number : numbers){
            list += number + ", ";
        } 
        
        return list;
    }

}
