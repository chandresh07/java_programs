
class  myEmploee{
    private int id;
    private String name;

    public String getName(){
        return name;

    }
    public void setName(String n){
        name = n;

    }
    public int  getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}


class ch9{
    public static void main(String [] args){

        myEmploee harry = new myEmploee();
        harry.setName("codewithchandresh");
        System.out.println(harry.getName());
        harry.setId(148520);
        System.out.println(harry.getId());


    }
}