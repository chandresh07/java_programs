import java.util.*;

public class calc {
    @SuppressWarnings("resource")
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);

    int no1 = sc.nextInt();
    int no2 = sc.nextInt();
    

    int operator = sc.nextInt();

    switch(operator)  {
        case 1 : System.out.print(no1+no2);
        break;

        case 2 : System.out.print(no1-no2);
        break;

        case 3 : System.out.print(no1*no2);
        break;

        case 4 : System.out.print(no1/no2);
        break;

        case 5 : System.out.print(no1%no2);
        break;

        default :System.out.print("Enter valid nmber"); 
        }
    } 
}