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
public class ReverseArray {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin boyutu: ");
        int boyut = scan.nextInt();
        int[] dizi = new int[boyut];
        for(int i=0; i<boyut; i++){
            System.out.println("Dizinin " + i + ". indisi: ");
            dizi[i] = scan.nextInt();
        }
        System.out.print("Oluşturulan dizi: ");
        for(int i=0; i<boyut; i++){
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
        int gecici; //indisleri geçici olarak burada tutacağız
        for(int i=0; i<boyut/2; i++){ //1-2-3-4-5-6
            gecici=dizi[i]; //gecici=dizi[0] --> gecici=1
            dizi[i] = dizi[boyut-i-1]; //dizi[0]=dizi[5] --> dizi[0]=6
            dizi[boyut-i-1]=gecici; //dizi[5]=1
        }
        
        System.out.print("Dizinin ters çevrilmiş hali: ");
        for(int i=0; i<boyut; i++){
            System.out.print(dizi[i] + " ");
        }

    }
}
