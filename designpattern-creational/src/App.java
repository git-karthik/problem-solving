import com.rk.designpatterns.singleton.SingletonModel;

public class App {

    public static void main(String[] args) throws Exception {
  
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread --"+Thread.currentThread().getName()+"->"+SingletonModel.getInstance());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {                    
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread --"+Thread.currentThread().getName()+"->"+SingletonModel.getInstance());
            }
        };  
        
        t2.start();

    }
}
