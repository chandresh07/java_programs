import java.util.Scanner;

class prac4_4{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of day ");


        int day = sc.nextInt();

        switch(day){

            case 1:
                System.out.println("today is sunday");
                break;
            

            case 2:
                System.out.println("today is monday");
                break;

            
            case 3:
                System.out.println("today is tuesday");
                break;
            

             case 4:
                System.out.println("today is wednsday");
                break;
             
            case 5:
                System.out.println("today is thursday");
                break;
            
             case 6:
                System.out.println("today is friday");
                break;
            
             case 7 :
                System.out.println("today is saturday");
                break;
             
        }
    }
}