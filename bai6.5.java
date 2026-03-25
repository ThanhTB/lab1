
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiến Thành
 */
public class bai65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
