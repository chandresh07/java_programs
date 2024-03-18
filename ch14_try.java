



public class ch14_try {
    public static void main(String[] args) {

        int a = 6000;
        int b= 0;

        try{
        int c = a/b;
        System.out.println("the divison of a divides b is "+c);     
        }
        catch(Exception e){
            System.out.println("you can not do that beacause of this exception ");
            System.out.println(e);
        }
        
    }
}
