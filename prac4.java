import java.util.Scanner;

class prac4{
    public static void main(String [] args){

        byte m1,m2,m3;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your physics marks ");
        m1= sc.nextByte();

        System.out.println("Enter your maths marks");
        m2 = sc.nextByte();

        System.out.println("Enter your english marks");
        m3 = sc.nextByte();

        float avg =(m1+m2+m3)/3.0f;

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you are passed");
        }
        else{
            System.out.println("you are failed");
        }

        
        
            }
}