
class Base{
    public int x;

    public int Getx(){
        return x;
    }
    public void Setx(int x){
        this.x = x;
    }
    public void  PrintDetails(){
        System.out.println("Details");
    }

}

class Derived extends Base{
    public int y;

    public int Gety(){
        return y;
    }
    public void Sety(int y){
        this.y= y;
    }
}

class ch_9inher{
    public static void main(String [] args){

        Base b = new Base();
        b.Setx(4);
       // System.out.println(b.Getx());

        Derived d = new Derived();
        d.Sety(12);
        d.Setx(10);
        System.out.println(d.Gety());
        System.out.println(d.Getx());

    }
}