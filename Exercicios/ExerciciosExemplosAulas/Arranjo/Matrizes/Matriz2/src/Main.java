import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantify of lines: ");
        int linhasQuantidade = sc.nextInt();

        System.out.println("Enter the quantify of columns: ");
        int colunasQuantidade = sc.nextInt();

        int[][] matriz = new int[linhasQuantidade][colunasQuantidade];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Line "+i+ " Column "+j+"\n");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter a number to search in the matrix:");
        int value = sc.nextInt();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == value){
                    System.out.println("Position ("+i+","+j+")");
                    if (j>0){
                        System.out.println("Left: "+matriz[i][j-1]);
                    }
                    if (i>0){
                        System.out.println("Up: "+matriz[i-1][j]);
                    }
                    if (j<matriz[i].length-1){
                        System.out.println("Right: "+matriz[i][j+1]);
                    }
                    if (i<matriz.length-1){
                        System.out.println("Down: "+matriz[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}