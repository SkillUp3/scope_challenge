package com.company;

import java.util.Scanner;

/**
 * Created by idejesus on 26/03/2017.
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("enter a number");
        this.x = x.nextInt();
    }

    public void multiply() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x +" "+ x * this.x);
        }
    }
}
