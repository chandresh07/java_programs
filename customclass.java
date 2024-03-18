
class Employee{

    int id;
    int salary;
    String name;

    public void getDetails(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);

    }
    public int getSalary(){
        return salary;
    }
}



public class customclass{
       public static void main(String [] args){

        Employee harry = new Employee();
        Employee chandresh = new Employee();


        harry.id = 1;
        harry.salary = 20000;
        harry.name = "harry";

        chandresh.id = 2;
        chandresh.salary = 300000;
        chandresh.name= "chandresh rathod";

        harry.getDetails();
        chandresh.getDetails();

       int Salary = harry.getSalary();
       int valary = chandresh.getSalary();
        System.out.println(Salary);
        System.out.println(valary);
        harry.getSalary();
        chandresh.getSalary();



    }
}