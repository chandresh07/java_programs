




class inher{

    int logic(int x, int y){

        int z;
        if(x<y){
            z = x+y;
        }
        else{
            z
             = (x+y)*5;
        }
        return z;
    }
    public static void main(String [] args){
        inher i = new inher();
        int a = 5;
        int b = 10;
        int c;
        c = i.logic(a,b);
        int a1 = 10;
        int b1 = 5;
        int c1 ;
        c1 = i.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}