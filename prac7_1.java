import java.util.Scanner;

class prac7_1{
    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in);
        fahrenheit(13);
       // String msg= (a%2==0) ? "even" :"odd";
       // System.out.print(msg);
       // int n = sc.nextInt();
        // multiplication(n);
       //  patter(4);
      // pattern2(4);
       
    }
    static void fahrenheit (float a){
        float fah = ((a*9)/5) + 32;
        System.out.print(fah);
    }

   /* static void patter(int r){
        
        for(int a=1; a<=r; a++){
            for(int b=1; b<=a; b++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    static void multiplication(int n){
            for(int i= 1; i<=10; i++){
           System.out.format("%d X %d = %d\n",n,i,n*i);
    
            }
        }*/

   /* static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
}