
abstract class telephone{
   abstract public void  ring();
   abstract public void disconnect();
   abstract public void lift();


}

class smartphone extends telephone{
    @Override
    public void ring() {
        System.out.println("ringing");
        
    }
    @Override
    public void disconnect() {
        System.out.println("cut");
        
    }
    @Override
    public void lift() {
        System.out.println("connected");
        
    }

}

public class ch11_prac4 {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.disconnect();
        sp.lift();
        sp.ring();
        
    }
}
