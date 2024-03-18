import java.util.Scanner;

class percen {
    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1 ");
        float maths = sc.nextFloat();

         System.out.println("Enter the marks of subject 2 ");
        float english = sc.nextFloat();

         System.out.println("Enter the marks of subject 3 ");
        float science = sc.nextFloat();

         System.out.println("Enter the marks of subject 4 ");
        float physics = sc.nextFloat();

         System.out.println("Enter the marks of subject 5 ");
        float computer = sc.nextFloat();

        float total = ((maths + english + science + physics + computer)/5);

        System.out.println("totla percentage of your marks are "+total);
    }
}