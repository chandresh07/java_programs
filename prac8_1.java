
class Employee{
    int salary;
    String name;


    String getName(){
        return name;
    }
    void setName(String n){
        name = n;
        

    }
    int getSalary(){
        return salary;
    }
}


class prac8_1{
    public static void main(String [] args){
        Employee e = new Employee();
        e.setName("chandresh");
        System.out.println(e.getName());
        e.salary = 25000;
        System.out.println(e.getSalary());
        

    }
}