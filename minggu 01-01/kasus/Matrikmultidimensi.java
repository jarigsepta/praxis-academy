import java.util.Scanner;
public class Matrikmultidimensi {
    public static void main(String[] args) {
        Scanner matrik = new Scanner(System.in);
       
        int i;
        int x;
        int matrikA [][] = new int[2][2];
        int matrikB [][] = new int[2][2];
        int jum [][] = new int[2][2];
       
        System.out.println("INPUT MATRIK A");
       
        for (i = 0; i < matrikA.length; i++){
            for (x = 0; x < matrikA.length; x++){
                System.out.print("Matrik A baris ke-" + (i + 1) + " kolom ke-" + (x + 1) + ": ");
                matrikA[i][x] = matrik.nextInt();
            }
        }
        System.out.println("INPUT MATRIK B");
       
        for (i = 0; i < matrikB.length; i++){
            for (x = 0; x < matrikB.length; x++){
                System.out.print("Matrik B baris ke-" + (i + 1) + " kolom ke-" + (x + 1) + ": ");
                matrikB[i][x] = matrik.nextInt();
            }
        }
        System.out.println("MATRIK A");
       
        for (i = 0; i < matrikA.length; i++){
            for (x = 0; x < matrikA.length; x++){
                System.out.print(matrikA[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("MATRIK B");
       
        for (i = 0; i < matrikB.length; i++){
            for (x = 0; x < matrikB.length; x++){
                System.out.print(matrikB[i][x] + " ");
            }
            System.out.println();
        }
       
        for (i = 0; i < jum.length; i++){
            for (x = 0; x < jum.length; x++){
                jum[i][x] = matrikA[i][x] + matrikB[i][x];
               
            }
        }
        System.out.println("PENJUMLAHAN MATRIK A DAN MATRIK B");
       
        for (i = 0; i < jum.length; i++){
            for (x = 0; x < jum.length; x++){
               
                 System.out.print(jum[i][x] + " ");
            }
            System.out.println();
        }
    }
}