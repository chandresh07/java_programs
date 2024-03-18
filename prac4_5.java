import java.util.Scanner;

class prac4_5{

    public static void main(String [] args){

        System.out.println("Enter The Year ");

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year % 4==0 &&  year %100 != 0 || year %400 == 0){
            System.out.println("The "+ year +" is leap year");
        }
        else{
            System.out.println("The "+ year +" is not a leap year");
        }

    }
}