package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        try {
            for (int i = 30; i >= 0; i--) {
                Thread.sleep(100);
                System.out.println(i);
            }
            System.out.println("Бум!");
        } catch(Exception ex){

        }
    }
}
