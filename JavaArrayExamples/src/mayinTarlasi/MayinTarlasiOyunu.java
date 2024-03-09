/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Serdar
 */
public class MayinTarlasiOyunu {
    
    public static void main(String[] args) {
        //OYUNCUNUN BELİRLEDİĞİ SATIR-SÜTUN SAYISINA VE ZORLUK SEVİYESİNE GÖRE MAYIN TARLASI OYUNU.        
        Scanner s = new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ! ");
        System.out.print("LÜTFEN SATIR BOYUTUNU GİRİNİZ: "); //Satır boyutu alındı.       
        int satir = s.nextInt();
        System.out.print("LÜTFEN SÜTUN BOYUTUNU GİRİNİZ: "); //Sütun boyutu alındı.
        int sutun = s.nextInt();
        System.out.println("ZORLUK SEVİYELERİ %20, %40, %60 VE %8O'DİR.ZORLUK GİTGİDE ARTMAKTADIR. ");
        System.out.print("LÜTFEN ZORLUK SEVİYENİZİ SEÇİNİZ: "); //Zorluk seviyesi belirlendi.
        int zorluk = s.nextInt();
        while (zorluk != 20 && zorluk != 40 && zorluk != 60 && zorluk != 80)
        {
            System.out.print("BELİRTİLEN ZORLUK SEVİYELERİNİN DIŞINA ÇIKILAMAZ. LÜTFEN YENİDEN DEĞER GİRİNİZ: ");
            zorluk = s.nextInt();
        }
        int [][] tarla = new int[satir][sutun]; //Oynanacak alan için bir dizi tanımlandı.
        int i = 0;
        int j = 0;
        while (i < satir)
        {               
            while (j < sutun)
            {
                tarla[i][j] = 0;
                j++;
            }
            i++;
        }
        if (zorluk == 20) //%20 zorluk seviyesine göre mayınlar atandı.
        {
            int mayin = ((satir*sutun)/5);
            int x = 0;
            int w = 0;
            while(w < mayin)
            {
                Random rastgele1=new Random();
                int rastgelesutun = rastgele1.nextInt(sutun);
                int rastgelesatir = rastgele1.nextInt(satir);
                if (tarla[rastgelesatir][rastgelesutun] == 0)
                {
                    tarla[rastgelesatir][rastgelesutun] = 1;
                    w++;
                }
            }
        }
        else if (zorluk == 40) //%40 zorluk seviyesine göre mayınlar atandı.
        {
            int mayin = ((2*(satir*sutun))/5);
            int x = 0;
            int w = 0;
            while(w < mayin)
            {
                Random rastgele1=new Random();
                int rastgelesutun = rastgele1.nextInt(sutun);
                int rastgelesatir = rastgele1.nextInt(satir);
                if (tarla[rastgelesatir][rastgelesutun] == 0)
                {
                    tarla[rastgelesatir][rastgelesutun] = 1;
                    w++;
                }
            }
        }
        else if (zorluk == 60) //%60 zorluk seviyesine göre mayınlar atandı.
        {
            int mayin = ((3*(satir*sutun))/5);
            int x = 0;
            int w = 0;
            while(w < mayin)
            {
                Random rastgele1=new Random();
                int rastgelesutun = rastgele1.nextInt(sutun);
                int rastgelesatir = rastgele1.nextInt(satir);
                if (tarla[rastgelesatir][rastgelesutun] == 0)
                {
                    tarla[rastgelesatir][rastgelesutun] = 1;
                    w++;
                }
            }
        } 
        else if (zorluk == 80) //%80 zorluk seviyesine göre mayınlar atandı.
        {
            int mayin = ((4*(satir*sutun))/5);
            int x = 0;
            int w = 0;
            while(w < mayin)
            {
                Random rastgele1=new Random();
                int rastgelesutun = rastgele1.nextInt(sutun);
                int rastgelesatir = rastgele1.nextInt(satir);
                if (tarla[rastgelesatir][rastgelesutun] == 0)
                {
                    tarla[rastgelesatir][rastgelesutun] = 1;
                    w++;
                }
            }
        }
        System.out.println();
        System.out.println("ZORLUK SEVİYESİ, SATIR-SÜTUN SAYISI BELİRLENDİ. MAYINLAR YERLERİNE KOYULDU.");
        System.out.println("OYUN BAŞLASIN!");
        String[][] yildiztarlasi = new String[satir][sutun]; //Mayınların gizlenmesi için yeni bir dizi tanımlandı.
        int a = 0;
        while (a < satir)
        {
            int b = 0;
            while (b < sutun) 
            {
                yildiztarlasi[a][b] = "*"; //Mayınların gizlenmesi için bu diziye "*" değeri atandı.
                b++;
            }
            a++;
        }
        for (int c = 0; c < satir; c++)
        {
            for (int d = 0; d < sutun; d++)
            {
                System.out.print(yildiztarlasi[c][d]);
                System.out.print("  ");
            }           
            System.out.println();
        }
            System.out.print("LÜTFEN SATIR DEĞERİNİ GİRİNİZ: ");
        int satir2 = s.nextInt() - 1;
        while (satir2 > satir || satir2 < 0)
        {
            System.out.print("BELİRLENEN SATIR DEĞERİNDEN BÜYÜK VEYA SIFIRDAN KÜÇÜK DEĞER GİRİLEMEZ. LÜTFEN YENİ DEĞER GİRİNİZ: ");
            satir2 = s.nextInt() - 1;
        }
        System.out.print("LÜTFEN SÜTUN DEĞERİNİ GİRİNİZ: ");
        int sutun2 = s.nextInt() - 1;
        while (sutun2 > sutun || sutun2 < 0){
            System.out.print("BELİRLENEN SATIR DEĞERİNDEN BÜYÜK VEYA SIFIRDAN KÜÇÜK DEĞER GİRİLEMEZ. LÜTFEN YENİ DEĞER GİRİNİZ: ");
            sutun2 = s.nextInt() - 1;
        }
        int mayinYok = (sutun*satir)-(((sutun*satir)/5)*(zorluk/20));
        int puan = 0;
        int w = 0;
        boolean kontrol = false;

        if (w == mayinYok)
        {
            System.out.println("TEBRİKLER! HİÇBİR MAYINA BASMADINIZ. ALDIĞINIZ PUAN: " + puan); //Oyun kazanıldığında gelecek çıktı belirlendi.
            System.out.println("OYNADIĞINIZ ALAN: ");
            System.out.println();
            for (int o = 0; o < satir; o++)
            {
                for (int p = 0; p < sutun; p++)
                {
                    System.out.print(tarla[o][p]);
                    System.out.print("  ");
                }
                System.out.println();
            }
            kontrol = true;
        }

        while (kontrol == false)
        {
            if (tarla[satir2][sutun2] == 0) //Mayınsız bölgeye değer atandı.(0=temiz)
            {

                yildiztarlasi[satir2][sutun2] = "0";

                if (zorluk == 20)
                {
                    puan+=10;
                } else if (zorluk == 40)
                {
                    puan+=20;
                } else if (zorluk == 60)
                {
                    puan +=30;
                } else if (zorluk == 80)
                {
                    puan+=40;
                }
            } else if (tarla[satir2][sutun2] == 1) //Mayınlı bölgeye değer atandı.(1=mayın)
            {
                yildiztarlasi[satir2][sutun2] = "1";
                System.out.println();
                System.out.println("KAYBETTİNİZ! MAALESEF MAYINA BASTINIZ. ALDIĞINIZ PUAN: " + puan); //Oyun kaybedildiğinde gelecek çıktı belirlendi.
                System.out.println();
                System.out.println("OYNADIĞINIZ ALAN: ");
                System.out.println();
                for (int e = 0; e < satir; e++)
                {
                    for (int f = 0; f < sutun; f++)
                    {
                        System.out.print(tarla[e][f]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
                kontrol = true;
            }
            if (kontrol == false) 
            {
                System.out.println();
                for (int g = 0; g < satir; g++)
                {
                    for (int h = 0; h < sutun; h++)
                    {
                        System.out.print(yildiztarlasi[g][h]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
            }
            while (yildiztarlasi[satir2][sutun2] == "0")
                {
                System.out.print("LÜTFEN SATIR DEĞERİNİ GİRİNİZ: ");
                satir2 = s.nextInt() - 1;
                System.out.println();
                if (satir2 + 1 > satir || satir2 < 0)
                {
                    while (satir2 + 1 > satir || satir2 < 0)
                    {
                        System.out.print("BELİRLENEN SATIR DEĞERİNDEN BÜYÜK VEYA SIFIRDAN KÜÇÜK DEĞER GİRİLEMEZ. LÜTFEN YENİ DEĞER GİRİNİZ: ");
                        satir2 = s.nextInt() - 1;
                    }
                }

                System.out.print("LÜTFEN SÜTUN DEĞERİNİ GİRİNİZ: ");
                sutun2 = s.nextInt() - 1;
                System.out.println();
                if (sutun2 + 1 > sutun || sutun2 < 0)
                {
                    while (sutun2 + 1 > sutun || sutun2 < 0)
                    {
                        System.out.print("BELİRLENEN SATIR DEĞERİNDEN BÜYÜK VEYA SIFIRDAN KÜÇÜK DEĞER GİRİLEMEZ. LÜTFEN YENİ DEĞER GİRİNİZ: ");
                        sutun2 = s.nextInt() - 1;
                    }
                }
                if (yildiztarlasi[satir2][sutun2] != "*")
                {
                    System.out.print("AÇTIĞINIZ SATIRI TEKRAR AÇAMAZSINIZ. LÜTFEN YENİDEN SATIR DEĞERİ GİRİNİZ: ");
                    System.out.println();
                    System.out.print("LÜTFEN SATIR DEĞERİNİ GİRİNİZ: ");
                    satir2 = s.nextInt() - 1;
                    System.out.println();
                    if (satir2 + 1 > satir || satir2 < 0)
                    {
                        while (satir2 + 1 > satir || satir2 < 0)
                        {
                            System.out.print("BELİRLENEN SATIR DEĞERİNDEN BÜYÜK VEYA SIFIRDAN KÜÇÜK DEĞER GİRİLEMEZ. LÜTFEN YENİ DEĞER GİRİNİZ: ");
                            satir2 = s.nextInt() - 1;
                        }
                    }
                    System.out.print("LÜTFEN SÜTUN DEĞERİNİ GİRİNİZ: ");
                    sutun2 = s.nextInt() - 1;
                    System.out.println();
                    if (sutun2 + 1 > sutun || sutun2 < 0)
                    {
                        while (sutun2 + 1 > sutun || sutun2 < 0)
                        {
                            System.out.print("BELİRLENEN SATIR DEĞERİNDEN BÜYÜK VEYA SIFIRDAN KÜÇÜK DEĞER GİRİLEMEZ. LÜTFEN YENİ DEĞER GİRİNİZ: ");
                            sutun2 = s.nextInt() - 1;
                        }
                    }
                }
            }
        }
    
    }
}
