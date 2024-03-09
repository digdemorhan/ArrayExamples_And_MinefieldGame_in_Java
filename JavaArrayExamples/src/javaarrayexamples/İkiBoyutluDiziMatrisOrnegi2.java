/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaarrayexamples;

import java.util.Scanner;

/**
 *
 * @author Serdar
 */
public class İkiBoyutluDiziMatrisOrnegi2 {
    
    public static void main(String[] args) {
        
        //Girilen satır ve sütun sayısına göre dizi oluşturup satırları ikişer ve sütunları onar arttıran program
        
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz: ");
        int satir = s.nextInt();
        System.out.println("Lütfen sütun sayısını giriniz: ");
        int sutun = s.nextInt();
        int sayi=0;
        int[][] dizi = new int[satir][sutun];
        for(int i=0; i<satir; i++){
            for(int j=0; j<sutun; j++){
                dizi[i][j] = sayi;
                System.out.print(dizi[i][j] + " ");
                sayi += 2;
            }
            sayi += 8;
            System.out.println();
        }
    }
}
