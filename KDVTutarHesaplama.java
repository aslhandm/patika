package kdvtutarhesaplama;

import java.util.Scanner;

public class KDVTutarHesaplama {

    public static void main(String[] args) {
        double tutar;
        double kdvOrani1 = 0.18;
        double kdvOrani2 = 0.08;
        double kdvTutari;
        double toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ödemeniz gereken tutarı giriniz: ");
        tutar = input.nextDouble();
        if (tutar <= 1000){
            kdvTutari = tutar * kdvOrani1;
            System.out.println("Ürünün KDV oranı: %18");
            System.out.println("Ürünün KDV tutarı: " + kdvTutari);
            toplamTutar = tutar + kdvTutari;
            System.out.println("Ürünün toplam tutarı: " + toplamTutar);
        }
        else {
        kdvTutari = tutar * kdvOrani2;
        System.out.println("Ürünün KDV oranı: %8");
        System.out.println("Ürünün KDV tutarı: " + kdvTutari);
        toplamTutar = tutar + kdvTutari;
        System.out.println("Ürünün toplam tutarı: " + toplamTutar);}
    }
 
    }

