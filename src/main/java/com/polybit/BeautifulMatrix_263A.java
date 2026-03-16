package com.polybit;

import java.util.Scanner;

public class BeautifulMatrix_263A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int k = sc.nextInt();
                if (k == 1) { answer = Math.abs(i-2) + Math.abs(j-2); }
            }
        }
        System.out.println(answer);
        sc.close();
    }

}
