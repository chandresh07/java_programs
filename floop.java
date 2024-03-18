import java.util.Scanner;

class floop{
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=100; i>=1; --i){
            System.out.println(n);
        }        
    }
}