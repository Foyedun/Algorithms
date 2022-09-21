package com.sog;

public class Main {
    public static void main(String[] args) {
       String fabulous = stringReversal("shogo");
        System.out.println(fabulous);

    }

        public static String stringReversal(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    }

