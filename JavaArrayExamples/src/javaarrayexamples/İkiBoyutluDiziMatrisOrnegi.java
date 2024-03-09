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
public class İkiBoyutluDiziMatrisOrnegi {
    
    //Girilen satır ve sütun sayısına göre "*" dizisi oluşturan program.
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz: ");
        int satir = input.nextInt();
        System.out.println("Lütfen sütun sayısını giriniz: ");
        int sutun = input.nextInt();
        String[][] dizi = new String[satir][sutun];
        for(int i=0; i<satir; i++){
            for(int j=0; j<sutun; j++){
                dizi[i][j] = "*";
            }
        }
        for(int i =0; i<satir; i++){
            for(int j=0; j<sutun; j++){
                System.out.print(dizi[i][j]);
            }
            System.out.println();
        }
    }
}
