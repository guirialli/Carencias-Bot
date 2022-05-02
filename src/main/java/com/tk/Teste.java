package com.tk;

public class Teste {
    
    public static void main(String[] args) {
        String que =  "[U:- Aurora.(801930314531471411)]";
        String que1 = que.substring(que.length()-20, que.length() -2);
        que = "801930314531471411";
        if(que.equals(que1))
        System.out.println(que.length() + " " + que1.length());
    }
}
