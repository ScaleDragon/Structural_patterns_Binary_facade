package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        // 3+4 & 3*4
        System.out.println(bins.sum("11", "100"));
        System.out.println(bins.mult("11", "100"));
    }
}
