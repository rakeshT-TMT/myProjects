package com.example.ThreadsCodes;

public class Synchronized {
    public static void main(String[] args) throws Exception{
        BrickDiary bd=new BrickDiary();

        Runnable r1=()->{
            for(int i=0;i<30000;i+=50){
                bd.incrementBrickCount();
            }
        };
        Runnable r2=()->{
            for(int i=0;i<20000;i+=50){
                bd.incrementBrickCount();
            }
        };
        Runnable r3=()->{
            for(int i=0;i<15000;i+=50){
                bd.incrementBrickCount();
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

//        System.out.println(bd.brickCount);
//        System.out.println(bd.brickCount2);
        System.out.println(bd.getBrickCount());
        System.out.println(bd.getBrickCount2());

    }
}
//class BrickDiary{
//    int brickCount=0;
//    int brickCount2=0;
//    public synchronized void incrementBrickCount(){
//
//            brickCount += 50;
//            brickCount2 += 50;
//    }
//
//}
class BrickDiary {
    private int brickCount = 0;
    private int brickCount2 = 0;
    private final int LIMIT = 500;

    public synchronized void incrementBrickCount() {
        try {
            while (brickCount >= LIMIT) {

                wait();
            }
            brickCount += 50;
            brickCount2 += 50;
            System.out.println(Thread.currentThread().getName() + " incremented: brickCount = " + brickCount + ", brickCount2 = " + brickCount2);


            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }

    public synchronized int getBrickCount() {
        return brickCount;
    }

    public synchronized int getBrickCount2() {
        return brickCount2;
    }
}
