
class mythred extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<100){
        System.out.println("mythred is running 0");
        i++;
        }
    }
}
class mythred1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<100){
        System.out.println("mythred1 is running 1");
        i++;
        }
    }
}


public class ch13_thred {
    public static void main(String[] args) {
        mythred mt = new mythred();
        mythred1 mt1 = new mythred1();
        mt.start();
        mt1.start();
        
    }
    
}
