package java部分._10多线程._2基本线程的编写._1主线程;

public class SimpleThread extends Thread{
    private int countDown = 5;//执行5次
    private int threadNumber;
    private static int threadCount = 0;

    public SimpleThread(){
        threadNumber = ++threadCount;
        System.out.println("Making" + threadNumber);
    }

    public void run(){
        while(true){
            System.out.println("Thread" + threadNumber + "(" +countDown + ")");
            if(--countDown == 0 )return;
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<5;i++)
            new SimpleThread().start();//5个线程
        System.out.println("All threads Started");//主线程的这一个

    }
}
