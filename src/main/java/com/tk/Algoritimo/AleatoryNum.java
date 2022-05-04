package com.tk.Algoritimo;

import java.util.Random;

public class AleatoryNum{

    public static int genNumberInt(int bound){
        int num = aleatoryNumber(bound+1);
        if(num>0)
           return num;
        else
           return genNumberInt(bound);
    }

    private static int aleatoryNumber(int bound){
        Random d = new Random();
        return d.nextInt(bound);
    }
}