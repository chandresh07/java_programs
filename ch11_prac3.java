

class monkey{
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("biteing");
    }
}

interface basicAnimal{
    public void eat();
    public void sleep();
}

class human extends monkey implements basicAnimal{
    @Override
    public void eat() {
        System.out.println("eating");
        
    }
    @Override
    public void sleep() {
        System.out.println("sleeping");
        
    }

}

public class ch11_prac3 {
    public static void main(String[] args) {
        human h = new human();
        h.bite();
        h.eat();
        h.jump();
        h.sleep();
        
    }
    
}
