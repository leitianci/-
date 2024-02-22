package 草稿._2;

public class Main3 extends Thread{
    int i,j,x=0;
    Main3(int m,int n){
        this.i = m;
        this.j = n;
    }
    public void run() {
        int p,q;
        q=0;//余数
        p=0;//整除的次数


        for(int m=i;m<=j;m++) {
            for(int h=1;h<=m;h++) {
                q=m%h;
                if(q==0)p=p+1;
            }
            if(p==2) {
                x=x+1;
            }
            p=0;
        }
        System.out.println("输出"+i+"到"+j+"之间的质数个数："+x);
    }
    public static void main(String[] args) {

        Main3 thread1 =  new Main3(2,100000);
        Main3 thread2 =  new Main3(100000,200000);
        thread1.start();
        thread2.start();

    }



}
