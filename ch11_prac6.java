
interface tvremote{
    public void volume();
    public void changechannel();

}

interface smarttvremote extends tvremote{
    public void gamebutton();
    public void netflix();   

}

class remote implements smarttvremote{
    @Override
    public void volume() {
        System.out.println("volume button");
        
    }
    @Override
    public void changechannel() {
        System.out.println("channel change");
        
    }
    @Override
    public void gamebutton() {
        System.out.println("game button");
        
    }
    @Override
    public void netflix() {
        System.out.println("netlix button");
        
    }
}


class ch11_prac6{
    public static void main(String[] args) {
        remote r = new  remote();
        r.changechannel();
        r.gamebutton();
        r.volume();
        r.netflix();


        
    }
}