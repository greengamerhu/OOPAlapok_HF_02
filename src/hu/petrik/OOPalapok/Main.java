package hu.petrik.OOPalapok;


import hu.petrik.OOPalapok.kor.Kor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Kor k1 = new Kor();
        Kor k2 = new Kor(10);
        Kor k3 = new Kor(20);
        Kor k4 = new Kor(2,3,4);
        Kor k5 = new Kor(21,-3,40);
        Kor k6 = new Kor(222,-40,24);
        Kor k7 = new Kor(666,-666,50);
        Kor k8 = new Kor();
        Kor k9 = new Kor();
        Kor k10 = new Kor();
        System.out.printf("%s-nek a Kerülete: %.3f \n", k2, k2.getKerulet());
        System.out.printf("%s-nek a Területe: %.3f \n", k2, k2.getTerulet());
        System.out.println(k2);
        k2.korMerete("+", 10);
        System.out.println(k2);
        List<Kor> korok = new ArrayList<Kor>();
        korok.add(k1);
        korok.add(k2);
        korok.add(k3);
        korok.add(k4);
        korok.add(k5);
        korok.add(k6);
        korok.add(k7);
        korok.add(k8);
        korok.add(k9);
        korok.add(k10);

        Kor TeruletMax = k1;
        for (Kor kor: korok) {
            System.out.printf("%s \n", kor);
            if (kor.getTerulet() > TeruletMax.getTerulet()) {
                TeruletMax = kor;
            }
        }
        System.out.printf("A legnagyobb Területű kör a listából: %s Területe: %.3f ", TeruletMax, TeruletMax.getTerulet());




    }
}
