package com.polybit;

import java.util.Scanner;

public class DominoPiling_50A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int answer = (m * n) / 2;
        System.out.println(answer);
    }

}
