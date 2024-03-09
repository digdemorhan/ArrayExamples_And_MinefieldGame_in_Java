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
public class DizilerleDikUcgenYapimi {
    
    public static void main(String[] args) {
        
        //Girilen satır sayısına göre ters üçgen yapımı.
        /*
            İPUCU:
            Önce algoritmayı çözümlememiz gerekiyor.
            Boşluk sayısına dikkat edelim.
            *********     1     0       9   
             *******      2     1       7   
              *****       3     2       5   
               ***        4     3       3   
                *         5     4       1   
                       Satır  Boşluk  Yıldız 
                          n     n-1    2*n-1
            Bakıldığında, yıldız sayısının bir eksiği kadar boşluk olması gerekiyor.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Dik üçgen için satır sayısı: ");
        int satirDik = scan.nextInt();
        for(int i=1; i<=satirDik; i++){
            for(int j=0; j<=(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Aynı dik üçgenin tersini de yapalım.
        System.out.println("Ters dik üçgen için satır sayısı: ");
        int satirTersDik = scan.nextInt();
        for(int i=satirTersDik; i>=1; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Normal üçgen yapalım.
        System.out.println("Üçgen için satır sayısı: ");
        int satirNorm = scan.nextInt();
        for(int i=satirNorm; i>=1; i--){
            for(int j=1; j<=(i-1); j++){
                System.out.print(" ");
            }
            int yildiz = (satirNorm+1)-i;
            for(int k=1; k<=2*yildiz-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Ters üçgen yapalım.
        System.out.println("Ters üçgen için satır sayısı: ");
        int satirTers = scan.nextInt();
        for(int i=1; i<=satirTers; i++){
            for(int j=1; j<=(i-1); j++){
                System.out.print(" ");
            }
            int yildiz = (satirTers+1)-i;
            for(int k=1; k<=2*yildiz-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
