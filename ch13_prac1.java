
class gm extends Thread{
    @Override
    public void run() {
        int j = 0;
        while(j<100){
        System.out.println("Goood Morning");
        j++;
        }
    }
}
class wm extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<100){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);

            }
        System.out.println("Welcone");
        i++;
        }
    }
}





public class ch13_prac1 {
public static void main(String[] args) {
    gm  g = new gm();
     wm w  = new wm();
       w.start();
    g.start();
}
}
