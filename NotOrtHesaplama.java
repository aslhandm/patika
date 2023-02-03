/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notorthesaplama;

import java.util.Scanner;

public class NotOrtHesaplama {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner ex = new Scanner(System.in);

        System.out.println("Matematik Notu: ");
        mat = ex.nextInt();

        System.out.println("Fizik Notu: ");
        fizik = ex.nextInt();

        System.out.println("Kimya Notu: ");
        kimya = ex.nextInt();

        System.out.println("Turkce Notu: ");
        turkce = ex.nextInt();

        System.out.println("Tarih Notu: ");
        tarih = ex.nextInt();

        System.out.println("Muzik Notu: ");
        muzik = ex.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalama Not: " + ortalama);

        boolean sonuc = ortalama < 60;
        String a = sonuc ? "Kaldı" : "Geçti";
        System.out.println("Geçme Durumu: " + a);

    }

}
