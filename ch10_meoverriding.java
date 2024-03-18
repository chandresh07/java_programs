



class A{

    public void meth2(){
        System.out.println("class A method ");
    }
}

class B extends A{
    public void meth2(){
        System.out.println("Class B method ");
    }
}




class ch10_meoverriding{
    public static void main(String [] args){
    A a = new A();
    B b = new B();
    b.meth2();
    a.meth2();
    
    }
}
