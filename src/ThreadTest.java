/**
 * Created by Shirley on 2017/8/8.
 */
class NewThread extends Thread {
    static int sum = 5000;
    static Object o = new Object();

    public NewThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (sum > 0) {
                    System.out.println(Thread.currentThread() + "取走了1000块");
                    sum -= 1000;
                } else {
                    System.out.println("钱被取光了");
                    break;
                }
            }

        }

    }

}
public class ThreadTest{
    public static void main(String args[]){

        NewThread thread1=new NewThread("妻子");
        NewThread thread2=new NewThread("丈夫");
        thread2.setPriority(10);

        thread1.start();
        thread2.start();
    }


}
