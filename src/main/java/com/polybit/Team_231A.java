package com.polybit;

import java.util.Scanner;

public class Team_231A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            int confidence = 0;
            for (int j = 0; j < 3; j++) {
                confidence += Integer.parseInt(sc.next());
            }
            answer += confidence >= 2 ? 1 : 0;
        }
        System.out.println(answer);
    }

}
