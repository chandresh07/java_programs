
abstract class pen{
   abstract public void write();
   abstract public void refill();
}

class cilo extends pen{
    @Override
    public void write() {
        System.out.println("writing");
        
    }
    @Override
    public void refill() {
        System.out.println("refilling");
        
    }
    public void changeNib(){
        System.out.println("chaning the nib");
    }
}






public class ch11_prac {
    public static void main(String[] args) {
        cilo c =  new cilo();
        c.changeNib();
        
    }
    
}
