import java.util.Scanner;
import java.util.Random;

class rpsgame{
    public static void main(String [] args){

        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number between 0 to 2 in game \n0 for rock, 1 for pepear, and 2  for scisors");

        int uint = sc.nextInt();
        int ranint = rm.nextInt(3);

        // uint = user input
        // ranint = random input by computer

        if(uint < 1 && ranint != 0 && ranint != 1){
            System.out.println("you won the game"+ranint);
        }
        else if(uint < 1 && ranint != 0 &&ranint != 2){
                System.out.println("you loss the game Computer have a "+ranint);
        }
        else if(uint < 2 && uint > 0 && ranint != 1 && ranint != 2){
            System.out.println("you won the game"+ranint);
        }
        else if(uint <2 && uint >0 && ranint !=1 && ranint !=0){
            System.out.println("you loss the game Computer have a "+ranint);
        }
        else if(uint > 1 && ranint != 2 && ranint != 0 ){
            System.out.println("You won the games"+ranint);
        }
        else if(uint >1 && ranint != 2 && ranint !=1){
            System.out.println("you loss the game" + ranint);
        }
        else{
            System.out.println("computer choosed same " +ranint);
        }
    }
}