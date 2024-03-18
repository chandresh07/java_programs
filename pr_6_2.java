

class pr_6_2{
    public static void main(String [] args){

       /* float [] num = {2.1f , 2.1f, 2.1f, 2.1f, 2.1f};

        float sum = 0;

        for(float elements: num){
            sum = sum + elements;
        }

        System.out.println(sum);*/
      //  int n = Math.floorDiv(2000,10);
      //  System.out.println(n);

        int [] arr = {11,22,33,35,43,10};

        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.print(min);
    }
}