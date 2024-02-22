package 草稿._2;

public class test extends Thread{

    int x;//以x开始
    int y;//以y结束
    int sum=0;
    public test(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run() {
        int yushu = 0;//
        int flag = 0;//

        for(int i = x; i <=y; i++){
            for(int j = 1; j <= i; j++){
                yushu = i % j;
                if(yushu == 0) flag++;
            }
            if(flag == 2) sum++;
            flag = 0;
        }


        System.out.println("从" + x + "到" + y + "有" + sum + "个质数");
    }

    public static void main(String[] args) {
        new test(2,100000).start();
        new test(100000,200000).start();
    }

}
