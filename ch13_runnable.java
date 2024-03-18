
class mythred implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<100) {
           System.out.println("walking");
           i++;
        }
        
    }

}
class mythred1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<100){
        System.out.println("running");
        i++;
        }
    }
}



public class ch13_runnable{
    public static void main(String[] args) {
        
        mythred mt = new mythred();
        Thread t = new Thread(mt);

        mythred1 mt1 = new mythred1();
        Thread t2 = new Thread(mt1);

        t.start();
        t2.start();
    }
    
}
