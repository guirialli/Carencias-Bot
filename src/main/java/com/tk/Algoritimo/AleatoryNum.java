package com.tk.Algoritimo;

import java.util.Random;

public class AleatoryNum{

    public static int genNumberInt(int bound){
        Random d = new Random();
        return d.nextInt(bound);
    }
}