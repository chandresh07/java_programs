

interface  bicycle{
    void applybreake(int decrement);
    void speedup(int increment);
    void gearup();

}
// multiple interface class can be implemented in a derived class

class avoncycle implements bicycle{
    int speed = 7;
    public void applybreake(int decrement){
        speed  = speed - decrement;
        System.out.println("applying breake");
    }
   public void speedup(int increment){
        speed = speed + increment; 
        System.out.println("applying sped");
    }
    public void gearup(){
        System.out.println("gear up");
    }
}



public class ch11_interface {
    public static void main(String[] args) {
        avoncycle a = new avoncycle();
        a.applybreake(1);
        a.speedup(1);
        a.gearup();
        
    }
    
}
