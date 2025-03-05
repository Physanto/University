import java.util.Scanner;

public class Auxiliar{

    Scanner stdin = new Scanner(System.in);

    public void llenarMatriz(){

        float notas[][] = new float[2][2];

        for(int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (i+1) + ": ");

                notas[i][j] = stdin.nextFloat();
            }  
        }
    }
}
