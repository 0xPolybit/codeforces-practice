package com.polybit;

import java.util.Scanner;

public class NextRound_158A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); }
        int advancers = 0; int kthScore = arr[k-1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= kthScore && arr[i] != 0) {
                advancers += 1;
            }
        }
        System.out.println(advancers);
        sc.close();
    }

}
