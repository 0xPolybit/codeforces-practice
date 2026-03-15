package com.polybit;

import java.util.Scanner;

public class BitPlusPlus_282A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String str = sc.next();
            if (str.charAt(1) == '+') { x += 1; }
            else { x -= 1; }
        }
        System.out.println(x);
    }

}
