package experiment.experiment_2;

public class prime extends Thread{

    int x;//以x开始
    int y;//以y结束
    int sum=0;
    public prime(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run() {
        int yushu = 0;//每次计算的余数
        int flag = 0;//可以被整除的个数

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
        new prime(2,100000).start();
        new prime(100000,200000).start();
    }

}
