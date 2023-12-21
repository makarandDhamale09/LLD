package com.questions.thread;

public class NewThread extends Thread{

    NewThread(){
        super("My Thread");
        start();
    }

    @Override
    public void run() {
        System.out.println(this);
    }
}
