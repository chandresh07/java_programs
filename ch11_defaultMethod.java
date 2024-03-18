

interface mycamera{
    void takesnap();
    void recordvideo();
}

interface mywifi{
    String[] getnetworks();
    void connectToNetwork(String network);

}

class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling"+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting...");
    } 
}

class mysmartphone extends mycellphone implements mycamera,mywifi{
    public void takesnap(){
        System.out.println("taking snap");

    }
   public void recordvideo(){
        System.out.println("taking snap video");

    }
    public String[] getnetworks(){
        System.out.println("getting list og networks");
        String [] networklist = {"harry", "shubham", "kohali"};
        return networklist;

     }
   public void connectToNetwork(String network){
        System.out.println("connecting to network");

    }

}

 class ch11_defaultMethod {
    public static void main(String[] args) {

        mysmartphone ms = new mysmartphone();
        String [] ar = ms.getnetworks();
        for(String item : ar){
            System.out.println(item);
        }
        
    }

    
}