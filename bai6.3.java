/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Tiến Thành
 */
public class bai64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            int space = n-i;
        
            int stars = 2*i-1;
            for(int s = 0; s< space; s++){
                System.out.print(" ");
            }
            for(int st = 0;st< stars;st++){
                System.out.print("*");
            }
            System.out.println();
        
        }
        
    } 
}
