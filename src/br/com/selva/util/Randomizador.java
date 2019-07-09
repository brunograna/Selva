package br.com.selva.util;

import java.util.Random;

public class Randomizador {
    public static void Randomizador(int[] array) {
        int n = array.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            trocar(array, i, change);
        }
    }

    private static void trocar(int[] a, int i, int troca) {
        int ajuda = a[i];
        a[i] = a[troca];
        a[troca] = ajuda;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4 };
        Randomizador(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}