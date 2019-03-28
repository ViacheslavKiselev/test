package ru.test;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ssssssss");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread");
            }
        }).start();
        System.out.println("Bla");
    }

    public void doJob() {
        System.out.println("Test do Job");
    }

}
