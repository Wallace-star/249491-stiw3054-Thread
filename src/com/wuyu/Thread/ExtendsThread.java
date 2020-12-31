package com.wuyu.Thread;

public class ExtendsThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello Thread" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        ExtendsThread helloThread1 = new ExtendsThread();
        ExtendsThread helloThread2 = new ExtendsThread();
        helloThread1.start();
        helloThread2.start();
    }
}
