
class myMainEmployee{

    private int id;
    private String name;

    myMainEmployee()
    {
        System.out.println(" Angel "); 
        id = 45;
        name = "chandresh";
    }

    myMainEmployee(String myname){
        name = myname;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}




class ch9cons{
    public static void main(String [] args){
         myMainEmployee harry= new myMainEmployee();
         myMainEmployee harry1 = new myMainEmployee("Nidhi");
         System.out.println(harry.getId());
         System.out.println(harry.getName());

    }
}