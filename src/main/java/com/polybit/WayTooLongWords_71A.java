package com.polybit;

import java.util.Scanner;

public class WayTooLongWords_71A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
                
            String x = sc.next();
            int len = x.length();
 
            if (len > 10) {
                System.out.print(x.charAt(0));
                System.out.print(len - 2);
                System.out.println(x.charAt(len - 1));
            } else {
                System.out.println(x);
            }
        }
    }
    
}
