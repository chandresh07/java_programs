import java.util.Scanner;
import java.util.Random;

class guessgame{
    int noofGuess;
    int number;
    int rmnumber;

    guessgame(int n){
        if(number<rmnumber){
            System.out.println("HIgher number ");
        }
        else if(number>rmnumber){
            System.out.println("Lower number ");
        }
        else{
            System.out.println("Correct guess",rmnumber);
        }

        public int getNumber(){
            return number;
        }
        public int setNumber(int n){
            rmnumber = number;
        }
    }

    public static void main(String [] args){


        guessgame gg = new guessgame(int n);
        Random rm = new Random();
        int rmnuber = rm.nextInt(100);
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number between 1 to 100");
        int number = sc.nextInt();

    }
}