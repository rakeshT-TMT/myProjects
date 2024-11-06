package com.example.ThreadsCodes;



public class ThreadSleep extends Thread {

//    public void run(){
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//            try{
//                Thread.sleep(300);
//            }catch (InterruptedException e){
//                System.out.println("Thread is Interrupted");
//            }
//        }
//    }
//    public static void main(String[] args) {
//       ThreadSleep t1=new ThreadSleep();
//        t1.start();
//    }

    public static void main(String[] args) {
        Runnable r1=()->{
            for(int i=0;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
                System.out.println("Thread is Interrupted");
            }
        }
        };
        Runnable r2=()->{
            for(int i=11;i<=20;i++){
                System.out.println(i);
                try{
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    System.out.println("Thread is Interrupted");
                }
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted");
        }
        t2.start();

    }
}




//public class ThreadSleep extends Thread {
//    String name;
//    public ThreadSleep(String name) {
//        this.name=name;
//    }
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Thread.currentThread().getName() + " is running with priority " +
//                    Thread.currentThread().getPriority());
//            try{
//                Thread.sleep(500);
//            }catch (InterruptedException e){
//                System.out.println("Thread Interruption");
//            }
//
//        }
//    }
//
//        public static void main(String[] args) {
//            ThreadSleep t1=new ThreadSleep("Thread-1");
//            ThreadSleep t2=new ThreadSleep("Thread-2");
//            ThreadSleep t3 =new ThreadSleep("Thread-3");
//
//            t1.setPriority(Thread.MIN_PRIORITY);
//            t2.setPriority(Thread.NORM_PRIORITY);
//            t3.setPriority(Thread.MAX_PRIORITY);
//
//            t1.start();
//            t2.start();
//            t3.start();
//
//
//    }
//}
