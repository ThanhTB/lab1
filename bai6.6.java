
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiến Thành
 */
public class bai66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] c= new int [m][n];
        int [][] a = new int[m][n];
        int [][] b = new int [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
            
        }
        
    }
}
