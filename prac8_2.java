
class cellphone{

    void ring(){
        System.out.println("Phone is Ringing....");
    }

    void vibrate(){
        System.out.println("phone is vibrating....");
    }
    void call(){
        System.out.println("phone is calling...");
    }
 }


class prac8_2{
    public static void main(String [] args){

        cellphone c = new cellphone();
        c.ring();
        c.vibrate();
        c.call();
        

    }
}