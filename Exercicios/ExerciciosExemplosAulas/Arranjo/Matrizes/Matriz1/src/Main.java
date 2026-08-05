import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ordem da matriz: ");
        int ordem = sc.nextInt();

        int[][] matriz = new int[ordem][ordem];
        int contadorNegativo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
               matriz[i][j] = sc.nextInt();
               if (matriz[i][j] < 0){
                   contadorNegativo++;
               }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }
        System.out.println("\nNegative numbers = "+contadorNegativo);
    }
}
