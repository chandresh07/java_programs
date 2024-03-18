
abstract class base{

    public base(){
        System.out.println("I am a contructor");
    }
    public void sayHello(){
        System.out.println("Hello World");
    }
    abstract public void greet();

}

class derived extends base{
    public void greet(){
        System.out.println("Good Morning");
    }
}


class ch11_absract{
    public static void main(String [] args){
        derived d = new derived();
        d.greet();

    }
}